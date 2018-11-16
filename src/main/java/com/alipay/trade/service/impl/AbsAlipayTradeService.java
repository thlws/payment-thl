package com.alipay.trade.service.impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayResponse;
import com.alipay.api.request.*;
import com.alipay.api.response.*;
import com.alipay.trade.model.TradeStatus;
import com.alipay.trade.model.builder.*;
import com.alipay.trade.model.result.*;
import com.alipay.trade.service.AlipayTradeService;
import com.alipay.trade.utils.Utils;
import com.alipay.trade.config.Constants;
import org.thlws.utils.JsonUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuyangkly on 15/10/28.
 */
abstract class AbsAlipayTradeService extends AbsAlipayService implements AlipayTradeService {
    /**
     * The constant executorService.
     */
    protected static ExecutorService executorService = Executors.newCachedThreadPool();
    /**
     * The Client.
     */
    protected AlipayClient client;

    @Override
    public AlipayF2FQueryResult queryTradeResult(AlipayTradeQueryRequestBuilder builder) {
        AlipayTradeQueryResponse response = tradeQuery(builder);

        AlipayF2FQueryResult result = new AlipayF2FQueryResult(response);
        if (querySuccess(response)) {
            // 查询返回该订单交易支付成功
            result.setTradeStatus(TradeStatus.SUCCESS);

        } else if (tradeError(response)) {
            // 查询发生异常，交易状态未知
            result.setTradeStatus(TradeStatus.UNKNOWN);

        } else {
            // 其他情况均表明该订单号交易失败
            result.setTradeStatus(TradeStatus.FAILED);
        }
        return result;
    }

    /**
     * Trade query alipay trade query response.
     *
     * @param builder the builder
     * @return the alipay trade query response
     */
    protected AlipayTradeQueryResponse tradeQuery(AlipayTradeQueryRequestBuilder builder) {
        validateBuilder(builder);

        AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
        request.putOtherTextParam("app_auth_token", builder.getAppAuthToken());
        request.setBizContent(builder.toJsonString());
        log.debug("trade.query bizContent:" + request.getBizContent());

        return (AlipayTradeQueryResponse) getResponse(client, request);
    }

    @Override
    public AlipayF2FRefundResult tradeRefund(AlipayTradeRefundRequestBuilder builder) {
        validateBuilder(builder);

        AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
        request.putOtherTextParam("app_auth_token", builder.getAppAuthToken());
        request.setBizContent(builder.toJsonString());
        log.debug("trade.refund bizContent:" + request.getBizContent());

        AlipayTradeRefundResponse response = (AlipayTradeRefundResponse) getResponse(client, request);

        AlipayF2FRefundResult result = new AlipayF2FRefundResult(response);
        if (response != null && Constants.SUCCESS.equals(response.getCode())) {
            // 退货交易成功
            result.setTradeStatus(TradeStatus.SUCCESS);

        } else if (tradeError(response)) {
            // 退货发生异常，退货状态未知
            result.setTradeStatus(TradeStatus.UNKNOWN);

        } else {
            // 其他情况表明该订单退货明确失败
            result.setTradeStatus(TradeStatus.FAILED);
        }
        return result;
    }

    @Override
    public AlipayF2FPrecreateResult tradePrecreate(AlipayTradePrecreateRequestBuilder builder) {
        validateBuilder(builder);

        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
        request.putOtherTextParam("app_auth_token", builder.getAppAuthToken());
        request.setBizContent(builder.toJsonString());
        log.debug("trade.precreate bizContent:" + request.getBizContent());

        AlipayTradePrecreateResponse response = (AlipayTradePrecreateResponse) getResponse(client, request);

        AlipayF2FPrecreateResult result = new AlipayF2FPrecreateResult(response);
        if (response != null && Constants.SUCCESS.equals(response.getCode())) {
            // 预下单交易成功
            result.setTradeStatus(TradeStatus.SUCCESS);

        } else if (tradeError(response)) {
            // 预下单发生异常，状态未知
            result.setTradeStatus(TradeStatus.UNKNOWN);

        } else {
            // 其他情况表明该预下单明确失败
            result.setTradeStatus(TradeStatus.FAILED);
        }
        return result;
    }

    // 商户可以直接使用的pay方法
    @Override
    public AlipayF2FPayResult tradePay(AlipayTradePayRequestBuilder builder) {
        validateBuilder(builder);

        final String outTradeNo = builder.getOutTradeNo();

        AlipayTradePayRequest request = new AlipayTradePayRequest();
        // 设置平台参数
        request.setNotifyUrl(builder.getNotifyUrl());
        String appAuthToken = builder.getAppAuthToken();
        // todo 等支付宝sdk升级公共参数后使用如下方法
        // request.setAppAuthToken(appAuthToken);
        request.putOtherTextParam("app_auth_token", builder.getAppAuthToken());

        // 设置业务参数
        request.setBizContent(builder.toJsonString());
        log.debug("trade.pay bizContent:" + request.getBizContent());

        // 首先调用支付api
        AlipayTradePayResponse response = (AlipayTradePayResponse) getResponse(client, request);

        AlipayF2FPayResult result = new AlipayF2FPayResult(response);
        if (response != null && Constants.SUCCESS.equals(response.getCode())) {
            // 支付交易明确成功
            result.setTradeStatus(TradeStatus.SUCCESS);

        } else if (response != null && Constants.PAYING.equals(response.getCode())) {
            // 返回用户处理中，则轮询查询交易是否成功，如果查询超时，则调用撤销
            AlipayTradeQueryRequestBuilder queryBuiler = new AlipayTradeQueryRequestBuilder()
                    .setAppAuthToken(appAuthToken)
                    .setOutTradeNo(outTradeNo);
            AlipayTradeQueryResponse loopQueryResponse = loopQueryResult(queryBuiler);
            return checkQueryAndCancel(outTradeNo, appAuthToken, result, loopQueryResponse);

        } else if (tradeError(response)) {
            // 系统错误，则查询一次交易，如果交易没有支付成功，则调用撤销
            AlipayTradeQueryRequestBuilder queryBuiler = new AlipayTradeQueryRequestBuilder()
                    .setAppAuthToken(appAuthToken)
                    .setOutTradeNo(outTradeNo);
            AlipayTradeQueryResponse queryResponse = tradeQuery(queryBuiler);
            return checkQueryAndCancel(outTradeNo, appAuthToken, result, queryResponse);

        } else {
            // 其他情况表明该订单支付明确失败
            result.setTradeStatus(TradeStatus.FAILED);
        }

        return result;
    }


    /**
     * Check query and cancel alipay f 2 f pay result.
     *
     * @param outTradeNo    the out trade no
     * @param appAuthToken  the app auth token
     * @param result        the result
     * @param queryResponse the query response
     * @return the alipay f 2 f pay result
     */
// 根据查询结果queryResponse判断交易是否支付成功，如果支付成功则更新result并返回，如果不成功则调用撤销
    protected AlipayF2FPayResult checkQueryAndCancel(String outTradeNo, String appAuthToken, AlipayF2FPayResult result,
                                                   AlipayTradeQueryResponse queryResponse) {
        if (querySuccess(queryResponse)) {
            // 如果查询返回支付成功，则返回相应结果
            result.setTradeStatus(TradeStatus.SUCCESS);
            result.setResponse(toPayResponse(queryResponse));
            return result;
        }

        // 如果查询结果不为成功，则调用撤销
        AlipayTradeCancelRequestBuilder builder = new AlipayTradeCancelRequestBuilder().setOutTradeNo(outTradeNo);
        builder.setAppAuthToken(appAuthToken);
        AlipayTradeCancelResponse cancelResponse = cancelPayResult(builder);
        if (tradeError(cancelResponse)) {
            // 如果第一次同步撤销返回异常，则标记支付交易为未知状态
            result.setTradeStatus(TradeStatus.UNKNOWN);
        } else {
            // 标记支付为失败，如果撤销未能成功，产生的单边帐由人工处理
            result.setTradeStatus(TradeStatus.FAILED);
        }
        return result;
    }


    /**
     * Trade cancel alipay trade cancel response.
     *
     * @param builder the builder
     * @return the alipay trade cancel response
     */
// 根据外部订单号outTradeNo撤销订单
    protected AlipayTradeCancelResponse tradeCancel(AlipayTradeCancelRequestBuilder builder) {
        validateBuilder(builder);

        AlipayTradeCancelRequest request = new AlipayTradeCancelRequest();
        request.putOtherTextParam("app_auth_token", builder.getAppAuthToken());
        request.setBizContent(builder.toJsonString());
        log.debug("trade.cancel bizContent:" + request.getBizContent());

        return (AlipayTradeCancelResponse) getResponse(client, request);
    }

    @Override
    public AlipayF2FCancelResult tradeCancel_II(AlipayTradeCancelRequestBuilder builder) {
        //TODO FIXME XXX  撤销订单;
        validateBuilder(builder);
        //final String outTradeNo = builder.getOutTradeNo();

        AlipayTradeCancelRequest request = new AlipayTradeCancelRequest();
        request.setBizContent(JsonUtil.format(builder.getBizContent()));
        AlipayTradeCancelResponse response = (AlipayTradeCancelResponse)getResponse(client,request);
        AlipayF2FCancelResult result = new AlipayF2FCancelResult(response);
        if (response != null && Constants.SUCCESS.equals(response.getCode())) {
            result.setTradeStatus(TradeStatus.SUCCESS);
        } else if (tradeError(response)) {
            result.setTradeStatus(TradeStatus.FAILED);
        } else {
            result.setTradeStatus(TradeStatus.UNKNOWN);
        }
        return result;
    }

    /**
     * Loop query result alipay trade query response.
     *
     * @param builder the builder
     * @return the alipay trade query response
     */
// 轮询查询订单支付结果
    protected AlipayTradeQueryResponse loopQueryResult(AlipayTradeQueryRequestBuilder builder) {
        AlipayTradeQueryResponse queryResult = null;
        for (int i = 0; i < Constants.max_query_retry; i++) {
            Utils.sleep(Constants.query_duration);

            AlipayTradeQueryResponse response = tradeQuery(builder);
            if (response != null) {
                if (stopQuery(response)) {
                    return response;
                }
                queryResult = response;
            }
        }
        return queryResult;
    }

    /**
     * Stop query boolean.
     *
     * @param response the response
     * @return the boolean
     */
// 判断是否停止查询
    protected boolean stopQuery(AlipayTradeQueryResponse response) {
        if (Constants.SUCCESS.equals(response.getCode())) {
            if ("TRADE_FINISHED".equals(response.getTradeStatus()) ||
                    "TRADE_SUCCESS".equals(response.getTradeStatus()) ||
                    "TRADE_CLOSED".equals(response.getTradeStatus())) {
                // 如果查询到交易成功、交易结束、交易关闭，则返回对应结果
                return true;
            }
        }
        return false;
    }

    /**
     * Cancel pay result alipay trade cancel response.
     *
     * @param builder the builder
     * @return the alipay trade cancel response
     */
// 根据外部订单号outTradeNo撤销订单
    protected AlipayTradeCancelResponse cancelPayResult(AlipayTradeCancelRequestBuilder builder) {
        AlipayTradeCancelResponse response = tradeCancel(builder);
        if (cancelSuccess(response)) {
            // 如果撤销成功，则返回撤销结果
            return response;
        }

        // 撤销失败
        if (needRetry(response)) {
            // 如果需要重试，首先记录日志，然后调用异步撤销
            log.warn("begin async cancel request:" + builder);
            asyncCancel(builder);
        }
        return response;
    }

    /**
     * Async cancel.
     *
     * @param builder the builder
     */
// 异步撤销
    protected void asyncCancel(final AlipayTradeCancelRequestBuilder builder) {
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Constants.max_cancel_retry; i++) {
                    Utils.sleep(Constants.cancel_duration);

                    AlipayTradeCancelResponse response = tradeCancel(builder);
                    if (cancelSuccess(response) ||
                            !needRetry(response)) {
                        // 如果撤销成功或者应答告知不需要重试撤销，则返回撤销结果（无论撤销是成功失败，失败人工处理）
                        return ;
                    }
                }
            }
        });
    }

    /**
     * To pay response alipay trade pay response.
     *
     * @param response the response
     * @return the alipay trade pay response
     */
// 将查询应答转换为支付应答
    protected AlipayTradePayResponse toPayResponse(AlipayTradeQueryResponse response) {
        AlipayTradePayResponse payResponse = new AlipayTradePayResponse();
        // 只有查询明确返回成功才能将返回码设置为10000，否则均为失败
        payResponse.setCode(querySuccess(response) ? Constants.SUCCESS : Constants.FAILED);
        // 补充交易状态信息
        StringBuilder msg = new StringBuilder(response.getMsg())
                .append(" tradeStatus:")
                .append(response.getTradeStatus());
        payResponse.setMsg(msg.toString());
        payResponse.setSubCode(response.getSubCode());
        payResponse.setSubMsg(response.getSubMsg());
        payResponse.setBody(response.getBody());
        payResponse.setParams(response.getParams());

        // payResponse应该是交易支付时间，但是response里是本次交易打款给卖家的时间,是否有问题
        // payResponse.setGmtPayment(response.getSendPayDate());
        payResponse.setBuyerLogonId(response.getBuyerLogonId());
        payResponse.setFundBillList(response.getFundBillList());
        payResponse.setOpenId(response.getOpenId());
        payResponse.setOutTradeNo(response.getOutTradeNo());
        payResponse.setReceiptAmount(response.getReceiptAmount());
        payResponse.setTotalAmount(response.getTotalAmount());
        payResponse.setTradeNo(response.getTradeNo());
        return payResponse;
    }

    /**
     * Need retry boolean.
     *
     * @param response the response
     * @return the boolean
     */
// 撤销需要重试
    protected boolean needRetry(AlipayTradeCancelResponse response) {
        return response == null ||
                "Y".equals(response.getRetryFlag());
    }

    /***
     * 查询返回“支付成功”
     * Modified by Hanley 新增查询成功状态 TRADE_CLOSED-[line 310 已注释]
     * @param response the response
     * @return boolean
     */
    protected boolean querySuccess(AlipayTradeQueryResponse response) {
        return response != null &&
                Constants.SUCCESS.equals(response.getCode()) &&
                ("TRADE_SUCCESS".equals(response.getTradeStatus()) ||
                        "TRADE_FINISHED".equals(response.getTradeStatus())
//                        || "TRADE_CLOSED".equals(response.getTradeStatus())
                );
    }

    /**
     * Cancel success boolean.
     *
     * @param response the response
     * @return the boolean
     */
// 撤销返回“撤销成功”
    protected boolean cancelSuccess(AlipayTradeCancelResponse response) {
        return response != null &&
                Constants.SUCCESS.equals(response.getCode());
    }

    /**
     * Trade error boolean.
     *
     * @param response the response
     * @return the boolean
     */
// 交易异常，或发生系统错误
    protected boolean tradeError(AlipayResponse response) {
        return response == null ||
                Constants.ERROR.equals(response.getCode());
    }
}

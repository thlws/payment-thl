package org.thlws.payment.alipay.trade.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import org.apache.commons.lang3.StringUtils;
import org.thlws.payment.alipay.trade.config.Constants;
import org.thlws.payment.alipay.trade.model.TradeStatus;
import org.thlws.payment.alipay.trade.model.builder.AlipayTradePayRequestBuilder;
import org.thlws.payment.alipay.trade.model.builder.AlipayTradeQueryRequestBuilder;
import org.thlws.payment.alipay.trade.model.result.AlipayF2FPayResult;
import org.thlws.payment.alipay.trade.service.impl.hb.HbListener;
import org.thlws.payment.alipay.trade.service.impl.hb.TradeListener;

import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;


/**
 *
 * @author liuyangkly
 * date15/7/29
 * <p>
 * 一定要在创建AlipayTradeService之前调用Configs.init("alipayrisk10");设置参数
 */
public class AlipayTradeWithHBServiceImpl extends AbsAlipayTradeService {

    private TradeListener listener;

    /**
     * The type Client builder.
     */
    public static class ClientBuilder {
        private String gatewayUrl;
        private String appid;
        private String privateKey;
        private String format;
        private String charset;
        private String alipayPublicKey;
        private TradeListener listener;

        /**
         * Build alipay trade with hb service.
         *
         * @return the alipay trade with hb service
         */
        public AlipayTradeWithHBServiceImpl build() {
            if (StringUtils.isEmpty(gatewayUrl)) {
                gatewayUrl = Constants.open_api_domain; // 与mcloudmonitor网关地址不同
            }
            if (StringUtils.isEmpty(appid)) {
                throw new NullPointerException("appid can not be Null.");
            }
            if (StringUtils.isEmpty(privateKey)) {
                throw new NullPointerException("privateKey can not be Null.");
            }
            if (StringUtils.isEmpty(format)) {
                format = "json";
            }
            if (StringUtils.isEmpty(charset)) {
                charset = "utf-8";
            }
            if (StringUtils.isEmpty(alipayPublicKey)) {
                throw new NullPointerException("alipayPublicKey can not be Null.");
            }
            if (listener == null) {
                listener = new HbListener();  // 默认监听器
            }

            return new AlipayTradeWithHBServiceImpl(this);
        }

        /**
         * Gets listener.
         *
         * @return the listener
         */
        public TradeListener getListener() {
            return listener;
        }

        /**
         * Sets listener.
         *
         * @param listener the listener
         * @return the listener
         */
        public ClientBuilder setListener(TradeListener listener) {
            this.listener = listener;
            return this;
        }

        /**
         * Sets alipay public key.
         *
         * @param alipayPublicKey the alipay public key
         * @return the alipay public key
         */
        public ClientBuilder setAlipayPublicKey(String alipayPublicKey) {
            this.alipayPublicKey = alipayPublicKey;
            return this;
        }

        /**
         * Sets appid.
         *
         * @param appid the appid
         * @return the appid
         */
        public ClientBuilder setAppid(String appid) {
            this.appid = appid;
            return this;
        }

        /**
         * Sets charset.
         *
         * @param charset the charset
         * @return the charset
         */
        public ClientBuilder setCharset(String charset) {
            this.charset = charset;
            return this;
        }

        /**
         * Sets format.
         *
         * @param format the format
         * @return the format
         */
        public ClientBuilder setFormat(String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets gateway url.
         *
         * @param gatewayUrl the gateway url
         * @return the gateway url
         */
        public ClientBuilder setGatewayUrl(String gatewayUrl) {
            this.gatewayUrl = gatewayUrl;
            return this;
        }

        /**
         * Sets private key.
         *
         * @param privateKey the private key
         * @return the private key
         */
        public ClientBuilder setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * Gets alipay public key.
         *
         * @return the alipay public key
         */
        public String getAlipayPublicKey() {
            return alipayPublicKey;
        }

        /**
         * Gets appid.
         *
         * @return the appid
         */
        public String getAppid() {
            return appid;
        }

        /**
         * Gets charset.
         *
         * @return the charset
         */
        public String getCharset() {
            return charset;
        }

        /**
         * Gets format.
         *
         * @return the format
         */
        public String getFormat() {
            return format;
        }

        /**
         * Gets gateway url.
         *
         * @return the gateway url
         */
        public String getGatewayUrl() {
            return gatewayUrl;
        }

        /**
         * Gets private key.
         *
         * @return the private key
         */
        public String getPrivateKey() {
            return privateKey;
        }
    }

    /**
     * Instantiates a new Alipay trade with hb service.
     *
     * @param builder the builder
     */
    public AlipayTradeWithHBServiceImpl(ClientBuilder builder) {
        if (StringUtils.isEmpty(builder.getGatewayUrl())) {
            throw new NullPointerException("gatewayUrl should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getAppid())) {
            throw new NullPointerException("appid should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getPrivateKey())) {
            throw new NullPointerException("privateKey should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getFormat())) {
            throw new NullPointerException("format should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getCharset())) {
            throw new NullPointerException("charset should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getAlipayPublicKey())) {
            throw new NullPointerException("alipayPublicKey should not be NULL!");
        }
        if (builder.getListener() == null) {
            throw new NullPointerException("listener should not be NULL!");
        }

        listener = builder.getListener();
        client = new DefaultAlipayClient(builder.getGatewayUrl(), builder.getAppid(), builder.getPrivateKey(),
                builder.getFormat(), builder.getCharset(), builder.getAlipayPublicKey());
    }

    private AlipayTradePayResponse getResponse(AlipayClient client, AlipayTradePayRequest request,
                                                 final String outTradeNo, final long beforeCall) {
        try {
            AlipayTradePayResponse response = client.execute(request);
            if (response != null) {
                log.debug(response.getBody());
            }
            return response;

        } catch (AlipayApiException e) {
            // 获取异常真实原因
            Throwable cause = e.getCause();

            if (cause instanceof ConnectException ||
                    cause instanceof NoRouteToHostException) {
                // 建立连接异常
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        listener.onConnectException(outTradeNo, beforeCall);
                    }
                });

            } else if (cause instanceof SocketException) {
                // 报文上送异常
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        listener.onSendException(outTradeNo, beforeCall);
                    }
                });

            } else if (cause instanceof SocketTimeoutException) {
                // 报文接收异常
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        listener.onReceiveException(outTradeNo, beforeCall);
                    }
                });
            }

            e.printStackTrace();
            return null;
        }
    }

    // 商户可以直接使用的pay方法，并且集成了监控代码
    @Override
    public AlipayF2FPayResult tradePay(AlipayTradePayRequestBuilder builder) {
        validateBuilder(builder);

        final String outTradeNo = builder.getOutTradeNo();

        AlipayTradePayRequest request = new AlipayTradePayRequest();
        // 设置平台参数
        String appAuthToken = builder.getAppAuthToken();
        request.setNotifyUrl(builder.getNotifyUrl());
        request.putOtherTextParam("app_auth_token", appAuthToken);

        // 设置业务参数
        request.setBizContent(builder.toJsonString());
        log.debug("trade.pay bizContent:" + request.getBizContent());

        // 首先调用支付api
        final long beforeCall = System.currentTimeMillis();
        AlipayTradePayResponse response = getResponse(client, request, outTradeNo, beforeCall);

        AlipayF2FPayResult result = new AlipayF2FPayResult(response);
        if (response != null && Constants.SUCCESS.equals(response.getCode())) {
            // 支付交易明确成功
            result.setTradeStatus(TradeStatus.SUCCESS);

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    listener.onPayTradeSuccess(outTradeNo, beforeCall);
                }
            });

        } else if (response != null && Constants.PAYING.equals(response.getCode())) {
            // 返回支付中，同步交易耗时
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    listener.onPayInProgress(outTradeNo, beforeCall);
                }
            });

            // 返回用户处理中，则轮询查询交易是否成功，如果查询超时，则调用撤销
            AlipayTradeQueryRequestBuilder queryBuiler = new AlipayTradeQueryRequestBuilder()
                    .setAppAuthToken(appAuthToken)
                    .setOutTradeNo(outTradeNo);
            AlipayTradeQueryResponse loopQueryResponse = loopQueryResult(queryBuiler);
            return checkQueryAndCancel(outTradeNo, appAuthToken, result, loopQueryResponse);

        } else if (tradeError(response)) {
            // 系统错误，同步交易耗时
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    listener.onPayFailed(outTradeNo, beforeCall);
                }
            });

            // 系统错误，则查询一次交易，如果交易没有支付成功，则调用撤销
            AlipayTradeQueryRequestBuilder queryBuiler = new AlipayTradeQueryRequestBuilder()
                    .setAppAuthToken(appAuthToken)
                    .setOutTradeNo(outTradeNo);
            AlipayTradeQueryResponse queryResponse = tradeQuery(queryBuiler);
            return checkQueryAndCancel(outTradeNo, appAuthToken, result, queryResponse);

        } else {
            // 其他情况表明该订单支付明确失败
            result.setTradeStatus(TradeStatus.FAILED);

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    listener.onPayFailed(outTradeNo, beforeCall);
                }
            });
        }

        return result;
    }
}

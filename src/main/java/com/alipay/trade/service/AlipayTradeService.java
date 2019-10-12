package com.alipay.trade.service;

import com.alipay.trade.model.builder.*;
import com.alipay.trade.model.result.*;

/**
 * Created by liuyangkly on 15/7/29.
 */
public interface AlipayTradeService {

    /**
     * Trade pay alipay f 2 f pay result.
     *
     * @param builder the builder
     * @return the alipay f 2 f pay result
     */
// 当面付2.0流程支付
    public AlipayF2FPayResult tradePay(AlipayTradePayRequestBuilder builder);

    /**
     * Query trade result alipay f 2 f query result.
     *
     * @param builder the builder
     * @return the alipay f 2 f query result
     */
// 当面付2.0消费查询
    public AlipayF2FQueryResult queryTradeResult(AlipayTradeQueryRequestBuilder builder);

    /**
     * Trade refund alipay f 2 f refund result.
     *
     * @param builder the builder
     * @return the alipay f 2 f refund result
     */
// 当面付2.0消费退款
    public AlipayF2FRefundResult tradeRefund(AlipayTradeRefundRequestBuilder builder);

    /**
     * Trade precreate alipay f 2 f precreate result.
     *
     * @param builder the builder
     * @return the alipay f 2 f precreate result
     */
// 当面付2.0预下单(生成二维码)
    public AlipayF2FPrecreateResult tradePrecreate(AlipayTradePrecreateRequestBuilder builder);

    /**
     * Trade cancel ii alipay f 2 f cancel result.
     *
     * @param builder the builder
     * @return the alipay f 2 f cancel result
     */
//当面付2.0 撤销订单
    public AlipayF2FCancelResult tradeCancel_II(AlipayTradeCancelRequestBuilder builder);
}

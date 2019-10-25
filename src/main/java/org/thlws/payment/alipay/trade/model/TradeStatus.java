package org.thlws.payment.alipay.trade.model;

/**
 *
 * @author liuyangkly
 * date15/8/29
 */
public enum TradeStatus {
    /**
     *  业务交易明确成功，比如支付成功、退货成功
     */
    SUCCESS

    ,
    /**
     * 业务交易明确失败，比如支付明确失败、退货明确失败
     */
    FAILED

    ,
    /**
     * 业务交易状态未知，此时不清楚该业务是否成功或者失败，需要商户自行确认
     */
    UNKNOWN
}

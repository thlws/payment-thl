package org.thlws.payment.alipay.entity.request;

import org.thlws.utils.JsonUtil;

/**
 * 支付宝退款
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayRefundRequest {

    /**支付宝交易号,tradeNo| outTradeNo二选一*/
    private String tradeNo;

    /**(特殊 tradeNo| outTradeNo二选一) 商户网站订单系统中唯一订单号，64个字符以内，只能包含字母、数字、下划线*/
    private String outTradeNo;

    /**(必填)退款金额*/
    private String refundAmount;

    /**(选填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持*/
    private String storeId;

    /**(选填) 退款理由*/
    private String refundReason;

    /**可选,部分退款时 必须*/
    private String outRequestNo;

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
        return outRequestNo;
    }

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

    /**
     * Gets terminal id.
     *
     * @return the terminal id
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets terminal id.
     *
     * @param terminalId the terminal id
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    private String terminalId;

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * Gets refund amount.
     *
     * @return the refund amount
     */
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets refund amount.
     *
     * @param refundAmount the refund amount
     */
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * Gets refund reason.
     *
     * @return the refund reason
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Sets refund reason.
     *
     * @param refundReason the refund reason
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}

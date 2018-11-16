package org.thlws.payment.alipay.entity.request;

import org.thlws.utils.JsonUtil;

/**
 * 支付宝退款
 * @author hanley@thlws.com
 * @date 2018/11/16
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

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    private String terminalId;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}

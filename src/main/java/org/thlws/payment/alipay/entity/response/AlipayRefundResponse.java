package org.thlws.payment.alipay.entity.response;

import com.alipay.api.domain.TradeFundBill;
import org.thlws.utils.JsonUtil;

import java.util.Date;
import java.util.List;

/**
 * 支付宝退款
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayRefundResponse {

    private boolean isSuccess;
    private String desc;

    private String              subCode;
    private String              subMsg;
    private String              code;
    private String              msg;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets msg.
     *
     * @param msg the msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 用户的登录id
     */
    private String buyerLogonId;

    /**
     * 买家在支付宝的用户id
     */
    private String buyerUserId;

    /**
     * 本次退款是否发生了资金变化
     */
    private String fundChange;

    /**
     * 退款支付时间
     */
    private Date gmtRefundPay;

    /**
     * 买家支付宝用户号，该参数已废弃，请不要使用
     */
    private String openId;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 退款使用的资金渠道
     */
    private List<TradeFundBill> refundDetailItemList;

    /**
     * 退款总金额
     */
    private String refundFee;

    /**
     * 本次商户实际退回金额
     */
    private String sendBackFee;

    /**
     * 交易在支付时候的门店名称
     */
    private String storeName;

    /**
     * 2013112011001004330000121536
     */
    private String tradeNo;

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess() {
        return isSuccess;
    }

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Gets buyer logon id.
     *
     * @return the buyer logon id
     */
    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    /**
     * Sets buyer logon id.
     *
     * @param buyerLogonId the buyer logon id
     */
    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    /**
     * Gets buyer user id.
     *
     * @return the buyer user id
     */
    public String getBuyerUserId() {
        return buyerUserId;
    }

    /**
     * Sets buyer user id.
     *
     * @param buyerUserId the buyer user id
     */
    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    /**
     * Gets fund change.
     *
     * @return the fund change
     */
    public String getFundChange() {
        return fundChange;
    }

    /**
     * Sets fund change.
     *
     * @param fundChange the fund change
     */
    public void setFundChange(String fundChange) {
        this.fundChange = fundChange;
    }

    /**
     * Gets gmt refund pay.
     *
     * @return the gmt refund pay
     */
    public Date getGmtRefundPay() {
        return gmtRefundPay;
    }

    /**
     * Sets gmt refund pay.
     *
     * @param gmtRefundPay the gmt refund pay
     */
    public void setGmtRefundPay(Date gmtRefundPay) {
        this.gmtRefundPay = gmtRefundPay;
    }

    /**
     * Gets open id.
     *
     * @return the open id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * Sets open id.
     *
     * @param openId the open id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
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
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * Gets refund detail item list.
     *
     * @return the refund detail item list
     */
    public List<TradeFundBill> getRefundDetailItemList() {
        return refundDetailItemList;
    }

    /**
     * Sets refund detail item list.
     *
     * @param refundDetailItemList the refund detail item list
     */
    public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList) {
        this.refundDetailItemList = refundDetailItemList;
    }

    /**
     * Gets refund fee.
     *
     * @return the refund fee
     */
    public String getRefundFee() {
        return refundFee;
    }

    /**
     * Sets refund fee.
     *
     * @param refundFee the refund fee
     */
    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * Gets send back fee.
     *
     * @return the send back fee
     */
    public String getSendBackFee() {
        return sendBackFee;
    }

    /**
     * Sets send back fee.
     *
     * @param sendBackFee the send back fee
     */
    public void setSendBackFee(String sendBackFee) {
        this.sendBackFee = sendBackFee;
    }

    /**
     * Gets store name.
     *
     * @return the store name
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets store name.
     *
     * @param storeName the store name
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

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
     * Gets sub code.
     *
     * @return the sub code
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets sub code.
     *
     * @param subCode the sub code
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    /**
     * Gets sub msg.
     *
     * @return the sub msg
     */
    public String getSubMsg() {
        return subMsg;
    }

    /**
     * Sets sub msg.
     *
     * @param subMsg the sub msg
     */
    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}

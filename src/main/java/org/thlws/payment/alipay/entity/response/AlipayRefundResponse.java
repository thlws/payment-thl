package org.thlws.payment.alipay.entity.response;

import com.alipay.api.domain.TradeFundBill;
import org.thlws.utils.JsonUtil;

import java.util.Date;
import java.util.List;

/**
 * 支付宝退款
 * @author hanley@thlws.com
 * @date 2018/11/16
 */
public class AlipayRefundResponse {

    private boolean isSuccess;
    private String desc;

    private String              subCode;
    private String              subMsg;
    private String              code;
    private String              msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

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

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getFundChange() {
        return fundChange;
    }

    public void setFundChange(String fundChange) {
        this.fundChange = fundChange;
    }

    public Date getGmtRefundPay() {
        return gmtRefundPay;
    }

    public void setGmtRefundPay(Date gmtRefundPay) {
        this.gmtRefundPay = gmtRefundPay;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public List<TradeFundBill> getRefundDetailItemList() {
        return refundDetailItemList;
    }

    public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList) {
        this.refundDetailItemList = refundDetailItemList;
    }

    public String getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public String getSendBackFee() {
        return sendBackFee;
    }

    public void setSendBackFee(String sendBackFee) {
        this.sendBackFee = sendBackFee;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}

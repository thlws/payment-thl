package org.thlws.payment.alipay.entity.response;

import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.VoucherDetail;
import org.thlws.utils.JsonUtil;

import java.util.Date;
import java.util.List;


/**
 * 支付宝付款结果
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayTradeResponse {

    private boolean isSuccess;
    private String desc;

    private String              code;
    private String              msg;
    private String              subCode;
    private String              subMsg;

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
     * 买家支付宝账号
     */
    private String buyerLogonId;

    /**
     * 买家付款的金额
     */
    private String buyerPayAmount;

    /**
     * 买家在支付宝的用户id
     */
    private String buyerUserId;

    /**
     * 支付宝卡余额
     */
    private String cardBalance;

    /**
     * 本次交易支付所使用的单品券优惠的商品优惠信息
     */
    private String discountGoodsDetail;

    /**
     * 交易支付使用的资金渠道
     */
    private List<TradeFundBill> fundBillList;

    /**
     * 交易支付时间
     */
    private Date gmtPayment;

    /**
     * 交易中可给用户开具发票的金额
     */
    private String invoiceAmount;

    /**
     * 买家支付宝用户号,该参数已废弃，请不要使用。
     */
    private String openId;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 使用积分宝付款的金额
     */
    private String pointAmount;

    /**
     * 实收金额
     */
    private String receiptAmount;

    /**
     * 发生支付交易的商户门店名称
     */
    private String storeName;

    /**
     * 交易金额
     */
    private String totalAmount;

    /**
     * 支付宝交易号
     */
    private String tradeNo;

    /**
     * 本交易支付时使用的所有优惠券信息
     */
    private List<VoucherDetail> voucherDetailList;

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
     * Gets buyer pay amount.
     *
     * @return the buyer pay amount
     */
    public String getBuyerPayAmount() {
        return buyerPayAmount;
    }

    /**
     * Sets buyer pay amount.
     *
     * @param buyerPayAmount the buyer pay amount
     */
    public void setBuyerPayAmount(String buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
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
     * Gets card balance.
     *
     * @return the card balance
     */
    public String getCardBalance() {
        return cardBalance;
    }

    /**
     * Sets card balance.
     *
     * @param cardBalance the card balance
     */
    public void setCardBalance(String cardBalance) {
        this.cardBalance = cardBalance;
    }

    /**
     * Gets discount goods detail.
     *
     * @return the discount goods detail
     */
    public String getDiscountGoodsDetail() {
        return discountGoodsDetail;
    }

    /**
     * Sets discount goods detail.
     *
     * @param discountGoodsDetail the discount goods detail
     */
    public void setDiscountGoodsDetail(String discountGoodsDetail) {
        this.discountGoodsDetail = discountGoodsDetail;
    }

    /**
     * Gets fund bill list.
     *
     * @return the fund bill list
     */
    public List<TradeFundBill> getFundBillList() {
        return fundBillList;
    }

    /**
     * Sets fund bill list.
     *
     * @param fundBillList the fund bill list
     */
    public void setFundBillList(List<TradeFundBill> fundBillList) {
        this.fundBillList = fundBillList;
    }

    /**
     * Gets gmt payment.
     *
     * @return the gmt payment
     */
    public Date getGmtPayment() {
        return gmtPayment;
    }

    /**
     * Sets gmt payment.
     *
     * @param gmtPayment the gmt payment
     */
    public void setGmtPayment(Date gmtPayment) {
        this.gmtPayment = gmtPayment;
    }

    /**
     * Gets invoice amount.
     *
     * @return the invoice amount
     */
    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Sets invoice amount.
     *
     * @param invoiceAmount the invoice amount
     */
    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
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
     * Gets point amount.
     *
     * @return the point amount
     */
    public String getPointAmount() {
        return pointAmount;
    }

    /**
     * Sets point amount.
     *
     * @param pointAmount the point amount
     */
    public void setPointAmount(String pointAmount) {
        this.pointAmount = pointAmount;
    }

    /**
     * Gets receipt amount.
     *
     * @return the receipt amount
     */
    public String getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * Sets receipt amount.
     *
     * @param receiptAmount the receipt amount
     */
    public void setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
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
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
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
     * Gets voucher detail list.
     *
     * @return the voucher detail list
     */
    public List<VoucherDetail> getVoucherDetailList() {
        return voucherDetailList;
    }

    /**
     * Sets voucher detail list.
     *
     * @param voucherDetailList the voucher detail list
     */
    public void setVoucherDetailList(List<VoucherDetail> voucherDetailList) {
        this.voucherDetailList = voucherDetailList;
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

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}

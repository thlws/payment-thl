package org.thlws.payment.alipay.entity.response;

import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.VoucherDetail;
import org.thlws.utils.JsonUtil;

import java.util.Date;
import java.util.List;


/**
 * 支付宝付款结果
 * @author hanley@thlws.com
 * @date 2018/11/16
 */
public class AlipayTradeResponse {

    private boolean isSuccess;
    private String desc;

    private String              code;
    private String              msg;
    private String              subCode;
    private String              subMsg;

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

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(String buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(String cardBalance) {
        this.cardBalance = cardBalance;
    }

    public String getDiscountGoodsDetail() {
        return discountGoodsDetail;
    }

    public void setDiscountGoodsDetail(String discountGoodsDetail) {
        this.discountGoodsDetail = discountGoodsDetail;
    }

    public List<TradeFundBill> getFundBillList() {
        return fundBillList;
    }

    public void setFundBillList(List<TradeFundBill> fundBillList) {
        this.fundBillList = fundBillList;
    }

    public Date getGmtPayment() {
        return gmtPayment;
    }

    public void setGmtPayment(Date gmtPayment) {
        this.gmtPayment = gmtPayment;
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
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

    public String getPointAmount() {
        return pointAmount;
    }

    public void setPointAmount(String pointAmount) {
        this.pointAmount = pointAmount;
    }

    public String getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public List<VoucherDetail> getVoucherDetailList() {
        return voucherDetailList;
    }

    public void setVoucherDetailList(List<VoucherDetail> voucherDetailList) {
        this.voucherDetailList = voucherDetailList;
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

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}

package org.thlws.payment.alipay.entity.response;

import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.VoucherDetail;
import org.thlws.utils.JsonUtil;

import java.util.Date;
import java.util.List;

/**
 * 支付宝订单查询
 * @author hanley@thlws.com
 * @date 2018/11/16
 */
public class AlipayQueryResponse {

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

     * 支付宝店铺编号
     */
    private String alipayStoreId;

    /**
     * 买家支付宝账号
     */
    private String buyerLogonId;

    /**
     * 买家实付金额，单位为元，两位小数。该金额代表该笔交易买家实际支付的金额，不包含商户折扣等金额
     */
    private String buyerPayAmount;

    /**
     * 买家在支付宝的用户id
     */
    private String buyerUserId;

    /**
     * 本次交易支付所使用的单品券优惠的商品优惠信息
     */
    private String discountGoodsDetail;

    /**
     * 交易支付使用的资金渠道
     */
    private List<TradeFundBill> fundBillList;

    /**
     * 行业特殊信息（例如在医保卡支付业务中，向用户返回医疗信息）。
     */
    private String industrySepcDetail;

    /**
     * 交易中用户支付的可开具发票的金额，单位为元，两位小数。该金额代表该笔交易中可以给用户开具发票的金额
     */
    private String invoiceAmount;

    /**
     * 买家支付宝用户号，该字段将废弃，不要使用
     */
    private String openId;

    /**
     * 商家订单号
     */
    private String outTradeNo;

    /**
     * 积分支付的金额，单位为元，两位小数。该金额代表该笔交易中用户使用积分支付的金额，比如集分宝或者支付宝实时优惠等
     */
    private String pointAmount;

    /**
     * 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
     */
    private String receiptAmount;

    /**
     * 本次交易打款给卖家的时间
     */
    private Date sendPayDate;

    /**
     * 商户门店编号
     */
    private String storeId;

    /**
     * 请求交易支付中的商户店铺的名称
     */
    private String storeName;

    /**
     * 商户机具终端编号
     */
    private String terminalId;

    /**
     * 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
     */
    private String totalAmount;

    /**
     * 支付宝交易号
     */
    private String tradeNo;

    /**
     * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
     */
    private String tradeStatus;

    /**
     * 本交易支付时使用的所有优惠券信息
     */
    private List<VoucherDetail> voucherDetailList;

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

    public String getAlipayStoreId() {
        return alipayStoreId;
    }

    public void setAlipayStoreId(String alipayStoreId) {
        this.alipayStoreId = alipayStoreId;
    }

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

    public String getIndustrySepcDetail() {
        return industrySepcDetail;
    }

    public void setIndustrySepcDetail(String industrySepcDetail) {
        this.industrySepcDetail = industrySepcDetail;
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

    public Date getSendPayDate() {
        return sendPayDate;
    }

    public void setSendPayDate(Date sendPayDate) {
        this.sendPayDate = sendPayDate;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
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

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
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

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}

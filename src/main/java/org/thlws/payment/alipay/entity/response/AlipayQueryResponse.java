package org.thlws.payment.alipay.entity.response;

import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.VoucherDetail;
import org.thlws.utils.JsonUtil;

import java.util.Date;
import java.util.List;

/**
 * 支付宝订单查询
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayQueryResponse {

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
     * Gets alipay store id.
     *
     * @return the alipay store id
     */
    public String getAlipayStoreId() {
        return alipayStoreId;
    }

    /**
     * Sets alipay store id.
     *
     * @param alipayStoreId the alipay store id
     */
    public void setAlipayStoreId(String alipayStoreId) {
        this.alipayStoreId = alipayStoreId;
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
     * Gets industry sepc detail.
     *
     * @return the industry sepc detail
     */
    public String getIndustrySepcDetail() {
        return industrySepcDetail;
    }

    /**
     * Sets industry sepc detail.
     *
     * @param industrySepcDetail the industry sepc detail
     */
    public void setIndustrySepcDetail(String industrySepcDetail) {
        this.industrySepcDetail = industrySepcDetail;
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
     * Gets send pay date.
     *
     * @return the send pay date
     */
    public Date getSendPayDate() {
        return sendPayDate;
    }

    /**
     * Sets send pay date.
     *
     * @param sendPayDate the send pay date
     */
    public void setSendPayDate(Date sendPayDate) {
        this.sendPayDate = sendPayDate;
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
     * Gets trade status.
     *
     * @return the trade status
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * Sets trade status.
     *
     * @param tradeStatus the trade status
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
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

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}

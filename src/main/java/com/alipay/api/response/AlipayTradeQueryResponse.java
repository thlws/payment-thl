package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.VoucherDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-18 19:56:32
 */
public class AlipayTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8883755937835161658L;

	/** 
	 * 支付宝店铺编号
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/** 
	 * 预授权支付模式，该参数仅在信用预授权支付场景下返回。信用预授权支付：CREDIT_PREAUTH_PAY
	 */
	@ApiField("auth_trade_pay_mode")
	private String authTradePayMode;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家实付金额，单位为元，两位小数。该金额代表该笔交易买家实际支付的金额，不包含商户折扣等金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 买家用户类型。CORPORATE:企业用户；PRIVATE:个人用户。
	 */
	@ApiField("buyer_user_type")
	private String buyerUserType;

	/** 
	 * 平台优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 本次交易支付所使用的单品券优惠的商品优惠信息
	 */
	@ApiField("discount_goods_detail")
	private String discountGoodsDetail;

	/** 
	 * 交易支付使用的资金渠道
	 */
	@ApiListField("fund_bill_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> fundBillList;

	/** 
	 * 行业特殊信息（例如在医保卡支付业务中，向用户返回医疗信息）。
	 */
	@ApiField("industry_sepc_detail")
	private String industrySepcDetail;

	/** 
	 * 交易中用户支付的可开具发票的金额，单位为元，两位小数。该金额代表该笔交易中可以给用户开具发票的金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 商家优惠金额
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/** 
	 * 买家支付宝用户号，该字段将废弃，不要使用
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 支付币种订单金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 订单支付币种
	 */
	@ApiField("pay_currency")
	private String payCurrency;

	/** 
	 * 积分支付的金额，单位为元，两位小数。该金额代表该笔交易中用户使用积分支付的金额，比如集分宝或者支付宝实时优惠等
	 */
	@ApiField("point_amount")
	private String pointAmount;

	/** 
	 * 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 本次交易打款给卖家的时间
	 */
	@ApiField("send_pay_date")
	private Date sendPayDate;

	/** 
	 * 结算币种订单金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 订单结算币种，对应支付接口传入的settle_currency，支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/** 
	 * 结算币种兑换标价币种汇率
	 */
	@ApiField("settle_trans_rate")
	private String settleTransRate;

	/** 
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 请求交易支付中的商户店铺的名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 商户机具终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/** 
	 * 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/** 
	 * 标价币种，该参数的值为支付时传入的trans_currency，支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY、新台币：TWD。当trans_currency 和 settle_currency 不一致时，trans_currency支持人民币：CNY、新台币：TWD
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/** 
	 * 标价币种兑换支付币种汇率
	 */
	@ApiField("trans_pay_rate")
	private String transPayRate;

	/** 
	 * 本交易支付时使用的所有优惠券信息
	 */
	@ApiListField("voucher_detail_list")
	@ApiField("voucher_detail")
	private List<VoucherDetail> voucherDetailList;

    /**
     * Sets alipay store id.
     *
     * @param alipayStoreId the alipay store id
     */
    public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

    /**
     * Gets alipay store id.
     *
     * @return the alipay store id
     */
    public String getAlipayStoreId( ) {
		return this.alipayStoreId;
	}

    /**
     * Sets auth trade pay mode.
     *
     * @param authTradePayMode the auth trade pay mode
     */
    public void setAuthTradePayMode(String authTradePayMode) {
		this.authTradePayMode = authTradePayMode;
	}

    /**
     * Gets auth trade pay mode.
     *
     * @return the auth trade pay mode
     */
    public String getAuthTradePayMode( ) {
		return this.authTradePayMode;
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
     * Gets buyer logon id.
     *
     * @return the buyer logon id
     */
    public String getBuyerLogonId( ) {
		return this.buyerLogonId;
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
     * Gets buyer pay amount.
     *
     * @return the buyer pay amount
     */
    public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
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
     * Gets buyer user id.
     *
     * @return the buyer user id
     */
    public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

    /**
     * Sets buyer user type.
     *
     * @param buyerUserType the buyer user type
     */
    public void setBuyerUserType(String buyerUserType) {
		this.buyerUserType = buyerUserType;
	}

    /**
     * Gets buyer user type.
     *
     * @return the buyer user type
     */
    public String getBuyerUserType( ) {
		return this.buyerUserType;
	}

    /**
     * Sets discount amount.
     *
     * @param discountAmount the discount amount
     */
    public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

    /**
     * Gets discount amount.
     *
     * @return the discount amount
     */
    public String getDiscountAmount( ) {
		return this.discountAmount;
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
     * Gets discount goods detail.
     *
     * @return the discount goods detail
     */
    public String getDiscountGoodsDetail( ) {
		return this.discountGoodsDetail;
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
     * Gets fund bill list.
     *
     * @return the fund bill list
     */
    public List<TradeFundBill> getFundBillList( ) {
		return this.fundBillList;
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
     * Gets industry sepc detail.
     *
     * @return the industry sepc detail
     */
    public String getIndustrySepcDetail( ) {
		return this.industrySepcDetail;
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
     * Gets invoice amount.
     *
     * @return the invoice amount
     */
    public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

    /**
     * Sets mdiscount amount.
     *
     * @param mdiscountAmount the mdiscount amount
     */
    public void setMdiscountAmount(String mdiscountAmount) {
		this.mdiscountAmount = mdiscountAmount;
	}

    /**
     * Gets mdiscount amount.
     *
     * @return the mdiscount amount
     */
    public String getMdiscountAmount( ) {
		return this.mdiscountAmount;
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
     * Gets open id.
     *
     * @return the open id
     */
    public String getOpenId( ) {
		return this.openId;
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
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

    /**
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount( ) {
		return this.payAmount;
	}

    /**
     * Sets pay currency.
     *
     * @param payCurrency the pay currency
     */
    public void setPayCurrency(String payCurrency) {
		this.payCurrency = payCurrency;
	}

    /**
     * Gets pay currency.
     *
     * @return the pay currency
     */
    public String getPayCurrency( ) {
		return this.payCurrency;
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
     * Gets point amount.
     *
     * @return the point amount
     */
    public String getPointAmount( ) {
		return this.pointAmount;
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
     * Gets receipt amount.
     *
     * @return the receipt amount
     */
    public String getReceiptAmount( ) {
		return this.receiptAmount;
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
     * Gets send pay date.
     *
     * @return the send pay date
     */
    public Date getSendPayDate( ) {
		return this.sendPayDate;
	}

    /**
     * Sets settle amount.
     *
     * @param settleAmount the settle amount
     */
    public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

    /**
     * Gets settle amount.
     *
     * @return the settle amount
     */
    public String getSettleAmount( ) {
		return this.settleAmount;
	}

    /**
     * Sets settle currency.
     *
     * @param settleCurrency the settle currency
     */
    public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}

    /**
     * Gets settle currency.
     *
     * @return the settle currency
     */
    public String getSettleCurrency( ) {
		return this.settleCurrency;
	}

    /**
     * Sets settle trans rate.
     *
     * @param settleTransRate the settle trans rate
     */
    public void setSettleTransRate(String settleTransRate) {
		this.settleTransRate = settleTransRate;
	}

    /**
     * Gets settle trans rate.
     *
     * @return the settle trans rate
     */
    public String getSettleTransRate( ) {
		return this.settleTransRate;
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
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId( ) {
		return this.storeId;
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
     * Gets store name.
     *
     * @return the store name
     */
    public String getStoreName( ) {
		return this.storeName;
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
     * Gets terminal id.
     *
     * @return the terminal id
     */
    public String getTerminalId( ) {
		return this.terminalId;
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
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount( ) {
		return this.totalAmount;
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
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
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
     * Gets trade status.
     *
     * @return the trade status
     */
    public String getTradeStatus( ) {
		return this.tradeStatus;
	}

    /**
     * Sets trans currency.
     *
     * @param transCurrency the trans currency
     */
    public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

    /**
     * Gets trans currency.
     *
     * @return the trans currency
     */
    public String getTransCurrency( ) {
		return this.transCurrency;
	}

    /**
     * Sets trans pay rate.
     *
     * @param transPayRate the trans pay rate
     */
    public void setTransPayRate(String transPayRate) {
		this.transPayRate = transPayRate;
	}

    /**
     * Gets trans pay rate.
     *
     * @return the trans pay rate
     */
    public String getTransPayRate( ) {
		return this.transPayRate;
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
     * Gets voucher detail list.
     *
     * @return the voucher detail list
     */
    public List<VoucherDetail> getVoucherDetailList( ) {
		return this.voucherDetailList;
	}

}

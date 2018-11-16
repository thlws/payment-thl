package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.PresetPayToolInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.refund response.
 *
 * @author auto create
 * @since 1.0, 2018-09-14 12:00:21
 */
public class AlipayTradeRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7178383685532584977L;

	/** 
	 * 用户的登录id
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 本次退款是否发生了资金变化
	 */
	@ApiField("fund_change")
	private String fundChange;

	/** 
	 * 退款支付时间
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/** 
	 * 买家支付宝用户号，该参数已废弃，请不要使用
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次退款金额中买家退款金额
	 */
	@ApiField("present_refund_buyer_amount")
	private String presentRefundBuyerAmount;

	/** 
	 * 本次退款金额中平台优惠退款金额
	 */
	@ApiField("present_refund_discount_amount")
	private String presentRefundDiscountAmount;

	/** 
	 * 本次退款金额中商家优惠退款金额
	 */
	@ApiField("present_refund_mdiscount_amount")
	private String presentRefundMdiscountAmount;

	/** 
	 * 退款币种信息
	 */
	@ApiField("refund_currency")
	private String refundCurrency;

	/** 
	 * 退款使用的资金渠道
	 */
	@ApiListField("refund_detail_item_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> refundDetailItemList;

	/** 
	 * 退款总金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 退回的前置资产列表
	 */
	@ApiField("refund_preset_paytool_list")
	private PresetPayToolInfo refundPresetPaytoolList;

	/** 
	 * 本次商户实际退回金额
注：在签约收单产品时需勾选“返回资金明细”才会返回
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	/** 
	 * 交易在支付时候的门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 2013112011001004330000121536
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
     * Sets fund change.
     *
     * @param fundChange the fund change
     */
    public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}

    /**
     * Gets fund change.
     *
     * @return the fund change
     */
    public String getFundChange( ) {
		return this.fundChange;
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
     * Gets gmt refund pay.
     *
     * @return the gmt refund pay
     */
    public Date getGmtRefundPay( ) {
		return this.gmtRefundPay;
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
     * Sets present refund buyer amount.
     *
     * @param presentRefundBuyerAmount the present refund buyer amount
     */
    public void setPresentRefundBuyerAmount(String presentRefundBuyerAmount) {
		this.presentRefundBuyerAmount = presentRefundBuyerAmount;
	}

    /**
     * Gets present refund buyer amount.
     *
     * @return the present refund buyer amount
     */
    public String getPresentRefundBuyerAmount( ) {
		return this.presentRefundBuyerAmount;
	}

    /**
     * Sets present refund discount amount.
     *
     * @param presentRefundDiscountAmount the present refund discount amount
     */
    public void setPresentRefundDiscountAmount(String presentRefundDiscountAmount) {
		this.presentRefundDiscountAmount = presentRefundDiscountAmount;
	}

    /**
     * Gets present refund discount amount.
     *
     * @return the present refund discount amount
     */
    public String getPresentRefundDiscountAmount( ) {
		return this.presentRefundDiscountAmount;
	}

    /**
     * Sets present refund mdiscount amount.
     *
     * @param presentRefundMdiscountAmount the present refund mdiscount amount
     */
    public void setPresentRefundMdiscountAmount(String presentRefundMdiscountAmount) {
		this.presentRefundMdiscountAmount = presentRefundMdiscountAmount;
	}

    /**
     * Gets present refund mdiscount amount.
     *
     * @return the present refund mdiscount amount
     */
    public String getPresentRefundMdiscountAmount( ) {
		return this.presentRefundMdiscountAmount;
	}

    /**
     * Sets refund currency.
     *
     * @param refundCurrency the refund currency
     */
    public void setRefundCurrency(String refundCurrency) {
		this.refundCurrency = refundCurrency;
	}

    /**
     * Gets refund currency.
     *
     * @return the refund currency
     */
    public String getRefundCurrency( ) {
		return this.refundCurrency;
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
     * Gets refund detail item list.
     *
     * @return the refund detail item list
     */
    public List<TradeFundBill> getRefundDetailItemList( ) {
		return this.refundDetailItemList;
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
     * Gets refund fee.
     *
     * @return the refund fee
     */
    public String getRefundFee( ) {
		return this.refundFee;
	}

    /**
     * Sets refund preset paytool list.
     *
     * @param refundPresetPaytoolList the refund preset paytool list
     */
    public void setRefundPresetPaytoolList(PresetPayToolInfo refundPresetPaytoolList) {
		this.refundPresetPaytoolList = refundPresetPaytoolList;
	}

    /**
     * Gets refund preset paytool list.
     *
     * @return the refund preset paytool list
     */
    public PresetPayToolInfo getRefundPresetPaytoolList( ) {
		return this.refundPresetPaytoolList;
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
     * Gets send back fee.
     *
     * @return the send back fee
     */
    public String getSendBackFee( ) {
		return this.sendBackFee;
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

}

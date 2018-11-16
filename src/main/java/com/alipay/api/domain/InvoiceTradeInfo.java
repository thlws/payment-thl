package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票管家交易信息模型
 *
 * @author auto create
 * @since 1.0, 2017-10-17 21:09:03
 */
public class InvoiceTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 7877354799668673574L;

	/**
	 * 支付宝交易号（字段于2017-02-21废弃，请勿使用）
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 交易创建时间 yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("create_trade_date")
	private String createTradeDate;

	/**
	 * 交易号（发票管家指定）
	 */
	@ApiField("einv_trade_id")
	private String einvTradeId;

	/**
	 * 交易商品总称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 发票内容项明细
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_query_open_model")
	private List<InvoiceItemQueryOpenModel> invoiceContent;

	/**
	 * 品牌全称，由商户在发票管家配置
	 */
	@ApiField("m_name")
	private String mName;

	/**
	 * 交易商户品牌简称
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 交易所属的商户id，即卖家主体标志，可以为支付宝的门店id
也可以为支付宝的签约pid，也可以为支付宝的收款账户seller_user_id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户交易订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易支付时间 yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("payment_trade_date")
	private String paymentTradeDate;

	/**
	 * 实际付款金额，不包含商户优惠金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 商户门店全称，由商户在发票管家配置
	 */
	@ApiField("sub_m_name")
	private String subMName;

	/**
	 * 商户交易门店简称，一般由m_short_name+sub_m_short_name确定唯一的商户，这两项配置需要商户提前在支付宝配置
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * 交易总金额，精确到小数点两位，以元为单位
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易资金明细列表
	 */
	@ApiListField("trade_fund_list")
	@ApiField("invoice_trade_fund_item")
	private List<InvoiceTradeFundItem> tradeFundList;

	/**
	 * 交易商品明细列表
	 */
	@ApiListField("trade_goods_list")
	@ApiField("invoice_trade_goods_item")
	private List<InvoiceTradeGoodsItem> tradeGoodsList;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易的买家支付宝账户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets alipay trade no.
     *
     * @return the alipay trade no
     */
    public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}

    /**
     * Sets alipay trade no.
     *
     * @param alipayTradeNo the alipay trade no
     */
    public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

    /**
     * Gets create trade date.
     *
     * @return the create trade date
     */
    public String getCreateTradeDate() {
		return this.createTradeDate;
	}

    /**
     * Sets create trade date.
     *
     * @param createTradeDate the create trade date
     */
    public void setCreateTradeDate(String createTradeDate) {
		this.createTradeDate = createTradeDate;
	}

    /**
     * Gets einv trade id.
     *
     * @return the einv trade id
     */
    public String getEinvTradeId() {
		return this.einvTradeId;
	}

    /**
     * Sets einv trade id.
     *
     * @param einvTradeId the einv trade id
     */
    public void setEinvTradeId(String einvTradeId) {
		this.einvTradeId = einvTradeId;
	}

    /**
     * Gets goods name.
     *
     * @return the goods name
     */
    public String getGoodsName() {
		return this.goodsName;
	}

    /**
     * Sets goods name.
     *
     * @param goodsName the goods name
     */
    public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

    /**
     * Gets invoice content.
     *
     * @return the invoice content
     */
    public List<InvoiceItemQueryOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}

    /**
     * Sets invoice content.
     *
     * @param invoiceContent the invoice content
     */
    public void setInvoiceContent(List<InvoiceItemQueryOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getmName() {
		return this.mName;
	}

    /**
     * Sets name.
     *
     * @param mName the m name
     */
    public void setmName(String mName) {
		this.mName = mName;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getmShortName() {
		return this.mShortName;
	}

    /**
     * Sets short name.
     *
     * @param mShortName the m short name
     */
    public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets payment trade date.
     *
     * @return the payment trade date
     */
    public String getPaymentTradeDate() {
		return this.paymentTradeDate;
	}

    /**
     * Sets payment trade date.
     *
     * @param paymentTradeDate the payment trade date
     */
    public void setPaymentTradeDate(String paymentTradeDate) {
		this.paymentTradeDate = paymentTradeDate;
	}

    /**
     * Gets real amount.
     *
     * @return the real amount
     */
    public String getRealAmount() {
		return this.realAmount;
	}

    /**
     * Sets real amount.
     *
     * @param realAmount the real amount
     */
    public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

    /**
     * Gets sub m name.
     *
     * @return the sub m name
     */
    public String getSubMName() {
		return this.subMName;
	}

    /**
     * Sets sub m name.
     *
     * @param subMName the sub m name
     */
    public void setSubMName(String subMName) {
		this.subMName = subMName;
	}

    /**
     * Gets sub m short name.
     *
     * @return the sub m short name
     */
    public String getSubMShortName() {
		return this.subMShortName;
	}

    /**
     * Sets sub m short name.
     *
     * @param subMShortName the sub m short name
     */
    public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

    /**
     * Gets trade amount.
     *
     * @return the trade amount
     */
    public String getTradeAmount() {
		return this.tradeAmount;
	}

    /**
     * Sets trade amount.
     *
     * @param tradeAmount the trade amount
     */
    public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

    /**
     * Gets trade fund list.
     *
     * @return the trade fund list
     */
    public List<InvoiceTradeFundItem> getTradeFundList() {
		return this.tradeFundList;
	}

    /**
     * Sets trade fund list.
     *
     * @param tradeFundList the trade fund list
     */
    public void setTradeFundList(List<InvoiceTradeFundItem> tradeFundList) {
		this.tradeFundList = tradeFundList;
	}

    /**
     * Gets trade goods list.
     *
     * @return the trade goods list
     */
    public List<InvoiceTradeGoodsItem> getTradeGoodsList() {
		return this.tradeGoodsList;
	}

    /**
     * Sets trade goods list.
     *
     * @param tradeGoodsList the trade goods list
     */
    public void setTradeGoodsList(List<InvoiceTradeGoodsItem> tradeGoodsList) {
		this.tradeGoodsList = tradeGoodsList;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}

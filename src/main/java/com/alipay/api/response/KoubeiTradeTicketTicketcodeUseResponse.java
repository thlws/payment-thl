package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.ticketcode.use response.
 *
 * @author auto create
 * @since 1.0, 2018-08-30 20:00:21
 */
public class KoubeiTradeTicketTicketcodeUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7134232262458825576L;

	/** 
	 * 该字段用于描述本次返回中的业务属性，现有：BIZ_ALREADY_SUCCESS（幂等业务码）
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 用户购买券的时候实际支付的金额，单位为元，精确到小数点后两位
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 用户购买时商品的现价，单位为元，精确到小数点后两位
	 */
	@ApiField("current_price")
	private String currentPrice;

	/** 
	 * 商家优惠金额，单位为元，精确到小数点后两位
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 交易中可给用户开具发票的金额，单位为元，精确到小数点后两位
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 口碑商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 用户购买时商品的名称
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 口碑补贴金额，单位为元，精确到小数点后两位
	 */
	@ApiField("koubei_subsidy_amount")
	private String koubeiSubsidyAmount;

	/** 
	 * 凭证码所属的订单id
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 用户购买时商品的原价，单位为元，精确到小数点后两位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 商家实收金额，单位为元，精确到小数点后两位
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 12位的券码，券码为纯数字，且唯一不重复
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	/** 
	 * 核销流水号
	 */
	@ApiField("ticket_trans_id")
	private String ticketTransId;

	/** 
	 * 券核销时间
	 */
	@ApiField("use_date")
	private String useDate;

	/** 
	 * 券核销门店ID
	 */
	@ApiField("use_shop_id")
	private String useShopId;

	/** 
	 * 券核销门店名称
	 */
	@ApiField("use_shop_name")
	private String useShopName;

	/** 
	 * 凭证码对应的凭证资产id
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Sets biz code.
     *
     * @param bizCode the biz code
     */
    public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

    /**
     * Gets biz code.
     *
     * @return the biz code
     */
    public String getBizCode( ) {
		return this.bizCode;
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
     * Sets current price.
     *
     * @param currentPrice the current price
     */
    public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

    /**
     * Gets current price.
     *
     * @return the current price
     */
    public String getCurrentPrice( ) {
		return this.currentPrice;
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
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId( ) {
		return this.itemId;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName( ) {
		return this.itemName;
	}

    /**
     * Sets koubei subsidy amount.
     *
     * @param koubeiSubsidyAmount the koubei subsidy amount
     */
    public void setKoubeiSubsidyAmount(String koubeiSubsidyAmount) {
		this.koubeiSubsidyAmount = koubeiSubsidyAmount;
	}

    /**
     * Gets koubei subsidy amount.
     *
     * @return the koubei subsidy amount
     */
    public String getKoubeiSubsidyAmount( ) {
		return this.koubeiSubsidyAmount;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

    /**
     * Sets original price.
     *
     * @param originalPrice the original price
     */
    public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

    /**
     * Gets original price.
     *
     * @return the original price
     */
    public String getOriginalPrice( ) {
		return this.originalPrice;
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
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId( ) {
		return this.requestId;
	}

    /**
     * Sets ticket code.
     *
     * @param ticketCode the ticket code
     */
    public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

    /**
     * Gets ticket code.
     *
     * @return the ticket code
     */
    public String getTicketCode( ) {
		return this.ticketCode;
	}

    /**
     * Sets ticket trans id.
     *
     * @param ticketTransId the ticket trans id
     */
    public void setTicketTransId(String ticketTransId) {
		this.ticketTransId = ticketTransId;
	}

    /**
     * Gets ticket trans id.
     *
     * @return the ticket trans id
     */
    public String getTicketTransId( ) {
		return this.ticketTransId;
	}

    /**
     * Sets use date.
     *
     * @param useDate the use date
     */
    public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

    /**
     * Gets use date.
     *
     * @return the use date
     */
    public String getUseDate( ) {
		return this.useDate;
	}

    /**
     * Sets use shop id.
     *
     * @param useShopId the use shop id
     */
    public void setUseShopId(String useShopId) {
		this.useShopId = useShopId;
	}

    /**
     * Gets use shop id.
     *
     * @return the use shop id
     */
    public String getUseShopId( ) {
		return this.useShopId;
	}

    /**
     * Sets use shop name.
     *
     * @param useShopName the use shop name
     */
    public void setUseShopName(String useShopName) {
		this.useShopName = useShopName;
	}

    /**
     * Gets use shop name.
     *
     * @return the use shop name
     */
    public String getUseShopName( ) {
		return this.useShopName;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId( ) {
		return this.voucherId;
	}

}

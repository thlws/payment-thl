package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.lifeassistant.prod.bill.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:05:11
 */
public class AlipayLifeassistantProdBillGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3768782776227269218L;

	/** 
	 * 支付金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 流水号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 支付款项名称
	 */
	@ApiField("order_item")
	private String orderItem;

	/** 
	 * 支付时间，毫秒
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 付款类型
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 收款方名称|机构名称
	 */
	@ApiField("payee")
	private String payee;

	/** 
	 * 交易类型
S——担保交易
FP——即时到帐
COD——货到付款
	 */
	@ApiField("trade_type")
	private String tradeType;

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount( ) {
		return this.amount;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId( ) {
		return this.orderId;
	}

    /**
     * Sets order item.
     *
     * @param orderItem the order item
     */
    public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

    /**
     * Gets order item.
     *
     * @return the order item
     */
    public String getOrderItem( ) {
		return this.orderItem;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public String getPayTime( ) {
		return this.payTime;
	}

    /**
     * Sets pay type.
     *
     * @param payType the pay type
     */
    public void setPayType(String payType) {
		this.payType = payType;
	}

    /**
     * Gets pay type.
     *
     * @return the pay type
     */
    public String getPayType( ) {
		return this.payType;
	}

    /**
     * Sets payee.
     *
     * @param payee the payee
     */
    public void setPayee(String payee) {
		this.payee = payee;
	}

    /**
     * Gets payee.
     *
     * @return the payee
     */
    public String getPayee( ) {
		return this.payee;
	}

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTradeType( ) {
		return this.tradeType;
	}

}

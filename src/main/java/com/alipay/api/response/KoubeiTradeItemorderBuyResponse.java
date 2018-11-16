package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.itemorder.buy response.
 *
 * @author auto create
 * @since 1.0, 2018-05-07 11:30:00
 */
public class KoubeiTradeItemorderBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3153312426971388149L;

	/** 
	 * 收银单id，唤收银台时传入，该参数为请求级别参数，如果二次支付，需要重新获取
	 */
	@ApiField("cashier_order_id")
	private String cashierOrderId;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 支付宝交易号，唤收银台时入参
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Sets cashier order id.
     *
     * @param cashierOrderId the cashier order id
     */
    public void setCashierOrderId(String cashierOrderId) {
		this.cashierOrderId = cashierOrderId;
	}

    /**
     * Gets cashier order id.
     *
     * @return the cashier order id
     */
    public String getCashierOrderId( ) {
		return this.cashierOrderId;
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

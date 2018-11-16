package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.itemorder.refund response.
 *
 * @author auto create
 * @since 1.0, 2018-02-08 13:54:45
 */
public class KoubeiTradeItemorderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1714995929689417768L;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 退款唯一请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 实际退的资金。
	 */
	@ApiField("real_refund_amount")
	private String realRefundAmount;

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
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

    /**
     * Sets real refund amount.
     *
     * @param realRefundAmount the real refund amount
     */
    public void setRealRefundAmount(String realRefundAmount) {
		this.realRefundAmount = realRefundAmount;
	}

    /**
     * Gets real refund amount.
     *
     * @return the real refund amount
     */
    public String getRealRefundAmount( ) {
		return this.realRefundAmount;
	}

}

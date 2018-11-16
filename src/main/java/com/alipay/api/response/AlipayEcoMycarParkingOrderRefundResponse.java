package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.order.refund response.
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:49:32
 */
public class AlipayEcoMycarParkingOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7341916917776624248L;

	/** 
	 * 代扣时返回的支付宝支付交易流水号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部申请退款请求流水，ISV唯一
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/** 
	 * 本次退款金额，保留小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 支付宝退款流水
	 */
	@ApiField("refund_no")
	private String refundNo;

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
     * Sets out refund no.
     *
     * @param outRefundNo the out refund no
     */
    public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

    /**
     * Gets out refund no.
     *
     * @return the out refund no
     */
    public String getOutRefundNo( ) {
		return this.outRefundNo;
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
     * Sets refund no.
     *
     * @param refundNo the refund no
     */
    public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

    /**
     * Gets refund no.
     *
     * @return the refund no
     */
    public String getRefundNo( ) {
		return this.refundNo;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车代扣退款接口
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:49:32
 */
public class AlipayEcoMycarParkingOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8114682323841583747L;

	/**
	 * 代扣时返回的支付宝支付交易流水号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * ISV代扣订单号，ISV唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部申请退款请求流水，ISV唯一
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 退款金额，保留小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款理由
	 */
	@ApiField("refund_reason")
	private String refundReason;

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
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
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out refund no.
     *
     * @return the out refund no
     */
    public String getOutRefundNo() {
		return this.outRefundNo;
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
     * Gets refund fee.
     *
     * @return the refund fee
     */
    public String getRefundFee() {
		return this.refundFee;
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
     * Gets refund reason.
     *
     * @return the refund reason
     */
    public String getRefundReason() {
		return this.refundReason;
	}

    /**
     * Sets refund reason.
     *
     * @param refundReason the refund reason
     */
    public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}

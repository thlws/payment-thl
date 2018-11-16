package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.bill.pay.status response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEbppPdeductBillPayStatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 3416226547793858988L;

	/** 
	 * 支付宝协议流水
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝流billNo
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单的结果码
	 */
	@ApiField("order_result_code")
	private String orderResultCode;

	/** 
	 * 订单的结果描述
	 */
	@ApiField("order_result_msg")
	private String orderResultMsg;

	/** 
	 * 外部订单流水
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付宝订单支付状态。
0：未知状态。
1：支付成功。
2：支付失败。
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId( ) {
		return this.agreementId;
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
     * Sets order result code.
     *
     * @param orderResultCode the order result code
     */
    public void setOrderResultCode(String orderResultCode) {
		this.orderResultCode = orderResultCode;
	}

    /**
     * Gets order result code.
     *
     * @return the order result code
     */
    public String getOrderResultCode( ) {
		return this.orderResultCode;
	}

    /**
     * Sets order result msg.
     *
     * @param orderResultMsg the order result msg
     */
    public void setOrderResultMsg(String orderResultMsg) {
		this.orderResultMsg = orderResultMsg;
	}

    /**
     * Gets order result msg.
     *
     * @return the order result msg
     */
    public String getOrderResultMsg( ) {
		return this.orderResultMsg;
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
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}

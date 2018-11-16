package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.pay response.
 *
 * @author auto create
 * @since 1.0, 2018-08-07 17:07:48
 */
public class AlipayEbppPdeductPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5218672467433924227L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝订单流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 扩展参数
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 商户代扣业务流水
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 针对于支付失败时，给的对应错误明细，如果判断外围的错误码是INVOKE_PAYACCEPTANCE_EXCEPTION需要近一步再结合着结果模型中的result_code, result_msg来判断
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 针对于支付失败时，给的对应错误明细，如果判断外围的错误码是INVOKE_PAYACCEPTANCE_EXCEPTION需要近一步再结合着结果模型中的result_code, result_msg来判断
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 订单支付状态。
0：未知
1：成功
2：失败
	 */
	@ApiField("result_status")
	private String resultStatus;

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
     * Sets bill no.
     *
     * @param billNo the bill no
     */
    public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

    /**
     * Gets bill no.
     *
     * @return the bill no
     */
    public String getBillNo( ) {
		return this.billNo;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField( ) {
		return this.extendField;
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
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
	}

    /**
     * Sets result msg.
     *
     * @param resultMsg the result msg
     */
    public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

    /**
     * Gets result msg.
     *
     * @return the result msg
     */
    public String getResultMsg( ) {
		return this.resultMsg;
	}

    /**
     * Sets result status.
     *
     * @param resultStatus the result status
     */
    public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

    /**
     * Gets result status.
     *
     * @return the result status
     */
    public String getResultStatus( ) {
		return this.resultStatus;
	}

}

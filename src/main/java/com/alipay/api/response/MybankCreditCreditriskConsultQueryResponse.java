package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.consult.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-01 20:15:46
 */
public class MybankCreditCreditriskConsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4877698989513518912L;

	/** 
	 * 可贷额度，单位元
	 */
	@ApiField("available_amt")
	private String availableAmt;

	/** 
	 * 咨询结果，根据具体的场景约定不同的值。
授信前准入场景，返回1表示准入，0表示不准入
	 */
	@ApiField("consult_result_code")
	private String consultResultCode;

	/** 
	 * 咨询结果的描述信息
	 */
	@ApiField("consult_result_msg")
	private String consultResultMsg;

    /**
     * Sets available amt.
     *
     * @param availableAmt the available amt
     */
    public void setAvailableAmt(String availableAmt) {
		this.availableAmt = availableAmt;
	}

    /**
     * Gets available amt.
     *
     * @return the available amt
     */
    public String getAvailableAmt( ) {
		return this.availableAmt;
	}

    /**
     * Sets consult result code.
     *
     * @param consultResultCode the consult result code
     */
    public void setConsultResultCode(String consultResultCode) {
		this.consultResultCode = consultResultCode;
	}

    /**
     * Gets consult result code.
     *
     * @return the consult result code
     */
    public String getConsultResultCode( ) {
		return this.consultResultCode;
	}

    /**
     * Sets consult result msg.
     *
     * @param consultResultMsg the consult result msg
     */
    public void setConsultResultMsg(String consultResultMsg) {
		this.consultResultMsg = consultResultMsg;
	}

    /**
     * Gets consult result msg.
     *
     * @return the consult result msg
     */
    public String getConsultResultMsg( ) {
		return this.consultResultMsg;
	}

}

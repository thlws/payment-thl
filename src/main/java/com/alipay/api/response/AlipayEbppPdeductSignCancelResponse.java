package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.cancel response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEbppPdeductSignCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5324237557543914683L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝协议状态。解约成功则返回success
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 商户代扣协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

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
     * Sets agreement status.
     *
     * @param agreementStatus the agreement status
     */
    public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

    /**
     * Gets agreement status.
     *
     * @return the agreement status
     */
    public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

    /**
     * Sets out agreement id.
     *
     * @param outAgreementId the out agreement id
     */
    public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}

    /**
     * Gets out agreement id.
     *
     * @return the out agreement id
     */
    public String getOutAgreementId( ) {
		return this.outAgreementId;
	}

}

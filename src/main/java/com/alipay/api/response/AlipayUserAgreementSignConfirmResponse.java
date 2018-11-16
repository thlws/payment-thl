package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.sign.confirm response.
 *
 * @author auto create
 * @since 1.0, 2018-01-08 15:35:38
 */
public class AlipayUserAgreementSignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5434834418137376172L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 是否海外购汇身份。值：T/F
	 */
	@ApiField("forex_eligible")
	private String forexEligible;

	/** 
	 * 协议的当前状态。
1. TEMP：暂存，协议未生效过；
2. NORMAL：正常；
3. STOP：暂停。
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets agreement no.
     *
     * @param agreementNo the agreement no
     */
    public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

    /**
     * Gets agreement no.
     *
     * @return the agreement no
     */
    public String getAgreementNo( ) {
		return this.agreementNo;
	}

    /**
     * Sets forex eligible.
     *
     * @param forexEligible the forex eligible
     */
    public void setForexEligible(String forexEligible) {
		this.forexEligible = forexEligible;
	}

    /**
     * Gets forex eligible.
     *
     * @return the forex eligible
     */
    public String getForexEligible( ) {
		return this.forexEligible;
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

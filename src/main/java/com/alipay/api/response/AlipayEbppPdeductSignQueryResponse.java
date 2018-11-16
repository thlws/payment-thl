package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEbppPdeductSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4573638563196591464L;

	/** 
	 * 协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 朗新协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/** 
	 * 签约时间
	 */
	@ApiField("sign_date")
	private String signDate;

	/** 
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

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
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey( ) {
		return this.billKey;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst( ) {
		return this.chargeInst;
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

    /**
     * Sets sign date.
     *
     * @param signDate the sign date
     */
    public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

    /**
     * Gets sign date.
     *
     * @return the sign date
     */
    public String getSignDate( ) {
		return this.signDate;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}

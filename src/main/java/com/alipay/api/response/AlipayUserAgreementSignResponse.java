package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.sign response.
 *
 * @author auto create
 * @since 1.0, 2017-12-07 13:51:38
 */
public class AlipayUserAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5893888598435855138L;

	/** 
	 * 在无需用户确认且签约成功的场景下，会同步返回签约协议号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 返回脱敏的支付宝账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 签约申请成功的场景下，会同步返回用户签约的支付宝账号对应的支付宝唯一用户id。
以2088开头的16位纯数字组成。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 签约申请token，其格式和内容，由支付宝定义。在需要签约确认的场景下，商户可根据申请操作成功时返回的申请token，进行后续的确认操作。
1. 不需要用户进行签约确认时，不返回本参数。
2. 需要用户进行签约确认时，本参数不为空。
	 */
	@ApiField("apply_token")
	private String applyToken;

	/** 
	 * 用户在商户网站的登录账号，如果商户接口中未传，则不会返回
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 是否海外购汇身份
	 */
	@ApiField("forex_eligible")
	private String forexEligible;

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
     * Sets alipay logon id.
     *
     * @param alipayLogonId the alipay logon id
     */
    public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

    /**
     * Gets alipay logon id.
     *
     * @return the alipay logon id
     */
    public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

    /**
     * Sets apply token.
     *
     * @param applyToken the apply token
     */
    public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}

    /**
     * Gets apply token.
     *
     * @return the apply token
     */
    public String getApplyToken( ) {
		return this.applyToken;
	}

    /**
     * Sets external logon id.
     *
     * @param externalLogonId the external logon id
     */
    public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

    /**
     * Gets external logon id.
     *
     * @return the external logon id
     */
    public String getExternalLogonId( ) {
		return this.externalLogonId;
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

}

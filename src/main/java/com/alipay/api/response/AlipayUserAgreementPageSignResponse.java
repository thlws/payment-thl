package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.page.sign response.
 *
 * @author auto create
 * @since 1.0, 2018-08-10 14:35:00
 */
public class AlipayUserAgreementPageSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5648178328327617944L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号。（只有签约成功时才会返回）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 返回脱敏的支付宝账号，如需要返回不脱敏的支付宝用户账号，需要用户在签约页面上授权
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 用户签约的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。(只有签约成功时才会返回)
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/** 
	 * 用户在商户网站的登录账号，如果商户接口中未传，则不会返回
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 是否海外购汇身份。值：T/F（只有在签约成功时才会返回）
	 */
	@ApiField("forex_eligible")
	private String forexEligible;

	/** 
	 * 用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss。（只有签约成功才会返回）
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/** 
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/** 
	 * 当前签约的协议场景。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/** 
	 * 支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss。(只有签约成功才会返回)
	 */
	@ApiField("sign_time")
	private String signTime;

	/** 
	 * 协议的当前状态。
1. TEMP：暂存，协议未生效过；
2. NORMAL：正常；
3. STOP：暂停。  
（只有签约成功才会返回）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss。（只有签约成功才会返回）
	 */
	@ApiField("valid_time")
	private String validTime;

	/** 
	 * 用户的芝麻信用openId，供商户查询用户芝麻信用使用。（只有签约成功时才返回）
	 */
	@ApiField("zm_open_id")
	private String zmOpenId;

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
     * Sets external agreement no.
     *
     * @param externalAgreementNo the external agreement no
     */
    public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

    /**
     * Gets external agreement no.
     *
     * @return the external agreement no
     */
    public String getExternalAgreementNo( ) {
		return this.externalAgreementNo;
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

    /**
     * Sets invalid time.
     *
     * @param invalidTime the invalid time
     */
    public void setInvalidTime(String invalidTime) {
		this.invalidTime = invalidTime;
	}

    /**
     * Gets invalid time.
     *
     * @return the invalid time
     */
    public String getInvalidTime( ) {
		return this.invalidTime;
	}

    /**
     * Sets personal product code.
     *
     * @param personalProductCode the personal product code
     */
    public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

    /**
     * Gets personal product code.
     *
     * @return the personal product code
     */
    public String getPersonalProductCode( ) {
		return this.personalProductCode;
	}

    /**
     * Sets sign scene.
     *
     * @param signScene the sign scene
     */
    public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

    /**
     * Gets sign scene.
     *
     * @return the sign scene
     */
    public String getSignScene( ) {
		return this.signScene;
	}

    /**
     * Sets sign time.
     *
     * @param signTime the sign time
     */
    public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

    /**
     * Gets sign time.
     *
     * @return the sign time
     */
    public String getSignTime( ) {
		return this.signTime;
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

    /**
     * Sets valid time.
     *
     * @param validTime the valid time
     */
    public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

    /**
     * Gets valid time.
     *
     * @return the valid time
     */
    public String getValidTime( ) {
		return this.validTime;
	}

    /**
     * Sets zm open id.
     *
     * @param zmOpenId the zm open id
     */
    public void setZmOpenId(String zmOpenId) {
		this.zmOpenId = zmOpenId;
	}

    /**
     * Gets zm open id.
     *
     * @return the zm open id
     */
    public String getZmOpenId( ) {
		return this.zmOpenId;
	}

}

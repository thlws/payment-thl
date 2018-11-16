package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-06 16:05:00
 */
public class AlipayUserAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2236851379445966918L;

	/** 
	 * 用户签约成功后的协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 返回脱敏的支付宝账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 设备Id
	 */
	@ApiField("device_id")
	private String deviceId;

	/** 
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/** 
	 * 外部登录Id
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 协议失效时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/** 
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/** 
	 * 签约主体类型。
CARD:支付宝账号
CUSTOMER:支付宝用户
	 */
	@ApiField("pricipal_type")
	private String pricipalType;

	/** 
	 * 签约主体标识。
当principal_type为CARD 时，该字段为支付宝用户号;
当principal_type为 CUSTOMER 时，该字段为支付宝用户标识。一个用户 可能有多个支付宝账号，即多个支付宝用户号，但只有一个是支付宝用户标识。
一个支付宝账号对应一个支付宝唯一用户号(以2088开头的16位纯数字组成)。
	 */
	@ApiField("principal_id")
	private String principalId;

	/** 
	 * 签约协议的场景。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/** 
	 * 协议签约时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("sign_time")
	private String signTime;

	/** 
	 * 协议当前状态
1. TEMP：暂存，协议未生效过；
2. NORMAL：正常；
3. STOP：暂停
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
取值范围：
1. PARTNER（平台商户）;
2. MERCHANT（集团商户），集团下子商户可共享用户签约内容;
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/** 
	 * 协议生效时间，格式为 yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_time")
	private String validTime;

	/** 
	 * 用户的芝麻信用 openId，供商 户查询用户芝麻信用使用。
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
     * Sets device id.
     *
     * @param deviceId the device id
     */
    public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

    /**
     * Gets device id.
     *
     * @return the device id
     */
    public String getDeviceId( ) {
		return this.deviceId;
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
     * Sets pricipal type.
     *
     * @param pricipalType the pricipal type
     */
    public void setPricipalType(String pricipalType) {
		this.pricipalType = pricipalType;
	}

    /**
     * Gets pricipal type.
     *
     * @return the pricipal type
     */
    public String getPricipalType( ) {
		return this.pricipalType;
	}

    /**
     * Sets principal id.
     *
     * @param principalId the principal id
     */
    public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

    /**
     * Gets principal id.
     *
     * @return the principal id
     */
    public String getPrincipalId( ) {
		return this.principalId;
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
     * Sets third party type.
     *
     * @param thirdPartyType the third party type
     */
    public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

    /**
     * Gets third party type.
     *
     * @return the third party type
     */
    public String getThirdPartyType( ) {
		return this.thirdPartyType;
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.testaccount.create response.
 *
 * @author auto create
 * @since 1.0, 2017-05-10 20:20:03
 */
public class AlipayUserAntpaasTestaccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3592154957625391277L;

	/** 
	 * 认证等级，L1 L2 L3
	 */
	@ApiField("account_level")
	private String accountLevel;

	/** 
	 * 证件中的姓名，必须为中文，尽量不要超过6个汉字
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型，IDENTITY_CARD 身份证，PASSPORT 护照，HK_MC_CARD 港澳证件
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * havanaId
	 */
	@ApiField("havana_id")
	private String havanaId;

	/** 
	 * abc123@alitest.com
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * 登录名类型，EMAIL,MOBILE
	 */
	@ApiField("logon_type")
	private String logonType;

	/** 
	 * message，错误信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 支付密码
	 */
	@ApiField("payment_password")
	private String paymentPassword;

	/** 
	 * 登录密码
	 */
	@ApiField("query_password")
	private String queryPassword;

	/** 
	 * success，返回结果,T,F
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 新创建的账户id，accountNo
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 账户状态，T,Q
	 */
	@ApiField("user_status")
	private String userStatus;

	/** 
	 * 账户类型，个人企业 PERSON ORG
	 */
	@ApiField("user_type")
	private String userType;

    /**
     * Sets account level.
     *
     * @param accountLevel the account level
     */
    public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
	}

    /**
     * Gets account level.
     *
     * @return the account level
     */
    public String getAccountLevel( ) {
		return this.accountLevel;
	}

    /**
     * Sets cert name.
     *
     * @param certName the cert name
     */
    public void setCertName(String certName) {
		this.certName = certName;
	}

    /**
     * Gets cert name.
     *
     * @return the cert name
     */
    public String getCertName( ) {
		return this.certName;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo( ) {
		return this.certNo;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType( ) {
		return this.certType;
	}

    /**
     * Sets havana id.
     *
     * @param havanaId the havana id
     */
    public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

    /**
     * Gets havana id.
     *
     * @return the havana id
     */
    public String getHavanaId( ) {
		return this.havanaId;
	}

    /**
     * Sets logon id.
     *
     * @param logonId the logon id
     */
    public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

    /**
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId( ) {
		return this.logonId;
	}

    /**
     * Sets logon type.
     *
     * @param logonType the logon type
     */
    public void setLogonType(String logonType) {
		this.logonType = logonType;
	}

    /**
     * Gets logon type.
     *
     * @return the logon type
     */
    public String getLogonType( ) {
		return this.logonType;
	}

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
		this.message = message;
	}

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage( ) {
		return this.message;
	}

    /**
     * Sets payment password.
     *
     * @param paymentPassword the payment password
     */
    public void setPaymentPassword(String paymentPassword) {
		this.paymentPassword = paymentPassword;
	}

    /**
     * Gets payment password.
     *
     * @return the payment password
     */
    public String getPaymentPassword( ) {
		return this.paymentPassword;
	}

    /**
     * Sets query password.
     *
     * @param queryPassword the query password
     */
    public void setQueryPassword(String queryPassword) {
		this.queryPassword = queryPassword;
	}

    /**
     * Gets query password.
     *
     * @return the query password
     */
    public String getQueryPassword( ) {
		return this.queryPassword;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(String success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public String getSuccess( ) {
		return this.success;
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

    /**
     * Sets user status.
     *
     * @param userStatus the user status
     */
    public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

    /**
     * Gets user status.
     *
     * @return the user status
     */
    public String getUserStatus( ) {
		return this.userStatus;
	}

    /**
     * Sets user type.
     *
     * @param userType the user type
     */
    public void setUserType(String userType) {
		this.userType = userType;
	}

    /**
     * Gets user type.
     *
     * @return the user type
     */
    public String getUserType( ) {
		return this.userType;
	}

}

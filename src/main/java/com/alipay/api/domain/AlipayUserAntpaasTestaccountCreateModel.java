package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建测试支付宝账户
 *
 * @author auto create
 * @since 1.0, 2017-05-10 20:20:03
 */
public class AlipayUserAntpaasTestaccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6885993824379214633L;

	/**
	 * 认证等级，L1，L2，L3，L3可以开店
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
	 * 登录名，如邮箱的值
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 登录名类型，EMAIL
	 */
	@ApiField("logon_type")
	private String logonType;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作类型，CREATION 仅创建, CERTIFY 仅认证, CREATION_AND_CERTIFY 创建+认证
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 操作者工号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 调用方IP地址
	 */
	@ApiField("remote_ip")
	private String remoteIp;

	/**
	 * 支付宝账户id，accountNo
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 账户状态，T Q
	 */
	@ApiField("user_status")
	private String userStatus;

	/**
	 * 账户类型，PERSON 个人 ORG 企业
	 */
	@ApiField("user_type")
	private String userType;

    /**
     * Gets account level.
     *
     * @return the account level
     */
    public String getAccountLevel() {
		return this.accountLevel;
	}

    /**
     * Sets account level.
     *
     * @param accountLevel the account level
     */
    public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
	}

    /**
     * Gets cert name.
     *
     * @return the cert name
     */
    public String getCertName() {
		return this.certName;
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
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
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
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType() {
		return this.certType;
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
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId() {
		return this.logonId;
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
     * Gets logon type.
     *
     * @return the logon type
     */
    public String getLogonType() {
		return this.logonType;
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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets operation type.
     *
     * @return the operation type
     */
    public String getOperationType() {
		return this.operationType;
	}

    /**
     * Sets operation type.
     *
     * @param operationType the operation type
     */
    public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets remote ip.
     *
     * @return the remote ip
     */
    public String getRemoteIp() {
		return this.remoteIp;
	}

    /**
     * Sets remote ip.
     *
     * @param remoteIp the remote ip
     */
    public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
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
     * Gets user status.
     *
     * @return the user status
     */
    public String getUserStatus() {
		return this.userStatus;
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
     * Gets user type.
     *
     * @return the user type
     */
    public String getUserType() {
		return this.userType;
	}

    /**
     * Sets user type.
     *
     * @param userType the user type
     */
    public void setUserType(String userType) {
		this.userType = userType;
	}

}

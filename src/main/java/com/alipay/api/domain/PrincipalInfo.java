package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求身份安全业务的用户主体信息
 *
 * @author auto create
 * @since 1.0, 2017-11-28 15:46:58
 */
public class PrincipalInfo extends AlipayObject {

	private static final long serialVersionUID = 5436763418541534635L;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 证件号
	 */
	@ApiField("operator_cert_no")
	private String operatorCertNo;

	/**
	 * 证件类型，例如身份证，护照等
	 */
	@ApiField("operator_cert_type")
	private String operatorCertType;

	/**
	 * 用户主体信息的扩展参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 租户信息
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 业务方传入的用户标识
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets mobile no.
     *
     * @return the mobile no
     */
    public String getMobileNo() {
		return this.mobileNo;
	}

    /**
     * Sets mobile no.
     *
     * @param mobileNo the mobile no
     */
    public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

    /**
     * Gets operator cert no.
     *
     * @return the operator cert no
     */
    public String getOperatorCertNo() {
		return this.operatorCertNo;
	}

    /**
     * Sets operator cert no.
     *
     * @param operatorCertNo the operator cert no
     */
    public void setOperatorCertNo(String operatorCertNo) {
		this.operatorCertNo = operatorCertNo;
	}

    /**
     * Gets operator cert type.
     *
     * @return the operator cert type
     */
    public String getOperatorCertType() {
		return this.operatorCertType;
	}

    /**
     * Sets operator cert type.
     *
     * @param operatorCertType the operator cert type
     */
    public void setOperatorCertType(String operatorCertType) {
		this.operatorCertType = operatorCertType;
	}

    /**
     * Gets params.
     *
     * @return the params
     */
    public String getParams() {
		return this.params;
	}

    /**
     * Sets params.
     *
     * @param params the params
     */
    public void setParams(String params) {
		this.params = params;
	}

    /**
     * Gets tnt inst id.
     *
     * @return the tnt inst id
     */
    public String getTntInstId() {
		return this.tntInstId;
	}

    /**
     * Sets tnt inst id.
     *
     * @param tntInstId the tnt inst id
     */
    public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
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
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

}

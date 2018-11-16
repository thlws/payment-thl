package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员信息详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AlipayUserDetail extends AlipayObject {

	private static final long serialVersionUID = 4699344436266513235L;

	/**
	 * 支付宝用户userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 是否通过实名认证
	 */
	@ApiField("certified")
	private Boolean certified;

	/**
	 * 支付宝登录号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 性别。可选值:m(男),f(女)
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 用户状态。可选:normal(正常), supervise (监管),delete(注销)
	 */
	@ApiField("user_status")
	private String userStatus;

	/**
	 * 用户类型。可选：personal（个人），company（公司）
	 */
	@ApiField("user_type")
	private String userType;

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
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
     * Gets certified.
     *
     * @return the certified
     */
    public Boolean getCertified() {
		return this.certified;
	}

    /**
     * Sets certified.
     *
     * @param certified the certified
     */
    public void setCertified(Boolean certified) {
		this.certified = certified;
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
     * Gets real name.
     *
     * @return the real name
     */
    public String getRealName() {
		return this.realName;
	}

    /**
     * Sets real name.
     *
     * @param realName the real name
     */
    public void setRealName(String realName) {
		this.realName = realName;
	}

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
		return this.sex;
	}

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
		this.sex = sex;
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

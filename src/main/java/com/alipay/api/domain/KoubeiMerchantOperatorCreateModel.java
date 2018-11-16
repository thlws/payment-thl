package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建操作员
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:43:32
 */
public class KoubeiMerchantOperatorCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3228539735958762544L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 部门ID
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 折让限额单位
	 */
	@ApiField("discount_limit_unit")
	private String discountLimitUnit;

	/**
	 * 折让限额值
	 */
	@ApiField("discount_limit_value")
	private String discountLimitValue;

	/**
	 * 免单限额单位
	 */
	@ApiField("free_limit_unit")
	private String freeLimitUnit;

	/**
	 * 免单限额
	 */
	@ApiField("free_limit_value")
	private String freeLimitValue;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 操作员绑定的部门类型 5-部门，6-门店
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 登录名
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作员名字
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 角色ID, 示例值角色为店长
	 */
	@ApiField("role_id")
	private String roleId;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets department id.
     *
     * @return the department id
     */
    public String getDepartmentId() {
		return this.departmentId;
	}

    /**
     * Sets department id.
     *
     * @param departmentId the department id
     */
    public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

    /**
     * Gets discount limit unit.
     *
     * @return the discount limit unit
     */
    public String getDiscountLimitUnit() {
		return this.discountLimitUnit;
	}

    /**
     * Sets discount limit unit.
     *
     * @param discountLimitUnit the discount limit unit
     */
    public void setDiscountLimitUnit(String discountLimitUnit) {
		this.discountLimitUnit = discountLimitUnit;
	}

    /**
     * Gets discount limit value.
     *
     * @return the discount limit value
     */
    public String getDiscountLimitValue() {
		return this.discountLimitValue;
	}

    /**
     * Sets discount limit value.
     *
     * @param discountLimitValue the discount limit value
     */
    public void setDiscountLimitValue(String discountLimitValue) {
		this.discountLimitValue = discountLimitValue;
	}

    /**
     * Gets free limit unit.
     *
     * @return the free limit unit
     */
    public String getFreeLimitUnit() {
		return this.freeLimitUnit;
	}

    /**
     * Sets free limit unit.
     *
     * @param freeLimitUnit the free limit unit
     */
    public void setFreeLimitUnit(String freeLimitUnit) {
		this.freeLimitUnit = freeLimitUnit;
	}

    /**
     * Gets free limit value.
     *
     * @return the free limit value
     */
    public String getFreeLimitValue() {
		return this.freeLimitValue;
	}

    /**
     * Sets free limit value.
     *
     * @param freeLimitValue the free limit value
     */
    public void setFreeLimitValue(String freeLimitValue) {
		this.freeLimitValue = freeLimitValue;
	}

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
		return this.gender;
	}

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
		this.gender = gender;
	}

    /**
     * Gets job type.
     *
     * @return the job type
     */
    public String getJobType() {
		return this.jobType;
	}

    /**
     * Sets job type.
     *
     * @param jobType the job type
     */
    public void setJobType(String jobType) {
		this.jobType = jobType;
	}

    /**
     * Gets login id.
     *
     * @return the login id
     */
    public String getLoginId() {
		return this.loginId;
	}

    /**
     * Sets login id.
     *
     * @param loginId the login id
     */
    public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets operator name.
     *
     * @return the operator name
     */
    public String getOperatorName() {
		return this.operatorName;
	}

    /**
     * Sets operator name.
     *
     * @param operatorName the operator name
     */
    public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public String getRoleId() {
		return this.roleId;
	}

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新操作员信息
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:43:06
 */
public class KoubeiMerchantOperatorModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2149973257237918813L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 组织部门ID
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
	 * 每天
	 */
	@ApiField("free_limit_unit")
	private String freeLimitUnit;

	/**
	 * 免单限额值
	 */
	@ApiField("free_limit_value")
	private String freeLimitValue;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 5-非叶子节点，6叶子节点
	 */
	@ApiField("job_type")
	private String jobType;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作员Id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员姓名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 操作员角色ID
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

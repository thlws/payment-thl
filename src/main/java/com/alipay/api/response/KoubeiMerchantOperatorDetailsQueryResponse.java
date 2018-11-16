package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.details.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:44:03
 */
public class KoubeiMerchantOperatorDetailsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3157855696368152233L;

	/** 
	 * 操作员所属的部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/** 
	 * 操作员所属的组织部门名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/** 
	 * 折让限额单位长度不合法
	 */
	@ApiField("discount_limit_unit")
	private String discountLimitUnit;

	/** 
	 * 折让限额
	 */
	@ApiField("discount_limit_value")
	private String discountLimitValue;

	/** 
	 * 30
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
	 * 操作员关联的部门类型
5-部门
6-门店
	 */
	@ApiField("job_type")
	private String jobType;

	/** 
	 * 操作员登录账号
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 管理的门店数量
	 */
	@ApiField("manage_shops")
	private String manageShops;

	/** 
	 * 操作员绑定的手机号，会用于接收短信校验码和短信通知
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/** 
	 * 操作员真实姓名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/** 
	 * 操作员激活码
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/** 
	 * 角色代码
	 */
	@ApiField("role_code")
	private String roleCode;

	/** 
	 * 操作员关联的角色id
	 */
	@ApiField("role_id")
	private String roleId;

	/** 
	 * 操作员关联的角色名称
	 */
	@ApiField("role_name")
	private String roleName;

	/** 
	 * 操作员状态： 未激活-W，锁定-U，正常-T
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets department id.
     *
     * @param departmentId the department id
     */
    public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

    /**
     * Gets department id.
     *
     * @return the department id
     */
    public String getDepartmentId( ) {
		return this.departmentId;
	}

    /**
     * Sets department name.
     *
     * @param departmentName the department name
     */
    public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

    /**
     * Gets department name.
     *
     * @return the department name
     */
    public String getDepartmentName( ) {
		return this.departmentName;
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
     * Gets discount limit unit.
     *
     * @return the discount limit unit
     */
    public String getDiscountLimitUnit( ) {
		return this.discountLimitUnit;
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
     * Gets discount limit value.
     *
     * @return the discount limit value
     */
    public String getDiscountLimitValue( ) {
		return this.discountLimitValue;
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
     * Gets free limit unit.
     *
     * @return the free limit unit
     */
    public String getFreeLimitUnit( ) {
		return this.freeLimitUnit;
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
     * Gets free limit value.
     *
     * @return the free limit value
     */
    public String getFreeLimitValue( ) {
		return this.freeLimitValue;
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
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender( ) {
		return this.gender;
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
     * Gets job type.
     *
     * @return the job type
     */
    public String getJobType( ) {
		return this.jobType;
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
     * Gets login id.
     *
     * @return the login id
     */
    public String getLoginId( ) {
		return this.loginId;
	}

    /**
     * Sets manage shops.
     *
     * @param manageShops the manage shops
     */
    public void setManageShops(String manageShops) {
		this.manageShops = manageShops;
	}

    /**
     * Gets manage shops.
     *
     * @return the manage shops
     */
    public String getManageShops( ) {
		return this.manageShops;
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
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile( ) {
		return this.mobile;
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
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId( ) {
		return this.operatorId;
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
     * Gets operator name.
     *
     * @return the operator name
     */
    public String getOperatorName( ) {
		return this.operatorName;
	}

    /**
     * Sets qr code url.
     *
     * @param qrCodeUrl the qr code url
     */
    public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

    /**
     * Gets qr code url.
     *
     * @return the qr code url
     */
    public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

    /**
     * Sets role code.
     *
     * @param roleCode the role code
     */
    public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

    /**
     * Gets role code.
     *
     * @return the role code
     */
    public String getRoleCode( ) {
		return this.roleCode;
	}

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public String getRoleId( ) {
		return this.roleId;
	}

    /**
     * Sets role name.
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName( ) {
		return this.roleName;
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

}

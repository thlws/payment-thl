package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商家中心员工管理，操作员基本信息
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:31:50
 */
public class OperatorBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2843358743913675482L;

	/**
	 * 操作员所属部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 操作员所属部门的部门树
	 */
	@ApiField("dept_path")
	private String deptPath;

	/**
	 * 操作员联系手机
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作员别名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 操作员id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 操作员类型，只区分收银员和非收银员
收银员为“RESTRICTED_CASHIER”，非收银员为“STANDARD_NORMAL”
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 描述当前操作员角色类型，CASHIER为收银员，SHOPKEEPER为店长，只有系统角色才有role_code
	 */
	@ApiField("role_code")
	private String roleCode;

	/**
	 * 操作员所属角色id
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 员工管理里的角色
	 */
	@ApiField("role_name")
	private String roleName;

	/**
	 * 操作员状态值，T为激活，W为未激活
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets dept id.
     *
     * @return the dept id
     */
    public String getDeptId() {
		return this.deptId;
	}

    /**
     * Sets dept id.
     *
     * @param deptId the dept id
     */
    public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

    /**
     * Gets dept path.
     *
     * @return the dept path
     */
    public String getDeptPath() {
		return this.deptPath;
	}

    /**
     * Sets dept path.
     *
     * @param deptPath the dept path
     */
    public void setDeptPath(String deptPath) {
		this.deptPath = deptPath;
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
     * Gets nick name.
     *
     * @return the nick name
     */
    public String getNickName() {
		return this.nickName;
	}

    /**
     * Sets nick name.
     *
     * @param nickName the nick name
     */
    public void setNickName(String nickName) {
		this.nickName = nickName;
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
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

    /**
     * Gets role code.
     *
     * @return the role code
     */
    public String getRoleCode() {
		return this.roleCode;
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

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
		return this.roleName;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}

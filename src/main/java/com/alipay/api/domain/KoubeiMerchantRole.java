package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户角色模型
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:23:52
 */
public class KoubeiMerchantRole extends AlipayObject {

	private static final long serialVersionUID = 4655584252497418229L;

	/**
	 * 员工数量
	 */
	@ApiField("operator_num")
	private String operatorNum;

	/**
	 * 权限数量
	 */
	@ApiField("permission_num")
	private String permissionNum;

	/**
	 * 角色标识码，如财务
	 */
	@ApiField("role_code")
	private String roleCode;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 角色名称
	 */
	@ApiField("role_name")
	private String roleName;

    /**
     * Gets operator num.
     *
     * @return the operator num
     */
    public String getOperatorNum() {
		return this.operatorNum;
	}

    /**
     * Sets operator num.
     *
     * @param operatorNum the operator num
     */
    public void setOperatorNum(String operatorNum) {
		this.operatorNum = operatorNum;
	}

    /**
     * Gets permission num.
     *
     * @return the permission num
     */
    public String getPermissionNum() {
		return this.permissionNum;
	}

    /**
     * Sets permission num.
     *
     * @param permissionNum the permission num
     */
    public void setPermissionNum(String permissionNum) {
		this.permissionNum = permissionNum;
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

}

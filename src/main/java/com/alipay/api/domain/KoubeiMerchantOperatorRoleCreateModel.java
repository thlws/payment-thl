package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑操作员角色新增或者修改
 *
 * @author auto create
 * @since 1.0, 2018-05-30 15:42:52
 */
public class KoubeiMerchantOperatorRoleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8586572696234664265L;

	/**
	 * 操作员ID
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 角色名称，修改时必填
	 */
	@ApiField("role_name")
	private String roleName;

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

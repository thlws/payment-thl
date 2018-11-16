package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 角色删除
 *
 * @author auto create
 * @since 1.0, 2018-05-30 15:43:25
 */
public class KoubeiMerchantOperatorRoleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3864567945229381929L;

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

}

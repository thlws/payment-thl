package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询角色信息
 *
 * @author auto create
 * @since 1.0, 2018-05-30 15:42:02
 */
public class KoubeiMerchantOperatorRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1113456478472147672L;

	/**
	 * 当前操作员ID
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 角色ID,若传入刚查对应角色ID的信息
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

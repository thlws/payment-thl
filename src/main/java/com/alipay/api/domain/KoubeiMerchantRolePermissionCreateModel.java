package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv权限保存
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:28:04
 */
public class KoubeiMerchantRolePermissionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7422123845785434884L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 需要增加的isv权限
	 */
	@ApiListField("permissions_to_add")
	@ApiField("business_permission")
	private List<BusinessPermission> permissionsToAdd;

	/**
	 * 需要删除的权限
	 */
	@ApiListField("permissions_to_delete")
	@ApiField("business_permission")
	private List<BusinessPermission> permissionsToDelete;

	/**
	 * 与principal_type配合使用，当principal_type为ROLE时，principal_id为角色id，当principal_type为OPERATOR时，principal_id为操作员id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 与principal_id配合使用，当principal_type为ROLE时，principal_id为角色id，当principal_type为OPERATOR时，principal_id为操作员id
	 */
	@ApiField("principal_type")
	private String principalType;

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
     * Gets permissions to add.
     *
     * @return the permissions to add
     */
    public List<BusinessPermission> getPermissionsToAdd() {
		return this.permissionsToAdd;
	}

    /**
     * Sets permissions to add.
     *
     * @param permissionsToAdd the permissions to add
     */
    public void setPermissionsToAdd(List<BusinessPermission> permissionsToAdd) {
		this.permissionsToAdd = permissionsToAdd;
	}

    /**
     * Gets permissions to delete.
     *
     * @return the permissions to delete
     */
    public List<BusinessPermission> getPermissionsToDelete() {
		return this.permissionsToDelete;
	}

    /**
     * Sets permissions to delete.
     *
     * @param permissionsToDelete the permissions to delete
     */
    public void setPermissionsToDelete(List<BusinessPermission> permissionsToDelete) {
		this.permissionsToDelete = permissionsToDelete;
	}

    /**
     * Gets principal id.
     *
     * @return the principal id
     */
    public String getPrincipalId() {
		return this.principalId;
	}

    /**
     * Sets principal id.
     *
     * @param principalId the principal id
     */
    public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

    /**
     * Gets principal type.
     *
     * @return the principal type
     */
    public String getPrincipalType() {
		return this.principalType;
	}

    /**
     * Sets principal type.
     *
     * @param principalType the principal type
     */
    public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

}

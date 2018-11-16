package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessPermission;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.role.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-16 19:00:54
 */
public class KoubeiMerchantRoleDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5153458693838778917L;

	/** 
	 * 根据主体查询到的主体拥有的角色信息
	 */
	@ApiListField("permissions")
	@ApiField("business_permission")
	private List<BusinessPermission> permissions;

	/** 
	 * 角色码
	 */
	@ApiField("role_code")
	private String roleCode;

	/** 
	 * 人员管理场景角色id
	 */
	@ApiField("role_id")
	private String roleId;

	/** 
	 * 人员管理场景角色名称
	 */
	@ApiField("role_name")
	private String roleName;

    /**
     * Sets permissions.
     *
     * @param permissions the permissions
     */
    public void setPermissions(List<BusinessPermission> permissions) {
		this.permissions = permissions;
	}

    /**
     * Gets permissions.
     *
     * @return the permissions
     */
    public List<BusinessPermission> getPermissions( ) {
		return this.permissions;
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

}

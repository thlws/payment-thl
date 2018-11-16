package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.role.create response.
 *
 * @author auto create
 * @since 1.0, 2018-05-30 15:42:55
 */
public class KoubeiMerchantOperatorRoleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4865786523119287278L;

	/** 
	 * 新增返回角色roleId,修改则返回修改的roleId.
	 */
	@ApiField("role_id")
	private String roleId;

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

}

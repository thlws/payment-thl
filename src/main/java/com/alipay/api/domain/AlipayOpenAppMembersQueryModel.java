package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序查询成员
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:25:09
 */
public class AlipayOpenAppMembersQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3135179166257388621L;

	/**
	 * 成员的角色类型，DEVELOPER-开发者，EXPERIENCER-体验者
	 */
	@ApiField("role")
	private String role;

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
		return this.role;
	}

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
		this.role = role;
	}

}

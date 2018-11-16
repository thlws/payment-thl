package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加小程序开发者或体验者
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:17:53
 */
public class AlipayOpenAppMembersCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4373484922918491242L;

	/**
	 * 支付宝登录账号ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 成员的角色类型，DEVELOPER-开发者，EXPERIENCER-体验者
	 */
	@ApiField("role")
	private String role;

    /**
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId() {
		return this.logonId;
	}

    /**
     * Sets logon id.
     *
     * @param logonId the logon id
     */
    public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

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

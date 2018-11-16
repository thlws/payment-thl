package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约情况
 *
 * @author auto create
 * @since 1.0, 2017-02-10 14:26:07
 */
public class KbadvertRoleInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 2858718495648119384L;

	/**
	 * 角色code
	 */
	@ApiField("role_code")
	private String roleCode;

	/**
	 * NOT_OPEN:未开通
OPENED:已经开通
	 */
	@ApiField("status")
	private String status;

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

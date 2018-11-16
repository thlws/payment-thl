package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.role.create response.
 *
 * @author auto create
 * @since 1.0, 2017-09-25 21:10:11
 */
public class MybankCreditUserRoleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3667852514536329824L;

	/** 
	 * 参与者
	 */
	@ApiField("ip_id")
	private String ipId;

	/** 
	 * 参与者会员角色号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

    /**
     * Sets ip id.
     *
     * @param ipId the ip id
     */
    public void setIpId(String ipId) {
		this.ipId = ipId;
	}

    /**
     * Gets ip id.
     *
     * @return the ip id
     */
    public String getIpId( ) {
		return this.ipId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId( ) {
		return this.ipRoleId;
	}

}

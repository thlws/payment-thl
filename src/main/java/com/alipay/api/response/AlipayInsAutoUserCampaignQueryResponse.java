package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.campaign.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-28 11:02:50
 */
public class AlipayInsAutoUserCampaignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3615289716916494831L;

	/** 
	 * 用户参与状态。
未参与：WITHOUT_REGISTER
参与：REGISTER
	 */
	@ApiField("register_status")
	private String registerStatus;

    /**
     * Sets register status.
     *
     * @param registerStatus the register status
     */
    public void setRegisterStatus(String registerStatus) {
		this.registerStatus = registerStatus;
	}

    /**
     * Gets register status.
     *
     * @return the register status
     */
    public String getRegisterStatus( ) {
		return this.registerStatus;
	}

}

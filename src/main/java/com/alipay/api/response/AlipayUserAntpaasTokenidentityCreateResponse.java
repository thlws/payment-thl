package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.tokenidentity.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-20 12:10:00
 */
public class AlipayUserAntpaasTokenidentityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1873813322746213586L;

	/** 
	 * 蚂蚁通行证id
	 */
	@ApiField("ant_id")
	private String antId;

	/** 
	 * 支付宝用户Id，即匿名用户Id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets ant id.
     *
     * @param antId the ant id
     */
    public void setAntId(String antId) {
		this.antId = antId;
	}

    /**
     * Gets ant id.
     *
     * @return the ant id
     */
    public String getAntId( ) {
		return this.antId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}

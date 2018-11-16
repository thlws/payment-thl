package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.userid.get response.
 *
 * @author auto create
 * @since 1.0, 2016-10-25 19:01:45
 */
public class AlipayUserAntpaasUseridGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1853913182863611943L;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

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

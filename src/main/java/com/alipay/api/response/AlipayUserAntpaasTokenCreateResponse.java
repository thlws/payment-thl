package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.token.create response.
 *
 * @author auto create
 * @since 1.0, 2016-12-06 11:57:17
 */
public class AlipayUserAntpaasTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3778289374987525413L;

	/** 
	 * 蚂蚁通行证id
	 */
	@ApiField("ant_id")
	private String antId;

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

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.auth.info.authquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaAuthInfoAuthqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8475245953654647949L;

	/** 
	 * 是否已经授权,已授权:true,未授权:false
	 */
	@ApiField("authorized")
	private Boolean authorized;

    /**
     * Sets authorized.
     *
     * @param authorized the authorized
     */
    public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}

    /**
     * Gets authorized.
     *
     * @return the authorized
     */
    public Boolean getAuthorized( ) {
		return this.authorized;
	}

}

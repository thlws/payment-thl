package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.app.token.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-13 19:13:06
 */
public class AlipayAppTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1384736441289757854L;

	/** 
	 * 应用访问令牌
	 */
	@ApiField("app_access_token")
	private String appAccessToken;

	/** 
	 * 应用访问凭证有效时间，单位：秒
	 */
	@ApiField("expires_in")
	private Long expiresIn;

    /**
     * Sets app access token.
     *
     * @param appAccessToken the app access token
     */
    public void setAppAccessToken(String appAccessToken) {
		this.appAccessToken = appAccessToken;
	}

    /**
     * Gets app access token.
     *
     * @return the app access token
     */
    public String getAppAccessToken( ) {
		return this.appAccessToken;
	}

    /**
     * Sets expires in.
     *
     * @param expiresIn the expires in
     */
    public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}

    /**
     * Gets expires in.
     *
     * @return the expires in
     */
    public Long getExpiresIn( ) {
		return this.expiresIn;
	}

}

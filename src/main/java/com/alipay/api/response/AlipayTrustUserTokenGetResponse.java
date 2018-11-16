package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.token.get response.
 *
 * @author auto create
 * @since 1.0, 2015-05-06 18:13:09
 */
public class AlipayTrustUserTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8554346471765552241L;

	/** 
	 * 访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 本字段已废弃
	 */
	@ApiField("refresh_token")
	private String refreshToken;

    /**
     * Sets access token.
     *
     * @param accessToken the access token
     */
    public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

    /**
     * Gets access token.
     *
     * @return the access token
     */
    public String getAccessToken( ) {
		return this.accessToken;
	}

    /**
     * Sets refresh token.
     *
     * @param refreshToken the refresh token
     */
    public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

    /**
     * Gets refresh token.
     *
     * @return the refresh token
     */
    public String getRefreshToken( ) {
		return this.refreshToken;
	}

}

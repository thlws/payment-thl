package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.auth.zhimaper.inner.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-08-07 16:45:00
 */
public class AlipayUserAuthZhimaperInnerApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5445638738294843527L;

	/** 
	 * 访问令牌。通过该令牌调用需要授权类接口
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 令牌类型，permanent表示返回的access_token和refresh_token永久有效，不受expires_in和re_expires_in限制，默认是空，即受expires_in和re_expires_in限制的时效性令牌
	 */
	@ApiField("auth_token_type")
	private String authTokenType;

	/** 
	 * 刷新令牌。通过该令牌可以刷新access_token
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
     * Sets auth token type.
     *
     * @param authTokenType the auth token type
     */
    public void setAuthTokenType(String authTokenType) {
		this.authTokenType = authTokenType;
	}

    /**
     * Gets auth token type.
     *
     * @return the auth token type
     */
    public String getAuthTokenType( ) {
		return this.authTokenType;
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

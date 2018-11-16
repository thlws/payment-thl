package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.system.oauth.token response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipaySystemOauthTokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 4724455858631684217L;

	/** 
	 * 访问令牌。通过该令牌调用需要授权类接口
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 已废弃，请勿使用
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 令牌类型，permanent表示返回的access_token和refresh_token永久有效，非永久令牌不返回该字段
	 */
	@ApiField("auth_token_type")
	private String authTokenType;

	/** 
	 * 访问令牌的有效时间，单位是秒。
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 刷新令牌的有效时间，单位是秒。
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/** 
	 * 刷新令牌。通过该令牌可以刷新access_token
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 支付宝用户的唯一userId
	 */
	@ApiField("user_id")
	private String userId;

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
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId( ) {
		return this.alipayUserId;
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
     * Sets expires in.
     *
     * @param expiresIn the expires in
     */
    public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

    /**
     * Gets expires in.
     *
     * @return the expires in
     */
    public String getExpiresIn( ) {
		return this.expiresIn;
	}

    /**
     * Sets re expires in.
     *
     * @param reExpiresIn the re expires in
     */
    public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}

    /**
     * Gets re expires in.
     *
     * @return the re expires in
     */
    public String getReExpiresIn( ) {
		return this.reExpiresIn;
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

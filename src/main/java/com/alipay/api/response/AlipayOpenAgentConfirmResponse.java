package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.confirm response.
 *
 * @author auto create
 * @since 1.0, 2018-06-15 11:24:58
 */
public class AlipayOpenAgentConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1367678691476283546L;

	/** 
	 * 应用授权令牌
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

	/** 
	 * 刷新令牌
	 */
	@ApiField("app_refresh_token")
	private String appRefreshToken;

	/** 
	 * 授权商户的appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/** 
	 * 应用授权令牌的有效时间（从接口调用时间作为起始时间），单位到秒
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/** 
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets app auth token.
     *
     * @param appAuthToken the app auth token
     */
    public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}

    /**
     * Gets app auth token.
     *
     * @return the app auth token
     */
    public String getAppAuthToken( ) {
		return this.appAuthToken;
	}

    /**
     * Sets app refresh token.
     *
     * @param appRefreshToken the app refresh token
     */
    public void setAppRefreshToken(String appRefreshToken) {
		this.appRefreshToken = appRefreshToken;
	}

    /**
     * Gets app refresh token.
     *
     * @return the app refresh token
     */
    public String getAppRefreshToken( ) {
		return this.appRefreshToken;
	}

    /**
     * Sets auth app id.
     *
     * @param authAppId the auth app id
     */
    public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}

    /**
     * Gets auth app id.
     *
     * @return the auth app id
     */
    public String getAuthAppId( ) {
		return this.authAppId;
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

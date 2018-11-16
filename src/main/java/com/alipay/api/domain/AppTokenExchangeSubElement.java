package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用授权获取访问令牌，如果是批量授权，需要返回令牌列表
 *
 * @author auto create
 * @since 1.0, 2018-06-29 17:54:42
 */
public class AppTokenExchangeSubElement extends AlipayObject {

	private static final long serialVersionUID = 5126869211923197358L;

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
	 * 授权商户appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 过期时间
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/**
	 * 刷新令牌过期时间
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/**
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets app auth token.
     *
     * @return the app auth token
     */
    public String getAppAuthToken() {
		return this.appAuthToken;
	}

    /**
     * Sets app auth token.
     *
     * @param appAuthToken the app auth token
     */
    public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}

    /**
     * Gets app refresh token.
     *
     * @return the app refresh token
     */
    public String getAppRefreshToken() {
		return this.appRefreshToken;
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
     * Gets auth app id.
     *
     * @return the auth app id
     */
    public String getAuthAppId() {
		return this.authAppId;
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
     * Gets expires in.
     *
     * @return the expires in
     */
    public String getExpiresIn() {
		return this.expiresIn;
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
     * Gets re expires in.
     *
     * @return the re expires in
     */
    public String getReExpiresIn() {
		return this.reExpiresIn;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}

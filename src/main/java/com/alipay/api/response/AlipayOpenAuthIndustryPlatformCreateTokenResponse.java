package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.industry.platform.create.token response.
 *
 * @author auto create
 * @since 1.0, 2018-02-09 11:39:27
 */
public class AlipayOpenAuthIndustryPlatformCreateTokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 4288892626165997535L;

	/** 
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * appid
	 */
	@ApiField("requst_app_id")
	private String requstAppId;

	/** 
	 * scope
	 */
	@ApiField("scope")
	private String scope;

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode( ) {
		return this.authCode;
	}

    /**
     * Sets requst app id.
     *
     * @param requstAppId the requst app id
     */
    public void setRequstAppId(String requstAppId) {
		this.requstAppId = requstAppId;
	}

    /**
     * Gets requst app id.
     *
     * @return the requst app id
     */
    public String getRequstAppId( ) {
		return this.requstAppId;
	}

    /**
     * Sets scope.
     *
     * @param scope the scope
     */
    public void setScope(String scope) {
		this.scope = scope;
	}

    /**
     * Gets scope.
     *
     * @return the scope
     */
    public String getScope( ) {
		return this.scope;
	}

}

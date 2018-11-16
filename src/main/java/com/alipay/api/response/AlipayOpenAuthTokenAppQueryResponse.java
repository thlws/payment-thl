package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.token.app.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenAuthTokenAppQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6797174618515241554L;

	/** 
	 * 授权商户的appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/** 
	 * 授权失效时间
	 */
	@ApiField("auth_end")
	private Date authEnd;

	/** 
	 * 当前app_auth_token的授权接口列表
	 */
	@ApiListField("auth_methods")
	@ApiField("string")
	private List<String> authMethods;

	/** 
	 * 授权生效时间
	 */
	@ApiField("auth_start")
	private Date authStart;

	/** 
	 * 应用授权令牌失效时间，单位到秒
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	/** 
	 * valid：有效状态；invalid：无效状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

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
     * Sets auth end.
     *
     * @param authEnd the auth end
     */
    public void setAuthEnd(Date authEnd) {
		this.authEnd = authEnd;
	}

    /**
     * Gets auth end.
     *
     * @return the auth end
     */
    public Date getAuthEnd( ) {
		return this.authEnd;
	}

    /**
     * Sets auth methods.
     *
     * @param authMethods the auth methods
     */
    public void setAuthMethods(List<String> authMethods) {
		this.authMethods = authMethods;
	}

    /**
     * Gets auth methods.
     *
     * @return the auth methods
     */
    public List<String> getAuthMethods( ) {
		return this.authMethods;
	}

    /**
     * Sets auth start.
     *
     * @param authStart the auth start
     */
    public void setAuthStart(Date authStart) {
		this.authStart = authStart;
	}

    /**
     * Gets auth start.
     *
     * @return the auth start
     */
    public Date getAuthStart( ) {
		return this.authStart;
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

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
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

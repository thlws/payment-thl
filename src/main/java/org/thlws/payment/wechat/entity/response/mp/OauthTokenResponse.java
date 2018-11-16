package org.thlws.payment.wechat.entity.response.mp;

import org.thlws.utils.JsonUtil;

/**
 * Oauth access_token  refresh_token Response POJO
 * 此为Oauth方式得Token,非普通方式token
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 */
public class OauthTokenResponse {

	private String access_token    ;
	private String expires_in      ;//access_token接口调用凭证超时时间，单位（秒）
	private String refresh_token   ;
	private String openid          ;
	private String scope           ;
	private String unionid         ;

	private long errcode		   ;
	private String errmsg			;
	private String desc;

	/**
	 * Gets desc.
	 *
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets desc.
	 *
	 * @param desc the desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Gets errcode.
	 *
	 * @return the errcode
	 */
	public long getErrcode() {
		return errcode;
	}

	/**
	 * Sets errcode.
	 *
	 * @param errcode the errcode
	 */
	public void setErrcode(long errcode) {
		this.errcode = errcode;
	}

	/**
	 * Gets errmsg.
	 *
	 * @return the errmsg
	 */
	public String getErrmsg() {
		return errmsg;
	}

	/**
	 * Sets errmsg.
	 *
	 * @param errmsg the errmsg
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	/**
	 * Instantiates a new Oauth token response.
	 */
	public OauthTokenResponse(){}

	/**
	 * Gets access token.
	 *
	 * @return the access token
	 */
	public String getAccess_token() {
		return access_token;
	}

	/**
	 * Gets expires in.
	 *
	 * @return the expires in
	 */
	public String getExpires_in() {
		return expires_in;
	}

	/**
	 * Gets refresh token.
	 *
	 * @return the refresh token
	 */
	public String getRefresh_token() {
		return refresh_token;
	}

	/**
	 * Gets openid.
	 *
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}

	/**
	 * Gets scope.
	 *
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * Gets unionid.
	 *
	 * @return the unionid
	 */
	public String getUnionid() {
		return unionid;
	}

	/**
	 * Sets access token.
	 *
	 * @param access_token the access token
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	/**
	 * Sets expires in.
	 *
	 * @param expires_in the expires in
	 */
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

	/**
	 * Sets refresh token.
	 *
	 * @param refresh_token the refresh token
	 */
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	/**
	 * Sets openid.
	 *
	 * @param openid the openid
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
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
	 * Sets unionid.
	 *
	 * @param unionid the unionid
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}

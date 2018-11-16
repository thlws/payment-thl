package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.create response.
 *
 * @author auto create
 * @since 1.0, 2017-12-18 14:57:49
 */
public class AlipayOpenPublicLifeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5394344278523588573L;

	/** 
	 * 过期时间，在过期时间之前需要拿refresh_token重新换取新的token使用
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 生活号id，用于表示此生活号唯一性
	 */
	@ApiField("public_id")
	private String publicId;

	/** 
	 * 生活号长链接
	 */
	@ApiField("public_long_link")
	private String publicLongLink;

	/** 
	 * 生活号短链接
	 */
	@ApiField("public_short_link")
	private String publicShortLink;

	/** 
	 * 刷新令牌，当返回值中过期时间快到了，可以通过此令牌来重新刷新令牌，时间自动延长一年
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 授权token，通过授权token可以代替已生成的生活号id进行代理操作，例如发送广播等
	 */
	@ApiField("token")
	private String token;

    /**
     * Sets expire time.
     *
     * @param expireTime the expire time
     */
    public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

    /**
     * Gets expire time.
     *
     * @return the expire time
     */
    public String getExpireTime( ) {
		return this.expireTime;
	}

    /**
     * Sets public id.
     *
     * @param publicId the public id
     */
    public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

    /**
     * Gets public id.
     *
     * @return the public id
     */
    public String getPublicId( ) {
		return this.publicId;
	}

    /**
     * Sets public long link.
     *
     * @param publicLongLink the public long link
     */
    public void setPublicLongLink(String publicLongLink) {
		this.publicLongLink = publicLongLink;
	}

    /**
     * Gets public long link.
     *
     * @return the public long link
     */
    public String getPublicLongLink( ) {
		return this.publicLongLink;
	}

    /**
     * Sets public short link.
     *
     * @param publicShortLink the public short link
     */
    public void setPublicShortLink(String publicShortLink) {
		this.publicShortLink = publicShortLink;
	}

    /**
     * Gets public short link.
     *
     * @return the public short link
     */
    public String getPublicShortLink( ) {
		return this.publicShortLink;
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
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken( ) {
		return this.token;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.weibo.token.get response.
 *
 * @author auto create
 * @since 1.0, 2016-06-06 22:14:31
 */
public class AlipayWeiboTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1576635196424523419L;

	/** 
	 * 访问账单查询的临时令牌
	 */
	@ApiField("access_token")
	private String accessToken;

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

}

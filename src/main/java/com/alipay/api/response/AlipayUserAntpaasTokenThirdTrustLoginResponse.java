package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.token.third.trust.login response.
 *
 * @author auto create
 * @since 1.0, 2018-07-09 15:40:26
 */
public class AlipayUserAntpaasTokenThirdTrustLoginResponse extends AlipayResponse {

	private static final long serialVersionUID = 3381793775833382936L;

	/** 
	 * third_trust_token：用户免登的一次性token；后续使用改token进行免登请求。
	 */
	@ApiField("third_trust_token")
	private String thirdTrustToken;

    /**
     * Sets third trust token.
     *
     * @param thirdTrustToken the third trust token
     */
    public void setThirdTrustToken(String thirdTrustToken) {
		this.thirdTrustToken = thirdTrustToken;
	}

    /**
     * Gets third trust token.
     *
     * @return the third trust token
     */
    public String getThirdTrustToken( ) {
		return this.thirdTrustToken;
	}

}

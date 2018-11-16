package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.verify response.
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:37
 */
public class AlipaySecurityProdFingerprintVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7347277954295422483L;

	/** 
	 * IFAA服务端校验结果，true为通过，false为未通过
	 */
	@ApiField("auth_result")
	private Boolean authResult;

	/** 
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token用于提供给业务方关联校验结果。
	 */
	@ApiField("token")
	private String token;

    /**
     * Sets auth result.
     *
     * @param authResult the auth result
     */
    public void setAuthResult(Boolean authResult) {
		this.authResult = authResult;
	}

    /**
     * Gets auth result.
     *
     * @return the auth result
     */
    public Boolean getAuthResult( ) {
		return this.authResult;
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

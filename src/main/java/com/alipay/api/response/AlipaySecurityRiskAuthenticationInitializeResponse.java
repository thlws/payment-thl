package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.authentication.initialize response.
 *
 * @author auto create
 * @since 1.0, 2017-11-28 16:00:03
 */
public class AlipaySecurityRiskAuthenticationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5561142916133819859L;

	/** 
	 * 身份安全业务初始化后返回的业务信息
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 身份安全业务初始化后生成的token
	 */
	@ApiField("token_id")
	private String tokenId;

    /**
     * Sets biz result.
     *
     * @param bizResult the biz result
     */
    public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}

    /**
     * Gets biz result.
     *
     * @return the biz result
     */
    public String getBizResult( ) {
		return this.bizResult;
	}

    /**
     * Sets token id.
     *
     * @param tokenId the token id
     */
    public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

    /**
     * Gets token id.
     *
     * @return the token id
     */
    public String getTokenId( ) {
		return this.tokenId;
	}

}

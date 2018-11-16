package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.authentication.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-27 13:53:45
 */
public class AlipaySecurityRiskAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6422923787239623469L;

	/** 
	 * 身份安全业务相关查询业务信息
	 */
	@ApiField("biz_result")
	private String bizResult;

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

}

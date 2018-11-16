package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.user.certify response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayInsAutoAutoinsprodUserCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1859493821562516544L;

	/** 
	 * 验证结果
	 */
	@ApiField("agent_cert_result")
	private String agentCertResult;

    /**
     * Sets agent cert result.
     *
     * @param agentCertResult the agent cert result
     */
    public void setAgentCertResult(String agentCertResult) {
		this.agentCertResult = agentCertResult;
	}

    /**
     * Gets agent cert result.
     *
     * @return the agent cert result
     */
    public String getAgentCertResult( ) {
		return this.agentCertResult;
	}

}

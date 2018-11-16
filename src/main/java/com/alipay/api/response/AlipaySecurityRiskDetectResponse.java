package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.detect response.
 *
 * @author auto create
 * @since 1.0, 2016-03-04 14:55:25
 */
public class AlipaySecurityRiskDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1646775984967988669L;

	/** 
	 * 结果码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/** 
	 * 风险等级
	 */
	@ApiField("risk_level")
	private Long riskLevel;

    /**
     * Sets risk code.
     *
     * @param riskCode the risk code
     */
    public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

    /**
     * Gets risk code.
     *
     * @return the risk code
     */
    public String getRiskCode( ) {
		return this.riskCode;
	}

    /**
     * Sets risk level.
     *
     * @param riskLevel the risk level
     */
    public void setRiskLevel(Long riskLevel) {
		this.riskLevel = riskLevel;
	}

    /**
     * Gets risk level.
     *
     * @return the risk level
     */
    public Long getRiskLevel( ) {
		return this.riskLevel;
	}

}

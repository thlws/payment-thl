package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.info.analysis response.
 *
 * @author auto create
 * @since 1.0, 2016-03-04 14:55:20
 */
public class AlipaySecurityInfoAnalysisResponse extends AlipayResponse {

	private static final long serialVersionUID = 5588227786453414681L;

	/** 
	 * 风险标签
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

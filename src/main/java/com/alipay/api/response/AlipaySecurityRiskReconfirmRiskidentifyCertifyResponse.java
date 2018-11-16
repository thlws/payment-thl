package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.reconfirm.riskidentify.certify response.
 *
 * @author auto create
 * @since 1.0, 2018-05-04 10:40:00
 */
public class AlipaySecurityRiskReconfirmRiskidentifyCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3383329811366934345L;

	/** 
	 * 额外信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 是否有风险
该字段为风险检测结果，不敏感，无需脱敏
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/** 
	 * 风险识别id，为一个标识id，不敏感，无需脱敏
	 */
	@ApiField("identify_id")
	private String identifyId;

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo( ) {
		return this.extendInfo;
	}

    /**
     * Sets has risk.
     *
     * @param hasRisk the has risk
     */
    public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}

    /**
     * Gets has risk.
     *
     * @return the has risk
     */
    public Boolean getHasRisk( ) {
		return this.hasRisk;
	}

    /**
     * Sets identify id.
     *
     * @param identifyId the identify id
     */
    public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}

    /**
     * Gets identify id.
     *
     * @return the identify id
     */
    public String getIdentifyId( ) {
		return this.identifyId;
	}

}

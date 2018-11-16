package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskRankInfoCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.mobileactivity.query response.
 *
 * @author auto create
 * @since 1.0, 2016-06-15 13:55:46
 */
public class AlipaySecurityRiskMobileactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8442769749458962888L;

	/** 
	 * 是否有风险
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/** 
	 * 返回本次模型的infocode
	 */
	@ApiListField("info_code")
	@ApiField("risk_rank_info_code")
	private List<RiskRankInfoCode> infoCode;

	/** 
	 * 风险等级
	 */
	@ApiField("risk_rank")
	private Long riskRank;

	/** 
	 * 10
	 */
	@ApiField("risk_score")
	private Long riskScore;

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
     * Sets info code.
     *
     * @param infoCode the info code
     */
    public void setInfoCode(List<RiskRankInfoCode> infoCode) {
		this.infoCode = infoCode;
	}

    /**
     * Gets info code.
     *
     * @return the info code
     */
    public List<RiskRankInfoCode> getInfoCode( ) {
		return this.infoCode;
	}

    /**
     * Sets risk rank.
     *
     * @param riskRank the risk rank
     */
    public void setRiskRank(Long riskRank) {
		this.riskRank = riskRank;
	}

    /**
     * Gets risk rank.
     *
     * @return the risk rank
     */
    public Long getRiskRank( ) {
		return this.riskRank;
	}

    /**
     * Sets risk score.
     *
     * @param riskScore the risk score
     */
    public void setRiskScore(Long riskScore) {
		this.riskScore = riskScore;
	}

    /**
     * Gets risk score.
     *
     * @return the risk score
     */
    public Long getRiskScore( ) {
		return this.riskScore;
	}

}

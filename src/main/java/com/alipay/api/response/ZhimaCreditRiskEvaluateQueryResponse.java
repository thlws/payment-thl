package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.risk.evaluate.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-13 11:52:05
 */
public class ZhimaCreditRiskEvaluateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6453844951125689318L;

	/** 
	 * 风控评估结果[True:准入;False:不准入]
	 */
	@ApiField("accessible")
	private Boolean accessible;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 当准入通过且需要输出免押额度等级时，用该字段表示额度等级。当无法评估额度时，用N/A表述
	 */
	@ApiField("limit_level")
	private String limitLevel;

	/** 
	 * 当准入accessible为False时，用该字段描述原因
	 */
	@ApiField("risk_code")
	private String riskCode;

	/** 
	 * score_level:当准入通过且需要输出用户芝麻分等级时，用该字段表示芝麻分等级。当无芝麻分时，用N/A表述
	 */
	@ApiField("score_level")
	private String scoreLevel;

    /**
     * Sets accessible.
     *
     * @param accessible the accessible
     */
    public void setAccessible(Boolean accessible) {
		this.accessible = accessible;
	}

    /**
     * Gets accessible.
     *
     * @return the accessible
     */
    public Boolean getAccessible( ) {
		return this.accessible;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets limit level.
     *
     * @param limitLevel the limit level
     */
    public void setLimitLevel(String limitLevel) {
		this.limitLevel = limitLevel;
	}

    /**
     * Gets limit level.
     *
     * @return the limit level
     */
    public String getLimitLevel( ) {
		return this.limitLevel;
	}

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
     * Sets score level.
     *
     * @param scoreLevel the score level
     */
    public void setScoreLevel(String scoreLevel) {
		this.scoreLevel = scoreLevel;
	}

    /**
     * Gets score level.
     *
     * @return the score level
     */
    public String getScoreLevel( ) {
		return this.scoreLevel;
	}

}

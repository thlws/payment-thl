package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.risk.list response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaCreditAntifraudRiskListResponse extends AlipayResponse {

	private static final long serialVersionUID = 1432129683885886159L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 决策结果，可空，取值当前为REJECT\REVIEW\PASS，产品定制使用。根据产品定制配置，对结果进行决策返回
	 */
	@ApiField("decision_result")
	private String decisionResult;

	/** 
	 * 是否命中风险编码，yes标识命中，no标识未命中
	 */
	@ApiField("hit_risk")
	private String hitRisk;

	/** 
	 * 命中风险项的RiskCode列表，对应的描述见产品文档
	 */
	@ApiListField("risk_code")
	@ApiField("string")
	private List<String> riskCode;

	/** 
	 * 方案ID，可空，产品定制使用。在线可能会存在多个方案并行，方案ID标识当前请求使用的在线方案
	 */
	@ApiField("solution_id")
	private String solutionId;

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
     * Sets decision result.
     *
     * @param decisionResult the decision result
     */
    public void setDecisionResult(String decisionResult) {
		this.decisionResult = decisionResult;
	}

    /**
     * Gets decision result.
     *
     * @return the decision result
     */
    public String getDecisionResult( ) {
		return this.decisionResult;
	}

    /**
     * Sets hit risk.
     *
     * @param hitRisk the hit risk
     */
    public void setHitRisk(String hitRisk) {
		this.hitRisk = hitRisk;
	}

    /**
     * Gets hit risk.
     *
     * @return the hit risk
     */
    public String getHitRisk( ) {
		return this.hitRisk;
	}

    /**
     * Sets risk code.
     *
     * @param riskCode the risk code
     */
    public void setRiskCode(List<String> riskCode) {
		this.riskCode = riskCode;
	}

    /**
     * Gets risk code.
     *
     * @return the risk code
     */
    public List<String> getRiskCode( ) {
		return this.riskCode;
	}

    /**
     * Sets solution id.
     *
     * @param solutionId the solution id
     */
    public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

    /**
     * Gets solution id.
     *
     * @return the solution id
     */
    public String getSolutionId( ) {
		return this.solutionId;
	}

}

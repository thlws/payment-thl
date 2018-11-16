package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.antifraud.score.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaCreditAntifraudScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4726623439442235784L;

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
	 * 申请欺诈评分，分数范围是[0,100]的整数,分数越高信息越真实
	 */
	@ApiField("score")
	private Long score;

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
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(Long score) {
		this.score = score;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public Long getScore( ) {
		return this.score;
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

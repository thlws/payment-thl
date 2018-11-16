package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.plan.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:45:12
 */
public class MybankCreditSceneprodPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7737473213768487299L;

	/** 
	 * 贷款方案内容
	 */
	@ApiField("loan_plan")
	private String loanPlan;

	/** 
	 * 是否离线准入，只有为true的时候loan_plan才会有数据
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 签约时间
	 */
	@ApiField("sign_time")
	private String signTime;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets loan plan.
     *
     * @param loanPlan the loan plan
     */
    public void setLoanPlan(String loanPlan) {
		this.loanPlan = loanPlan;
	}

    /**
     * Gets loan plan.
     *
     * @return the loan plan
     */
    public String getLoanPlan( ) {
		return this.loanPlan;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

    /**
     * Sets retry.
     *
     * @param retry the retry
     */
    public void setRetry(String retry) {
		this.retry = retry;
	}

    /**
     * Gets retry.
     *
     * @return the retry
     */
    public String getRetry( ) {
		return this.retry;
	}

    /**
     * Sets sign time.
     *
     * @param signTime the sign time
     */
    public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

    /**
     * Gets sign time.
     *
     * @return the sign time
     */
    public String getSignTime( ) {
		return this.signTime;
	}

    /**
     * Sets trace id.
     *
     * @param traceId the trace id
     */
    public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

    /**
     * Gets trace id.
     *
     * @return the trace id
     */
    public String getTraceId( ) {
		return this.traceId;
	}

}

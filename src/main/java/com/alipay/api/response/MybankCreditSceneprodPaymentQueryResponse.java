package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.payment.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:38:14
 */
public class MybankCreditSceneprodPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7858969412788642545L;

	/** 
	 * 备注信息
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 交易完成时间
	 */
	@ApiField("finish_time")
	private String finishTime;

	/** 
	 * 网商内部代收付申请单编号
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 代收付申请单状态： SUC 成功，PRO 执行中 ，FAIL 失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent( ) {
		return this.content;
	}

    /**
     * Sets finish time.
     *
     * @param finishTime the finish time
     */
    public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

    /**
     * Gets finish time.
     *
     * @return the finish time
     */
    public String getFinishTime( ) {
		return this.finishTime;
	}

    /**
     * Sets in apply no.
     *
     * @param inApplyNo the in apply no
     */
    public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}

    /**
     * Gets in apply no.
     *
     * @return the in apply no
     */
    public String getInApplyNo( ) {
		return this.inApplyNo;
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
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
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

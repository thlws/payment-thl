package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-07-31 10:40:00
 */
public class MybankCreditSceneprodLoanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1319936492721882766L;

	/** 
	 * 在特定状态修改完毕后的返回内容，里面包含合作机构推进流程的信息。
	 */
	@ApiField("result_content")
	private String resultContent;

	/** 
	 * 是否重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets result content.
     *
     * @param resultContent the result content
     */
    public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}

    /**
     * Gets result content.
     *
     * @return the result content
     */
    public String getResultContent( ) {
		return this.resultContent;
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

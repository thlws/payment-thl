package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.asset.transfer response.
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:59:42
 */
public class MybankCreditSceneprodLoanAssetTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 2365222371284346241L;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

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

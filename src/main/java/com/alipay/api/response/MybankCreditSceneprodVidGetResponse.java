package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.vid.get response.
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:51:40
 */
public class MybankCreditSceneprodVidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2346139575676554177L;

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
	 * 支付宝核身VID
	 */
	@ApiField("verify_id")
	private String verifyId;

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

    /**
     * Sets verify id.
     *
     * @param verifyId the verify id
     */
    public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

    /**
     * Gets verify id.
     *
     * @return the verify id
     */
    public String getVerifyId( ) {
		return this.verifyId;
	}

}

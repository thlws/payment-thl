package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.ep.certification.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaCustomerEpCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1138888639976782523L;

	/** 
	 * 认证不通过的原因
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证是否通过，通过为true，不通过为false
	 */
	@ApiField("passed")
	private String passed;

    /**
     * Sets failed reason.
     *
     * @param failedReason the failed reason
     */
    public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}

    /**
     * Gets failed reason.
     *
     * @return the failed reason
     */
    public String getFailedReason( ) {
		return this.failedReason;
	}

    /**
     * Sets passed.
     *
     * @param passed the passed
     */
    public void setPassed(String passed) {
		this.passed = passed;
	}

    /**
     * Gets passed.
     *
     * @return the passed
     */
    public String getPassed( ) {
		return this.passed;
	}

}

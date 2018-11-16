package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.material.certify response.
 *
 * @author auto create
 * @since 1.0, 2018-08-29 14:41:05
 */
public class ZhimaCustomerCertificationMaterialCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8699533444453772493L;

	/** 
	 * 本次认证的唯一标识，商户需要记录，后续的操作都需要用到
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 认证不通过的原因
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证是否通过,通过为true，不通过为false
	 */
	@ApiField("passed")
	private String passed;

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-29 14:41:48
 */
public class ZhimaCustomerCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6738178544444493949L;

	/** 
	 * 认证的主体属性信息，一般的认证场景都是返回空
	 */
	@ApiField("attribute_info")
	private String attributeInfo;

	/** 
	 * 包含了认证过程中的认证材料和过程记录
	 */
	@ApiField("channel_statuses")
	private String channelStatuses;

	/** 
	 * 认证不通过的原因
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/** 
	 * 认证的主体信息，一般的认证场景返回为空
	 */
	@ApiField("identity_info")
	private String identityInfo;

	/** 
	 * 认证是否通过,通过为true，不通过为false
	 */
	@ApiField("passed")
	private String passed;

    /**
     * Sets attribute info.
     *
     * @param attributeInfo the attribute info
     */
    public void setAttributeInfo(String attributeInfo) {
		this.attributeInfo = attributeInfo;
	}

    /**
     * Gets attribute info.
     *
     * @return the attribute info
     */
    public String getAttributeInfo( ) {
		return this.attributeInfo;
	}

    /**
     * Sets channel statuses.
     *
     * @param channelStatuses the channel statuses
     */
    public void setChannelStatuses(String channelStatuses) {
		this.channelStatuses = channelStatuses;
	}

    /**
     * Gets channel statuses.
     *
     * @return the channel statuses
     */
    public String getChannelStatuses( ) {
		return this.channelStatuses;
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
     * Sets identity info.
     *
     * @param identityInfo the identity info
     */
    public void setIdentityInfo(String identityInfo) {
		this.identityInfo = identityInfo;
	}

    /**
     * Gets identity info.
     *
     * @return the identity info
     */
    public String getIdentityInfo( ) {
		return this.identityInfo;
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

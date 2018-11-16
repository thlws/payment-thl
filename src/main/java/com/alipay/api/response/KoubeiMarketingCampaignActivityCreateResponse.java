package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:03:00
 */
public class KoubeiMarketingCampaignActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1352961937331179713L;

	/** 
	 * 活动审批状态，
仅限服务商代商户创建活动时返回
AUDITING，审核中,REJECT为驳回，不返回表示通过
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 活动ID
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动状态，目前返回以下状态，
STARTING，活动启动中
STARTED，活动已启动
	 */
	@ApiField("camp_status")
	private String campStatus;

    /**
     * Sets audit status.
     *
     * @param auditStatus the audit status
     */
    public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

    /**
     * Gets audit status.
     *
     * @return the audit status
     */
    public String getAuditStatus( ) {
		return this.auditStatus;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId( ) {
		return this.campId;
	}

    /**
     * Sets camp status.
     *
     * @param campStatus the camp status
     */
    public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

    /**
     * Gets camp status.
     *
     * @return the camp status
     */
    public String getCampStatus( ) {
		return this.campStatus;
	}

}

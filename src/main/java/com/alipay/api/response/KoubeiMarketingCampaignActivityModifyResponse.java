package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingCampaignActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6798764652363289451L;

	/** 
	 * 活动子状态，如审核中
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 活动状态
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

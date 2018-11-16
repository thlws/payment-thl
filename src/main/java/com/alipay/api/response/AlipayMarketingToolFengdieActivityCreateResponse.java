package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.activity.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:15:30
 */
public class AlipayMarketingToolFengdieActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3372889617745239616L;

	/** 
	 * H5应用的唯一id
	 */
	@ApiField("activity_id")
	private Long activityId;

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public Long getActivityId( ) {
		return this.activityId;
	}

}

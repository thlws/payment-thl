package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.checkresult.submit response.
 *
 * @author auto create
 * @since 1.0, 2016-06-15 15:06:55
 */
public class KoubeiQualityTestCloudacptCheckresultSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3546776369793683115L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次
	 */
	@ApiField("batch_id")
	private String batchId;

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId( ) {
		return this.activityId;
	}

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

    /**
     * Gets batch id.
     *
     * @return the batch id
     */
    public String getBatchId( ) {
		return this.batchId;
	}

}

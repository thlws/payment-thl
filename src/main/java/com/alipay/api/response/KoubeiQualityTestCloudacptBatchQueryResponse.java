package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenBatch;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.batch.query response.
 *
 * @author auto create
 * @since 1.0, 2016-06-15 15:06:46
 */
public class KoubeiQualityTestCloudacptBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5491443548216415445L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次列表
	 */
	@ApiListField("batch_list")
	@ApiField("open_batch")
	private List<OpenBatch> batchList;

	/** 
	 * 单品批次数
	 */
	@ApiField("batch_num")
	private String batchNum;

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
     * Sets batch list.
     *
     * @param batchList the batch list
     */
    public void setBatchList(List<OpenBatch> batchList) {
		this.batchList = batchList;
	}

    /**
     * Gets batch list.
     *
     * @return the batch list
     */
    public List<OpenBatch> getBatchList( ) {
		return this.batchList;
	}

    /**
     * Sets batch num.
     *
     * @param batchNum the batch num
     */
    public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

    /**
     * Gets batch num.
     *
     * @return the batch num
     */
    public String getBatchNum( ) {
		return this.batchNum;
	}

}

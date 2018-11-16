package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抽奖活动状态变更
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:21:52
 */
public class AlipayMarketingCampaignDrawcampStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 6496344812361668353L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 修改的活动状态，CAMP_PAUSED  暂停状态, CAMP_ENDED  结束状态, CAMP_GOING启动状态，只支持以上3种状态变更。结束状态的活动不允许在修改活动状态。
	 */
	@ApiField("camp_status")
	private String campStatus;

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId() {
		return this.campId;
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
     * Gets camp status.
     *
     * @return the camp status
     */
    public String getCampStatus() {
		return this.campStatus;
	}

    /**
     * Sets camp status.
     *
     * @param campStatus the camp status
     */
    public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

}

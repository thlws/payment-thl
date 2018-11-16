package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收活动明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class OpenActivity extends AlipayObject {

	private static final long serialVersionUID = 4479813193672183315L;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_date")
	private String activityEndDate;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动开始时间
	 */
	@ApiField("activity_start_date")
	private String activityStartDate;

	/**
	 * 活动验证状态
0，未检测
1，未通过
2，已通过
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

    /**
     * Gets activity end date.
     *
     * @return the activity end date
     */
    public String getActivityEndDate() {
		return this.activityEndDate;
	}

    /**
     * Sets activity end date.
     *
     * @param activityEndDate the activity end date
     */
    public void setActivityEndDate(String activityEndDate) {
		this.activityEndDate = activityEndDate;
	}

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId() {
		return this.activityId;
	}

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets activity name.
     *
     * @return the activity name
     */
    public String getActivityName() {
		return this.activityName;
	}

    /**
     * Sets activity name.
     *
     * @param activityName the activity name
     */
    public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

    /**
     * Gets activity start date.
     *
     * @return the activity start date
     */
    public String getActivityStartDate() {
		return this.activityStartDate;
	}

    /**
     * Sets activity start date.
     *
     * @param activityStartDate the activity start date
     */
    public void setActivityStartDate(String activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

    /**
     * Gets activity status.
     *
     * @return the activity status
     */
    public String getActivityStatus() {
		return this.activityStatus;
	}

    /**
     * Sets activity status.
     *
     * @param activityStatus the activity status
     */
    public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
		return this.storeId;
	}

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}

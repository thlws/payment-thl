package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商信息
 *
 * @author auto create
 * @since 1.0, 2017-09-30 11:20:29
 */
public class RecruitInfo extends AlipayObject {

	private static final long serialVersionUID = 3625498798431256459L;

	/**
	 * 招商结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 是否参与门店参与了招商
	 */
	@ApiField("exclude_constraint_shops")
	private Boolean excludeConstraintShops;

	/**
	 * 招商方案id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 招商开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 招商状态
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets exclude constraint shops.
     *
     * @return the exclude constraint shops
     */
    public Boolean getExcludeConstraintShops() {
		return this.excludeConstraintShops;
	}

    /**
     * Sets exclude constraint shops.
     *
     * @param excludeConstraintShops the exclude constraint shops
     */
    public void setExcludeConstraintShops(Boolean excludeConstraintShops) {
		this.excludeConstraintShops = excludeConstraintShops;
	}

    /**
     * Gets plan id.
     *
     * @return the plan id
     */
    public String getPlanId() {
		return this.planId;
	}

    /**
     * Sets plan id.
     *
     * @param planId the plan id
     */
    public void setPlanId(String planId) {
		this.planId = planId;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}

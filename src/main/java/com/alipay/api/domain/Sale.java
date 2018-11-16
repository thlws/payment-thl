package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 促销信息集合，JSON格式
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:51:27
 */
public class Sale extends AlipayObject {

	private static final long serialVersionUID = 4713584559634872463L;

	/**
	 * 促销描述内容，有活动的情况下必填
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 促销活动结束时间，有活动的情况下必填
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 促销活动开始时间，有活动的情况下必填
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 活动状态，0：有效；1：停用；默认状态0：有效。有活动的情况下必填
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets describe.
     *
     * @return the describe
     */
    public String getDescribe() {
		return this.describe;
	}

    /**
     * Sets describe.
     *
     * @param describe the describe
     */
    public void setDescribe(String describe) {
		this.describe = describe;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public String getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public String getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(String startTime) {
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

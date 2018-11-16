package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 有效期
 *
 * @author auto create
 * @since 1.0, 2016-06-23 17:38:07
 */
public class ValidDateInfo extends AlipayObject {

	private static final long serialVersionUID = 7425871296277796423L;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 相对有效期
	 */
	@ApiField("relative_time")
	private PeriodInfo relativeTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 时间模式,RELATIVE=相对时间，RELATIVE=绝对模式
	 */
	@ApiField("time_mode")
	private String timeMode;

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
     * Gets relative time.
     *
     * @return the relative time
     */
    public PeriodInfo getRelativeTime() {
		return this.relativeTime;
	}

    /**
     * Sets relative time.
     *
     * @param relativeTime the relative time
     */
    public void setRelativeTime(PeriodInfo relativeTime) {
		this.relativeTime = relativeTime;
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
     * Gets time mode.
     *
     * @return the time mode
     */
    public String getTimeMode() {
		return this.timeMode;
	}

    /**
     * Sets time mode.
     *
     * @param timeMode the time mode
     */
    public void setTimeMode(String timeMode) {
		this.timeMode = timeMode;
	}

}

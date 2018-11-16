package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放规则
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:24
 */
public class GetRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1462114541326121232L;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 发放次数限制
	 */
	@ApiField("get_count_limit")
	private PeriodInfo getCountLimit;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

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
     * Gets get count limit.
     *
     * @return the get count limit
     */
    public PeriodInfo getGetCountLimit() {
		return this.getCountLimit;
	}

    /**
     * Sets get count limit.
     *
     * @param getCountLimit the get count limit
     */
    public void setGetCountLimit(PeriodInfo getCountLimit) {
		this.getCountLimit = getCountLimit;
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

}

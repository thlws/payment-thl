package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品可用时间段
 *
 * @author auto create
 * @since 1.0, 2018-09-03 14:58:58
 */
public class AvailableTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 5193526676432166565L;

	/**
	 * limit_period_unit为WEEK_DAY，周范围内日单位[1,7]，limit_period_unit 为DAY，月范围内日单位[1,31]
	 */
	@ApiListField("available_days")
	@ApiField("number")
	private List<Long> availableDays;

	/**
	 * 开始时间如 13:00  代表下午1点
	 */
	@ApiField("from_time")
	private String fromTime;

	/**
	 * WEEK_DAY, "周范围内日单位[1,7]， DAY, "月范围内日单位[1,31]
	 */
	@ApiField("limit_period_unit")
	private String limitPeriodUnit;

	/**
	 * 结束时间 如 14:10  代表下午2点10分
	 */
	@ApiField("to_time")
	private String toTime;

    /**
     * Gets available days.
     *
     * @return the available days
     */
    public List<Long> getAvailableDays() {
		return this.availableDays;
	}

    /**
     * Sets available days.
     *
     * @param availableDays the available days
     */
    public void setAvailableDays(List<Long> availableDays) {
		this.availableDays = availableDays;
	}

    /**
     * Gets from time.
     *
     * @return the from time
     */
    public String getFromTime() {
		return this.fromTime;
	}

    /**
     * Sets from time.
     *
     * @param fromTime the from time
     */
    public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

    /**
     * Gets limit period unit.
     *
     * @return the limit period unit
     */
    public String getLimitPeriodUnit() {
		return this.limitPeriodUnit;
	}

    /**
     * Sets limit period unit.
     *
     * @param limitPeriodUnit the limit period unit
     */
    public void setLimitPeriodUnit(String limitPeriodUnit) {
		this.limitPeriodUnit = limitPeriodUnit;
	}

    /**
     * Gets to time.
     *
     * @return the to time
     */
    public String getToTime() {
		return this.toTime;
	}

    /**
     * Sets to time.
     *
     * @param toTime the to time
     */
    public void setToTime(String toTime) {
		this.toTime = toTime;
	}

}

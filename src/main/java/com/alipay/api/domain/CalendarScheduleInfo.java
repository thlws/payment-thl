package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务者的时间表信息
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:50:27
 */
public class CalendarScheduleInfo extends AlipayObject {

	private static final long serialVersionUID = 5797635949742916642L;

	/**
	 * 时间分段时长，字段unit为单位，如duration=30，unit=MIN，则表示二进制的时间表表示将一天分为30分钟一小段的时间片段，用来表示服务者的时间是否可用
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 服务者的服务时间表
	 */
	@ApiListField("schedule")
	@ApiField("schedule_info")
	private List<ScheduleInfo> schedule;

	/**
	 * 间隔长度单位，默认为MIN（分钟），允许的单位有DAY（天）、WEEK（周）、MONTH(月)
	 */
	@ApiField("unit")
	private String unit;

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public Long getDuration() {
		return this.duration;
	}

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(Long duration) {
		this.duration = duration;
	}

    /**
     * Gets schedule.
     *
     * @return the schedule
     */
    public List<ScheduleInfo> getSchedule() {
		return this.schedule;
	}

    /**
     * Sets schedule.
     *
     * @param schedule the schedule
     */
    public void setSchedule(List<ScheduleInfo> schedule) {
		this.schedule = schedule;
	}

    /**
     * Gets unit.
     *
     * @return the unit
     */
    public String getUnit() {
		return this.unit;
	}

    /**
     * Sets unit.
     *
     * @param unit the unit
     */
    public void setUnit(String unit) {
		this.unit = unit;
	}

}

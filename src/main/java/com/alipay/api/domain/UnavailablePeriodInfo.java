package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品不可用时段数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class UnavailablePeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 6819513597411313717L;

	/**
	 * 商品不可用时段结束日期。格式为YYYY-MM-DD，如2017-05-03
	 */
	@ApiField("end_day")
	private String endDay;

	/**
	 * 商品不可用时段开始日期。格式为YYYY-MM-DD，如2017-05-01
	 */
	@ApiField("start_day")
	private String startDay;

    /**
     * Gets end day.
     *
     * @return the end day
     */
    public String getEndDay() {
		return this.endDay;
	}

    /**
     * Sets end day.
     *
     * @param endDay the end day
     */
    public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

    /**
     * Gets start day.
     *
     * @return the start day
     */
    public String getStartDay() {
		return this.startDay;
	}

    /**
     * Sets start day.
     *
     * @param startDay the start day
     */
    public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

}

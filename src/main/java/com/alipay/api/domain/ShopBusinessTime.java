package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺经营时间
 *
 * @author auto create
 * @since 1.0, 2018-08-16 14:35:41
 */
public class ShopBusinessTime extends AlipayObject {

	private static final long serialVersionUID = 8232185276696624352L;

	/**
	 * 关门时间 格式：HH:mm
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 开门时间 格式：HH:mm
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 本对象表示周几的营业时间。1~6表示周一到周六，7表示周日
	 */
	@ApiField("week_day")
	private Long weekDay;

    /**
     * Gets close time.
     *
     * @return the close time
     */
    public String getCloseTime() {
		return this.closeTime;
	}

    /**
     * Sets close time.
     *
     * @param closeTime the close time
     */
    public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

    /**
     * Gets open time.
     *
     * @return the open time
     */
    public String getOpenTime() {
		return this.openTime;
	}

    /**
     * Sets open time.
     *
     * @param openTime the open time
     */
    public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

    /**
     * Gets week day.
     *
     * @return the week day
     */
    public Long getWeekDay() {
		return this.weekDay;
	}

    /**
     * Sets week day.
     *
     * @param weekDay the week day
     */
    public void setWeekDay(Long weekDay) {
		this.weekDay = weekDay;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.stepcounter.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-29 11:43:07
 */
public class AlipayUserStepcounterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3626344253993867299L;

	/** 
	 * 用户的日计步值。为用户某个时区下某个日期的步数总值。
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 查询到的步数所在日期。
	 */
	@ApiField("count_date")
	private String countDate;

	/** 
	 * 返回的用户日计步数所在时区。若入参中时区不为空，则此返回与入参相同; 若入参中时区为空，则返回用户设备所在时区步数。
	 */
	@ApiField("time_zone")
	private String timeZone;

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
		this.count = count;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount( ) {
		return this.count;
	}

    /**
     * Sets count date.
     *
     * @param countDate the count date
     */
    public void setCountDate(String countDate) {
		this.countDate = countDate;
	}

    /**
     * Gets count date.
     *
     * @return the count date
     */
    public String getCountDate( ) {
		return this.countDate;
	}

    /**
     * Sets time zone.
     *
     * @param timeZone the time zone
     */
    public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

    /**
     * Gets time zone.
     *
     * @return the time zone
     */
    public String getTimeZone( ) {
		return this.timeZone;
	}

}

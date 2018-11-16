package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备相关信息
 *
 * @author auto create
 * @since 1.0, 2017-04-28 11:12:12
 */
public class AlipayMarketingIbsInfo extends AlipayObject {

	private static final long serialVersionUID = 7193113166989188997L;

	/**
	 * 精度
	 */
	@ApiField("accuracy")
	private String accuracy;

	/**
	 * 海拔
	 */
	@ApiField("altitude")
	private String altitude;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 时间ms
	 */
	@ApiField("time")
	private String time;

    /**
     * Gets accuracy.
     *
     * @return the accuracy
     */
    public String getAccuracy() {
		return this.accuracy;
	}

    /**
     * Sets accuracy.
     *
     * @param accuracy the accuracy
     */
    public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

    /**
     * Gets altitude.
     *
     * @return the altitude
     */
    public String getAltitude() {
		return this.altitude;
	}

    /**
     * Sets altitude.
     *
     * @param altitude the altitude
     */
    public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
		return this.latitude;
	}

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets time.
     *
     * @return the time
     */
    public String getTime() {
		return this.time;
	}

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(String time) {
		this.time = time;
	}

}

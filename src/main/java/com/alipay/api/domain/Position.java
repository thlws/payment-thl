package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 媒体点位信息
 *
 * @author auto create
 * @since 1.0, 2018-09-18 21:24:18
 */
public class Position extends AlipayObject {

	private static final long serialVersionUID = 7374446946174889681L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 点位唯一标识id
	 */
	@ApiField("device_id")
	private Long deviceId;

	/**
	 * 屏幕类型，枚举值：SLCD、LED
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 公交 或者 地铁：SUBWAY、BUS
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 站点编码
	 */
	@ApiField("station_code")
	private String stationCode;

	/**
	 * 站点等级，共分为4个等级，分别为：LEVELA、LEVLEB、LEVELC 以及 LEVELD
	 */
	@ApiField("station_level")
	private String stationLevel;

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets device id.
     *
     * @return the device id
     */
    public Long getDeviceId() {
		return this.deviceId;
	}

    /**
     * Sets device id.
     *
     * @param deviceId the device id
     */
    public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

    /**
     * Gets device type.
     *
     * @return the device type
     */
    public String getDeviceType() {
		return this.deviceType;
	}

    /**
     * Sets device type.
     *
     * @param deviceType the device type
     */
    public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

    /**
     * Gets station code.
     *
     * @return the station code
     */
    public String getStationCode() {
		return this.stationCode;
	}

    /**
     * Sets station code.
     *
     * @param stationCode the station code
     */
    public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

    /**
     * Gets station level.
     *
     * @return the station level
     */
    public String getStationLevel() {
		return this.stationLevel;
	}

    /**
     * Sets station level.
     *
     * @param stationLevel the station level
     */
    public void setStationLevel(String stationLevel) {
		this.stationLevel = stationLevel;
	}

}

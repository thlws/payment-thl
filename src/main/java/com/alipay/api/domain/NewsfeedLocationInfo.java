package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动态相关的地理位置
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class NewsfeedLocationInfo extends AlipayObject {

	private static final long serialVersionUID = 6676359699882167987L;

	/**
	 * 地理信息
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 纬度 latitude（填写非0非1）
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度 longitude（填写非0非1）
	 */
	@ApiField("lon")
	private String lon;

    /**
     * Gets ad code.
     *
     * @return the ad code
     */
    public String getAdCode() {
		return this.adCode;
	}

    /**
     * Sets ad code.
     *
     * @param adCode the ad code
     */
    public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

    /**
     * Gets lat.
     *
     * @return the lat
     */
    public String getLat() {
		return this.lat;
	}

    /**
     * Sets lat.
     *
     * @param lat the lat
     */
    public void setLat(String lat) {
		this.lat = lat;
	}

    /**
     * Gets lon.
     *
     * @return the lon
     */
    public String getLon() {
		return this.lon;
	}

    /**
     * Sets lon.
     *
     * @param lon the lon
     */
    public void setLon(String lon) {
		this.lon = lon;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * POI信息
 *
 * @author auto create
 * @since 1.0, 2017-11-29 17:17:32
 */
public class ContentPoiData extends AlipayObject {

	private static final long serialVersionUID = 1176613448926266487L;

	/**
	 * poi纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * poi经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 位置信息
	 */
	@ApiField("poi_name")
	private String poiName;

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
     * Gets poi name.
     *
     * @return the poi name
     */
    public String getPoiName() {
		return this.poiName;
	}

    /**
     * Sets poi name.
     *
     * @param poiName the poi name
     */
    public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

}

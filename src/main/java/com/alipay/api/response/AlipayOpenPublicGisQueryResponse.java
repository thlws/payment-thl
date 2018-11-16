package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.gis.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 15:21:53
 */
public class AlipayOpenPublicGisQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6278526191947887172L;

	/** 
	 * 精确度
	 */
	@ApiField("accuracy")
	private String accuracy;

	/** 
	 * 经纬度所在位置
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 纬度信息
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 经度信息
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 经纬度对应位置所在的省份
	 */
	@ApiField("province")
	private String province;

    /**
     * Sets accuracy.
     *
     * @param accuracy the accuracy
     */
    public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

    /**
     * Gets accuracy.
     *
     * @return the accuracy
     */
    public String getAccuracy( ) {
		return this.accuracy;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity( ) {
		return this.city;
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
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude( ) {
		return this.latitude;
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
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude( ) {
		return this.longitude;
	}

    /**
     * Sets province.
     *
     * @param province the province
     */
    public void setProvince(String province) {
		this.province = province;
	}

    /**
     * Gets province.
     *
     * @return the province
     */
    public String getProvince( ) {
		return this.province;
	}

}

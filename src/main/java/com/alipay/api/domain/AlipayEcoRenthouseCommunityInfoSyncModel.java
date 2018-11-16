package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区同步
 *
 * @author auto create
 * @since 1.0, 2017-12-22 17:20:35
 */
public class AlipayEcoRenthouseCommunityInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4476761554827213686L;

	/**
	 * 小区地址(与经度纬度，POI三者选填其一)
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市国标码（与城市名称二者选填一个），参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201703/t20170310_1471429.html
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 经度|纬度（经度）
	 */
	@ApiField("community_locations")
	private String communityLocations;

	/**
	 * 小区名称
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 坐标系(0:百度,1:高德)
	 */
	@ApiField("coordsys")
	private String coordsys;

	/**
	 * 行政区县国标码(与行政区县名称选填一个），参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201703/t20170310_1471429.html
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 行政区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * POI编号
	 */
	@ApiField("poi")
	private String poi;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

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
     * Gets city name.
     *
     * @return the city name
     */
    public String getCityName() {
		return this.cityName;
	}

    /**
     * Sets city name.
     *
     * @param cityName the city name
     */
    public void setCityName(String cityName) {
		this.cityName = cityName;
	}

    /**
     * Gets community locations.
     *
     * @return the community locations
     */
    public String getCommunityLocations() {
		return this.communityLocations;
	}

    /**
     * Sets community locations.
     *
     * @param communityLocations the community locations
     */
    public void setCommunityLocations(String communityLocations) {
		this.communityLocations = communityLocations;
	}

    /**
     * Gets community name.
     *
     * @return the community name
     */
    public String getCommunityName() {
		return this.communityName;
	}

    /**
     * Sets community name.
     *
     * @param communityName the community name
     */
    public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

    /**
     * Gets coordsys.
     *
     * @return the coordsys
     */
    public String getCoordsys() {
		return this.coordsys;
	}

    /**
     * Sets coordsys.
     *
     * @param coordsys the coordsys
     */
    public void setCoordsys(String coordsys) {
		this.coordsys = coordsys;
	}

    /**
     * Gets district code.
     *
     * @return the district code
     */
    public String getDistrictCode() {
		return this.districtCode;
	}

    /**
     * Sets district code.
     *
     * @param districtCode the district code
     */
    public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

    /**
     * Gets district name.
     *
     * @return the district name
     */
    public String getDistrictName() {
		return this.districtName;
	}

    /**
     * Sets district name.
     *
     * @param districtName the district name
     */
    public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

    /**
     * Gets poi.
     *
     * @return the poi
     */
    public String getPoi() {
		return this.poi;
	}

    /**
     * Sets poi.
     *
     * @param poi the poi
     */
    public void setPoi(String poi) {
		this.poi = poi;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小区大楼信息同步
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:23
 */
public class AlipayEcoRenthouseCommunityBaseinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1238146583144616938L;

	/**
	 * 商圈编码
	 */
	@ApiField("bus_code")
	private String busCode;

	/**
	 * 商圈所在纬度
	 */
	@ApiField("bus_lat")
	private String busLat;

	/**
	 * 商圈所在经度
	 */
	@ApiField("bus_lng")
	private String busLng;

	/**
	 * 商圈名称
	 */
	@ApiField("bus_name")
	private String busName;

	/**
	 * 商圈覆盖半径(单位:米)
	 */
	@ApiField("bus_radius")
	private Long busRadius;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市所在纬度
	 */
	@ApiField("city_lat")
	private String cityLat;

	/**
	 * 城市所在经度
	 */
	@ApiField("city_lng")
	private String cityLng;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 小区/大楼编码
	 */
	@ApiField("community_code")
	private String communityCode;

	/**
	 * 小区/大楼所在纬度
	 */
	@ApiField("community_lat")
	private String communityLat;

	/**
	 * 小区/大楼所在经度
	 */
	@ApiField("community_lng")
	private String communityLng;

	/**
	 * 小区/大楼名称
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 小区/大楼弄号
	 */
	@ApiField("community_nong")
	private String communityNong;

	/**
	 * 小区/大楼街道
	 */
	@ApiField("community_street")
	private String communityStreet;

	/**
	 * 小区/大楼标识类型 1：小区  2:大楼
	 */
	@ApiField("community_tag")
	private String communityTag;

	/**
	 * 行政区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 行政区域所在纬度
	 */
	@ApiField("district_lat")
	private String districtLat;

	/**
	 * 行政区域所在经度
	 */
	@ApiField("district_lng")
	private String districtLng;

	/**
	 * 行政区域名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 地铁线地铁站关系
	 */
	@ApiListField("subway_stations")
	@ApiField("string")
	private List<String> subwayStations;

    /**
     * Gets bus code.
     *
     * @return the bus code
     */
    public String getBusCode() {
		return this.busCode;
	}

    /**
     * Sets bus code.
     *
     * @param busCode the bus code
     */
    public void setBusCode(String busCode) {
		this.busCode = busCode;
	}

    /**
     * Gets bus lat.
     *
     * @return the bus lat
     */
    public String getBusLat() {
		return this.busLat;
	}

    /**
     * Sets bus lat.
     *
     * @param busLat the bus lat
     */
    public void setBusLat(String busLat) {
		this.busLat = busLat;
	}

    /**
     * Gets bus lng.
     *
     * @return the bus lng
     */
    public String getBusLng() {
		return this.busLng;
	}

    /**
     * Sets bus lng.
     *
     * @param busLng the bus lng
     */
    public void setBusLng(String busLng) {
		this.busLng = busLng;
	}

    /**
     * Gets bus name.
     *
     * @return the bus name
     */
    public String getBusName() {
		return this.busName;
	}

    /**
     * Sets bus name.
     *
     * @param busName the bus name
     */
    public void setBusName(String busName) {
		this.busName = busName;
	}

    /**
     * Gets bus radius.
     *
     * @return the bus radius
     */
    public Long getBusRadius() {
		return this.busRadius;
	}

    /**
     * Sets bus radius.
     *
     * @param busRadius the bus radius
     */
    public void setBusRadius(Long busRadius) {
		this.busRadius = busRadius;
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
     * Gets city lat.
     *
     * @return the city lat
     */
    public String getCityLat() {
		return this.cityLat;
	}

    /**
     * Sets city lat.
     *
     * @param cityLat the city lat
     */
    public void setCityLat(String cityLat) {
		this.cityLat = cityLat;
	}

    /**
     * Gets city lng.
     *
     * @return the city lng
     */
    public String getCityLng() {
		return this.cityLng;
	}

    /**
     * Sets city lng.
     *
     * @param cityLng the city lng
     */
    public void setCityLng(String cityLng) {
		this.cityLng = cityLng;
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
     * Gets community code.
     *
     * @return the community code
     */
    public String getCommunityCode() {
		return this.communityCode;
	}

    /**
     * Sets community code.
     *
     * @param communityCode the community code
     */
    public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

    /**
     * Gets community lat.
     *
     * @return the community lat
     */
    public String getCommunityLat() {
		return this.communityLat;
	}

    /**
     * Sets community lat.
     *
     * @param communityLat the community lat
     */
    public void setCommunityLat(String communityLat) {
		this.communityLat = communityLat;
	}

    /**
     * Gets community lng.
     *
     * @return the community lng
     */
    public String getCommunityLng() {
		return this.communityLng;
	}

    /**
     * Sets community lng.
     *
     * @param communityLng the community lng
     */
    public void setCommunityLng(String communityLng) {
		this.communityLng = communityLng;
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
     * Gets community nong.
     *
     * @return the community nong
     */
    public String getCommunityNong() {
		return this.communityNong;
	}

    /**
     * Sets community nong.
     *
     * @param communityNong the community nong
     */
    public void setCommunityNong(String communityNong) {
		this.communityNong = communityNong;
	}

    /**
     * Gets community street.
     *
     * @return the community street
     */
    public String getCommunityStreet() {
		return this.communityStreet;
	}

    /**
     * Sets community street.
     *
     * @param communityStreet the community street
     */
    public void setCommunityStreet(String communityStreet) {
		this.communityStreet = communityStreet;
	}

    /**
     * Gets community tag.
     *
     * @return the community tag
     */
    public String getCommunityTag() {
		return this.communityTag;
	}

    /**
     * Sets community tag.
     *
     * @param communityTag the community tag
     */
    public void setCommunityTag(String communityTag) {
		this.communityTag = communityTag;
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
     * Gets district lat.
     *
     * @return the district lat
     */
    public String getDistrictLat() {
		return this.districtLat;
	}

    /**
     * Sets district lat.
     *
     * @param districtLat the district lat
     */
    public void setDistrictLat(String districtLat) {
		this.districtLat = districtLat;
	}

    /**
     * Gets district lng.
     *
     * @return the district lng
     */
    public String getDistrictLng() {
		return this.districtLng;
	}

    /**
     * Sets district lng.
     *
     * @param districtLng the district lng
     */
    public void setDistrictLng(String districtLng) {
		this.districtLng = districtLng;
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
     * Gets subway stations.
     *
     * @return the subway stations
     */
    public List<String> getSubwayStations() {
		return this.subwayStations;
	}

    /**
     * Sets subway stations.
     *
     * @param subwayStations the subway stations
     */
    public void setSubwayStations(List<String> subwayStations) {
		this.subwayStations = subwayStations;
	}

}

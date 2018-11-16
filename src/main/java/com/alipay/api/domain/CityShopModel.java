package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据城市聚合的门店基本信息模型
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:32:06
 */
public class CityShopModel extends AlipayObject {

	private static final long serialVersionUID = 7778255393171326982L;

	/**
	 * 城市id
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区id
	 */
	@ApiField("district_id")
	private String districtId;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 判断门店是否是简易门店
	 */
	@ApiField("pos_shop")
	private Boolean posShop;

	/**
	 * 省份id
	 */
	@ApiField("province_id")
	private String provinceId;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店状态
	 */
	@ApiField("shop_status")
	private String shopStatus;

    /**
     * Gets city id.
     *
     * @return the city id
     */
    public String getCityId() {
		return this.cityId;
	}

    /**
     * Sets city id.
     *
     * @param cityId the city id
     */
    public void setCityId(String cityId) {
		this.cityId = cityId;
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
     * Gets district id.
     *
     * @return the district id
     */
    public String getDistrictId() {
		return this.districtId;
	}

    /**
     * Sets district id.
     *
     * @param districtId the district id
     */
    public void setDistrictId(String districtId) {
		this.districtId = districtId;
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
     * Gets pos shop.
     *
     * @return the pos shop
     */
    public Boolean getPosShop() {
		return this.posShop;
	}

    /**
     * Sets pos shop.
     *
     * @param posShop the pos shop
     */
    public void setPosShop(Boolean posShop) {
		this.posShop = posShop;
	}

    /**
     * Gets province id.
     *
     * @return the province id
     */
    public String getProvinceId() {
		return this.provinceId;
	}

    /**
     * Sets province id.
     *
     * @param provinceId the province id
     */
    public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

    /**
     * Gets province name.
     *
     * @return the province name
     */
    public String getProvinceName() {
		return this.provinceName;
	}

    /**
     * Sets province name.
     *
     * @param provinceName the province name
     */
    public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName() {
		return this.shopName;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

    /**
     * Gets shop status.
     *
     * @return the shop status
     */
    public String getShopStatus() {
		return this.shopStatus;
	}

    /**
     * Sets shop status.
     *
     * @param shopStatus the shop status
     */
    public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

}

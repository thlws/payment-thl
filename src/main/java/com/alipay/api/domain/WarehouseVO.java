package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仓库模型
 *
 * @author auto create
 * @since 1.0, 2018-08-21 20:34:20
 */
public class WarehouseVO extends AlipayObject {

	private static final long serialVersionUID = 8714337281312366163L;

	/**
	 * 仓库详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 区域名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 仓库的状态，EFFECTIVE：生效，INVALID：失效。
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 菜鸟仓的编码
	 */
	@ApiField("cainiao_code")
	private String cainiaoCode;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 市的名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 联系人
	 */
	@ApiField("contact")
	private String contact;

	/**
	 * 维度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 归属人ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 联系方式
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 省的编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省的名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 对应的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 仓库名称
	 */
	@ApiField("warehouse_name")
	private String warehouseName;

	/**
	 * 仓库类型，REAL：实仓
	 */
	@ApiField("warehouse_type")
	private String warehouseType;

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
     * Gets area code.
     *
     * @return the area code
     */
    public String getAreaCode() {
		return this.areaCode;
	}

    /**
     * Sets area code.
     *
     * @param areaCode the area code
     */
    public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

    /**
     * Gets area name.
     *
     * @return the area name
     */
    public String getAreaName() {
		return this.areaName;
	}

    /**
     * Sets area name.
     *
     * @param areaName the area name
     */
    public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

    /**
     * Gets biz status.
     *
     * @return the biz status
     */
    public String getBizStatus() {
		return this.bizStatus;
	}

    /**
     * Sets biz status.
     *
     * @param bizStatus the biz status
     */
    public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

    /**
     * Gets cainiao code.
     *
     * @return the cainiao code
     */
    public String getCainiaoCode() {
		return this.cainiaoCode;
	}

    /**
     * Sets cainiao code.
     *
     * @param cainiaoCode the cainiao code
     */
    public void setCainiaoCode(String cainiaoCode) {
		this.cainiaoCode = cainiaoCode;
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
     * Gets contact.
     *
     * @return the contact
     */
    public String getContact() {
		return this.contact;
	}

    /**
     * Sets contact.
     *
     * @param contact the contact
     */
    public void setContact(String contact) {
		this.contact = contact;
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

    /**
     * Gets owner id.
     *
     * @return the owner id
     */
    public String getOwnerId() {
		return this.ownerId;
	}

    /**
     * Sets owner id.
     *
     * @param ownerId the owner id
     */
    public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
		return this.phone;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
	}

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
		return this.provinceCode;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
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
     * Gets warehouse code.
     *
     * @return the warehouse code
     */
    public String getWarehouseCode() {
		return this.warehouseCode;
	}

    /**
     * Sets warehouse code.
     *
     * @param warehouseCode the warehouse code
     */
    public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

    /**
     * Gets warehouse name.
     *
     * @return the warehouse name
     */
    public String getWarehouseName() {
		return this.warehouseName;
	}

    /**
     * Sets warehouse name.
     *
     * @param warehouseName the warehouse name
     */
    public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

    /**
     * Gets warehouse type.
     *
     * @return the warehouse type
     */
    public String getWarehouseType() {
		return this.warehouseType;
	}

    /**
     * Sets warehouse type.
     *
     * @param warehouseType the warehouse type
     */
    public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

}

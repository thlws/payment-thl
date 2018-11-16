package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店信息
 *
 * @author auto create
 * @since 1.0, 2017-06-20 21:12:59
 */
public class ShopQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 6668661313188575934L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 是否包含同mid下的其他pid的店铺
	 */
	@ApiField("is_include_cognate")
	private Boolean isIncludeCognate;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 内部门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 外部门店ID
	 */
	@ApiField("store_id")
	private String storeId;

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
     * Gets is include cognate.
     *
     * @return the is include cognate
     */
    public Boolean getIsIncludeCognate() {
		return this.isIncludeCognate;
	}

    /**
     * Sets is include cognate.
     *
     * @param isIncludeCognate the is include cognate
     */
    public void setIsIncludeCognate(Boolean isIncludeCognate) {
		this.isIncludeCognate = isIncludeCognate;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
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
     * Gets shop type.
     *
     * @return the shop type
     */
    public String getShopType() {
		return this.shopType;
	}

    /**
     * Sets shop type.
     *
     * @param shopType the shop type
     */
    public void setShopType(String shopType) {
		this.shopType = shopType;
	}

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
		return this.storeId;
	}

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}

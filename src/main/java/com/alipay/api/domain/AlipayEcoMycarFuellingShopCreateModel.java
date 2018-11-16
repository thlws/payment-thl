package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油站门店信息增加接口
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:51:10
 */
public class AlipayEcoMycarFuellingShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3858989634914593822L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 国标6位城市编号
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 国标6位区编号
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 纬度，高德坐标系，最好找到高德POI标识，取得标识的维度填入
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度，高德坐标系,最好找到高德POI标识，取得标识的经度填入
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 外部门店编号，系统唯一，该值添加后不可修改
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * ISV提供的门店支付链接地址，如果支付链接地址为空，默认使用用户的当面付链接地址。注意：链接地址必须使用https://或alipays://协议。需进行encode转码
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * 高德POI信息唯一ID，可通过http://lbs.amap.com/api/webservice/guide/api/search/进行查找，查询的TYPE为010100|010101|010102|010103|010104|010105|010107|010108|010109|010110|010111|010112
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 国标6位省份编号
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店状态，0：有效；1：停用；
	 */
	@ApiField("shop_status")
	private String shopStatus;

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
     * Gets out shop id.
     *
     * @return the out shop id
     */
    public String getOutShopId() {
		return this.outShopId;
	}

    /**
     * Sets out shop id.
     *
     * @param outShopId the out shop id
     */
    public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

    /**
     * Gets pay url.
     *
     * @return the pay url
     */
    public String getPayUrl() {
		return this.payUrl;
	}

    /**
     * Sets pay url.
     *
     * @param payUrl the pay url
     */
    public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

    /**
     * Gets poi id.
     *
     * @return the poi id
     */
    public String getPoiId() {
		return this.poiId;
	}

    /**
     * Sets poi id.
     *
     * @param poiId the poi id
     */
    public void setPoiId(String poiId) {
		this.poiId = poiId;
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

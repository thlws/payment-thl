package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店摘要信息
 *
 * @author auto create
 * @since 1.0, 2017-07-26 09:48:54
 */
public class ShopSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 6431289712971242538L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 分店名
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌名，不填写则默认为其它品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 经营时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 门店类目列表
	 */
	@ApiListField("category_infos")
	@ApiField("shop_category_info")
	private List<ShopCategoryInfo> categoryInfos;

	/**
	 * 城市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * "0", "不展示"
"1", "展示"
"2", "后台强制不展示"
"3", "灰度展示状态"
	 */
	@ApiField("display_status")
	private String displayStatus;

	/**
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 门店座机电话
	 */
	@ApiField("landline_no")
	private String landlineNo;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店logo图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * logo图片地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店首图
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 门店首图url地址
	 */
	@ApiField("main_image_url")
	private String mainImageUrl;

	/**
	 * 主门店名
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 门店电话
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 人均消费
	 */
	@ApiField("per_pay")
	private String perPay;

	/**
	 * 门店所属商户pid
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 身份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店状态，OPEN：营业中、PAUSE：暂停营业、FREEZE：已冻结、CLOSE:门店已关闭
	 */
	@ApiField("status")
	private String status;

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
     * Gets branch shop name.
     *
     * @return the branch shop name
     */
    public String getBranchShopName() {
		return this.branchShopName;
	}

    /**
     * Sets branch shop name.
     *
     * @param branchShopName the branch shop name
     */
    public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets business time.
     *
     * @return the business time
     */
    public String getBusinessTime() {
		return this.businessTime;
	}

    /**
     * Sets business time.
     *
     * @param businessTime the business time
     */
    public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

    /**
     * Gets category infos.
     *
     * @return the category infos
     */
    public List<ShopCategoryInfo> getCategoryInfos() {
		return this.categoryInfos;
	}

    /**
     * Sets category infos.
     *
     * @param categoryInfos the category infos
     */
    public void setCategoryInfos(List<ShopCategoryInfo> categoryInfos) {
		this.categoryInfos = categoryInfos;
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
     * Gets display status.
     *
     * @return the display status
     */
    public String getDisplayStatus() {
		return this.displayStatus;
	}

    /**
     * Sets display status.
     *
     * @param displayStatus the display status
     */
    public void setDisplayStatus(String displayStatus) {
		this.displayStatus = displayStatus;
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
     * Gets landline no.
     *
     * @return the landline no
     */
    public String getLandlineNo() {
		return this.landlineNo;
	}

    /**
     * Sets landline no.
     *
     * @param landlineNo the landline no
     */
    public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
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
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
		return this.logo;
	}

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
		this.logo = logo;
	}

    /**
     * Gets logo url.
     *
     * @return the logo url
     */
    public String getLogoUrl() {
		return this.logoUrl;
	}

    /**
     * Sets logo url.
     *
     * @param logoUrl the logo url
     */
    public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
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
     * Gets main image.
     *
     * @return the main image
     */
    public String getMainImage() {
		return this.mainImage;
	}

    /**
     * Sets main image.
     *
     * @param mainImage the main image
     */
    public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

    /**
     * Gets main image url.
     *
     * @return the main image url
     */
    public String getMainImageUrl() {
		return this.mainImageUrl;
	}

    /**
     * Sets main image url.
     *
     * @param mainImageUrl the main image url
     */
    public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

    /**
     * Gets main shop name.
     *
     * @return the main shop name
     */
    public String getMainShopName() {
		return this.mainShopName;
	}

    /**
     * Sets main shop name.
     *
     * @param mainShopName the main shop name
     */
    public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}

    /**
     * Gets mobile no.
     *
     * @return the mobile no
     */
    public String getMobileNo() {
		return this.mobileNo;
	}

    /**
     * Sets mobile no.
     *
     * @param mobileNo the mobile no
     */
    public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

    /**
     * Gets per pay.
     *
     * @return the per pay
     */
    public String getPerPay() {
		return this.perPay;
	}

    /**
     * Sets per pay.
     *
     * @param perPay the per pay
     */
    public void setPerPay(String perPay) {
		this.perPay = perPay;
	}

    /**
     * Gets principal id.
     *
     * @return the principal id
     */
    public String getPrincipalId() {
		return this.principalId;
	}

    /**
     * Sets principal id.
     *
     * @param principalId the principal id
     */
    public void setPrincipalId(String principalId) {
		this.principalId = principalId;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}

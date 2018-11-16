package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商铺基础数据结构
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:53:06
 */
public class ShopRec extends AlipayObject {

	private static final long serialVersionUID = 2647362964935957575L;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商圈
	 */
	@ApiField("busi_area")
	private String busiArea;

	/**
	 * 城市id
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 菜系
	 */
	@ApiField("cuisine")
	private String cuisine;

	/**
	 * 距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否有优惠
	 */
	@ApiField("has_hui")
	private String hasHui;

	/**
	 * 店铺名称
	 */
	@ApiField("head_shop_name")
	private String headShopName;

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
	 * 人气分
	 */
	@ApiField("popularity")
	private String popularity;

	/**
	 * 人气等级
	 */
	@ApiField("popularity_level")
	private String popularityLevel;

	/**
	 * 人均消费
	 */
	@ApiField("price_average")
	private String priceAverage;

	/**
	 * 前台一级类目列表
	 */
	@ApiField("root_display_category_info")
	private String rootDisplayCategoryInfo;

	/**
	 * 店铺跳转链接
	 */
	@ApiField("shop_detail_url")
	private String shopDetailUrl;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺logo图
	 */
	@ApiField("shop_logo_url")
	private String shopLogoUrl;

	/**
	 * 店铺详细名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 推荐语
	 */
	@ApiField("shop_recommend_one_tag_compose")
	private String shopRecommendOneTagCompose;

	/**
	 * 推荐店铺的券
	 */
	@ApiListField("voucher_list")
	@ApiField("voucher_rec")
	private List<VoucherRec> voucherList;

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
     * Gets busi area.
     *
     * @return the busi area
     */
    public String getBusiArea() {
		return this.busiArea;
	}

    /**
     * Sets busi area.
     *
     * @param busiArea the busi area
     */
    public void setBusiArea(String busiArea) {
		this.busiArea = busiArea;
	}

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
     * Gets cuisine.
     *
     * @return the cuisine
     */
    public String getCuisine() {
		return this.cuisine;
	}

    /**
     * Sets cuisine.
     *
     * @param cuisine the cuisine
     */
    public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

    /**
     * Gets distance.
     *
     * @return the distance
     */
    public String getDistance() {
		return this.distance;
	}

    /**
     * Sets distance.
     *
     * @param distance the distance
     */
    public void setDistance(String distance) {
		this.distance = distance;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets has hui.
     *
     * @return the has hui
     */
    public String getHasHui() {
		return this.hasHui;
	}

    /**
     * Sets has hui.
     *
     * @param hasHui the has hui
     */
    public void setHasHui(String hasHui) {
		this.hasHui = hasHui;
	}

    /**
     * Gets head shop name.
     *
     * @return the head shop name
     */
    public String getHeadShopName() {
		return this.headShopName;
	}

    /**
     * Sets head shop name.
     *
     * @param headShopName the head shop name
     */
    public void setHeadShopName(String headShopName) {
		this.headShopName = headShopName;
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
     * Gets popularity.
     *
     * @return the popularity
     */
    public String getPopularity() {
		return this.popularity;
	}

    /**
     * Sets popularity.
     *
     * @param popularity the popularity
     */
    public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

    /**
     * Gets popularity level.
     *
     * @return the popularity level
     */
    public String getPopularityLevel() {
		return this.popularityLevel;
	}

    /**
     * Sets popularity level.
     *
     * @param popularityLevel the popularity level
     */
    public void setPopularityLevel(String popularityLevel) {
		this.popularityLevel = popularityLevel;
	}

    /**
     * Gets price average.
     *
     * @return the price average
     */
    public String getPriceAverage() {
		return this.priceAverage;
	}

    /**
     * Sets price average.
     *
     * @param priceAverage the price average
     */
    public void setPriceAverage(String priceAverage) {
		this.priceAverage = priceAverage;
	}

    /**
     * Gets root display category info.
     *
     * @return the root display category info
     */
    public String getRootDisplayCategoryInfo() {
		return this.rootDisplayCategoryInfo;
	}

    /**
     * Sets root display category info.
     *
     * @param rootDisplayCategoryInfo the root display category info
     */
    public void setRootDisplayCategoryInfo(String rootDisplayCategoryInfo) {
		this.rootDisplayCategoryInfo = rootDisplayCategoryInfo;
	}

    /**
     * Gets shop detail url.
     *
     * @return the shop detail url
     */
    public String getShopDetailUrl() {
		return this.shopDetailUrl;
	}

    /**
     * Sets shop detail url.
     *
     * @param shopDetailUrl the shop detail url
     */
    public void setShopDetailUrl(String shopDetailUrl) {
		this.shopDetailUrl = shopDetailUrl;
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
     * Gets shop logo url.
     *
     * @return the shop logo url
     */
    public String getShopLogoUrl() {
		return this.shopLogoUrl;
	}

    /**
     * Sets shop logo url.
     *
     * @param shopLogoUrl the shop logo url
     */
    public void setShopLogoUrl(String shopLogoUrl) {
		this.shopLogoUrl = shopLogoUrl;
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
     * Gets shop recommend one tag compose.
     *
     * @return the shop recommend one tag compose
     */
    public String getShopRecommendOneTagCompose() {
		return this.shopRecommendOneTagCompose;
	}

    /**
     * Sets shop recommend one tag compose.
     *
     * @param shopRecommendOneTagCompose the shop recommend one tag compose
     */
    public void setShopRecommendOneTagCompose(String shopRecommendOneTagCompose) {
		this.shopRecommendOneTagCompose = shopRecommendOneTagCompose;
	}

    /**
     * Gets voucher list.
     *
     * @return the voucher list
     */
    public List<VoucherRec> getVoucherList() {
		return this.voucherList;
	}

    /**
     * Sets voucher list.
     *
     * @param voucherList the voucher list
     */
    public void setVoucherList(List<VoucherRec> voucherList) {
		this.voucherList = voucherList;
	}

}

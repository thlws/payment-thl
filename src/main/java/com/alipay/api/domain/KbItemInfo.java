package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑淘抢购商品信息模型
 *
 * @author auto create
 * @since 1.0, 2017-12-01 11:22:32
 */
public class KbItemInfo extends AlipayObject {

	private static final long serialVersionUID = 2627948294171952559L;

	/**
	 * 店铺人气值，共4个等级,1,2,3,4
	 */
	@ApiField("avg_pop_value")
	private String avgPopValue;

	/**
	 * 开卖时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品logo图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 商品原价。
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 当前库存
	 */
	@ApiField("quota")
	private String quota;

	/**
	 * 优惠价
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 商品所属店铺距离当前用户距离
	 */
	@ApiField("shop_distance")
	private String shopDistance;

	/**
	 * 商品所属店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商品所属店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商品状态，SOLD_OUT：售罄，SELL_ING：进行中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 是否置顶，1：置顶，0:非置顶
	 */
	@ApiField("top")
	private String top;

	/**
	 * 总库存
	 */
	@ApiField("total_quota")
	private String totalQuota;

	/**
	 * 商品详情页地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets avg pop value.
     *
     * @return the avg pop value
     */
    public String getAvgPopValue() {
		return this.avgPopValue;
	}

    /**
     * Sets avg pop value.
     *
     * @param avgPopValue the avg pop value
     */
    public void setAvgPopValue(String avgPopValue) {
		this.avgPopValue = avgPopValue;
	}

    /**
     * Gets begin time.
     *
     * @return the begin time
     */
    public String getBeginTime() {
		return this.beginTime;
	}

    /**
     * Sets begin time.
     *
     * @param beginTime the begin time
     */
    public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public String getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(String endTime) {
		this.endTime = endTime;
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
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
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
     * Gets original price.
     *
     * @return the original price
     */
    public String getOriginalPrice() {
		return this.originalPrice;
	}

    /**
     * Sets original price.
     *
     * @param originalPrice the original price
     */
    public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

    /**
     * Gets quota.
     *
     * @return the quota
     */
    public String getQuota() {
		return this.quota;
	}

    /**
     * Sets quota.
     *
     * @param quota the quota
     */
    public void setQuota(String quota) {
		this.quota = quota;
	}

    /**
     * Gets sale price.
     *
     * @return the sale price
     */
    public String getSalePrice() {
		return this.salePrice;
	}

    /**
     * Sets sale price.
     *
     * @param salePrice the sale price
     */
    public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

    /**
     * Gets shop distance.
     *
     * @return the shop distance
     */
    public String getShopDistance() {
		return this.shopDistance;
	}

    /**
     * Sets shop distance.
     *
     * @param shopDistance the shop distance
     */
    public void setShopDistance(String shopDistance) {
		this.shopDistance = shopDistance;
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

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets top.
     *
     * @return the top
     */
    public String getTop() {
		return this.top;
	}

    /**
     * Sets top.
     *
     * @param top the top
     */
    public void setTop(String top) {
		this.top = top;
	}

    /**
     * Gets total quota.
     *
     * @return the total quota
     */
    public String getTotalQuota() {
		return this.totalQuota;
	}

    /**
     * Sets total quota.
     *
     * @param totalQuota the total quota
     */
    public void setTotalQuota(String totalQuota) {
		this.totalQuota = totalQuota;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
		return this.url;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

}

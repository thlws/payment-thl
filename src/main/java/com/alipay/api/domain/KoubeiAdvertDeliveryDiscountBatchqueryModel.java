package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告投放券商品输出接口
 *
 * @author auto create
 * @since 1.0, 2018-07-31 20:47:38
 */
public class KoubeiAdvertDeliveryDiscountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2777247684434679845L;

	/**
	 * 媒体编号，使用前需要找业务申请 ，不申请直接调用会失败
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市国标码，比如310100是上海
	 */
	@ApiField("city_code")
	private String cityCode;

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
	 * 手机号码，不能和user_id同时存在
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 当strategy为QUERY_AND_PURCHASE时，循环发送券列表中的券，直到发券量达到purchase_num。
	 */
	@ApiField("purchase_num")
	private String purchaseNum;

	/**
	 * 门店ID
如果提供门店ID，则优先查询门店下发的券。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 输出的券列表大小
	 */
	@ApiField("size")
	private String size;

	/**
	 * 查询策略，查询并发送策略，只有白名单内ISV才有权限使用，如果不在白名单内，则忽略该字段并默认查询
QUERY：查券（默认值）
QUERY_AND_PURCHASE：查并领，为了优化体验，在查询时进行发券处理，顺序发送券列表的券，直达发券量达到purchase_num。
	 */
	@ApiField("strategy")
	private String strategy;

	/**
	 * 支付宝账户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
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
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets purchase num.
     *
     * @return the purchase num
     */
    public String getPurchaseNum() {
		return this.purchaseNum;
	}

    /**
     * Sets purchase num.
     *
     * @param purchaseNum the purchase num
     */
    public void setPurchaseNum(String purchaseNum) {
		this.purchaseNum = purchaseNum;
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
     * Gets size.
     *
     * @return the size
     */
    public String getSize() {
		return this.size;
	}

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(String size) {
		this.size = size;
	}

    /**
     * Gets strategy.
     *
     * @return the strategy
     */
    public String getStrategy() {
		return this.strategy;
	}

    /**
     * Sets strategy.
     *
     * @param strategy the strategy
     */
    public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}

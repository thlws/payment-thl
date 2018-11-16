package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告推荐接口
 *
 * @author auto create
 * @since 1.0, 2018-03-01 15:55:14
 */
public class KoubeiAdvertDeliveryDiscountGetModel extends AlipayObject {

	private static final long serialVersionUID = 8711815566152526791L;

	/**
	 * 媒体编号，使用前需要找业务申请 ，不申请直接调用会失败
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码，国标码，比如310100是上海
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 纬度，以高德地图为准， 小数点后保留六位
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，以高德地图为准， 小数点后保留六位
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 被推荐用户的手机号码，不能与user_id同时存在
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝口碑门店ID
如果提供门店ID，则优先查询门店下发的券。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 获取推荐广告列表个数，值小于等于100个
	 */
	@ApiField("size")
	private String size;

	/**
	 * 蚂蚁统一会员ID，以2088开头的16位数字
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

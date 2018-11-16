package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告投放优惠查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-31 20:46:26
 */
public class KoubeiAdvertDeliveryDiscountWebBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3726945173515269695L;

	/**
	 * 分配的固定的渠道CODE，需要找运营申请
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 纬度，根据经纬度查询附近的券
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，根据经纬度查询附近的券
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 手机号码，根据手机号码查询支付宝账户ID
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 门店ID，如果设置门店，则查询门店下发行的券
	 */
	@ApiField("shop_id")
	private String shopId;

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

}

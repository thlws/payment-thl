package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于LBS的优惠券输出接口
 *
 * @author auto create
 * @since 1.0, 2017-11-03 16:59:45
 */
public class AlipayDataDataserviceLbsDiscountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6185963574853495254L;

	/**
	 * 媒体编号，使用前需要找业务申请 ，不申请直接调用会失败
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 手机IMEI号，imei、user_id、mobile三者必须且只能填一个
	 */
	@ApiField("imei")
	private String imei;

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
	 * 手机号码，imei、user_id、mobile三者必须且只能填一个
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 输出的券列表大小
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 支付宝用户ID，imei、user_id、mobile三者必须且只能填一个
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
     * Gets imei.
     *
     * @return the imei
     */
    public String getImei() {
		return this.imei;
	}

    /**
     * Sets imei.
     *
     * @param imei the imei
     */
    public void setImei(String imei) {
		this.imei = imei;
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
     * Gets size.
     *
     * @return the size
     */
    public Long getSize() {
		return this.size;
	}

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(Long size) {
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

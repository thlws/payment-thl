package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务的物流信息
 *
 * @author auto create
 * @since 1.0, 2017-03-14 16:16:59
 */
public class OrderLogisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 2446499739978893414L;

	/**
	 * 消费者下单线下服务时，填写的服务地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 订单的物流扩展信息，包括服务开始时间、服务结束时间
	 */
	@ApiField("ext_info")
	private OrderLogisticsExtInfo extInfo;

	/**
	 * 消费者地址纬度（高德坐标系）
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 消费者地址经度（高德坐标系）
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商家电话绑定的消费者手机号（阿里小号）
	 */
	@ApiField("merchant_bind_mobile")
	private String merchantBindMobile;

	/**
	 * 联系电话
	 */
	@ApiField("mobile")
	private String mobile;

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
     * Gets contact name.
     *
     * @return the contact name
     */
    public String getContactName() {
		return this.contactName;
	}

    /**
     * Sets contact name.
     *
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
		this.contactName = contactName;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public OrderLogisticsExtInfo getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(OrderLogisticsExtInfo extInfo) {
		this.extInfo = extInfo;
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
     * Gets merchant bind mobile.
     *
     * @return the merchant bind mobile
     */
    public String getMerchantBindMobile() {
		return this.merchantBindMobile;
	}

    /**
     * Sets merchant bind mobile.
     *
     * @param merchantBindMobile the merchant bind mobile
     */
    public void setMerchantBindMobile(String merchantBindMobile) {
		this.merchantBindMobile = merchantBindMobile;
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

}

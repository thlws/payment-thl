package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crash 信息上报接口
 *
 * @author auto create
 * @since 1.0, 2018-08-24 17:07:27
 */
public class KoubeiMerchantDeviceCrashinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6333557123492527771L;

	/**
	 * Crash事件发生时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 扩展信息(JSON格式)
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 设备型号
	 */
	@ApiField("hardware_version")
	private String hardwareVersion;

	/**
	 * 日志上报时间(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("log_time")
	private String logTime;

	/**
	 * 消息类型 CRASH_MSG/SSIDS_MSG
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * 第三方应用的app_id
	 */
	@ApiField("product")
	private String product;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 设备SN
	 */
	@ApiField("sn_id")
	private String snId;

    /**
     * Gets event time.
     *
     * @return the event time
     */
    public String getEventTime() {
		return this.eventTime;
	}

    /**
     * Sets event time.
     *
     * @param eventTime the event time
     */
    public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo() {
		return this.extendInfo;
	}

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets hardware version.
     *
     * @return the hardware version
     */
    public String getHardwareVersion() {
		return this.hardwareVersion;
	}

    /**
     * Sets hardware version.
     *
     * @param hardwareVersion the hardware version
     */
    public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

    /**
     * Gets log time.
     *
     * @return the log time
     */
    public String getLogTime() {
		return this.logTime;
	}

    /**
     * Sets log time.
     *
     * @param logTime the log time
     */
    public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

    /**
     * Gets message type.
     *
     * @return the message type
     */
    public String getMessageType() {
		return this.messageType;
	}

    /**
     * Sets message type.
     *
     * @param messageType the message type
     */
    public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

    /**
     * Gets product.
     *
     * @return the product
     */
    public String getProduct() {
		return this.product;
	}

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(String product) {
		this.product = product;
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
     * Gets sn id.
     *
     * @return the sn id
     */
    public String getSnId() {
		return this.snId;
	}

    /**
     * Sets sn id.
     *
     * @param snId the sn id
     */
    public void setSnId(String snId) {
		this.snId = snId;
	}

}

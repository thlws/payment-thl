package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 此api为了让第三方渠道端调用 ，记录他们的调用数据，然后根据数据比对进行计费功能
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:16
 */
public class AlipayMsaasPromotionCpainfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3219161585738632359L;

	/**
	 * 唯一应用
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 应用版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * bundle_id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 调试数据
	 */
	@ApiField("debug")
	private String debug;

	/**
	 * 扩展信息
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * IDFA
	 */
	@ApiField("idfa")
	private String idfa;

	/**
	 * IOS版本
	 */
	@ApiField("ios_version")
	private String iosVersion;

	/**
	 * MAC
	 */
	@ApiField("mac")
	private String mac;

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
		return this.appId;
	}

    /**
     * Sets app id.
     *
     * @param appId the app id
     */
    public void setAppId(String appId) {
		this.appId = appId;
	}

    /**
     * Gets app version.
     *
     * @return the app version
     */
    public String getAppVersion() {
		return this.appVersion;
	}

    /**
     * Sets app version.
     *
     * @param appVersion the app version
     */
    public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

    /**
     * Gets bundle id.
     *
     * @return the bundle id
     */
    public String getBundleId() {
		return this.bundleId;
	}

    /**
     * Sets bundle id.
     *
     * @param bundleId the bundle id
     */
    public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId() {
		return this.channelId;
	}

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets debug.
     *
     * @return the debug
     */
    public String getDebug() {
		return this.debug;
	}

    /**
     * Sets debug.
     *
     * @param debug the debug
     */
    public void setDebug(String debug) {
		this.debug = debug;
	}

    /**
     * Gets extend.
     *
     * @return the extend
     */
    public String getExtend() {
		return this.extend;
	}

    /**
     * Sets extend.
     *
     * @param extend the extend
     */
    public void setExtend(String extend) {
		this.extend = extend;
	}

    /**
     * Gets idfa.
     *
     * @return the idfa
     */
    public String getIdfa() {
		return this.idfa;
	}

    /**
     * Sets idfa.
     *
     * @param idfa the idfa
     */
    public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

    /**
     * Gets ios version.
     *
     * @return the ios version
     */
    public String getIosVersion() {
		return this.iosVersion;
	}

    /**
     * Sets ios version.
     *
     * @param iosVersion the ios version
     */
    public void setIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
	}

    /**
     * Gets mac.
     *
     * @return the mac
     */
    public String getMac() {
		return this.mac;
	}

    /**
     * Sets mac.
     *
     * @param mac the mac
     */
    public void setMac(String mac) {
		this.mac = mac;
	}

}

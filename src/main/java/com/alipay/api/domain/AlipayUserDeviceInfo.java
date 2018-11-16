package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员通用设备、环境相关信息
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:42:37
 */
public class AlipayUserDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 5727184192631996285L;

	/**
	 * 扩展信息，json格式的字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 移动设备国际身份码缩写：移动设备国际身份码缩写。仅移动端
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * ipv4地址
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * mac地址，冒号分隔
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 操作系统名称
	 */
	@ApiField("os_name")
	private String osName;

	/**
	 * 操作系统版本号
	 */
	@ApiField("os_version")
	private String osVersion;

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
     * Gets ip.
     *
     * @return the ip
     */
    public String getIp() {
		return this.ip;
	}

    /**
     * Sets ip.
     *
     * @param ip the ip
     */
    public void setIp(String ip) {
		this.ip = ip;
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

    /**
     * Gets os name.
     *
     * @return the os name
     */
    public String getOsName() {
		return this.osName;
	}

    /**
     * Sets os name.
     *
     * @param osName the os name
     */
    public void setOsName(String osName) {
		this.osName = osName;
	}

    /**
     * Gets os version.
     *
     * @return the os version
     */
    public String getOsVersion() {
		return this.osVersion;
	}

    /**
     * Sets os version.
     *
     * @param osVersion the os version
     */
    public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

}

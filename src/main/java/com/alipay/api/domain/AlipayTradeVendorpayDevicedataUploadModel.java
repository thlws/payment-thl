package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 厂商支付授权时上传设备数据接口，目前主要包含三星支付。com
 *
 * @author auto create
 * @since 1.0, 2016-05-19 17:02:20
 */
public class AlipayTradeVendorpayDevicedataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7135562978521919731L;

	/**
	 * 客户端应用包标识
	 */
	@ApiField("app_package_name")
	private String appPackageName;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 国际移动设备标识
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 国际移动用户识别码
	 */
	@ApiField("imsi")
	private String imsi;

	/**
	 * mac地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 手机机型
	 */
	@ApiField("machine_type")
	private String machineType;

	/**
	 * 手机系统版本
	 */
	@ApiField("phone_sys_version")
	private String phoneSysVersion;

	/**
	 * 厂商公钥、base64编码
	 */
	@ApiField("public_key")
	private String publicKey;

	/**
	 * 设备应用来源，厂商支付标记
	 */
	@ApiField("tidsource")
	private String tidsource;

	/**
	 * 设备标识符
	 */
	@ApiField("uuid")
	private String uuid;

	/**
	 * 厂商名字
	 */
	@ApiField("vendor")
	private String vendor;

    /**
     * Gets app package name.
     *
     * @return the app package name
     */
    public String getAppPackageName() {
		return this.appPackageName;
	}

    /**
     * Sets app package name.
     *
     * @param appPackageName the app package name
     */
    public void setAppPackageName(String appPackageName) {
		this.appPackageName = appPackageName;
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
     * Gets imsi.
     *
     * @return the imsi
     */
    public String getImsi() {
		return this.imsi;
	}

    /**
     * Sets imsi.
     *
     * @param imsi the imsi
     */
    public void setImsi(String imsi) {
		this.imsi = imsi;
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
     * Gets machine type.
     *
     * @return the machine type
     */
    public String getMachineType() {
		return this.machineType;
	}

    /**
     * Sets machine type.
     *
     * @param machineType the machine type
     */
    public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

    /**
     * Gets phone sys version.
     *
     * @return the phone sys version
     */
    public String getPhoneSysVersion() {
		return this.phoneSysVersion;
	}

    /**
     * Sets phone sys version.
     *
     * @param phoneSysVersion the phone sys version
     */
    public void setPhoneSysVersion(String phoneSysVersion) {
		this.phoneSysVersion = phoneSysVersion;
	}

    /**
     * Gets public key.
     *
     * @return the public key
     */
    public String getPublicKey() {
		return this.publicKey;
	}

    /**
     * Sets public key.
     *
     * @param publicKey the public key
     */
    public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

    /**
     * Gets tidsource.
     *
     * @return the tidsource
     */
    public String getTidsource() {
		return this.tidsource;
	}

    /**
     * Sets tidsource.
     *
     * @param tidsource the tidsource
     */
    public void setTidsource(String tidsource) {
		this.tidsource = tidsource;
	}

    /**
     * Gets uuid.
     *
     * @return the uuid
     */
    public String getUuid() {
		return this.uuid;
	}

    /**
     * Sets uuid.
     *
     * @param uuid the uuid
     */
    public void setUuid(String uuid) {
		this.uuid = uuid;
	}

    /**
     * Gets vendor.
     *
     * @return the vendor
     */
    public String getVendor() {
		return this.vendor;
	}

    /**
     * Sets vendor.
     *
     * @param vendor the vendor
     */
    public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}

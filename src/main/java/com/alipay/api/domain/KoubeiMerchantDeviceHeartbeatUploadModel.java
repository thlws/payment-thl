package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 心跳信息采集接口
 *
 * @author auto create
 * @since 1.0, 2018-08-24 17:06:57
 */
public class KoubeiMerchantDeviceHeartbeatUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7269244647974878771L;

	/**
	 * 前台/后台app信息，name传递应用名称，version传递应用版本信息，status传递应用状态，枚举：active----运行，background----后台运行
	 */
	@ApiField("app_info")
	private String appInfo;

	/**
	 * 心跳时间段内的机具异常原因，如有多个用“|”分隔。
HE_PRINTER——打印机异常；
HE_LOUDSPEAKER——音响异常；
HE_BOH-----后厨屏显异常
HE_OTHER——其他硬件异常
	 */
	@ApiField("exception_info")
	private String exceptionInfo;

	/**
	 * 心跳信息发送方自定义，json格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 设备型号
	 */
	@ApiField("hardware_version")
	private String hardwareVersion;

	/**
	 * isv_appid
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * isv商户pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * ISV 心跳服务器时间
	 */
	@ApiField("isv_server_time")
	private String isvServerTime;

	/**
	 * lbs 经纬度信息
	 */
	@ApiField("lbs")
	private String lbs;

	/**
	 * lbs获取方式：WIFI/BASE-STATION/GPS/AGPS
	 */
	@ApiField("lbs_type")
	private String lbsType;

	/**
	 * MAC 地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 机器制造商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 局域网IP
	 */
	@ApiField("network_ip")
	private String networkIp;

	/**
	 * 网络名称
	 */
	@ApiField("network_name")
	private String networkName;

	/**
	 * pos设备连接的网络类型
：2G,3G,4G,WIFI,LAN(有线网
络)
	 */
	@ApiField("network_type")
	private String networkType;

	/**
	 * 发送心跳的设备所依赖的支付宝产品（如 点餐的为 CO）
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
	 * isv点餐应用的版本信息
	 */
	@ApiField("soft_version")
	private String softVersion;

	/**
	 * 系统类型
	 */
	@ApiField("sys_type")
	private String sysType;

	/**
	 * 系统版本
	 */
	@ApiField("sys_version")
	private String sysVersion;

	/**
	 * 心跳发生时间
	 */
	@ApiField("time")
	private String time;

    /**
     * Gets app info.
     *
     * @return the app info
     */
    public String getAppInfo() {
		return this.appInfo;
	}

    /**
     * Sets app info.
     *
     * @param appInfo the app info
     */
    public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

    /**
     * Gets exception info.
     *
     * @return the exception info
     */
    public String getExceptionInfo() {
		return this.exceptionInfo;
	}

    /**
     * Sets exception info.
     *
     * @param exceptionInfo the exception info
     */
    public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
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
     * Gets isv app id.
     *
     * @return the isv app id
     */
    public String getIsvAppId() {
		return this.isvAppId;
	}

    /**
     * Sets isv app id.
     *
     * @param isvAppId the isv app id
     */
    public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

    /**
     * Gets isv pid.
     *
     * @return the isv pid
     */
    public String getIsvPid() {
		return this.isvPid;
	}

    /**
     * Sets isv pid.
     *
     * @param isvPid the isv pid
     */
    public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

    /**
     * Gets isv server time.
     *
     * @return the isv server time
     */
    public String getIsvServerTime() {
		return this.isvServerTime;
	}

    /**
     * Sets isv server time.
     *
     * @param isvServerTime the isv server time
     */
    public void setIsvServerTime(String isvServerTime) {
		this.isvServerTime = isvServerTime;
	}

    /**
     * Gets lbs.
     *
     * @return the lbs
     */
    public String getLbs() {
		return this.lbs;
	}

    /**
     * Sets lbs.
     *
     * @param lbs the lbs
     */
    public void setLbs(String lbs) {
		this.lbs = lbs;
	}

    /**
     * Gets lbs type.
     *
     * @return the lbs type
     */
    public String getLbsType() {
		return this.lbsType;
	}

    /**
     * Sets lbs type.
     *
     * @param lbsType the lbs type
     */
    public void setLbsType(String lbsType) {
		this.lbsType = lbsType;
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
     * Gets manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
		return this.manufacturer;
	}

    /**
     * Sets manufacturer.
     *
     * @param manufacturer the manufacturer
     */
    public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

    /**
     * Gets network ip.
     *
     * @return the network ip
     */
    public String getNetworkIp() {
		return this.networkIp;
	}

    /**
     * Sets network ip.
     *
     * @param networkIp the network ip
     */
    public void setNetworkIp(String networkIp) {
		this.networkIp = networkIp;
	}

    /**
     * Gets network name.
     *
     * @return the network name
     */
    public String getNetworkName() {
		return this.networkName;
	}

    /**
     * Sets network name.
     *
     * @param networkName the network name
     */
    public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

    /**
     * Gets network type.
     *
     * @return the network type
     */
    public String getNetworkType() {
		return this.networkType;
	}

    /**
     * Sets network type.
     *
     * @param networkType the network type
     */
    public void setNetworkType(String networkType) {
		this.networkType = networkType;
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

    /**
     * Gets soft version.
     *
     * @return the soft version
     */
    public String getSoftVersion() {
		return this.softVersion;
	}

    /**
     * Sets soft version.
     *
     * @param softVersion the soft version
     */
    public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}

    /**
     * Gets sys type.
     *
     * @return the sys type
     */
    public String getSysType() {
		return this.sysType;
	}

    /**
     * Sets sys type.
     *
     * @param sysType the sys type
     */
    public void setSysType(String sysType) {
		this.sysType = sysType;
	}

    /**
     * Gets sys version.
     *
     * @return the sys version
     */
    public String getSysVersion() {
		return this.sysVersion;
	}

    /**
     * Sets sys version.
     *
     * @param sysVersion the sys version
     */
    public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

    /**
     * Gets time.
     *
     * @return the time
     */
    public String getTime() {
		return this.time;
	}

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(String time) {
		this.time = time;
	}

}

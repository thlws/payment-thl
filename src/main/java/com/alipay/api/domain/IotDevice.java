package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备对象
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:29
 */
public class IotDevice extends AlipayObject {

	private static final long serialVersionUID = 3681295782121416713L;

	/**
	 * 蓝牙MAC地址
	 */
	@ApiField("bluetooth_mac")
	private String bluetoothMac;

	/**
	 * 设备控制面板地址
	 */
	@ApiField("control_url")
	private String controlUrl;

	/**
	 * 协议服务商用于唯一标识该设备的设备id(协议服务商定义)
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 协议服务商用于唯一标识一个设备型号的型号id
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备WIFI的MAC地址
	 */
	@ApiField("wifi_mac")
	private String wifiMac;

    /**
     * Gets bluetooth mac.
     *
     * @return the bluetooth mac
     */
    public String getBluetoothMac() {
		return this.bluetoothMac;
	}

    /**
     * Sets bluetooth mac.
     *
     * @param bluetoothMac the bluetooth mac
     */
    public void setBluetoothMac(String bluetoothMac) {
		this.bluetoothMac = bluetoothMac;
	}

    /**
     * Gets control url.
     *
     * @return the control url
     */
    public String getControlUrl() {
		return this.controlUrl;
	}

    /**
     * Sets control url.
     *
     * @param controlUrl the control url
     */
    public void setControlUrl(String controlUrl) {
		this.controlUrl = controlUrl;
	}

    /**
     * Gets device id.
     *
     * @return the device id
     */
    public String getDeviceId() {
		return this.deviceId;
	}

    /**
     * Sets device id.
     *
     * @param deviceId the device id
     */
    public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

    /**
     * Gets device name.
     *
     * @return the device name
     */
    public String getDeviceName() {
		return this.deviceName;
	}

    /**
     * Sets device name.
     *
     * @param deviceName the device name
     */
    public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

    /**
     * Gets entity id.
     *
     * @return the entity id
     */
    public String getModelId() {
		return this.modelId;
	}

    /**
     * Sets entity id.
     *
     * @param modelId the entity id
     */
    public void setModelId(String modelId) {
		this.modelId = modelId;
	}

    /**
     * Gets sn.
     *
     * @return the sn
     */
    public String getSn() {
		return this.sn;
	}

    /**
     * Sets sn.
     *
     * @param sn the sn
     */
    public void setSn(String sn) {
		this.sn = sn;
	}

    /**
     * Gets wifi mac.
     *
     * @return the wifi mac
     */
    public String getWifiMac() {
		return this.wifiMac;
	}

    /**
     * Sets wifi mac.
     *
     * @param wifiMac the wifi mac
     */
    public void setWifiMac(String wifiMac) {
		this.wifiMac = wifiMac;
	}

}

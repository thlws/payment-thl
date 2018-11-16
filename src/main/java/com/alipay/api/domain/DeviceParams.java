package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息参数
 *
 * @author auto create
 * @since 1.0, 2017-10-25 13:23:12
 */
public class DeviceParams extends AlipayObject {

	private static final long serialVersionUID = 3583171493252345371L;

	/**
	 * 设备Id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 设备类型，目前有四种值：
VR一体机：VR_MACHINE、电视：TV、身份证：ID_CARD、工牌：WORK_CARD
	 */
	@ApiField("device_type")
	private String deviceType;

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
     * Gets device type.
     *
     * @return the device type
     */
    public String getDeviceType() {
		return this.deviceType;
	}

    /**
     * Sets device type.
     *
     * @param deviceType the device type
     */
    public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

}

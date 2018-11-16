package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息
 *
 * @author auto create
 * @since 1.0, 2018-07-14 11:10:03
 */
public class DeviceResultInfo extends AlipayObject {

	private static final long serialVersionUID = 6618991295817862565L;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 业务数据类型
	 */
	@ApiField("device_label")
	private String deviceLabel;

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
     * Gets device label.
     *
     * @return the device label
     */
    public String getDeviceLabel() {
		return this.deviceLabel;
	}

    /**
     * Sets device label.
     *
     * @param deviceLabel the device label
     */
    public void setDeviceLabel(String deviceLabel) {
		this.deviceLabel = deviceLabel;
	}

}

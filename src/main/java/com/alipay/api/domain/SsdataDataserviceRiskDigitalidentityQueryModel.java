package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾设备指纹
 *
 * @author auto create
 * @since 1.0, 2017-12-12 09:59:52
 */
public class SsdataDataserviceRiskDigitalidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2122261791567329798L;

	/**
	 * 服务端生成的设备码（由我方提供的sdk生成）
	 */
	@ApiField("device_code")
	private String deviceCode;

    /**
     * Gets device code.
     *
     * @return the device code
     */
    public String getDeviceCode() {
		return this.deviceCode;
	}

    /**
     * Sets device code.
     *
     * @param deviceCode the device code
     */
    public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

}

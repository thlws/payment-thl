package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ifaa.devicepubkey.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-02 19:30:00
 */
public class AlipaySecurityProdIfaaDevicepubkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5648824654378583843L;

	/** 
	 * 加密过的设备公钥信息。
	 */
	@ApiField("device_key_info")
	private String deviceKeyInfo;

    /**
     * Sets device key info.
     *
     * @param deviceKeyInfo the device key info
     */
    public void setDeviceKeyInfo(String deviceKeyInfo) {
		this.deviceKeyInfo = deviceKeyInfo;
	}

    /**
     * Gets device key info.
     *
     * @return the device key info
     */
    public String getDeviceKeyInfo( ) {
		return this.deviceKeyInfo;
	}

}

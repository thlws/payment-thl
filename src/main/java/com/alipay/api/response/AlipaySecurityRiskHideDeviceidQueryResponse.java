package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.hide.deviceid.query response.
 *
 * @author auto create
 * @since 1.0, 2016-06-17 15:05:08
 */
public class AlipaySecurityRiskHideDeviceidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4392364378199299777L;

	/** 
	 * 设备指纹的apdid
	 */
	@ApiField("deviceid")
	private String deviceid;

    /**
     * Sets deviceid.
     *
     * @param deviceid the deviceid
     */
    public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

    /**
     * Gets deviceid.
     *
     * @return the deviceid
     */
    public String getDeviceid( ) {
		return this.deviceid;
	}

}

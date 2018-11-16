package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BeaconDeviceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.beacon.device.query response.
 *
 * @author auto create
 * @since 1.0, 2017-02-28 11:12:47
 */
public class AlipayMobileBeaconDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1661984125525285482L;

	/** 
	 * 蓝牙设备信息
	 */
	@ApiField("beacon_device_info")
	private BeaconDeviceInfo beaconDeviceInfo;

	/** 
	 * 操作返回码，200为成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 请求处理结果
	 */
	@ApiField("msg")
	private String msg;

    /**
     * Sets beacon device info.
     *
     * @param beaconDeviceInfo the beacon device info
     */
    public void setBeaconDeviceInfo(BeaconDeviceInfo beaconDeviceInfo) {
		this.beaconDeviceInfo = beaconDeviceInfo;
	}

    /**
     * Gets beacon device info.
     *
     * @return the beacon device info
     */
    public BeaconDeviceInfo getBeaconDeviceInfo( ) {
		return this.beaconDeviceInfo;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}

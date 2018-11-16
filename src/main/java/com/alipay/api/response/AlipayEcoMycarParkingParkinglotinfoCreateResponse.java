package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.parkinglotinfo.create response.
 *
 * @author auto create
 * @since 1.0, 2018-09-06 13:25:00
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1514342162837686452L;

	/** 
	 * 支付宝返回停车场id。成功不为空，失败返回空
	 */
	@ApiField("parking_id")
	private String parkingId;

    /**
     * Sets parking id.
     *
     * @param parkingId the parking id
     */
    public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

    /**
     * Gets parking id.
     *
     * @return the parking id
     */
    public String getParkingId( ) {
		return this.parkingId;
	}

}

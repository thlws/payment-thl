package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.vehicle.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoMycarParkingVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3782425776397651912L;

	/** 
	 * 车牌信息（utf-8编码）
	 */
	@ApiField("car_number")
	private String carNumber;

    /**
     * Sets car number.
     *
     * @param carNumber the car number
     */
    public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

    /**
     * Gets car number.
     *
     * @return the car number
     */
    public String getCarNumber( ) {
		return this.carNumber;
	}

}

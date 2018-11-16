package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.car.save response.
 *
 * @author auto create
 * @since 1.0, 2016-05-18 15:27:46
 */
public class AlipayInsAutoCarSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2844318547585155184L;

	/** 
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

    /**
     * Sets car no.
     *
     * @param carNo the car no
     */
    public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

    /**
     * Gets car no.
     *
     * @return the car no
     */
    public String getCarNo( ) {
		return this.carNo;
	}

}

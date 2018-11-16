package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆驶出上送接口
 *
 * @author auto create
 * @since 1.0, 2017-08-25 17:10:12
 */
public class AlipayEcoMycarParkingExitinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4617236342551223776L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 车辆离场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 支付宝停车场ID，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

    /**
     * Gets car number.
     *
     * @return the car number
     */
    public String getCarNumber() {
		return this.carNumber;
	}

    /**
     * Sets car number.
     *
     * @param carNumber the car number
     */
    public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

    /**
     * Gets out time.
     *
     * @return the out time
     */
    public String getOutTime() {
		return this.outTime;
	}

    /**
     * Sets out time.
     *
     * @param outTime the out time
     */
    public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

    /**
     * Gets parking id.
     *
     * @return the parking id
     */
    public String getParkingId() {
		return this.parkingId;
	}

    /**
     * Sets parking id.
     *
     * @param parkingId the parking id
     */
    public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}

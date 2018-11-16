package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车场景
 *
 * @author auto create
 * @since 1.0, 2018-06-14 09:19:48
 */
public class ParkingScene extends AlipayObject {

	private static final long serialVersionUID = 7178697998694953414L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 车辆入场的时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 停车场ID
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 停车场名称
	 */
	@ApiField("parking_name")
	private String parkingName;

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
     * Gets in time.
     *
     * @return the in time
     */
    public String getInTime() {
		return this.inTime;
	}

    /**
     * Sets in time.
     *
     * @param inTime the in time
     */
    public void setInTime(String inTime) {
		this.inTime = inTime;
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

    /**
     * Gets parking name.
     *
     * @return the parking name
     */
    public String getParkingName() {
		return this.parkingName;
	}

    /**
     * Sets parking name.
     *
     * @param parkingName the parking name
     */
    public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

}

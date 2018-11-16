package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车出场入参
 *
 * @author auto create
 * @since 1.0, 2018-06-21 17:51:48
 */
public class ParkingOutScene extends AlipayObject {

	private static final long serialVersionUID = 5724742962997364483L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 停车费用
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 出场时间
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 停车场id
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
     * Gets fee.
     *
     * @return the fee
     */
    public String getFee() {
		return this.fee;
	}

    /**
     * Sets fee.
     *
     * @param fee the fee
     */
    public void setFee(String fee) {
		this.fee = fee;
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

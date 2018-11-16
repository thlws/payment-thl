package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dataservice.violationinfo.share response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:30:19
 */
public class AlipayEcoMycarDataserviceViolationinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 4859171542778131277L;

	/** 
	 * 车架号
	 */
	@ApiField("body_num")
	private String bodyNum;

	/** 
	 * 发动机号
	 */
	@ApiField("engine_num")
	private String engineNum;

	/** 
	 * 车辆id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	/** 
	 * 车牌
	 */
	@ApiField("vi_number")
	private String viNumber;

    /**
     * Sets body num.
     *
     * @param bodyNum the body num
     */
    public void setBodyNum(String bodyNum) {
		this.bodyNum = bodyNum;
	}

    /**
     * Gets body num.
     *
     * @return the body num
     */
    public String getBodyNum( ) {
		return this.bodyNum;
	}

    /**
     * Sets engine num.
     *
     * @param engineNum the engine num
     */
    public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}

    /**
     * Gets engine num.
     *
     * @return the engine num
     */
    public String getEngineNum( ) {
		return this.engineNum;
	}

    /**
     * Sets vehicle id.
     *
     * @param vehicleId the vehicle id
     */
    public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

    /**
     * Gets vehicle id.
     *
     * @return the vehicle id
     */
    public String getVehicleId( ) {
		return this.vehicleId;
	}

    /**
     * Sets vi number.
     *
     * @param viNumber the vi number
     */
    public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

    /**
     * Gets vi number.
     *
     * @return the vi number
     */
    public String getViNumber( ) {
		return this.viNumber;
	}

}

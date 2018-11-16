package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.violation.vehicle.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:42
 */
public class AlipayEcoMycarViolationVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4888826583458296817L;

	/** 
	 * 用户车辆发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/** 
	 * 用户车辆ID,支付宝系统唯一
	 */
	@ApiField("vi_id")
	private String viId;

	/** 
	 * 用户车辆车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/** 
	 * 用户车辆识别码
	 */
	@ApiField("vin_no")
	private String vinNo;

    /**
     * Sets engine no.
     *
     * @param engineNo the engine no
     */
    public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

    /**
     * Gets engine no.
     *
     * @return the engine no
     */
    public String getEngineNo( ) {
		return this.engineNo;
	}

    /**
     * Sets vi id.
     *
     * @param viId the vi id
     */
    public void setViId(String viId) {
		this.viId = viId;
	}

    /**
     * Gets vi id.
     *
     * @return the vi id
     */
    public String getViId( ) {
		return this.viId;
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

    /**
     * Sets vin no.
     *
     * @param vinNo the vin no
     */
    public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}

    /**
     * Gets vin no.
     *
     * @return the vin no
     */
    public String getVinNo( ) {
		return this.vinNo;
	}

}

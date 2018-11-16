package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车卡生成二维码
 *
 * @author auto create
 * @since 1.0, 2017-08-25 17:10:39
 */
public class AlipayEcoMycarParkingCardbarcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3714425271313779785L;

	/**
	 * 设备商订单id
	 */
	@ApiField("equipment_id")
	private String equipmentId;

	/**
	 * 支付宝交易流水号订单
	 */
	@ApiField("parking_id")
	private String parkingId;

    /**
     * Gets equipment id.
     *
     * @return the equipment id
     */
    public String getEquipmentId() {
		return this.equipmentId;
	}

    /**
     * Sets equipment id.
     *
     * @param equipmentId the equipment id
     */
    public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
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

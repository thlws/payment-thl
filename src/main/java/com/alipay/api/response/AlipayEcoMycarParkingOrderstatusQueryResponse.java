package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.orderstatus.query response.
 *
 * @author auto create
 * @since 1.0, 2017-08-25 17:10:33
 */
public class AlipayEcoMycarParkingOrderstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1422921659271957133L;

	/** 
	 * 支付宝交易流水号订单
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * 车平台订单
	 */
	@ApiField("car_order_id")
	private String carOrderId;

	/** 
	 * 设备商订单id
	 */
	@ApiField("equipment_order_id")
	private String equipmentOrderId;

	/** 
	 * 支付金额
	 */
	@ApiField("pay_money")
	private String payMoney;

	/** 
	 * 支付状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付的时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 支付方式（1为支付宝在线缴费，2为支付宝代扣缴费）
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 返回状态(1为成功,0为失败)
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets alipay order id.
     *
     * @param alipayOrderId the alipay order id
     */
    public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

    /**
     * Gets alipay order id.
     *
     * @return the alipay order id
     */
    public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

    /**
     * Sets car order id.
     *
     * @param carOrderId the car order id
     */
    public void setCarOrderId(String carOrderId) {
		this.carOrderId = carOrderId;
	}

    /**
     * Gets car order id.
     *
     * @return the car order id
     */
    public String getCarOrderId( ) {
		return this.carOrderId;
	}

    /**
     * Sets equipment order id.
     *
     * @param equipmentOrderId the equipment order id
     */
    public void setEquipmentOrderId(String equipmentOrderId) {
		this.equipmentOrderId = equipmentOrderId;
	}

    /**
     * Gets equipment order id.
     *
     * @return the equipment order id
     */
    public String getEquipmentOrderId( ) {
		return this.equipmentOrderId;
	}

    /**
     * Sets pay money.
     *
     * @param payMoney the pay money
     */
    public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}

    /**
     * Gets pay money.
     *
     * @return the pay money
     */
    public String getPayMoney( ) {
		return this.payMoney;
	}

    /**
     * Sets pay status.
     *
     * @param payStatus the pay status
     */
    public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

    /**
     * Gets pay status.
     *
     * @return the pay status
     */
    public String getPayStatus( ) {
		return this.payStatus;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public String getPayTime( ) {
		return this.payTime;
	}

    /**
     * Sets pay type.
     *
     * @param payType the pay type
     */
    public void setPayType(String payType) {
		this.payType = payType;
	}

    /**
     * Gets pay type.
     *
     * @return the pay type
     */
    public String getPayType( ) {
		return this.payType;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}

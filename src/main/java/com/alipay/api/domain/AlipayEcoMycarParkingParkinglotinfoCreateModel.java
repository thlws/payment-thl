package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车生活停车平台录入停车场信息
 *
 * @author auto create
 * @since 1.0, 2018-09-06 13:19:30
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8893366599955988931L;

	/**
	 * 服务商ID（2088开头的16位纯数字），由服务商提供给ISV
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 该参数废弃
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_alipay")
	private String contactAlipay;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_emali")
	private String contactEmali;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_tel")
	private String contactTel;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_weixin")
	private String contactWeixin;

	/**
	 * 该参数废弃
	 */
	@ApiField("equipment_name")
	private String equipmentName;

	/**
	 * 该参数废弃
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 该参数废弃
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 收款方ID（2088开头的16位纯数字），由停车场收款的业主方提供给ISV，该字段暂用于机具和物料申领
	 */
	@ApiField("mchnt_id")
	private String mchntId;

	/**
	 * ISV停车场ID，由ISV提供，同一个isv或商户范围内唯一
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 停车场地址
	 */
	@ApiField("parking_address")
	private String parkingAddress;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_end_time")
	private String parkingEndTime;

	/**
	 * 收费说明
	 */
	@ApiField("parking_fee_description")
	private String parkingFeeDescription;

	/**
	 * 停车场类型，1为居民小区、2为商圈停车场（购物中心商业广场商场等）、3为路侧停车、4为公园景点（景点乐园公园老街古镇等）、5为商务楼宇（酒店写字楼商务楼园区等）、6为其他、7为交通枢纽（机场火车站汽车站码头港口等）、8为市政设施（体育场博物图书馆医院学校等）
	 */
	@ApiField("parking_lot_type")
	private String parkingLotType;

	/**
	 * 停车场客服电话
	 */
	@ApiField("parking_mobile")
	private String parkingMobile;

	/**
	 * 停车场名称
	 */
	@ApiField("parking_name")
	private String parkingName;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_number")
	private String parkingNumber;

	/**
	 * 高德地图唯一标识
	 */
	@ApiField("parking_poiid")
	private String parkingPoiid;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_start_time")
	private String parkingStartTime;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_type")
	private String parkingType;

	/**
	 * 支付方式（1为支付宝在线缴费，2为支付宝代扣缴费，3当面付)，如支持多种方式以','进行间隔
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 该参数废弃
	 */
	@ApiField("payment_mode")
	private String paymentMode;

	/**
	 * 商圈id
	 */
	@ApiField("shopingmall_id")
	private String shopingmallId;

	/**
	 * 用户支付未离场的超时时间(以分钟为单位)
	 */
	@ApiField("time_out")
	private String timeOut;

    /**
     * Gets agent id.
     *
     * @return the agent id
     */
    public String getAgentId() {
		return this.agentId;
	}

    /**
     * Sets agent id.
     *
     * @param agentId the agent id
     */
    public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

    /**
     * Gets city id.
     *
     * @return the city id
     */
    public String getCityId() {
		return this.cityId;
	}

    /**
     * Sets city id.
     *
     * @param cityId the city id
     */
    public void setCityId(String cityId) {
		this.cityId = cityId;
	}

    /**
     * Gets contact alipay.
     *
     * @return the contact alipay
     */
    public String getContactAlipay() {
		return this.contactAlipay;
	}

    /**
     * Sets contact alipay.
     *
     * @param contactAlipay the contact alipay
     */
    public void setContactAlipay(String contactAlipay) {
		this.contactAlipay = contactAlipay;
	}

    /**
     * Gets contact emali.
     *
     * @return the contact emali
     */
    public String getContactEmali() {
		return this.contactEmali;
	}

    /**
     * Sets contact emali.
     *
     * @param contactEmali the contact emali
     */
    public void setContactEmali(String contactEmali) {
		this.contactEmali = contactEmali;
	}

    /**
     * Gets contact mobile.
     *
     * @return the contact mobile
     */
    public String getContactMobile() {
		return this.contactMobile;
	}

    /**
     * Sets contact mobile.
     *
     * @param contactMobile the contact mobile
     */
    public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

    /**
     * Gets contact name.
     *
     * @return the contact name
     */
    public String getContactName() {
		return this.contactName;
	}

    /**
     * Sets contact name.
     *
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
		this.contactName = contactName;
	}

    /**
     * Gets contact tel.
     *
     * @return the contact tel
     */
    public String getContactTel() {
		return this.contactTel;
	}

    /**
     * Sets contact tel.
     *
     * @param contactTel the contact tel
     */
    public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

    /**
     * Gets contact weixin.
     *
     * @return the contact weixin
     */
    public String getContactWeixin() {
		return this.contactWeixin;
	}

    /**
     * Sets contact weixin.
     *
     * @param contactWeixin the contact weixin
     */
    public void setContactWeixin(String contactWeixin) {
		this.contactWeixin = contactWeixin;
	}

    /**
     * Gets equipment name.
     *
     * @return the equipment name
     */
    public String getEquipmentName() {
		return this.equipmentName;
	}

    /**
     * Sets equipment name.
     *
     * @param equipmentName the equipment name
     */
    public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
		return this.latitude;
	}

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets mchnt id.
     *
     * @return the mchnt id
     */
    public String getMchntId() {
		return this.mchntId;
	}

    /**
     * Sets mchnt id.
     *
     * @param mchntId the mchnt id
     */
    public void setMchntId(String mchntId) {
		this.mchntId = mchntId;
	}

    /**
     * Gets out parking id.
     *
     * @return the out parking id
     */
    public String getOutParkingId() {
		return this.outParkingId;
	}

    /**
     * Sets out parking id.
     *
     * @param outParkingId the out parking id
     */
    public void setOutParkingId(String outParkingId) {
		this.outParkingId = outParkingId;
	}

    /**
     * Gets parking address.
     *
     * @return the parking address
     */
    public String getParkingAddress() {
		return this.parkingAddress;
	}

    /**
     * Sets parking address.
     *
     * @param parkingAddress the parking address
     */
    public void setParkingAddress(String parkingAddress) {
		this.parkingAddress = parkingAddress;
	}

    /**
     * Gets parking end time.
     *
     * @return the parking end time
     */
    public String getParkingEndTime() {
		return this.parkingEndTime;
	}

    /**
     * Sets parking end time.
     *
     * @param parkingEndTime the parking end time
     */
    public void setParkingEndTime(String parkingEndTime) {
		this.parkingEndTime = parkingEndTime;
	}

    /**
     * Gets parking fee description.
     *
     * @return the parking fee description
     */
    public String getParkingFeeDescription() {
		return this.parkingFeeDescription;
	}

    /**
     * Sets parking fee description.
     *
     * @param parkingFeeDescription the parking fee description
     */
    public void setParkingFeeDescription(String parkingFeeDescription) {
		this.parkingFeeDescription = parkingFeeDescription;
	}

    /**
     * Gets parking lot type.
     *
     * @return the parking lot type
     */
    public String getParkingLotType() {
		return this.parkingLotType;
	}

    /**
     * Sets parking lot type.
     *
     * @param parkingLotType the parking lot type
     */
    public void setParkingLotType(String parkingLotType) {
		this.parkingLotType = parkingLotType;
	}

    /**
     * Gets parking mobile.
     *
     * @return the parking mobile
     */
    public String getParkingMobile() {
		return this.parkingMobile;
	}

    /**
     * Sets parking mobile.
     *
     * @param parkingMobile the parking mobile
     */
    public void setParkingMobile(String parkingMobile) {
		this.parkingMobile = parkingMobile;
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

    /**
     * Gets parking number.
     *
     * @return the parking number
     */
    public String getParkingNumber() {
		return this.parkingNumber;
	}

    /**
     * Sets parking number.
     *
     * @param parkingNumber the parking number
     */
    public void setParkingNumber(String parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

    /**
     * Gets parking poiid.
     *
     * @return the parking poiid
     */
    public String getParkingPoiid() {
		return this.parkingPoiid;
	}

    /**
     * Sets parking poiid.
     *
     * @param parkingPoiid the parking poiid
     */
    public void setParkingPoiid(String parkingPoiid) {
		this.parkingPoiid = parkingPoiid;
	}

    /**
     * Gets parking start time.
     *
     * @return the parking start time
     */
    public String getParkingStartTime() {
		return this.parkingStartTime;
	}

    /**
     * Sets parking start time.
     *
     * @param parkingStartTime the parking start time
     */
    public void setParkingStartTime(String parkingStartTime) {
		this.parkingStartTime = parkingStartTime;
	}

    /**
     * Gets parking type.
     *
     * @return the parking type
     */
    public String getParkingType() {
		return this.parkingType;
	}

    /**
     * Sets parking type.
     *
     * @param parkingType the parking type
     */
    public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}

    /**
     * Gets pay type.
     *
     * @return the pay type
     */
    public String getPayType() {
		return this.payType;
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
     * Gets payment mode.
     *
     * @return the payment mode
     */
    public String getPaymentMode() {
		return this.paymentMode;
	}

    /**
     * Sets payment mode.
     *
     * @param paymentMode the payment mode
     */
    public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

    /**
     * Gets shopingmall id.
     *
     * @return the shopingmall id
     */
    public String getShopingmallId() {
		return this.shopingmallId;
	}

    /**
     * Sets shopingmall id.
     *
     * @param shopingmallId the shopingmall id
     */
    public void setShopingmallId(String shopingmallId) {
		this.shopingmallId = shopingmallId;
	}

    /**
     * Gets time out.
     *
     * @return the time out
     */
    public String getTimeOut() {
		return this.timeOut;
	}

    /**
     * Sets time out.
     *
     * @param timeOut the time out
     */
    public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

}

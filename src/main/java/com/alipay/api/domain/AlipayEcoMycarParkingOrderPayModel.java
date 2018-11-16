package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车缴费代扣接口API
 *
 * @author auto create
 * @since 1.0, 2018-06-27 11:12:55
 */
public class AlipayEcoMycarParkingOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 1334858569116155113L;

	/**
	 * 代扣返佣的支付宝用户号。
以2088开头的纯16位数。
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 车牌，需要进行停车缴费代扣的车辆牌照
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 车牌颜色
	 */
	@ApiField("car_number_color")
	private String carNumberColor;

	/**
	 * ISV停车场ID，由ISV定义的停车场标识，系统唯一，parking_id和out_parking_id不能同时为空
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 支付宝合作商户网站唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，系统唯一, parking_id和out_parking_id不能同时为空
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 卖家支付宝用户号
卖家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数。
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 卖家支付宝账号，可以为email或者手机号。
如果seller_id不为空，则以seller_id的值作为卖家账号，忽略本参数。
	 */
	@ApiField("seller_logon_id")
	private String sellerLogonId;

	/**
	 * 订单标题，描述订单用途
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单金额，精确到小数点后两位
	 */
	@ApiField("total_fee")
	private String totalFee;

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
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
		return this.body;
	}

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
		this.body = body;
	}

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
     * Gets car number color.
     *
     * @return the car number color
     */
    public String getCarNumberColor() {
		return this.carNumberColor;
	}

    /**
     * Sets car number color.
     *
     * @param carNumberColor the car number color
     */
    public void setCarNumberColor(String carNumberColor) {
		this.carNumberColor = carNumberColor;
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
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId() {
		return this.sellerId;
	}

    /**
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets seller logon id.
     *
     * @return the seller logon id
     */
    public String getSellerLogonId() {
		return this.sellerLogonId;
	}

    /**
     * Sets seller logon id.
     *
     * @param sellerLogonId the seller logon id
     */
    public void setSellerLogonId(String sellerLogonId) {
		this.sellerLogonId = sellerLogonId;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotalFee() {
		return this.totalFee;
	}

    /**
     * Sets total fee.
     *
     * @param totalFee the total fee
     */
    public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}

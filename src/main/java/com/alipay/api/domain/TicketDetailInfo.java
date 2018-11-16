package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 购票订单信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class TicketDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5473847637448893825L;

	/**
	 * 总金额，元为单位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 终点站编码
	 */
	@ApiField("end_station")
	private String endStation;

	/**
	 * 终点站中文名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 票数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 起点站编码
	 */
	@ApiField("start_station")
	private String startStation;

	/**
	 * 起点站中文名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 单价，元为单位
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/**
	 * 票类型
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets end station.
     *
     * @return the end station
     */
    public String getEndStation() {
		return this.endStation;
	}

    /**
     * Sets end station.
     *
     * @param endStation the end station
     */
    public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

    /**
     * Gets end station name.
     *
     * @return the end station name
     */
    public String getEndStationName() {
		return this.endStationName;
	}

    /**
     * Sets end station name.
     *
     * @param endStationName the end station name
     */
    public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public String getQuantity() {
		return this.quantity;
	}

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

    /**
     * Gets start station.
     *
     * @return the start station
     */
    public String getStartStation() {
		return this.startStation;
	}

    /**
     * Sets start station.
     *
     * @param startStation the start station
     */
    public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

    /**
     * Gets start station name.
     *
     * @return the start station name
     */
    public String getStartStationName() {
		return this.startStationName;
	}

    /**
     * Sets start station name.
     *
     * @param startStationName the start station name
     */
    public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
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
     * Gets ticket price.
     *
     * @return the ticket price
     */
    public String getTicketPrice() {
		return this.ticketPrice;
	}

    /**
     * Sets ticket price.
     *
     * @param ticketPrice the ticket price
     */
    public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

    /**
     * Gets ticket type.
     *
     * @return the ticket type
     */
    public String getTicketType() {
		return this.ticketType;
	}

    /**
     * Sets ticket type.
     *
     * @param ticketType the ticket type
     */
    public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

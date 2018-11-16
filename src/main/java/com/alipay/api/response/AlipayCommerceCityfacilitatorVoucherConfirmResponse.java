package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.voucher.confirm response.
 *
 * @author auto create
 * @since 1.0, 2017-06-21 15:08:33
 */
public class AlipayCommerceCityfacilitatorVoucherConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3697169927473466216L;

	/** 
	 * 订单金额，元为单位
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 终点站
	 */
	@ApiField("end_station")
	private String endStation;

	/** 
	 * 终点站点名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/** 
	 * 订单中包含的票数
	 */
	@ApiField("quantity")
	private String quantity;

	/** 
	 * 起点站
	 */
	@ApiField("start_station")
	private String startStation;

	/** 
	 * 起始站点名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/** 
	 * 该笔订单状态，默认必然是SUCCESS
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 票单价
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/** 
	 * 描述票种类
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount( ) {
		return this.amount;
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
     * Gets end station.
     *
     * @return the end station
     */
    public String getEndStation( ) {
		return this.endStation;
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
     * Gets end station name.
     *
     * @return the end station name
     */
    public String getEndStationName( ) {
		return this.endStationName;
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
     * Gets quantity.
     *
     * @return the quantity
     */
    public String getQuantity( ) {
		return this.quantity;
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
     * Gets start station.
     *
     * @return the start station
     */
    public String getStartStation( ) {
		return this.startStation;
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
     * Gets start station name.
     *
     * @return the start station name
     */
    public String getStartStationName( ) {
		return this.startStationName;
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

    /**
     * Sets ticket price.
     *
     * @param ticketPrice the ticket price
     */
    public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

    /**
     * Gets ticket price.
     *
     * @return the ticket price
     */
    public String getTicketPrice( ) {
		return this.ticketPrice;
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
     * Gets ticket type.
     *
     * @return the ticket type
     */
    public String getTicketType( ) {
		return this.ticketType;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

}

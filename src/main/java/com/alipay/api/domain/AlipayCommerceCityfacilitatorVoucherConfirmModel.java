package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包中地铁票购票，获得核销码，线下地铁自助购票机上凭核销码取票,购票确认
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceCityfacilitatorVoucherConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6618412874864919599L;

	/**
	 * 金额，元为单位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 渠道商提供的其它信息
	 */
	@ApiField("biz_info_ext")
	private String bizInfoExt;

	/**
	 * 该笔请求的唯一编号，有值请求强校验
	 */
	@ApiField("biz_request_id")
	private String bizRequestId;

	/**
	 * 城市标准码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 终点站编号
	 */
	@ApiField("end_station")
	private String endStation;

	/**
	 * 单张票编号列表，多个逗号分隔
	 */
	@ApiField("exchange_ids")
	private String exchangeIds;

	/**
	 * 商户核销时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 商户的交易号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 票数
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 请求方标识
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 起点站编号
	 */
	@ApiField("start_station")
	private String startStation;

	/**
	 * 核销号
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 票单价，元为单位
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
     * Gets biz info ext.
     *
     * @return the biz info ext
     */
    public String getBizInfoExt() {
		return this.bizInfoExt;
	}

    /**
     * Sets biz info ext.
     *
     * @param bizInfoExt the biz info ext
     */
    public void setBizInfoExt(String bizInfoExt) {
		this.bizInfoExt = bizInfoExt;
	}

    /**
     * Gets biz request id.
     *
     * @return the biz request id
     */
    public String getBizRequestId() {
		return this.bizRequestId;
	}

    /**
     * Sets biz request id.
     *
     * @param bizRequestId the biz request id
     */
    public void setBizRequestId(String bizRequestId) {
		this.bizRequestId = bizRequestId;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
     * Gets exchange ids.
     *
     * @return the exchange ids
     */
    public String getExchangeIds() {
		return this.exchangeIds;
	}

    /**
     * Sets exchange ids.
     *
     * @param exchangeIds the exchange ids
     */
    public void setExchangeIds(String exchangeIds) {
		this.exchangeIds = exchangeIds;
	}

    /**
     * Gets operate time.
     *
     * @return the operate time
     */
    public String getOperateTime() {
		return this.operateTime;
	}

    /**
     * Sets operate time.
     *
     * @param operateTime the operate time
     */
    public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
     * Gets ticket no.
     *
     * @return the ticket no
     */
    public String getTicketNo() {
		return this.ticketNo;
	}

    /**
     * Sets ticket no.
     *
     * @param ticketNo the ticket no
     */
    public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
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

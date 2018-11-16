package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gift.order.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-04 16:35:00
 */
public class AlipaySocialGiftOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8251925411591397927L;

	/** 
	 * 礼物单状态：
等待领取：WAIT_RECEIVE
已经领取：RECEIVED
领取失败 ： RECEIVE_ERROR

礼物单和订单状态是不同的。订单主要涉及支付退款状态，而礼物单状态则是用户接受礼物的状态。
	 */
	@ApiField("gift_order_status")
	private String giftOrderStatus;

	/** 
	 * 订单状态：
已支付：PAY_SUCCESS
已退款：REFUND_SUCCESS
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 产品数量
	 */
	@ApiField("quantity")
	private String quantity;

	/** 
	 * 收礼方id
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/** 
	 * 送礼方id
	 */
	@ApiField("sender_id")
	private String senderId;

	/** 
	 * 对应送礼平台的sku_id，可用于找到送礼平台对应配置的产品，库存等信息。
	 */
	@ApiField("sku_id")
	private String skuId;

	/** 
	 * 订单总金额
	 */
	@ApiField("total_price")
	private String totalPrice;

	/** 
	 * 卡码信息
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Sets gift order status.
     *
     * @param giftOrderStatus the gift order status
     */
    public void setGiftOrderStatus(String giftOrderStatus) {
		this.giftOrderStatus = giftOrderStatus;
	}

    /**
     * Gets gift order status.
     *
     * @return the gift order status
     */
    public String getGiftOrderStatus( ) {
		return this.giftOrderStatus;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus( ) {
		return this.orderStatus;
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
     * Sets receiver id.
     *
     * @param receiverId the receiver id
     */
    public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

    /**
     * Gets receiver id.
     *
     * @return the receiver id
     */
    public String getReceiverId( ) {
		return this.receiverId;
	}

    /**
     * Sets sender id.
     *
     * @param senderId the sender id
     */
    public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

    /**
     * Gets sender id.
     *
     * @return the sender id
     */
    public String getSenderId( ) {
		return this.senderId;
	}

    /**
     * Sets sku id.
     *
     * @param skuId the sku id
     */
    public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

    /**
     * Gets sku id.
     *
     * @return the sku id
     */
    public String getSkuId( ) {
		return this.skuId;
	}

    /**
     * Sets total price.
     *
     * @param totalPrice the total price
     */
    public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

    /**
     * Gets total price.
     *
     * @return the total price
     */
    public String getTotalPrice( ) {
		return this.totalPrice;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId( ) {
		return this.voucherId;
	}

}

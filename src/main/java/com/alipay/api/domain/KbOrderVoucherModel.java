package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑订单商品凭证模型
 *
 * @author auto create
 * @since 1.0, 2018-03-08 11:39:18
 */
public class KbOrderVoucherModel extends AlipayObject {

	private static final long serialVersionUID = 2255761919472221263L;

	/**
	 * 商品凭证过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 商品凭证核销／退款对应的资金流水号
	 */
	@ApiField("funds_voucher_no")
	private String fundsVoucherNo;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 退款理由，由消费者选择或填写内容，系统退款可以为空。
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款类型，ROLE_DAEMON（超期未使用），ROLE_USER（消费者主动）；
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 商品凭证核销门店ID,核销后会存在该字段
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品凭证核销门店外部ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 凭证剩余可核销次数(次卡场景)
	 */
	@ApiField("ticket_effect_count")
	private String ticketEffectCount;

	/**
	 * 凭证已退款次数(次卡场景)
	 */
	@ApiField("ticket_refunded_count")
	private String ticketRefundedCount;

	/**
	 * 凭证已使用次数(次卡场景)
	 */
	@ApiField("ticket_used_count")
	private String ticketUsedCount;

	/**
	 * 商品凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Gets expire date.
     *
     * @return the expire date
     */
    public Date getExpireDate() {
		return this.expireDate;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets funds voucher no.
     *
     * @return the funds voucher no
     */
    public String getFundsVoucherNo() {
		return this.fundsVoucherNo;
	}

    /**
     * Sets funds voucher no.
     *
     * @param fundsVoucherNo the funds voucher no
     */
    public void setFundsVoucherNo(String fundsVoucherNo) {
		this.fundsVoucherNo = fundsVoucherNo;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets refund reason.
     *
     * @return the refund reason
     */
    public String getRefundReason() {
		return this.refundReason;
	}

    /**
     * Sets refund reason.
     *
     * @param refundReason the refund reason
     */
    public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

    /**
     * Gets refund type.
     *
     * @return the refund type
     */
    public String getRefundType() {
		return this.refundType;
	}

    /**
     * Sets refund type.
     *
     * @param refundType the refund type
     */
    public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
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
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
		return this.storeId;
	}

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

    /**
     * Gets ticket effect count.
     *
     * @return the ticket effect count
     */
    public String getTicketEffectCount() {
		return this.ticketEffectCount;
	}

    /**
     * Sets ticket effect count.
     *
     * @param ticketEffectCount the ticket effect count
     */
    public void setTicketEffectCount(String ticketEffectCount) {
		this.ticketEffectCount = ticketEffectCount;
	}

    /**
     * Gets ticket refunded count.
     *
     * @return the ticket refunded count
     */
    public String getTicketRefundedCount() {
		return this.ticketRefundedCount;
	}

    /**
     * Sets ticket refunded count.
     *
     * @param ticketRefundedCount the ticket refunded count
     */
    public void setTicketRefundedCount(String ticketRefundedCount) {
		this.ticketRefundedCount = ticketRefundedCount;
	}

    /**
     * Gets ticket used count.
     *
     * @return the ticket used count
     */
    public String getTicketUsedCount() {
		return this.ticketUsedCount;
	}

    /**
     * Sets ticket used count.
     *
     * @param ticketUsedCount the ticket used count
     */
    public void setTicketUsedCount(String ticketUsedCount) {
		this.ticketUsedCount = ticketUsedCount;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId() {
		return this.voucherId;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}

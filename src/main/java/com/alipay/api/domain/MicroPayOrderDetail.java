package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小额支付冻结订单详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class MicroPayOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 8443527284745822453L;

	/**
	 * 支付宝订单号，此订单号作为后续支付冻结金以及转账的订单标识
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付方的支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 可用于支付的金额（除去服务费）
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 冻结资金的到期自动解冻时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 冻结金额（不包含服务费）
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户订单号,这个是调用传入的
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单的最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 订单状态：I：初始，S：成功
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付的金额（含服务费）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 冻结资金支付确认方式， NO_CONFIRM：不需要付款确认，调用接口直接扣款 PAY_PASSWORD: 在转账需要付款方用支付密码确认，才可以转账成功
	 */
	@ApiField("pay_confirm")
	private String payConfirm;

    /**
     * Gets alipay order no.
     *
     * @return the alipay order no
     */
    public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}

    /**
     * Sets alipay order no.
     *
     * @param alipayOrderNo the alipay order no
     */
    public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets available amount.
     *
     * @return the available amount
     */
    public String getAvailableAmount() {
		return this.availableAmount;
	}

    /**
     * Sets available amount.
     *
     * @param availableAmount the available amount
     */
    public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets expire time.
     *
     * @return the expire time
     */
    public Date getExpireTime() {
		return this.expireTime;
	}

    /**
     * Sets expire time.
     *
     * @param expireTime the expire time
     */
    public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

    /**
     * Gets freeze amount.
     *
     * @return the freeze amount
     */
    public String getFreezeAmount() {
		return this.freezeAmount;
	}

    /**
     * Sets freeze amount.
     *
     * @param freezeAmount the freeze amount
     */
    public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets merchant order no.
     *
     * @return the merchant order no
     */
    public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

    /**
     * Sets merchant order no.
     *
     * @param merchantOrderNo the merchant order no
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

    /**
     * Gets modified time.
     *
     * @return the modified time
     */
    public Date getModifiedTime() {
		return this.modifiedTime;
	}

    /**
     * Sets modified time.
     *
     * @param modifiedTime the modified time
     */
    public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus() {
		return this.orderStatus;
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
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

    /**
     * Gets pay confirm.
     *
     * @return the pay confirm
     */
    public String getPayConfirm() {
		return this.payConfirm;
	}

    /**
     * Sets pay confirm.
     *
     * @param payConfirm the pay confirm
     */
    public void setPayConfirm(String payConfirm) {
		this.payConfirm = payConfirm;
	}

}

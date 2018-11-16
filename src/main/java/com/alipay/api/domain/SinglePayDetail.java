package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小额支付单笔支付
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class SinglePayDetail extends AlipayObject {

	private static final long serialVersionUID = 7838717747995651936L;

	/**
	 * 支付宝冻结订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 本次支付金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 本次支付url地址
	 */
	@ApiField("pay_url")
	private String payUrl;

	/**
	 * 收款人的userId
	 */
	@ApiField("receive_user_id")
	private String receiveUserId;

	/**
	 * 本次支付的支付宝流水号
	 */
	@ApiField("transfer_order_no")
	private String transferOrderNo;

	/**
	 * 本次支付的外部单据号
	 */
	@ApiField("transfer_out_order_no")
	private String transferOutOrderNo;

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
     * Gets pay url.
     *
     * @return the pay url
     */
    public String getPayUrl() {
		return this.payUrl;
	}

    /**
     * Sets pay url.
     *
     * @param payUrl the pay url
     */
    public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

    /**
     * Gets receive user id.
     *
     * @return the receive user id
     */
    public String getReceiveUserId() {
		return this.receiveUserId;
	}

    /**
     * Sets receive user id.
     *
     * @param receiveUserId the receive user id
     */
    public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}

    /**
     * Gets transfer order no.
     *
     * @return the transfer order no
     */
    public String getTransferOrderNo() {
		return this.transferOrderNo;
	}

    /**
     * Sets transfer order no.
     *
     * @param transferOrderNo the transfer order no
     */
    public void setTransferOrderNo(String transferOrderNo) {
		this.transferOrderNo = transferOrderNo;
	}

    /**
     * Gets transfer out order no.
     *
     * @return the transfer out order no
     */
    public String getTransferOutOrderNo() {
		return this.transferOutOrderNo;
	}

    /**
     * Sets transfer out order no.
     *
     * @param transferOutOrderNo the transfer out order no
     */
    public void setTransferOutOrderNo(String transferOutOrderNo) {
		this.transferOutOrderNo = transferOutOrderNo;
	}

}

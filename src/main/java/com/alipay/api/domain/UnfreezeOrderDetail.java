package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冻结订单详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class UnfreezeOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 4242294733554748974L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 冻结订单的商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单的最近修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 冻结金额（含服务费）
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单状态：I：初始，S：成功，F：失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 解冻金额（含服务费）
	 */
	@ApiField("unfreeze_amount")
	private String unfreezeAmount;

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
     * Gets order amount.
     *
     * @return the order amount
     */
    public String getOrderAmount() {
		return this.orderAmount;
	}

    /**
     * Sets order amount.
     *
     * @param orderAmount the order amount
     */
    public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
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
     * Gets unfreeze amount.
     *
     * @return the unfreeze amount
     */
    public String getUnfreezeAmount() {
		return this.unfreezeAmount;
	}

    /**
     * Sets unfreeze amount.
     *
     * @param unfreezeAmount the unfreeze amount
     */
    public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

}

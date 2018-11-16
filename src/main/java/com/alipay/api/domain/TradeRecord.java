package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝交易明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class TradeRecord extends AlipayObject {

	private static final long serialVersionUID = 7517897417227872726L;

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
	 * 资金流入流程类型,in表示收入,out表示支出
	 */
	@ApiField("in_out_type")
	private String inOutType;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单最后修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 对方支付宝登录号，需要隐藏
	 */
	@ApiField("opposite_logon_id")
	private String oppositeLogonId;

	/**
	 * 对方姓名，需要隐藏
	 */
	@ApiField("opposite_name")
	private String oppositeName;

	/**
	 * 对方支付宝账号
	 */
	@ApiField("opposite_user_id")
	private String oppositeUserId;

	/**
	 * 订单来源，为空查询所有来源。淘宝(taobao)，支付宝(alipay)，其它(other)
	 */
	@ApiField("order_from")
	private String orderFrom;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单的名称，描述订单的摘要信息，如交易的商品名称
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 本方支付宝登录号，需要隐藏
	 */
	@ApiField("owner_logon_id")
	private String ownerLogonId;

	/**
	 * 本方姓名，需要隐藏
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 本方支付宝账号
	 */
	@ApiField("owner_user_id")
	private String ownerUserId;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 订单服务费
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

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
     * Gets in out type.
     *
     * @return the in out type
     */
    public String getInOutType() {
		return this.inOutType;
	}

    /**
     * Sets in out type.
     *
     * @param inOutType the in out type
     */
    public void setInOutType(String inOutType) {
		this.inOutType = inOutType;
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
     * Gets opposite logon id.
     *
     * @return the opposite logon id
     */
    public String getOppositeLogonId() {
		return this.oppositeLogonId;
	}

    /**
     * Sets opposite logon id.
     *
     * @param oppositeLogonId the opposite logon id
     */
    public void setOppositeLogonId(String oppositeLogonId) {
		this.oppositeLogonId = oppositeLogonId;
	}

    /**
     * Gets opposite name.
     *
     * @return the opposite name
     */
    public String getOppositeName() {
		return this.oppositeName;
	}

    /**
     * Sets opposite name.
     *
     * @param oppositeName the opposite name
     */
    public void setOppositeName(String oppositeName) {
		this.oppositeName = oppositeName;
	}

    /**
     * Gets opposite user id.
     *
     * @return the opposite user id
     */
    public String getOppositeUserId() {
		return this.oppositeUserId;
	}

    /**
     * Sets opposite user id.
     *
     * @param oppositeUserId the opposite user id
     */
    public void setOppositeUserId(String oppositeUserId) {
		this.oppositeUserId = oppositeUserId;
	}

    /**
     * Gets order from.
     *
     * @return the order from
     */
    public String getOrderFrom() {
		return this.orderFrom;
	}

    /**
     * Sets order from.
     *
     * @param orderFrom the order from
     */
    public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
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
     * Gets order title.
     *
     * @return the order title
     */
    public String getOrderTitle() {
		return this.orderTitle;
	}

    /**
     * Sets order title.
     *
     * @param orderTitle the order title
     */
    public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

    /**
     * Gets order type.
     *
     * @return the order type
     */
    public String getOrderType() {
		return this.orderType;
	}

    /**
     * Sets order type.
     *
     * @param orderType the order type
     */
    public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

    /**
     * Gets owner logon id.
     *
     * @return the owner logon id
     */
    public String getOwnerLogonId() {
		return this.ownerLogonId;
	}

    /**
     * Sets owner logon id.
     *
     * @param ownerLogonId the owner logon id
     */
    public void setOwnerLogonId(String ownerLogonId) {
		this.ownerLogonId = ownerLogonId;
	}

    /**
     * Gets owner name.
     *
     * @return the owner name
     */
    public String getOwnerName() {
		return this.ownerName;
	}

    /**
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

    /**
     * Gets owner user id.
     *
     * @return the owner user id
     */
    public String getOwnerUserId() {
		return this.ownerUserId;
	}

    /**
     * Sets owner user id.
     *
     * @param ownerUserId the owner user id
     */
    public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets service charge.
     *
     * @return the service charge
     */
    public String getServiceCharge() {
		return this.serviceCharge;
	}

    /**
     * Sets service charge.
     *
     * @param serviceCharge the service charge
     */
    public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}

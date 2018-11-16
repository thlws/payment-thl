package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账务记录详情
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AccountRecord extends AlipayObject {

	private static final long serialVersionUID = 8779895811541277659L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 当时账户的余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 业务类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 收入金额
	 */
	@ApiField("in_amount")
	private String inAmount;

	/**
	 * 账务备注说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 对方支付宝账户ID
	 */
	@ApiField("opt_user_id")
	private String optUserId;

	/**
	 * 支出金额
	 */
	@ApiField("out_amount")
	private String outAmount;

	/**
	 * 本方支付宝账户ID
	 */
	@ApiField("self_user_id")
	private String selfUserId;

	/**
	 * 账务类型
	 */
	@ApiField("type")
	private String type;

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
     * Gets balance.
     *
     * @return the balance
     */
    public String getBalance() {
		return this.balance;
	}

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(String balance) {
		this.balance = balance;
	}

    /**
     * Gets business type.
     *
     * @return the business type
     */
    public String getBusinessType() {
		return this.businessType;
	}

    /**
     * Sets business type.
     *
     * @param businessType the business type
     */
    public void setBusinessType(String businessType) {
		this.businessType = businessType;
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
     * Gets in amount.
     *
     * @return the in amount
     */
    public String getInAmount() {
		return this.inAmount;
	}

    /**
     * Sets in amount.
     *
     * @param inAmount the in amount
     */
    public void setInAmount(String inAmount) {
		this.inAmount = inAmount;
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
     * Gets opt user id.
     *
     * @return the opt user id
     */
    public String getOptUserId() {
		return this.optUserId;
	}

    /**
     * Sets opt user id.
     *
     * @param optUserId the opt user id
     */
    public void setOptUserId(String optUserId) {
		this.optUserId = optUserId;
	}

    /**
     * Gets out amount.
     *
     * @return the out amount
     */
    public String getOutAmount() {
		return this.outAmount;
	}

    /**
     * Sets out amount.
     *
     * @param outAmount the out amount
     */
    public void setOutAmount(String outAmount) {
		this.outAmount = outAmount;
	}

    /**
     * Gets self user id.
     *
     * @return the self user id
     */
    public String getSelfUserId() {
		return this.selfUserId;
	}

    /**
     * Sets self user id.
     *
     * @param selfUserId the self user id
     */
    public void setSelfUserId(String selfUserId) {
		this.selfUserId = selfUserId;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}

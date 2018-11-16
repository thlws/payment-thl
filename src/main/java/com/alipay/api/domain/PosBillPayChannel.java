package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * pos账单支付渠道信息
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:38
 */
public class PosBillPayChannel extends AlipayObject {

	private static final long serialVersionUID = 8699786943131298568L;

	/**
	 * 支付渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 账单支付渠道维度优惠明细
	 */
	@ApiListField("discount_details")
	@ApiField("pos_discount_detail")
	private List<PosDiscountDetail> discountDetails;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 收银员ID
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/**
	 * 支付抵扣金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付渠道本身自己的支付订单号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 付款时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 用户身份标识：手机号码、userId等
	 */
	@ApiField("user_identity")
	private String userIdentity;

    /**
     * Gets channel type.
     *
     * @return the channel type
     */
    public String getChannelType() {
		return this.channelType;
	}

    /**
     * Sets channel type.
     *
     * @param channelType the channel type
     */
    public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

    /**
     * Gets discount details.
     *
     * @return the discount details
     */
    public List<PosDiscountDetail> getDiscountDetails() {
		return this.discountDetails;
	}

    /**
     * Sets discount details.
     *
     * @param discountDetails the discount details
     */
    public void setDiscountDetails(List<PosDiscountDetail> discountDetails) {
		this.discountDetails = discountDetails;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets out pay no.
     *
     * @return the out pay no
     */
    public String getOutPayNo() {
		return this.outPayNo;
	}

    /**
     * Sets out pay no.
     *
     * @param outPayNo the out pay no
     */
    public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
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
     * Gets pay no.
     *
     * @return the pay no
     */
    public String getPayNo() {
		return this.payNo;
	}

    /**
     * Sets pay no.
     *
     * @param payNo the pay no
     */
    public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public Date getPayTime() {
		return this.payTime;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets receipt amount.
     *
     * @return the receipt amount
     */
    public String getReceiptAmount() {
		return this.receiptAmount;
	}

    /**
     * Sets receipt amount.
     *
     * @param receiptAmount the receipt amount
     */
    public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

    /**
     * Gets user identity.
     *
     * @return the user identity
     */
    public String getUserIdentity() {
		return this.userIdentity;
	}

    /**
     * Sets user identity.
     *
     * @param userIdentity the user identity
     */
    public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

}

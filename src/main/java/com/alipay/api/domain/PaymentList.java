package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付明细信息
 *
 * @author auto create
 * @since 1.0, 2018-09-03 17:15:56
 */
public class PaymentList extends AlipayObject {

	private static final long serialVersionUID = 5186252598233799157L;

	/**
	 * 支付金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 支付优惠明细
	 */
	@ApiListField("discount_infos")
	@ApiField("discount_infos")
	private List<DiscountInfos> discountInfos;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 在线支付流水号
	 */
	@ApiField("online_payment_no")
	private String onlinePaymentNo;

	/**
	 * POS支付单ID
	 */
	@ApiField("out_payment_id")
	private String outPaymentId;

	/**
	 * 口碑支付单ID
	 */
	@ApiField("payment_id")
	private String paymentId;

	/**
	 * 支付方式，包括但不限于：
(1) ONLINE : 线上支付
(2) OFFLINE_ALIPAY：线下支付宝收款
(3) OFFLINE_WECHAT：线下微信支付
(4) OFFLINE_BANKCARD：线下银行卡支付
(5) OFFLINE_CASH : 线下现金支付
(6) OFFLINE_POINTS : 积分支付
(7) OFFLINE_STORED_VALUE_CARD : 储值卡支付
(8) OFFLINE_KOUBEI_VOUCHER : 口碑券
(9) OFFLINE_MEITUAN : 美团
(10) OFFLINE_OTHER : 线下其他支付方式
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * 付款用户的标识ID
	 */
	@ApiField("user_identity")
	private String userIdentity;

	/**
	 * "可枚举的付款用户的标识类型：
(1) ALIPAY:支付宝用户标识
(2)WEIXIN: 微信用户标识
(3) MOBILEPHONW:手机号"
	 */
	@ApiField("user_identity_type")
	private String userIdentityType;

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
     * Gets discount amount.
     *
     * @return the discount amount
     */
    public String getDiscountAmount() {
		return this.discountAmount;
	}

    /**
     * Sets discount amount.
     *
     * @param discountAmount the discount amount
     */
    public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

    /**
     * Gets discount infos.
     *
     * @return the discount infos
     */
    public List<DiscountInfos> getDiscountInfos() {
		return this.discountInfos;
	}

    /**
     * Sets discount infos.
     *
     * @param discountInfos the discount infos
     */
    public void setDiscountInfos(List<DiscountInfos> discountInfos) {
		this.discountInfos = discountInfos;
	}

    /**
     * Gets ext infos.
     *
     * @return the ext infos
     */
    public String getExtInfos() {
		return this.extInfos;
	}

    /**
     * Sets ext infos.
     *
     * @param extInfos the ext infos
     */
    public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

    /**
     * Gets online payment no.
     *
     * @return the online payment no
     */
    public String getOnlinePaymentNo() {
		return this.onlinePaymentNo;
	}

    /**
     * Sets online payment no.
     *
     * @param onlinePaymentNo the online payment no
     */
    public void setOnlinePaymentNo(String onlinePaymentNo) {
		this.onlinePaymentNo = onlinePaymentNo;
	}

    /**
     * Gets out payment id.
     *
     * @return the out payment id
     */
    public String getOutPaymentId() {
		return this.outPaymentId;
	}

    /**
     * Sets out payment id.
     *
     * @param outPaymentId the out payment id
     */
    public void setOutPaymentId(String outPaymentId) {
		this.outPaymentId = outPaymentId;
	}

    /**
     * Gets payment id.
     *
     * @return the payment id
     */
    public String getPaymentId() {
		return this.paymentId;
	}

    /**
     * Sets payment id.
     *
     * @param paymentId the payment id
     */
    public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

    /**
     * Gets payment method.
     *
     * @return the payment method
     */
    public String getPaymentMethod() {
		return this.paymentMethod;
	}

    /**
     * Sets payment method.
     *
     * @param paymentMethod the payment method
     */
    public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
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

    /**
     * Gets user identity type.
     *
     * @return the user identity type
     */
    public String getUserIdentityType() {
		return this.userIdentityType;
	}

    /**
     * Sets user identity type.
     *
     * @param userIdentityType the user identity type
     */
    public void setUserIdentityType(String userIdentityType) {
		this.userIdentityType = userIdentityType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单优惠信息
 *
 * @author auto create
 * @since 1.0, 2016-11-24 22:26:22
 */
public class ReduceInfo extends AlipayObject {

	private static final long serialVersionUID = 2539862147881721525L;

	/**
	 * 门店品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 消费金额（单位分）
	 */
	@ApiField("consume_amt")
	private String consumeAmt;

	/**
	 * 消费门店名称
	 */
	@ApiField("consume_store_name")
	private String consumeStoreName;

	/**
	 * 消费时间
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/**
	 * 优惠金额（单位分）
	 */
	@ApiField("promo_amt")
	private String promoAmt;

	/**
	 * 用户名（脱敏）
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets consume amt.
     *
     * @return the consume amt
     */
    public String getConsumeAmt() {
		return this.consumeAmt;
	}

    /**
     * Sets consume amt.
     *
     * @param consumeAmt the consume amt
     */
    public void setConsumeAmt(String consumeAmt) {
		this.consumeAmt = consumeAmt;
	}

    /**
     * Gets consume store name.
     *
     * @return the consume store name
     */
    public String getConsumeStoreName() {
		return this.consumeStoreName;
	}

    /**
     * Sets consume store name.
     *
     * @param consumeStoreName the consume store name
     */
    public void setConsumeStoreName(String consumeStoreName) {
		this.consumeStoreName = consumeStoreName;
	}

    /**
     * Gets payment time.
     *
     * @return the payment time
     */
    public String getPaymentTime() {
		return this.paymentTime;
	}

    /**
     * Sets payment time.
     *
     * @param paymentTime the payment time
     */
    public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

    /**
     * Gets promo amt.
     *
     * @return the promo amt
     */
    public String getPromoAmt() {
		return this.promoAmt;
	}

    /**
     * Sets promo amt.
     *
     * @param promoAmt the promo amt
     */
    public void setPromoAmt(String promoAmt) {
		this.promoAmt = promoAmt;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险优惠权益
 *
 * @author auto create
 * @since 1.0, 2018-07-09 17:45:36
 */
public class InsCoupon extends AlipayObject {

	private static final long serialVersionUID = 1843486566815471867L;

	/**
	 * 实际使用的权益值，可选不唯一，可能是金额（分），也可能是业务约定的其他描述
	 */
	@ApiField("actual_coupon_value")
	private String actualCouponValue;

	/**
	 * 实际使用的折扣金额（分），可选不唯一
	 */
	@ApiField("actual_discount_cash")
	private Long actualDiscountCash;

	/**
	 * 权益ID，必选不唯一，营销域分配
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 权益类型，可选不唯一，营销域分配
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益值，可选不唯一，可能是金额（分），也可能是业务约定的其他描述
	 */
	@ApiField("coupon_value")
	private String couponValue;

    /**
     * Gets actual coupon value.
     *
     * @return the actual coupon value
     */
    public String getActualCouponValue() {
		return this.actualCouponValue;
	}

    /**
     * Sets actual coupon value.
     *
     * @param actualCouponValue the actual coupon value
     */
    public void setActualCouponValue(String actualCouponValue) {
		this.actualCouponValue = actualCouponValue;
	}

    /**
     * Gets actual discount cash.
     *
     * @return the actual discount cash
     */
    public Long getActualDiscountCash() {
		return this.actualDiscountCash;
	}

    /**
     * Sets actual discount cash.
     *
     * @param actualDiscountCash the actual discount cash
     */
    public void setActualDiscountCash(Long actualDiscountCash) {
		this.actualDiscountCash = actualDiscountCash;
	}

    /**
     * Gets coupon id.
     *
     * @return the coupon id
     */
    public String getCouponId() {
		return this.couponId;
	}

    /**
     * Sets coupon id.
     *
     * @param couponId the coupon id
     */
    public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

    /**
     * Gets coupon type.
     *
     * @return the coupon type
     */
    public String getCouponType() {
		return this.couponType;
	}

    /**
     * Sets coupon type.
     *
     * @param couponType the coupon type
     */
    public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

    /**
     * Gets coupon value.
     *
     * @return the coupon value
     */
    public String getCouponValue() {
		return this.couponValue;
	}

    /**
     * Sets coupon value.
     *
     * @param couponValue the coupon value
     */
    public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}

}

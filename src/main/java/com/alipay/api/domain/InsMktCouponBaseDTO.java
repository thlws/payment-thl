package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益基础信息
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:56:59
 */
public class InsMktCouponBaseDTO extends AlipayObject {

	private static final long serialVersionUID = 3191996656416594136L;

	/**
	 * 权益Id
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益值
	 */
	@ApiField("coupon_value")
	private String couponValue;

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

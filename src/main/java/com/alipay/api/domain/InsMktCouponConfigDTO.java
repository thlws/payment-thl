package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益配置
 *
 * @author auto create
 * @since 1.0, 2016-10-12 15:45:05
 */
public class InsMktCouponConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 4272939172752781482L;

	/**
	 * 权益配置Id
	 */
	@ApiField("coupon_conf_id")
	private String couponConfId;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 200元优惠券
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 核销结束时间
	 */
	@ApiField("use_end_time")
	private Date useEndTime;

	/**
	 * 核销使用规则
	 */
	@ApiField("use_rule")
	private String useRule;

	/**
	 * 核销开始时间
	 */
	@ApiField("use_start_time")
	private Date useStartTime;

    /**
     * Gets coupon conf id.
     *
     * @return the coupon conf id
     */
    public String getCouponConfId() {
		return this.couponConfId;
	}

    /**
     * Sets coupon conf id.
     *
     * @param couponConfId the coupon conf id
     */
    public void setCouponConfId(String couponConfId) {
		this.couponConfId = couponConfId;
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

    /**
     * Gets use end time.
     *
     * @return the use end time
     */
    public Date getUseEndTime() {
		return this.useEndTime;
	}

    /**
     * Sets use end time.
     *
     * @param useEndTime the use end time
     */
    public void setUseEndTime(Date useEndTime) {
		this.useEndTime = useEndTime;
	}

    /**
     * Gets use rule.
     *
     * @return the use rule
     */
    public String getUseRule() {
		return this.useRule;
	}

    /**
     * Sets use rule.
     *
     * @param useRule the use rule
     */
    public void setUseRule(String useRule) {
		this.useRule = useRule;
	}

    /**
     * Gets use start time.
     *
     * @return the use start time
     */
    public Date getUseStartTime() {
		return this.useStartTime;
	}

    /**
     * Sets use start time.
     *
     * @param useStartTime the use start time
     */
    public void setUseStartTime(Date useStartTime) {
		this.useStartTime = useStartTime;
	}

}

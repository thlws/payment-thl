package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益活动基础信息DTO
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:56:59
 */
public class InsMktCouponCmpgnBaseDTO extends AlipayObject {

	private static final long serialVersionUID = 2461817547756721868L;

	/**
	 * 活动id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益盖帽值
	 */
	@ApiField("coupon_upper_value")
	private String couponUpperValue;

	/**
	 * 权益值
	 */
	@ApiField("coupon_value")
	private String couponValue;

    /**
     * Gets campaign id.
     *
     * @return the campaign id
     */
    public String getCampaignId() {
		return this.campaignId;
	}

    /**
     * Sets campaign id.
     *
     * @param campaignId the campaign id
     */
    public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
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
     * Gets coupon upper value.
     *
     * @return the coupon upper value
     */
    public String getCouponUpperValue() {
		return this.couponUpperValue;
	}

    /**
     * Sets coupon upper value.
     *
     * @param couponUpperValue the coupon upper value
     */
    public void setCouponUpperValue(String couponUpperValue) {
		this.couponUpperValue = couponUpperValue;
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

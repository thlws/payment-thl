package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销预营销活动DTO
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class InsMktPreUseCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 3114917874718476454L;

	/**
	 * 活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动名称
	 */
	@ApiField("campaign_name")
	private String campaignName;

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
	 * 是否预核销通过
	 */
	@ApiField("pre_use")
	private Boolean preUse;

	/**
	 * 预核销失败原因
	 */
	@ApiField("reason")
	private String reason;

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
     * Gets campaign name.
     *
     * @return the campaign name
     */
    public String getCampaignName() {
		return this.campaignName;
	}

    /**
     * Sets campaign name.
     *
     * @param campaignName the campaign name
     */
    public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
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

    /**
     * Gets pre use.
     *
     * @return the pre use
     */
    public Boolean getPreUse() {
		return this.preUse;
	}

    /**
     * Sets pre use.
     *
     * @param preUse the pre use
     */
    public void setPreUse(Boolean preUse) {
		this.preUse = preUse;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public String getReason() {
		return this.reason;
	}

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(String reason) {
		this.reason = reason;
	}

}

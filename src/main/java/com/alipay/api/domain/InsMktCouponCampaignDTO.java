package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益活动数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class InsMktCouponCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 7149763666811742868L;

	/**
	 * 活动核销截止时间
	 */
	@ApiField("campaign_end_time")
	private Date campaignEndTime;

	/**
	 * 活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动备注
	 */
	@ApiField("campaign_memo")
	private String campaignMemo;

	/**
	 * 活动描述
	 */
	@ApiField("campaign_name")
	private String campaignName;

	/**
	 * 活动开始时间
	 */
	@ApiField("campaign_start_time")
	private Date campaignStartTime;

	/**
	 * 活动的权益类型描述
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益盖帽值，如1000元优惠券
	 */
	@ApiField("coupon_upper_value")
	private String couponUpperValue;

	/**
	 * 权益值，如500元优惠券
	 */
	@ApiField("coupon_value")
	private String couponValue;

    /**
     * Gets campaign end time.
     *
     * @return the campaign end time
     */
    public Date getCampaignEndTime() {
		return this.campaignEndTime;
	}

    /**
     * Sets campaign end time.
     *
     * @param campaignEndTime the campaign end time
     */
    public void setCampaignEndTime(Date campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}

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
     * Gets campaign memo.
     *
     * @return the campaign memo
     */
    public String getCampaignMemo() {
		return this.campaignMemo;
	}

    /**
     * Sets campaign memo.
     *
     * @param campaignMemo the campaign memo
     */
    public void setCampaignMemo(String campaignMemo) {
		this.campaignMemo = campaignMemo;
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
     * Gets campaign start time.
     *
     * @return the campaign start time
     */
    public Date getCampaignStartTime() {
		return this.campaignStartTime;
	}

    /**
     * Sets campaign start time.
     *
     * @param campaignStartTime the campaign start time
     */
    public void setCampaignStartTime(Date campaignStartTime) {
		this.campaignStartTime = campaignStartTime;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 现金活动信息
 *
 * @author auto create
 * @since 1.0, 2016-12-08 11:56:01
 */
public class CashCampaignInfo extends AlipayObject {

	private static final long serialVersionUID = 3838198913855835184L;

	/**
	 * 活动状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 现金红包名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/**
	 * 原始活动号,商户进行问题排查时提供
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

    /**
     * Gets camp status.
     *
     * @return the camp status
     */
    public String getCampStatus() {
		return this.campStatus;
	}

    /**
     * Sets camp status.
     *
     * @param campStatus the camp status
     */
    public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

    /**
     * Gets coupon name.
     *
     * @return the coupon name
     */
    public String getCouponName() {
		return this.couponName;
	}

    /**
     * Sets coupon name.
     *
     * @param couponName the coupon name
     */
    public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

    /**
     * Gets crowd no.
     *
     * @return the crowd no
     */
    public String getCrowdNo() {
		return this.crowdNo;
	}

    /**
     * Sets crowd no.
     *
     * @param crowdNo the crowd no
     */
    public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

    /**
     * Gets origin crowd no.
     *
     * @return the origin crowd no
     */
    public String getOriginCrowdNo() {
		return this.originCrowdNo;
	}

    /**
     * Sets origin crowd no.
     *
     * @param originCrowdNo the origin crowd no
     */
    public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}

}

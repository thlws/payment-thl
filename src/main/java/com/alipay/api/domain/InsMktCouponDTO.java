package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class InsMktCouponDTO extends AlipayObject {

	private static final long serialVersionUID = 4732148491835954172L;

	/**
	 * 权益资产Id，如券Id
	 */
	@ApiField("asset_id")
	private String assetId;

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
	 * 500元单品券
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 是否推荐使用该优惠
	 */
	@ApiField("recommend")
	private Boolean recommend;

	/**
	 * 核销结束时间
	 */
	@ApiField("use_end_time")
	private Date useEndTime;

	/**
	 * 核销规则
	 */
	@ApiField("use_rule")
	private String useRule;

	/**
	 * 核销开始时间
	 */
	@ApiField("use_start_time")
	private Date useStartTime;

    /**
     * Gets asset id.
     *
     * @return the asset id
     */
    public String getAssetId() {
		return this.assetId;
	}

    /**
     * Sets asset id.
     *
     * @param assetId the asset id
     */
    public void setAssetId(String assetId) {
		this.assetId = assetId;
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

    /**
     * Gets recommend.
     *
     * @return the recommend
     */
    public Boolean getRecommend() {
		return this.recommend;
	}

    /**
     * Sets recommend.
     *
     * @param recommend the recommend
     */
    public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
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

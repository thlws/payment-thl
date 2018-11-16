package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销预核销权益
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class InsMktPreUseCouponDTO extends AlipayObject {

	private static final long serialVersionUID = 4272285634655452679L;

	/**
	 * 资产Id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 权益id
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
	 * 是否支持预核销
	 */
	@ApiField("pre_use")
	private Boolean preUse;

	/**
	 * 预核销失败原因
	 */
	@ApiField("reason")
	private String reason;

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

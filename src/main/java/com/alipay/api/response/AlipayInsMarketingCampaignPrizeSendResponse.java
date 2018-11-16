package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.campaign.prize.send response.
 *
 * @author auto create
 * @since 1.0, 2017-12-14 18:04:02
 */
public class AlipayInsMarketingCampaignPrizeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5772638596374424535L;

	/** 
	 * 资产Id，如单品券权益类型，则对应的资产Id即为券Id
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 活动Id
	 */
	@ApiField("compaign_id")
	private String compaignId;

	/** 
	 * 用户权益Id
	 */
	@ApiField("coupon_id")
	private String couponId;

	/** 
	 * 权益类型：
single_voucher：单品券
full_jfb：集分宝
	 */
	@ApiField("coupon_type")
	private String couponType;

	/** 
	 * 权益值，如优惠券则表示金额
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/** 
	 * 发奖流水Id
	 */
	@ApiField("flow_id")
	private String flowId;

    /**
     * Sets asset id.
     *
     * @param assetId the asset id
     */
    public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

    /**
     * Gets asset id.
     *
     * @return the asset id
     */
    public String getAssetId( ) {
		return this.assetId;
	}

    /**
     * Sets compaign id.
     *
     * @param compaignId the compaign id
     */
    public void setCompaignId(String compaignId) {
		this.compaignId = compaignId;
	}

    /**
     * Gets compaign id.
     *
     * @return the compaign id
     */
    public String getCompaignId( ) {
		return this.compaignId;
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
     * Gets coupon id.
     *
     * @return the coupon id
     */
    public String getCouponId( ) {
		return this.couponId;
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
     * Gets coupon type.
     *
     * @return the coupon type
     */
    public String getCouponType( ) {
		return this.couponType;
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
     * Gets coupon value.
     *
     * @return the coupon value
     */
    public String getCouponValue( ) {
		return this.couponValue;
	}

    /**
     * Sets flow id.
     *
     * @param flowId the flow id
     */
    public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

    /**
     * Gets flow id.
     *
     * @return the flow id
     */
    public String getFlowId( ) {
		return this.flowId;
	}

}

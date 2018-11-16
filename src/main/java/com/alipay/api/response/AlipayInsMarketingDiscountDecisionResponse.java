package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsMktCouponCampaignDTO;
import com.alipay.api.domain.InsMktCouponDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.discount.decision response.
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:52
 */
public class AlipayInsMarketingDiscountDecisionResponse extends AlipayResponse {

	private static final long serialVersionUID = 1475534169132623298L;

	/** 
	 * 该订单可以享受的事后权益
	 */
	@ApiListField("mkt_coupon_campaigns")
	@ApiField("ins_mkt_coupon_campaign_d_t_o")
	private List<InsMktCouponCampaignDTO> mktCouponCampaigns;

	/** 
	 * 本次优惠咨询可以使用的权益权益列表
	 */
	@ApiListField("mkt_coupons")
	@ApiField("ins_mkt_coupon_d_t_o")
	private List<InsMktCouponDTO> mktCoupons;

    /**
     * Sets mkt coupon campaigns.
     *
     * @param mktCouponCampaigns the mkt coupon campaigns
     */
    public void setMktCouponCampaigns(List<InsMktCouponCampaignDTO> mktCouponCampaigns) {
		this.mktCouponCampaigns = mktCouponCampaigns;
	}

    /**
     * Gets mkt coupon campaigns.
     *
     * @return the mkt coupon campaigns
     */
    public List<InsMktCouponCampaignDTO> getMktCouponCampaigns( ) {
		return this.mktCouponCampaigns;
	}

    /**
     * Sets mkt coupons.
     *
     * @param mktCoupons the mkt coupons
     */
    public void setMktCoupons(List<InsMktCouponDTO> mktCoupons) {
		this.mktCoupons = mktCoupons;
	}

    /**
     * Gets mkt coupons.
     *
     * @return the mkt coupons
     */
    public List<InsMktCouponDTO> getMktCoupons( ) {
		return this.mktCoupons;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.create response.
 *
 * @author auto create
 * @since 1.0, 2018-04-18 11:42:29
 */
public class KoubeiMarketingCampaignIntelligentPromoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7683669136766416338L;

	/** 
	 * 智能营销活动信息
	 */
	@ApiField("promo")
	private IntelligentPromo promo;

    /**
     * Sets promo.
     *
     * @param promo the promo
     */
    public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}

    /**
     * Gets promo.
     *
     * @return the promo
     */
    public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}

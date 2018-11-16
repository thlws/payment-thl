package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.promo.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-20 18:18:43
 */
public class KoubeiMarketingCampaignIntelligentPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7134921513782141581L;

	/** 
	 * 查询返回的营销活动模型
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

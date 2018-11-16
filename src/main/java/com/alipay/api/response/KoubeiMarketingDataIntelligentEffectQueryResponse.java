package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.intelligent.effect.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:02:50
 */
public class KoubeiMarketingDataIntelligentEffectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2447366492865654225L;

	/** 
	 * 咨询后返回的模型，包含活动本身的模型以及效果模型
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

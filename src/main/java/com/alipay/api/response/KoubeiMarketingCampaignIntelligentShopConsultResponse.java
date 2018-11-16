package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IntelligentPromoShopSummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.shop.consult response.
 *
 * @author auto create
 * @since 1.0, 2018-01-29 11:03:57
 */
public class KoubeiMarketingCampaignIntelligentShopConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7714939754257531276L;

	/** 
	 * 总共项数
	 */
	@ApiField("items")
	private String items;

	/** 
	 * 智能营销方案符合标准的门店列表
	 */
	@ApiListField("shops")
	@ApiField("intelligent_promo_shop_summary_info")
	private List<IntelligentPromoShopSummaryInfo> shops;

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(String items) {
		this.items = items;
	}

    /**
     * Gets items.
     *
     * @return the items
     */
    public String getItems( ) {
		return this.items;
	}

    /**
     * Sets shops.
     *
     * @param shops the shops
     */
    public void setShops(List<IntelligentPromoShopSummaryInfo> shops) {
		this.shops = shops;
	}

    /**
     * Gets shops.
     *
     * @return the shops
     */
    public List<IntelligentPromoShopSummaryInfo> getShops( ) {
		return this.shops;
	}

}

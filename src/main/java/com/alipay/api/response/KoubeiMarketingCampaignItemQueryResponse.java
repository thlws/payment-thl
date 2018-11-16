package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromoItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:08:13
 */
public class KoubeiMarketingCampaignItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3838918398372483413L;

	/** 
	 * 商品详情，包含门店信息
	 */
	@ApiField("item")
	private PromoItemInfo item;

    /**
     * Sets item.
     *
     * @param item the item
     */
    public void setItem(PromoItemInfo item) {
		this.item = item;
	}

    /**
     * Gets item.
     *
     * @return the item
     */
    public PromoItemInfo getItem( ) {
		return this.item;
	}

}

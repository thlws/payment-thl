package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopPromoInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.shoppromoinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:33:13
 */
public class KoubeiMarketingMallShoppromoinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4784768246424233138L;

	/** 
	 * 店铺营销信息详情
	 */
	@ApiListField("shop_promo_infos")
	@ApiField("shop_promo_info")
	private List<ShopPromoInfo> shopPromoInfos;

    /**
     * Sets shop promo infos.
     *
     * @param shopPromoInfos the shop promo infos
     */
    public void setShopPromoInfos(List<ShopPromoInfo> shopPromoInfos) {
		this.shopPromoInfos = shopPromoInfos;
	}

    /**
     * Gets shop promo infos.
     *
     * @return the shop promo infos
     */
    public List<ShopPromoInfo> getShopPromoInfos( ) {
		return this.shopPromoInfos;
	}

}

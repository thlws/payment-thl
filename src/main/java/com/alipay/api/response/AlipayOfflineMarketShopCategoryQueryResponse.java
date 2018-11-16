package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopCategoryConfigInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.category.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOfflineMarketShopCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8218277135578739455L;

	/** 
	 * 门店类目配置信息，包括能够开店的叶子节点类目信息，以及类目约束配置信息。
	 */
	@ApiListField("shop_category_config_infos")
	@ApiField("shop_category_config_info")
	private List<ShopCategoryConfigInfo> shopCategoryConfigInfos;

    /**
     * Sets shop category config infos.
     *
     * @param shopCategoryConfigInfos the shop category config infos
     */
    public void setShopCategoryConfigInfos(List<ShopCategoryConfigInfo> shopCategoryConfigInfos) {
		this.shopCategoryConfigInfos = shopCategoryConfigInfos;
	}

    /**
     * Gets shop category config infos.
     *
     * @return the shop category config infos
     */
    public List<ShopCategoryConfigInfo> getShopCategoryConfigInfos( ) {
		return this.shopCategoryConfigInfos;
	}

}

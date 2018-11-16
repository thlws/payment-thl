package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetProduceItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetproduce.assign.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-30 13:46:00
 */
public class AntMerchantExpandAssetproduceAssignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8729418358118852395L;

	/** 
	 * 生产指令集合, 订单明细ID(assign_item_id)为唯一键值.
	 */
	@ApiListField("asset_produce_items")
	@ApiField("asset_produce_item")
	private List<AssetProduceItem> assetProduceItems;

	/** 
	 * 当前是否还有生产指令可以拉取; 注意如果该值为false, 也只是提示当前没有更多生产指令了, 不代表后面没有生产指令, 商户需要自己制定策略定时去拉取.
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

    /**
     * Sets asset produce items.
     *
     * @param assetProduceItems the asset produce items
     */
    public void setAssetProduceItems(List<AssetProduceItem> assetProduceItems) {
		this.assetProduceItems = assetProduceItems;
	}

    /**
     * Gets asset produce items.
     *
     * @return the asset produce items
     */
    public List<AssetProduceItem> getAssetProduceItems( ) {
		return this.assetProduceItems;
	}

    /**
     * Sets has next page.
     *
     * @param hasNextPage the has next page
     */
    public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

    /**
     * Gets has next page.
     *
     * @return the has next page
     */
    public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

}

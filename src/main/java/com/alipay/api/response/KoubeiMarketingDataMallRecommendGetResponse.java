package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.recommend.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-05 14:15:00
 */
public class KoubeiMarketingDataMallRecommendGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8582216711527623444L;

	/** 
	 * 是否还有更多数据：true-是，false-否
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 商圈商品券结构商圈商
	 */
	@ApiListField("items")
	@ApiField("item_resp")
	private List<ItemResp> items;

    /**
     * Sets has more.
     *
     * @param hasMore the has more
     */
    public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

    /**
     * Gets has more.
     *
     * @return the has more
     */
    public Boolean getHasMore( ) {
		return this.hasMore;
	}

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(List<ItemResp> items) {
		this.items = items;
	}

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<ItemResp> getItems( ) {
		return this.items;
	}

}

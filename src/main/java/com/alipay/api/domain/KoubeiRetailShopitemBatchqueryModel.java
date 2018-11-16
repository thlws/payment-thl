package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv 回传的门店商品信息查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class KoubeiRetailShopitemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3749633482337935152L;

	/**
	 * 查询店铺商品查询入参
	 */
	@ApiListField("shop_items")
	@ApiField("request_ext_shop_item_query")
	private List<RequestExtShopItemQuery> shopItems;

    /**
     * Gets shop items.
     *
     * @return the shop items
     */
    public List<RequestExtShopItemQuery> getShopItems() {
		return this.shopItems;
	}

    /**
     * Sets shop items.
     *
     * @param shopItems the shop items
     */
    public void setShopItems(List<RequestExtShopItemQuery> shopItems) {
		this.shopItems = shopItems;
	}

}

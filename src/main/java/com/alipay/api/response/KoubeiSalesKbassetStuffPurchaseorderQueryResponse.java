package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccessPurchaseOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.purchaseorder.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:41:37
 */
public class KoubeiSalesKbassetStuffPurchaseorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4214178335456696879L;

	/** 
	 * 采购单记录集合
	 */
	@ApiListField("asset_purchase_orders")
	@ApiField("access_purchase_order")
	private List<AccessPurchaseOrder> assetPurchaseOrders;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

    /**
     * Sets asset purchase orders.
     *
     * @param assetPurchaseOrders the asset purchase orders
     */
    public void setAssetPurchaseOrders(List<AccessPurchaseOrder> assetPurchaseOrders) {
		this.assetPurchaseOrders = assetPurchaseOrders;
	}

    /**
     * Gets asset purchase orders.
     *
     * @return the asset purchase orders
     */
    public List<AccessPurchaseOrder> getAssetPurchaseOrders( ) {
		return this.assetPurchaseOrders;
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

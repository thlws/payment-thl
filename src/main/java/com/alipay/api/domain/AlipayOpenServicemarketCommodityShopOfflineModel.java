package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下架商户门店
 *
 * @author auto create
 * @since 1.0, 2016-08-25 11:11:17
 */
public class AlipayOpenServicemarketCommodityShopOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 8139648187768551461L;

	/**
	 * 服务商户ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId() {
		return this.commodityId;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店摘要信息
 *
 * @author auto create
 * @since 1.0, 2017-10-12 10:54:18
 */
public class IntelligentPromoShopSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 7717892268984615992L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 全店名
	 */
	@ApiField("shop_name")
	private String shopName;

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

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName() {
		return this.shopName;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}

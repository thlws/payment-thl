package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作品集－门店
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:04:46
 */
public class PortfolioShop extends AlipayObject {

	private static final long serialVersionUID = 4478763865621578436L;

	/**
	 * 展示权重；必须大于等于0；排序规则：权重倒叙
	 */
	@ApiField("display_weight")
	private Long displayWeight;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets display weight.
     *
     * @return the display weight
     */
    public Long getDisplayWeight() {
		return this.displayWeight;
	}

    /**
     * Sets display weight.
     *
     * @param displayWeight the display weight
     */
    public void setDisplayWeight(Long displayWeight) {
		this.displayWeight = displayWeight;
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

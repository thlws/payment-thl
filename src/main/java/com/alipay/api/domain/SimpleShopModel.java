package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商家中心员工管理的商户门店信息简单模型，包括门店id，门店名称
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:31:55
 */
public class SimpleShopModel extends AlipayObject {

	private static final long serialVersionUID = 6811772261356767127L;

	/**
	 * 商户门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商户门店名称
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

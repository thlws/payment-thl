package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店id查桌码信息列表
 *
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:11
 */
public class KoubeiCateringTablelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6292324399322713999L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

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

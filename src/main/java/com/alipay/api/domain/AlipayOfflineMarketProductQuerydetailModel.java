package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过该接口可以查询商户录入的指定商品详细信息
 *
 * @author auto create
 * @since 1.0, 2017-02-27 13:05:23
 */
public class AlipayOfflineMarketProductQuerydetailModel extends AlipayObject {

	private static final long serialVersionUID = 5363561746659136712L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 门店ID。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets op role.
     *
     * @return the op role
     */
    public String getOpRole() {
		return this.opRole;
	}

    /**
     * Sets op role.
     *
     * @param opRole the op role
     */
    public void setOpRole(String opRole) {
		this.opRole = opRole;
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

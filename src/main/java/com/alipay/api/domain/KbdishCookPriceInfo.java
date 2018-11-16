package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜谱价格
 *
 * @author auto create
 * @since 1.0, 2018-09-11 14:28:14
 */
public class KbdishCookPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 2755349643647891911L;

	/**
	 * 菜单id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 会员价
	 */
	@ApiField("member_price")
	private String memberPrice;

	/**
	 * 售卖价格
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * skuid
	 */
	@ApiField("sku_id")
	private String skuId;

    /**
     * Gets cook id.
     *
     * @return the cook id
     */
    public String getCookId() {
		return this.cookId;
	}

    /**
     * Sets cook id.
     *
     * @param cookId the cook id
     */
    public void setCookId(String cookId) {
		this.cookId = cookId;
	}

    /**
     * Gets dish id.
     *
     * @return the dish id
     */
    public String getDishId() {
		return this.dishId;
	}

    /**
     * Sets dish id.
     *
     * @param dishId the dish id
     */
    public void setDishId(String dishId) {
		this.dishId = dishId;
	}

    /**
     * Gets member price.
     *
     * @return the member price
     */
    public String getMemberPrice() {
		return this.memberPrice;
	}

    /**
     * Sets member price.
     *
     * @param memberPrice the member price
     */
    public void setMemberPrice(String memberPrice) {
		this.memberPrice = memberPrice;
	}

    /**
     * Gets sell price.
     *
     * @return the sell price
     */
    public String getSellPrice() {
		return this.sellPrice;
	}

    /**
     * Sets sell price.
     *
     * @param sellPrice the sell price
     */
    public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

    /**
     * Gets sku id.
     *
     * @return the sku id
     */
    public String getSkuId() {
		return this.skuId;
	}

    /**
     * Sets sku id.
     *
     * @param skuId the sku id
     */
    public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}

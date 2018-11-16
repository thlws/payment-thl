package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品单信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 10:32:44
 */
public class ItemOrderDetail extends AlipayObject {

	private static final long serialVersionUID = 4568471415156487225L;

	/**
	 * 商品原价，单位元，精确到小数点后两位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品现价，即商品售价，单位为元，精确到小数点后两位
	 */
	@ApiField("price")
	private String price;

	/**
	 * 购买商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

    /**
     * Gets original price.
     *
     * @return the original price
     */
    public String getOriginalPrice() {
		return this.originalPrice;
	}

    /**
     * Sets original price.
     *
     * @param originalPrice the original price
     */
    public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
		return this.price;
	}

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
		this.price = price;
	}

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public Long getQuantity() {
		return this.quantity;
	}

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(Long quantity) {
		this.quantity = quantity;
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

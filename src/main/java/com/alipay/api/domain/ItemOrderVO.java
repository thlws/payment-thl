package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品单信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 10:36:34
 */
public class ItemOrderVO extends AlipayObject {

	private static final long serialVersionUID = 8626117197283738376L;

	/**
	 * 业务扩展信息，比如外部卡码，格式为json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品单ID
	 */
	@ApiField("item_order_no")
	private String itemOrderNo;

	/**
	 * 商品单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets item order no.
     *
     * @return the item order no
     */
    public String getItemOrderNo() {
		return this.itemOrderNo;
	}

    /**
     * Sets item order no.
     *
     * @param itemOrderNo the item order no
     */
    public void setItemOrderNo(String itemOrderNo) {
		this.itemOrderNo = itemOrderNo;
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

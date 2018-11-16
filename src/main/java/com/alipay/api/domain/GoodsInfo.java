package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品明细信息
 *
 * @author auto create
 * @since 1.0, 2017-08-16 14:41:52
 */
public class GoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 3621271341897111438L;

	/**
	 * 商品类目
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 商户自定义商品外部编号
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商户自定义商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品单价，单位元,精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量,支持小数，但是小数位不能超过两位
	 */
	@ApiField("quantity")
	private String quantity;

    /**
     * Gets goods category.
     *
     * @return the goods category
     */
    public String getGoodsCategory() {
		return this.goodsCategory;
	}

    /**
     * Sets goods category.
     *
     * @param goodsCategory the goods category
     */
    public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

    /**
     * Gets goods id.
     *
     * @return the goods id
     */
    public String getGoodsId() {
		return this.goodsId;
	}

    /**
     * Sets goods id.
     *
     * @param goodsId the goods id
     */
    public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

    /**
     * Gets goods name.
     *
     * @return the goods name
     */
    public String getGoodsName() {
		return this.goodsName;
	}

    /**
     * Sets goods name.
     *
     * @param goodsName the goods name
     */
    public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
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
    public String getQuantity() {
		return this.quantity;
	}

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}

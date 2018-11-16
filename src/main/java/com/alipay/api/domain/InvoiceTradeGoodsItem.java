package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝交易模型交易内容项模型
 *
 * @author auto create
 * @since 1.0, 2017-06-05 21:24:37
 */
public class InvoiceTradeGoodsItem extends AlipayObject {

	private static final long serialVersionUID = 1465242872454399565L;

	/**
	 * 商品类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商户设置的商品编号
	 */
	@ApiField("goods_no")
	private String goodsNo;

	/**
	 * 商品项支付金额
	 */
	@ApiField("goods_sum_amount")
	private String goodsSumAmount;

	/**
	 * 商品单价，单位元，精确到小数点后两位
	 */
	@ApiField("price")
	private String price;

	/**
	 * 购买数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 购买商品规格型号描述
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 购买商品单位描述
	 */
	@ApiField("unit")
	private String unit;

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
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
     * Gets goods no.
     *
     * @return the goods no
     */
    public String getGoodsNo() {
		return this.goodsNo;
	}

    /**
     * Sets goods no.
     *
     * @param goodsNo the goods no
     */
    public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

    /**
     * Gets goods sum amount.
     *
     * @return the goods sum amount
     */
    public String getGoodsSumAmount() {
		return this.goodsSumAmount;
	}

    /**
     * Sets goods sum amount.
     *
     * @param goodsSumAmount the goods sum amount
     */
    public void setGoodsSumAmount(String goodsSumAmount) {
		this.goodsSumAmount = goodsSumAmount;
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

    /**
     * Gets specification.
     *
     * @return the specification
     */
    public String getSpecification() {
		return this.specification;
	}

    /**
     * Sets specification.
     *
     * @param specification the specification
     */
    public void setSpecification(String specification) {
		this.specification = specification;
	}

    /**
     * Gets unit.
     *
     * @return the unit
     */
    public String getUnit() {
		return this.unit;
	}

    /**
     * Sets unit.
     *
     * @param unit the unit
     */
    public void setUnit(String unit) {
		this.unit = unit;
	}

}

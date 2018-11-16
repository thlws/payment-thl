package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品套餐内，菜品详细信息数据结构
 *
 * @author auto create
 * @since 1.0, 2017-08-24 13:56:10
 */
public class ItemUnitInfo extends AlipayObject {

	private static final long serialVersionUID = 4488678349699554793L;

	/**
	 * 商品详情-商品套餐内容-菜品数量
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 商品详情-商品套餐内容-菜品价格。字符串，单位元，两位小数
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品详情-商品套餐内容-菜品规格
	 */
	@ApiField("spec")
	private String spec;

	/**
	 * 商品详情-商品套餐内容-菜品名称。不得超过15个中文字符
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品详情-商品套餐内容-菜品数量单位
	 */
	@ApiField("unit")
	private String unit;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(Long amount) {
		this.amount = amount;
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
     * Gets spec.
     *
     * @return the spec
     */
    public String getSpec() {
		return this.spec;
	}

    /**
     * Sets spec.
     *
     * @param spec the spec
     */
    public void setSpec(String spec) {
		this.spec = spec;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
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

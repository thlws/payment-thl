package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询店铺商品信息入参
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class RequestExtShopItemQuery extends AlipayObject {

	private static final long serialVersionUID = 7237632611399661615L;

	/**
	 * 店铺商品的品牌名称
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 店铺商品的商品类别
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 店铺商品SKU
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 口碑门店id
	 */
	@ApiField("kb_shop_id")
	private String kbShopId;

	/**
	 * 商品参考价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 店铺商品的名称
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets brand code.
     *
     * @return the brand code
     */
    public String getBrandCode() {
		return this.brandCode;
	}

    /**
     * Sets brand code.
     *
     * @param brandCode the brand code
     */
    public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

    /**
     * Gets category code.
     *
     * @return the category code
     */
    public String getCategoryCode() {
		return this.categoryCode;
	}

    /**
     * Sets category code.
     *
     * @param categoryCode the category code
     */
    public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets item code.
     *
     * @return the item code
     */
    public String getItemCode() {
		return this.itemCode;
	}

    /**
     * Sets item code.
     *
     * @param itemCode the item code
     */
    public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

    /**
     * Gets kb shop id.
     *
     * @return the kb shop id
     */
    public String getKbShopId() {
		return this.kbShopId;
	}

    /**
     * Sets kb shop id.
     *
     * @param kbShopId the kb shop id
     */
    public void setKbShopId(String kbShopId) {
		this.kbShopId = kbShopId;
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

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺商品模型结构
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class ExtShopItem extends AlipayObject {

	private static final long serialVersionUID = 5562387618742856169L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 入数，必须为整数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 产地
	 */
	@ApiField("country")
	private String country;

	/**
	 * 产品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品扩展信息
	 */
	@ApiField("ext_goods_info")
	private String extGoodsInfo;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品条码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 口碑门店id
	 */
	@ApiField("kb_shop_id")
	private String kbShopId;

	/**
	 * 商品图片url
	 */
	@ApiField("picture")
	private String picture;

	/**
	 * 参考价格
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品规格
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * ISV系统提供商
	 */
	@ApiField("system_provider_id")
	private String systemProviderId;

	/**
	 * 商品名称
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
     * Gets count.
     *
     * @return the count
     */
    public Long getCount() {
		return this.count;
	}

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
		this.count = count;
	}

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
		return this.country;
	}

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
		this.country = country;
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
     * Gets ext goods info.
     *
     * @return the ext goods info
     */
    public String getExtGoodsInfo() {
		return this.extGoodsInfo;
	}

    /**
     * Sets ext goods info.
     *
     * @param extGoodsInfo the ext goods info
     */
    public void setExtGoodsInfo(String extGoodsInfo) {
		this.extGoodsInfo = extGoodsInfo;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
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
     * Gets picture.
     *
     * @return the picture
     */
    public String getPicture() {
		return this.picture;
	}

    /**
     * Sets picture.
     *
     * @param picture the picture
     */
    public void setPicture(String picture) {
		this.picture = picture;
	}

    /**
     * Gets price.
     *
     * @return the price
     */
    public Long getPrice() {
		return this.price;
	}

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(Long price) {
		this.price = price;
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
     * Gets system provider id.
     *
     * @return the system provider id
     */
    public String getSystemProviderId() {
		return this.systemProviderId;
	}

    /**
     * Sets system provider id.
     *
     * @param systemProviderId the system provider id
     */
    public void setSystemProviderId(String systemProviderId) {
		this.systemProviderId = systemProviderId;
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

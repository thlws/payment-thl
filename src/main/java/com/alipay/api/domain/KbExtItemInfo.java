package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商品信息（关联品牌，品类）
 *
 * @author auto create
 * @since 1.0, 2017-09-25 14:11:31
 */
public class KbExtItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4781732143399494676L;

	/**
	 * 品牌信息（目前支持3级品牌）
	 */
	@ApiListField("brand_level_info_list")
	@ApiField("brand_level_info")
	private List<BrandLevelInfo> brandLevelInfoList;

	/**
	 * 商品简述：对商品的简要说明，吸引顾客的描述（非必填）
	 */
	@ApiField("brief")
	private String brief;

	/**
	 * 品类列表信息（目前支持5级品类）
	 */
	@ApiListField("category_level_info_list")
	@ApiField("category_level_info")
	private List<CategoryLevelInfo> categoryLevelInfoList;

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
	 * 币种，采用ISO 4217 Currency Codes编码，表示该商品售价对应的货币种类：CNY/USD 等
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品编码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 店内货号：商户店铺内自行对商品的编码
	 */
	@ApiField("inner_goods_id")
	private String innerGoodsId;

	/**
	 * 商品规格:900ml/500克/12瓶装
	 */
	@ApiField("item_format")
	private String itemFormat;

	/**
	 * 包装：描述该商品的包装形式：盒装/瓶装/袋装/散装
	 */
	@ApiField("pack")
	private String pack;

	/**
	 * 商品图片file_id列表（最多30张）
	 */
	@ApiListField("picture_id_list")
	@ApiField("string")
	private List<String> pictureIdList;

	/**
	 * 参考价格，单位（分），必须为整数
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 商品描述
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 表示该商品的售卖单位，对单价的补充说明个/箱/盒/克/公斤 等
	 */
	@ApiField("unit")
	private String unit;

    /**
     * Gets brand level info list.
     *
     * @return the brand level info list
     */
    public List<BrandLevelInfo> getBrandLevelInfoList() {
		return this.brandLevelInfoList;
	}

    /**
     * Sets brand level info list.
     *
     * @param brandLevelInfoList the brand level info list
     */
    public void setBrandLevelInfoList(List<BrandLevelInfo> brandLevelInfoList) {
		this.brandLevelInfoList = brandLevelInfoList;
	}

    /**
     * Gets brief.
     *
     * @return the brief
     */
    public String getBrief() {
		return this.brief;
	}

    /**
     * Sets brief.
     *
     * @param brief the brief
     */
    public void setBrief(String brief) {
		this.brief = brief;
	}

    /**
     * Gets category level info list.
     *
     * @return the category level info list
     */
    public List<CategoryLevelInfo> getCategoryLevelInfoList() {
		return this.categoryLevelInfoList;
	}

    /**
     * Sets category level info list.
     *
     * @param categoryLevelInfoList the category level info list
     */
    public void setCategoryLevelInfoList(List<CategoryLevelInfo> categoryLevelInfoList) {
		this.categoryLevelInfoList = categoryLevelInfoList;
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
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
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
     * Gets inner goods id.
     *
     * @return the inner goods id
     */
    public String getInnerGoodsId() {
		return this.innerGoodsId;
	}

    /**
     * Sets inner goods id.
     *
     * @param innerGoodsId the inner goods id
     */
    public void setInnerGoodsId(String innerGoodsId) {
		this.innerGoodsId = innerGoodsId;
	}

    /**
     * Gets item format.
     *
     * @return the item format
     */
    public String getItemFormat() {
		return this.itemFormat;
	}

    /**
     * Sets item format.
     *
     * @param itemFormat the item format
     */
    public void setItemFormat(String itemFormat) {
		this.itemFormat = itemFormat;
	}

    /**
     * Gets pack.
     *
     * @return the pack
     */
    public String getPack() {
		return this.pack;
	}

    /**
     * Sets pack.
     *
     * @param pack the pack
     */
    public void setPack(String pack) {
		this.pack = pack;
	}

    /**
     * Gets picture id list.
     *
     * @return the picture id list
     */
    public List<String> getPictureIdList() {
		return this.pictureIdList;
	}

    /**
     * Sets picture id list.
     *
     * @param pictureIdList the picture id list
     */
    public void setPictureIdList(List<String> pictureIdList) {
		this.pictureIdList = pictureIdList;
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

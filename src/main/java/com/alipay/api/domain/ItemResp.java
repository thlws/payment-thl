package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈商品券结构
 *
 * @author auto create
 * @since 1.0, 2018-07-05 14:11:05
 */
public class ItemResp extends AlipayObject {

	private static final long serialVersionUID = 7389557694654951993L;

	/**
	 * 内容分类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 用户是否已购买或已领取:true-已购买/已领取,false-未购买/未领取
	 */
	@ApiField("has_recive")
	private Boolean hasRecive;

	/**
	 * 小图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 营销图片
	 */
	@ApiField("image")
	private String image;

	/**
	 * 商品、券ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 内容意义
	 */
	@ApiField("meaning")
	private String meaning;

	/**
	 * 商品价格或折扣
	 */
	@ApiField("price")
	private String price;

	/**
	 * 简要描述
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 内容标签
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 限制及特性描述
	 */
	@ApiField("tips")
	private String tips;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 类型:VOUCHER(券)、ITEM(商品)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 内容跳转地址
	 */
	@ApiField("url")
	private String url;

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
     * Gets has recive.
     *
     * @return the has recive
     */
    public Boolean getHasRecive() {
		return this.hasRecive;
	}

    /**
     * Sets has recive.
     *
     * @param hasRecive the has recive
     */
    public void setHasRecive(Boolean hasRecive) {
		this.hasRecive = hasRecive;
	}

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon() {
		return this.icon;
	}

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
		this.icon = icon;
	}

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
		return this.image;
	}

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
		this.image = image;
	}

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
     * Gets meaning.
     *
     * @return the meaning
     */
    public String getMeaning() {
		return this.meaning;
	}

    /**
     * Sets meaning.
     *
     * @param meaning the meaning
     */
    public void setMeaning(String meaning) {
		this.meaning = meaning;
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
     * Gets summary.
     *
     * @return the summary
     */
    public String getSummary() {
		return this.summary;
	}

    /**
     * Sets summary.
     *
     * @param summary the summary
     */
    public void setSummary(String summary) {
		this.summary = summary;
	}

    /**
     * Gets tags.
     *
     * @return the tags
     */
    public String getTags() {
		return this.tags;
	}

    /**
     * Sets tags.
     *
     * @param tags the tags
     */
    public void setTags(String tags) {
		this.tags = tags;
	}

    /**
     * Gets tips.
     *
     * @return the tips
     */
    public String getTips() {
		return this.tips;
	}

    /**
     * Sets tips.
     *
     * @param tips the tips
     */
    public void setTips(String tips) {
		this.tips = tips;
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
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
		return this.url;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

}

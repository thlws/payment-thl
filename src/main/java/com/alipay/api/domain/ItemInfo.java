package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券的单品信息
 *
 * @author auto create
 * @since 1.0, 2017-11-23 10:24:01
 */
public class ItemInfo extends AlipayObject {

	private static final long serialVersionUID = 6149689689631651326L;

	/**
	 * 券适用的单品码列表
最少配置1个单品码
最多配置500个单品码
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 单品图片列表
单品图片不能超过3张
	 */
	@ApiListField("item_imgs")
	@ApiField("string")
	private List<String> itemImgs;

	/**
	 * 单品券详细介绍跳转链接
	 */
	@ApiField("item_link")
	private String itemLink;

	/**
	 * 单品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 单品券说明
	 */
	@ApiField("item_text")
	private String itemText;

	/**
	 * 单品券适用的商品列表中，每一个商品最高可享受优惠的件数；  
如：券适用于A,B两种商品，该字段设置为1，则用券A,B两种商品每种最多只有一件可享受优惠；
	 */
	@ApiField("max_discount_num")
	private String maxDiscountNum;

	/**
	 * 单品券适用商品列表中，每种商品享受优惠最低购买件数的门槛；
如：券适用于A,B两种商品，该字段设置为3，则A,B两种商品每种最少需要购买3件才可享受优惠；
	 */
	@ApiField("min_consume_num")
	private String minConsumeNum;

	/**
	 * 单品的原价，单位元
必须为合法金额类型字符串，如9.99
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 券适用SKU的最低消费金额门槛
如券适用A,B两个SKU，该字段设置的值为100，则订单中购买A,B两个SKU的合计金额需大于100元才可用券
	 */
	@ApiField("sku_min_consume")
	private String skuMinConsume;

	/**
	 * 如果一个单品券适用A，B，C三个单品，若设置了该字段为2，则在一笔交易中，A，B，C三个单品加起来最多只有俩件能够享受优惠
	 */
	@ApiField("total_max_discount_num")
	private String totalMaxDiscountNum;

    /**
     * Gets item ids.
     *
     * @return the item ids
     */
    public List<String> getItemIds() {
		return this.itemIds;
	}

    /**
     * Sets item ids.
     *
     * @param itemIds the item ids
     */
    public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

    /**
     * Gets item imgs.
     *
     * @return the item imgs
     */
    public List<String> getItemImgs() {
		return this.itemImgs;
	}

    /**
     * Sets item imgs.
     *
     * @param itemImgs the item imgs
     */
    public void setItemImgs(List<String> itemImgs) {
		this.itemImgs = itemImgs;
	}

    /**
     * Gets item link.
     *
     * @return the item link
     */
    public String getItemLink() {
		return this.itemLink;
	}

    /**
     * Sets item link.
     *
     * @param itemLink the item link
     */
    public void setItemLink(String itemLink) {
		this.itemLink = itemLink;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName() {
		return this.itemName;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    /**
     * Gets item text.
     *
     * @return the item text
     */
    public String getItemText() {
		return this.itemText;
	}

    /**
     * Sets item text.
     *
     * @param itemText the item text
     */
    public void setItemText(String itemText) {
		this.itemText = itemText;
	}

    /**
     * Gets max discount num.
     *
     * @return the max discount num
     */
    public String getMaxDiscountNum() {
		return this.maxDiscountNum;
	}

    /**
     * Sets max discount num.
     *
     * @param maxDiscountNum the max discount num
     */
    public void setMaxDiscountNum(String maxDiscountNum) {
		this.maxDiscountNum = maxDiscountNum;
	}

    /**
     * Gets min consume num.
     *
     * @return the min consume num
     */
    public String getMinConsumeNum() {
		return this.minConsumeNum;
	}

    /**
     * Sets min consume num.
     *
     * @param minConsumeNum the min consume num
     */
    public void setMinConsumeNum(String minConsumeNum) {
		this.minConsumeNum = minConsumeNum;
	}

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
     * Gets sku min consume.
     *
     * @return the sku min consume
     */
    public String getSkuMinConsume() {
		return this.skuMinConsume;
	}

    /**
     * Sets sku min consume.
     *
     * @param skuMinConsume the sku min consume
     */
    public void setSkuMinConsume(String skuMinConsume) {
		this.skuMinConsume = skuMinConsume;
	}

    /**
     * Gets total max discount num.
     *
     * @return the total max discount num
     */
    public String getTotalMaxDiscountNum() {
		return this.totalMaxDiscountNum;
	}

    /**
     * Sets total max discount num.
     *
     * @param totalMaxDiscountNum the total max discount num
     */
    public void setTotalMaxDiscountNum(String totalMaxDiscountNum) {
		this.totalMaxDiscountNum = totalMaxDiscountNum;
	}

}

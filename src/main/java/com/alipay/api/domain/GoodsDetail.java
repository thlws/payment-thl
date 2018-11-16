package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品列表信息
 *
 * @author auto create
 * @since 1.0, 2018-08-31 12:15:10
 */
public class GoodsDetail extends AlipayObject {

	private static final long serialVersionUID = 2264166422499968551L;

	/**
	 * 支付宝定义的统一商品编号
	 */
	@ApiField("alipay_goods_id")
	private String alipayGoodsId;

	/**
	 * 商品描述信息
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商品类目
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 商品的编号
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品单价，单位为元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品的展示地址
	 */
	@ApiField("show_url")
	private String showUrl;

    /**
     * Gets alipay goods id.
     *
     * @return the alipay goods id
     */
    public String getAlipayGoodsId() {
		return this.alipayGoodsId;
	}

    /**
     * Sets alipay goods id.
     *
     * @param alipayGoodsId the alipay goods id
     */
    public void setAlipayGoodsId(String alipayGoodsId) {
		this.alipayGoodsId = alipayGoodsId;
	}

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
		return this.body;
	}

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
		this.body = body;
	}

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
     * Gets show url.
     *
     * @return the show url
     */
    public String getShowUrl() {
		return this.showUrl;
	}

    /**
     * Sets show url.
     *
     * @param showUrl the show url
     */
    public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}

}

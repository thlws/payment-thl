package com.alipay.trade.model;


import com.alipay.trade.utils.Utils;
import com.google.gson.annotations.SerializedName;

/**
 * Created by liuyangkly on 15/6/26.
 * 商品明细
 */
public class GoodsDetail {
    // 商品编号(国标)
    @SerializedName("goods_id")
    private String goodsId;

    @SerializedName("alipay_goods_id")
    private String alipayGoodsId;

    // 商品名称
    @SerializedName("goods_name")
    private String goodsName;

    // 商品数量
    private int quantity;

    // 商品价格，此处单位为元，精确到小数点后2位
    private String price;

    // 商品类别
    @SerializedName("goods_category")
    private String goodsCategory;

    // 商品详情
    private String body;

    /**
     * New instance goods detail.
     *
     * @param goodsId   the goods id
     * @param goodsName the goods name
     * @param price     the price
     * @param quantity  the quantity
     * @return the goods detail
     */
// 创建一个商品信息，参数含义分别为商品id（使用国标）、商品名称、商品价格（单位为分）、商品数量
    public static GoodsDetail newInstance(String goodsId, String goodsName, long price, int quantity) {
        GoodsDetail info = new GoodsDetail();
        info.setGoodsId(goodsId);
        info.setGoodsName(goodsName);
        info.setPrice(price);
        info.setQuantity(quantity);
        return info;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GoodsDetail{");
        sb.append("goodsId='").append(goodsId).append('\'');
        sb.append(", alipayGoodsId='").append(alipayGoodsId).append('\'');
        sb.append(", goodsName='").append(goodsName).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append(", price='").append(price).append('\'');
        sb.append(", goodsCategory='").append(goodsCategory).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * Gets goods id.
     *
     * @return the goods id
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * Sets goods id.
     *
     * @param goodsId the goods id
     * @return the goods id
     */
    public GoodsDetail setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    /**
     * Gets alipay goods id.
     *
     * @return the alipay goods id
     */
    public String getAlipayGoodsId() {
        return alipayGoodsId;
    }

    /**
     * Sets alipay goods id.
     *
     * @param alipayGoodsId the alipay goods id
     * @return the alipay goods id
     */
    public GoodsDetail setAlipayGoodsId(String alipayGoodsId) {
        this.alipayGoodsId = alipayGoodsId;
        return this;
    }

    /**
     * Gets goods name.
     *
     * @return the goods name
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets goods name.
     *
     * @param goodsName the goods name
     * @return the goods name
     */
    public GoodsDetail setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     * @return the quantity
     */
    public GoodsDetail setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     * @return the price
     */
    public GoodsDetail setPrice(long price) {
        this.price = Utils.toAmount(price);
        return this;
    }

    /**
     * Gets goods category.
     *
     * @return the goods category
     */
    public String getGoodsCategory() {
        return goodsCategory;
    }

    /**
     * Sets goods category.
     *
     * @param goodsCategory the goods category
     * @return the goods category
     */
    public GoodsDetail setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
        return this;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body the body
     * @return the body
     */
    public GoodsDetail setBody(String body) {
        this.body = body;
        return this;
    }
}

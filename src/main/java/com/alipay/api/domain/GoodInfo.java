package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2018-02-02 19:51:19
 */
public class GoodInfo extends AlipayObject {

	private static final long serialVersionUID = 5323744586521449939L;

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
	 * 设备中该商品的剩余数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 商品重量,单位克
	 */
	@ApiField("weight")
	private String weight;

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
     * Gets weight.
     *
     * @return the weight
     */
    public String getWeight() {
		return this.weight;
	}

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(String weight) {
		this.weight = weight;
	}

}

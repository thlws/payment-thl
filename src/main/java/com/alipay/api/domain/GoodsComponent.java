package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标品的货品组成模型
 *
 * @author auto create
 * @since 1.0, 2018-09-17 10:34:17
 */
public class GoodsComponent extends AlipayObject {

	private static final long serialVersionUID = 4457265353489639672L;

	/**
	 * 货品code
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 货品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 组成数量
	 */
	@ApiField("quantity")
	private String quantity;

    /**
     * Gets goods code.
     *
     * @return the goods code
     */
    public String getGoodsCode() {
		return this.goodsCode;
	}

    /**
     * Sets goods code.
     *
     * @param goodsCode the goods code
     */
    public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
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

}

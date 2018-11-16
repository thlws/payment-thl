package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作业明细模型
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:37
 */
public class WorkDetail extends AlipayObject {

	private static final long serialVersionUID = 6396493878642621977L;

	/**
	 * 批次编号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 货品过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 货品编号
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 库存类型，ZP=正品, CC=残次, JS=机损, XS=箱损, 默认为ZP
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 价格，单位元，两位小数
	 */
	@ApiField("price")
	private String price;

	/**
	 * 货品生产日期
	 */
	@ApiField("production_date")
	private Date productionDate;

	/**
	 * 实际作业数量
	 */
	@ApiField("quantity")
	private Long quantity;

    /**
     * Gets batch code.
     *
     * @return the batch code
     */
    public String getBatchCode() {
		return this.batchCode;
	}

    /**
     * Sets batch code.
     *
     * @param batchCode the batch code
     */
    public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

    /**
     * Gets expire date.
     *
     * @return the expire date
     */
    public Date getExpireDate() {
		return this.expireDate;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

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
     * Gets inventory type.
     *
     * @return the inventory type
     */
    public String getInventoryType() {
		return this.inventoryType;
	}

    /**
     * Sets inventory type.
     *
     * @param inventoryType the inventory type
     */
    public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
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
     * Gets production date.
     *
     * @return the production date
     */
    public Date getProductionDate() {
		return this.productionDate;
	}

    /**
     * Sets production date.
     *
     * @param productionDate the production date
     */
    public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
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

}

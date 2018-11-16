package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货品安全库存
 *
 * @author auto create
 * @since 1.0, 2018-09-17 09:54:16
 */
public class GoodsSafetyInventory extends AlipayObject {

	private static final long serialVersionUID = 7183332566573155277L;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 最小采购量
	 */
	@ApiField("min_order_num")
	private String minOrderNum;

	/**
	 * 采购周期（单位天）
	 */
	@ApiField("purchase_cycle")
	private String purchaseCycle;

	/**
	 * 安全库存数量
	 */
	@ApiField("safety_inventory")
	private String safetyInventory;

	/**
	 * 目标库存数量
	 */
	@ApiField("target_inventory")
	private String targetInventory;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

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
     * Gets min order num.
     *
     * @return the min order num
     */
    public String getMinOrderNum() {
		return this.minOrderNum;
	}

    /**
     * Sets min order num.
     *
     * @param minOrderNum the min order num
     */
    public void setMinOrderNum(String minOrderNum) {
		this.minOrderNum = minOrderNum;
	}

    /**
     * Gets purchase cycle.
     *
     * @return the purchase cycle
     */
    public String getPurchaseCycle() {
		return this.purchaseCycle;
	}

    /**
     * Sets purchase cycle.
     *
     * @param purchaseCycle the purchase cycle
     */
    public void setPurchaseCycle(String purchaseCycle) {
		this.purchaseCycle = purchaseCycle;
	}

    /**
     * Gets safety inventory.
     *
     * @return the safety inventory
     */
    public String getSafetyInventory() {
		return this.safetyInventory;
	}

    /**
     * Sets safety inventory.
     *
     * @param safetyInventory the safety inventory
     */
    public void setSafetyInventory(String safetyInventory) {
		this.safetyInventory = safetyInventory;
	}

    /**
     * Gets target inventory.
     *
     * @return the target inventory
     */
    public String getTargetInventory() {
		return this.targetInventory;
	}

    /**
     * Sets target inventory.
     *
     * @param targetInventory the target inventory
     */
    public void setTargetInventory(String targetInventory) {
		this.targetInventory = targetInventory;
	}

    /**
     * Gets warehouse code.
     *
     * @return the warehouse code
     */
    public String getWarehouseCode() {
		return this.warehouseCode;
	}

    /**
     * Sets warehouse code.
     *
     * @param warehouseCode the warehouse code
     */
    public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}

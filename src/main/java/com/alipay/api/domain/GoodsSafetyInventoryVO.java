package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货品安全库存信息
 *
 * @author auto create
 * @since 1.0, 2018-09-17 09:54:10
 */
public class GoodsSafetyInventoryVO extends AlipayObject {

	private static final long serialVersionUID = 1751474649184884952L;

	/**
	 * 2018-08-18
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 历史平均每天销售
	 */
	@ApiField("historical_daily_sales")
	private String historicalDailySales;

	/**
	 * 最小购买数量
	 */
	@ApiField("min_order_num")
	private String minOrderNum;

	/**
	 * 采购周期
	 */
	@ApiField("purchase_cycle")
	private String purchaseCycle;

	/**
	 * 安全库存
	 */
	@ApiField("safety_inventory")
	private String safetyInventory;

	/**
	 * 目标库存
	 */
	@ApiField("target_inventory")
	private String targetInventory;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public Date getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
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
     * Gets historical daily sales.
     *
     * @return the historical daily sales
     */
    public String getHistoricalDailySales() {
		return this.historicalDailySales;
	}

    /**
     * Sets historical daily sales.
     *
     * @param historicalDailySales the historical daily sales
     */
    public void setHistoricalDailySales(String historicalDailySales) {
		this.historicalDailySales = historicalDailySales;
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

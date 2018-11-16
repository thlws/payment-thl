package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库通知单明细对象
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:39:41
 */
public class OutboundOrderLine extends AlipayObject {

	private static final long serialVersionUID = 3338593438872691717L;

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
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * ZP("正品"),CC("残次"), JS("机损"),XS("箱损"),ZT("在途库存");
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 计划出库量
	 */
	@ApiField("plan_quantity")
	private Long planQuantity;

	/**
	 * 价格(单位元，保留2为小数)
	 */
	@ApiField("price")
	private String price;

	/**
	 * 货品生产日期
	 */
	@ApiField("product_date")
	private Date productDate;

	/**
	 * 备注信息。
	 */
	@ApiField("remark")
	private String remark;

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
     * Gets plan quantity.
     *
     * @return the plan quantity
     */
    public Long getPlanQuantity() {
		return this.planQuantity;
	}

    /**
     * Sets plan quantity.
     *
     * @param planQuantity the plan quantity
     */
    public void setPlanQuantity(Long planQuantity) {
		this.planQuantity = planQuantity;
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
     * Gets product date.
     *
     * @return the product date
     */
    public Date getProductDate() {
		return this.productDate;
	}

    /**
     * Sets product date.
     *
     * @param productDate the product date
     */
    public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

}

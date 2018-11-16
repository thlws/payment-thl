package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存信息
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:33
 */
public class Inventory extends AlipayObject {

	private static final long serialVersionUID = 1326427648855484687L;

	/**
	 * 批次编号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("extend_props")
	private String extendProps;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改日期
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 货品类型：ZP("正品"), CC("残次"), JS("机损"),  XS("箱损"),ZT("在途库存")
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 锁定数量
	 */
	@ApiField("lock_quantity")
	private Long lockQuantity;

	/**
	 * 生产日期
	 */
	@ApiField("product_date")
	private Date productDate;

	/**
	 * 可用数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 实际数量
	 */
	@ApiField("real_quantity")
	private Long realQuantity;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

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
     * Gets extend props.
     *
     * @return the extend props
     */
    public String getExtendProps() {
		return this.extendProps;
	}

    /**
     * Sets extend props.
     *
     * @param extendProps the extend props
     */
    public void setExtendProps(String extendProps) {
		this.extendProps = extendProps;
	}

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
     * Gets lock quantity.
     *
     * @return the lock quantity
     */
    public Long getLockQuantity() {
		return this.lockQuantity;
	}

    /**
     * Sets lock quantity.
     *
     * @param lockQuantity the lock quantity
     */
    public void setLockQuantity(Long lockQuantity) {
		this.lockQuantity = lockQuantity;
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
     * Gets real quantity.
     *
     * @return the real quantity
     */
    public Long getRealQuantity() {
		return this.realQuantity;
	}

    /**
     * Sets real quantity.
     *
     * @param realQuantity the real quantity
     */
    public void setRealQuantity(Long realQuantity) {
		this.realQuantity = realQuantity;
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

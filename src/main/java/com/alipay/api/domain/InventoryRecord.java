package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存变更记录
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:27
 */
public class InventoryRecord extends AlipayObject {

	private static final long serialVersionUID = 6388721375837314346L;

	/**
	 * 可用库存变更之后
	 */
	@ApiField("after_modify_lock_quantity")
	private Long afterModifyLockQuantity;

	/**
	 * 可用库存变更之后
	 */
	@ApiField("after_modify_quantity")
	private Long afterModifyQuantity;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 占用库存变更之前
	 */
	@ApiField("before_modify_lock_quantity")
	private String beforeModifyLockQuantity;

	/**
	 * 可用库存变更之前
	 */
	@ApiField("before_modify_quantity")
	private Long beforeModifyQuantity;

	/**
	 * 占用库存
	 */
	@ApiField("diff_lock_quantity")
	private Long diffLockQuantity;

	/**
	 * 可用库存变化量
	 */
	@ApiField("diff_quantity")
	private Long diffQuantity;

	/**
	 * 过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 库存类型（ZP=正品, CC=残次,JS=机损, XS= 箱损, ZT=在途库存）
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 操作类型（INBOUND＝入库
OUTBOUND＝出库）
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 生产日期
	 */
	@ApiField("product_date")
	private Date productDate;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets after modify lock quantity.
     *
     * @return the after modify lock quantity
     */
    public Long getAfterModifyLockQuantity() {
		return this.afterModifyLockQuantity;
	}

    /**
     * Sets after modify lock quantity.
     *
     * @param afterModifyLockQuantity the after modify lock quantity
     */
    public void setAfterModifyLockQuantity(Long afterModifyLockQuantity) {
		this.afterModifyLockQuantity = afterModifyLockQuantity;
	}

    /**
     * Gets after modify quantity.
     *
     * @return the after modify quantity
     */
    public Long getAfterModifyQuantity() {
		return this.afterModifyQuantity;
	}

    /**
     * Sets after modify quantity.
     *
     * @param afterModifyQuantity the after modify quantity
     */
    public void setAfterModifyQuantity(Long afterModifyQuantity) {
		this.afterModifyQuantity = afterModifyQuantity;
	}

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
     * Gets before modify lock quantity.
     *
     * @return the before modify lock quantity
     */
    public String getBeforeModifyLockQuantity() {
		return this.beforeModifyLockQuantity;
	}

    /**
     * Sets before modify lock quantity.
     *
     * @param beforeModifyLockQuantity the before modify lock quantity
     */
    public void setBeforeModifyLockQuantity(String beforeModifyLockQuantity) {
		this.beforeModifyLockQuantity = beforeModifyLockQuantity;
	}

    /**
     * Gets before modify quantity.
     *
     * @return the before modify quantity
     */
    public Long getBeforeModifyQuantity() {
		return this.beforeModifyQuantity;
	}

    /**
     * Sets before modify quantity.
     *
     * @param beforeModifyQuantity the before modify quantity
     */
    public void setBeforeModifyQuantity(Long beforeModifyQuantity) {
		this.beforeModifyQuantity = beforeModifyQuantity;
	}

    /**
     * Gets diff lock quantity.
     *
     * @return the diff lock quantity
     */
    public Long getDiffLockQuantity() {
		return this.diffLockQuantity;
	}

    /**
     * Sets diff lock quantity.
     *
     * @param diffLockQuantity the diff lock quantity
     */
    public void setDiffLockQuantity(Long diffLockQuantity) {
		this.diffLockQuantity = diffLockQuantity;
	}

    /**
     * Gets diff quantity.
     *
     * @return the diff quantity
     */
    public Long getDiffQuantity() {
		return this.diffQuantity;
	}

    /**
     * Sets diff quantity.
     *
     * @param diffQuantity the diff quantity
     */
    public void setDiffQuantity(Long diffQuantity) {
		this.diffQuantity = diffQuantity;
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
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

    /**
     * Gets out biz id.
     *
     * @return the out biz id
     */
    public String getOutBizId() {
		return this.outBizId;
	}

    /**
     * Sets out biz id.
     *
     * @param outBizId the out biz id
     */
    public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
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

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商盘点单明细
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:38
 */
public class SupplierReportDetail extends AlipayObject {

	private static final long serialVersionUID = 5121574546365691916L;

	/**
	 * 批次编码
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 库存类型
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 生产日期
	 */
	@ApiField("production_date")
	private Date productionDate;

	/**
	 * 差异数量,为正整数
	 */
	@ApiField("quantity_diff")
	private Long quantityDiff;

	/**
	 * 盘盈/盘亏(increase/reduce)
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 供货商盘点单明细id
	 */
	@ApiField("supplier_report_detail_id")
	private String supplierReportDetailId;

	/**
	 * 供货商盘点单id
	 */
	@ApiField("supplier_report_id")
	private String supplierReportId;

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
     * Gets quantity diff.
     *
     * @return the quantity diff
     */
    public Long getQuantityDiff() {
		return this.quantityDiff;
	}

    /**
     * Sets quantity diff.
     *
     * @param quantityDiff the quantity diff
     */
    public void setQuantityDiff(Long quantityDiff) {
		this.quantityDiff = quantityDiff;
	}

    /**
     * Gets report type.
     *
     * @return the report type
     */
    public String getReportType() {
		return this.reportType;
	}

    /**
     * Sets report type.
     *
     * @param reportType the report type
     */
    public void setReportType(String reportType) {
		this.reportType = reportType;
	}

    /**
     * Gets supplier report detail id.
     *
     * @return the supplier report detail id
     */
    public String getSupplierReportDetailId() {
		return this.supplierReportDetailId;
	}

    /**
     * Sets supplier report detail id.
     *
     * @param supplierReportDetailId the supplier report detail id
     */
    public void setSupplierReportDetailId(String supplierReportDetailId) {
		this.supplierReportDetailId = supplierReportDetailId;
	}

    /**
     * Gets supplier report id.
     *
     * @return the supplier report id
     */
    public String getSupplierReportId() {
		return this.supplierReportId;
	}

    /**
     * Sets supplier report id.
     *
     * @param supplierReportId the supplier report id
     */
    public void setSupplierReportId(String supplierReportId) {
		this.supplierReportId = supplierReportId;
	}

}

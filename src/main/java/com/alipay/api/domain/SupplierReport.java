package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商盘点单
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:29:58
 */
public class SupplierReport extends AlipayObject {

	private static final long serialVersionUID = 7167661716574146568L;

	/**
	 * 盘点单创建渠道 notify:菜鸟通知,daily:日常调度,manual:手动定制
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 操作者id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作者类型，只会是system
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 盘点单下单日期
	 */
	@ApiField("order_date")
	private Date orderDate;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 盘点单状态  INIT:未完成 FINISHED:已完成
	 */
	@ApiField("state")
	private String state;

	/**
	 * 供货商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 供货商盘点单id
	 */
	@ApiField("supplier_report_id")
	private String supplierReportId;

	/**
	 * 唯一约束
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

    /**
     * Gets order date.
     *
     * @return the order date
     */
    public Date getOrderDate() {
		return this.orderDate;
	}

    /**
     * Sets order date.
     *
     * @param orderDate the order date
     */
    public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
		return this.state;
	}

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
		this.state = state;
	}

    /**
     * Gets supplier id.
     *
     * @return the supplier id
     */
    public String getSupplierId() {
		return this.supplierId;
	}

    /**
     * Sets supplier id.
     *
     * @param supplierId the supplier id
     */
    public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId() {
		return this.uniqueId;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
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

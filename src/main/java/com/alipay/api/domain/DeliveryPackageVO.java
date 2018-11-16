package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 包裹信息
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:31
 */
public class DeliveryPackageVO extends AlipayObject {

	private static final long serialVersionUID = 8572284286656353217L;

	/**
	 * 通知单id
	 */
	@ApiField("delivery_order_code")
	private String deliveryOrderCode;

	/**
	 * 菜鸟单号
	 */
	@ApiField("delivery_order_id")
	private String deliveryOrderId;

	/**
	 * 包裹明细
	 */
	@ApiListField("delivery_package_detail_list")
	@ApiField("delivery_package_detail")
	private List<DeliveryPackageDetail> deliveryPackageDetailList;

	/**
	 * 货运单号
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 包裹编码
	 */
	@ApiField("package_code")
	private String packageCode;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 作业id
	 */
	@ApiField("work_order_id")
	private String workOrderId;

    /**
     * Gets delivery order code.
     *
     * @return the delivery order code
     */
    public String getDeliveryOrderCode() {
		return this.deliveryOrderCode;
	}

    /**
     * Sets delivery order code.
     *
     * @param deliveryOrderCode the delivery order code
     */
    public void setDeliveryOrderCode(String deliveryOrderCode) {
		this.deliveryOrderCode = deliveryOrderCode;
	}

    /**
     * Gets delivery order id.
     *
     * @return the delivery order id
     */
    public String getDeliveryOrderId() {
		return this.deliveryOrderId;
	}

    /**
     * Sets delivery order id.
     *
     * @param deliveryOrderId the delivery order id
     */
    public void setDeliveryOrderId(String deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
	}

    /**
     * Gets delivery package detail list.
     *
     * @return the delivery package detail list
     */
    public List<DeliveryPackageDetail> getDeliveryPackageDetailList() {
		return this.deliveryPackageDetailList;
	}

    /**
     * Sets delivery package detail list.
     *
     * @param deliveryPackageDetailList the delivery package detail list
     */
    public void setDeliveryPackageDetailList(List<DeliveryPackageDetail> deliveryPackageDetailList) {
		this.deliveryPackageDetailList = deliveryPackageDetailList;
	}

    /**
     * Gets express code.
     *
     * @return the express code
     */
    public String getExpressCode() {
		return this.expressCode;
	}

    /**
     * Sets express code.
     *
     * @param expressCode the express code
     */
    public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public String getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets logistics code.
     *
     * @return the logistics code
     */
    public String getLogisticsCode() {
		return this.logisticsCode;
	}

    /**
     * Sets logistics code.
     *
     * @param logisticsCode the logistics code
     */
    public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

    /**
     * Gets package code.
     *
     * @return the package code
     */
    public String getPackageCode() {
		return this.packageCode;
	}

    /**
     * Sets package code.
     *
     * @param packageCode the package code
     */
    public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
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

    /**
     * Gets work order id.
     *
     * @return the work order id
     */
    public String getWorkOrderId() {
		return this.workOrderId;
	}

    /**
     * Sets work order id.
     *
     * @param workOrderId the work order id
     */
    public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

}

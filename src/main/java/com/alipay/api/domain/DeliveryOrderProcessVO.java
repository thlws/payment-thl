package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流单状态
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:06
 */
public class DeliveryOrderProcessVO extends AlipayObject {

	private static final long serialVersionUID = 1276951625347949276L;

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
	 * 操作内容
	 */
	@ApiField("operate_info")
	private String operateInfo;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 操作人编码
	 */
	@ApiField("operator_code")
	private String operatorCode;

	/**
	 * 操作人
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 通知单id
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 菜鸟订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单类型
CGRK=采购入库
JYCK＝交易出库
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 订单状态
发货物流状态：ACCEPT=仓库接单; PRINT = 打印;PICK=捡货;CHECK = 复核 ;PACKAGE= 打包;WEIGH= 称重;READY=待提货;DELIVERED=已发货;REFUSE=买家拒签;EXCEPTION =异常;CLOSED= 关闭;CANCELED= 取 消;REJECT=仓库拒单;SIGN=签收;TMSCANCELED=快递拦截;OTHER=其他;PARTDELIVERED=部分发货完成;TMSCANCELFAILED=快递拦截失败。
补货单物流状态：ACCEPT=仓库接单;PARTFULFILLED-部分收货完成;FULFILLED=收货完成; EXCEPTION =异常;CLOSED= 关闭;CANCELED= 取 消;REJECT=仓库拒单;
	 */
	@ApiField("process_status")
	private String processStatus;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

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
     * Gets operate info.
     *
     * @return the operate info
     */
    public String getOperateInfo() {
		return this.operateInfo;
	}

    /**
     * Sets operate info.
     *
     * @param operateInfo the operate info
     */
    public void setOperateInfo(String operateInfo) {
		this.operateInfo = operateInfo;
	}

    /**
     * Gets operate time.
     *
     * @return the operate time
     */
    public Date getOperateTime() {
		return this.operateTime;
	}

    /**
     * Sets operate time.
     *
     * @param operateTime the operate time
     */
    public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

    /**
     * Gets operator code.
     *
     * @return the operator code
     */
    public String getOperatorCode() {
		return this.operatorCode;
	}

    /**
     * Sets operator code.
     *
     * @param operatorCode the operator code
     */
    public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

    /**
     * Gets operator name.
     *
     * @return the operator name
     */
    public String getOperatorName() {
		return this.operatorName;
	}

    /**
     * Sets operator name.
     *
     * @param operatorName the operator name
     */
    public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

    /**
     * Gets order code.
     *
     * @return the order code
     */
    public String getOrderCode() {
		return this.orderCode;
	}

    /**
     * Sets order code.
     *
     * @param orderCode the order code
     */
    public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order type.
     *
     * @return the order type
     */
    public String getOrderType() {
		return this.orderType;
	}

    /**
     * Sets order type.
     *
     * @param orderType the order type
     */
    public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

    /**
     * Gets process status.
     *
     * @return the process status
     */
    public String getProcessStatus() {
		return this.processStatus;
	}

    /**
     * Sets process status.
     *
     * @param processStatus the process status
     */
    public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
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

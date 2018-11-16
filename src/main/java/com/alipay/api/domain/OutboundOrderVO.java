package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库通知单返回数据
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:32
 */
public class OutboundOrderVO extends AlipayObject {

	private static final long serialVersionUID = 4531752915383734784L;

	/**
	 * 取消原因
ORDER_CANCEL("订单取消"),
INVENTORY_OCCUPY_FAIL("库存占用失败")
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 通知日期
	 */
	@ApiField("notice_date")
	private Date noticeDate;

	/**
	 * 操作者id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作者类型，PROVIDER:服务商,PROVIDER_STAFF:服务商员工,MER:商户,MER_STAFF:商户员工,SALES:阿里销售小二,SYSTEM:系统
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 出库通知单id
	 */
	@ApiField("outbound_order_id")
	private String outboundOrderId;

	/**
	 * CGCK("采购出库"),
DDCK("订单出库"),
PDCK("盘点出库"),;
	 */
	@ApiField("outbound_type")
	private String outboundType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 状态
INIT,
PROCESSING,
FINISHED,
CANCELLED;
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets cancel reason.
     *
     * @return the cancel reason
     */
    public String getCancelReason() {
		return this.cancelReason;
	}

    /**
     * Sets cancel reason.
     *
     * @param cancelReason the cancel reason
     */
    public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
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
     * Gets notice date.
     *
     * @return the notice date
     */
    public Date getNoticeDate() {
		return this.noticeDate;
	}

    /**
     * Sets notice date.
     *
     * @param noticeDate the notice date
     */
    public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets outbound order id.
     *
     * @return the outbound order id
     */
    public String getOutboundOrderId() {
		return this.outboundOrderId;
	}

    /**
     * Sets outbound order id.
     *
     * @param outboundOrderId the outbound order id
     */
    public void setOutboundOrderId(String outboundOrderId) {
		this.outboundOrderId = outboundOrderId;
	}

    /**
     * Gets outbound type.
     *
     * @return the outbound type
     */
    public String getOutboundType() {
		return this.outboundType;
	}

    /**
     * Sets outbound type.
     *
     * @param outboundType the outbound type
     */
    public void setOutboundType(String outboundType) {
		this.outboundType = outboundType;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
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

package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入库通知单查询返回数据
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:55
 */
public class InboundOrderVO extends AlipayObject {

	private static final long serialVersionUID = 4767423454411393791L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 入库通知单id
	 */
	@ApiField("inbound_order_id")
	private String inboundOrderId;

	/**
	 * 入库业务类型，BHRK=补货入库，CGRK=采购入库，CGTHRK=采购退货入库，DDTHRK=订单退货入库，PDRK=盘点入库
	 */
	@ApiField("inbound_type")
	private String inboundType;

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
	 * 入库单类型：INIT（初始化）, PROCESSING（处理中）,FINISHED（完成）, CANCELLED（取消）;
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

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
     * Gets inbound order id.
     *
     * @return the inbound order id
     */
    public String getInboundOrderId() {
		return this.inboundOrderId;
	}

    /**
     * Sets inbound order id.
     *
     * @param inboundOrderId the inbound order id
     */
    public void setInboundOrderId(String inboundOrderId) {
		this.inboundOrderId = inboundOrderId;
	}

    /**
     * Gets inbound type.
     *
     * @return the inbound type
     */
    public String getInboundType() {
		return this.inboundType;
	}

    /**
     * Sets inbound type.
     *
     * @param inboundType the inbound type
     */
    public void setInboundType(String inboundType) {
		this.inboundType = inboundType;
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

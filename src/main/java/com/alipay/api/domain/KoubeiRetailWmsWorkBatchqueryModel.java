package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询作业列表
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:18
 */
public class KoubeiRetailWmsWorkBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8478471776388529747L;

	/**
	 * 完成时间范围开始时间
	 */
	@ApiField("gmt_finished_from")
	private Date gmtFinishedFrom;

	/**
	 * 完成时间范围结束时间
	 */
	@ApiField("gmt_finished_to")
	private Date gmtFinishedTo;

	/**
	 * 作业对应的入库/出库通知单的外部业务单据号，这个单据可能是采购单、补货单等
	 */
	@ApiField("notice_out_biz_no")
	private String noticeOutBizNo;

	/**
	 * 作业对应的通知单的外部业务类型，BHRK=补货入库，CGRK=采购入库，CGTHRK=采购退货入库，DDTHRK=订单退货入库，PDRK=盘点入库，CGCK=采购出库，DDCK=订单出库，PDCK=盘点出库，BHCK=补货出库
	 */
	@ApiField("notice_out_biz_type")
	private String noticeOutBizType;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 操作者id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 页码，从1开始，不传默认为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，不传默认20，不能超过100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 作业状态，INIT=待提交，FINISHED=已完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 作业类型，INBOUND=入库，OUTBOUND=出库
	 */
	@ApiField("work_type")
	private String workType;

    /**
     * Gets gmt finished from.
     *
     * @return the gmt finished from
     */
    public Date getGmtFinishedFrom() {
		return this.gmtFinishedFrom;
	}

    /**
     * Sets gmt finished from.
     *
     * @param gmtFinishedFrom the gmt finished from
     */
    public void setGmtFinishedFrom(Date gmtFinishedFrom) {
		this.gmtFinishedFrom = gmtFinishedFrom;
	}

    /**
     * Gets gmt finished to.
     *
     * @return the gmt finished to
     */
    public Date getGmtFinishedTo() {
		return this.gmtFinishedTo;
	}

    /**
     * Sets gmt finished to.
     *
     * @param gmtFinishedTo the gmt finished to
     */
    public void setGmtFinishedTo(Date gmtFinishedTo) {
		this.gmtFinishedTo = gmtFinishedTo;
	}

    /**
     * Gets notice out biz no.
     *
     * @return the notice out biz no
     */
    public String getNoticeOutBizNo() {
		return this.noticeOutBizNo;
	}

    /**
     * Sets notice out biz no.
     *
     * @param noticeOutBizNo the notice out biz no
     */
    public void setNoticeOutBizNo(String noticeOutBizNo) {
		this.noticeOutBizNo = noticeOutBizNo;
	}

    /**
     * Gets notice out biz type.
     *
     * @return the notice out biz type
     */
    public String getNoticeOutBizType() {
		return this.noticeOutBizType;
	}

    /**
     * Sets notice out biz type.
     *
     * @param noticeOutBizType the notice out biz type
     */
    public void setNoticeOutBizType(String noticeOutBizType) {
		this.noticeOutBizType = noticeOutBizType;
	}

    /**
     * Gets operate context.
     *
     * @return the operate context
     */
    public OperateContext getOperateContext() {
		return this.operateContext;
	}

    /**
     * Sets operate context.
     *
     * @param operateContext the operate context
     */
    public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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

    /**
     * Gets work type.
     *
     * @return the work type
     */
    public String getWorkType() {
		return this.workType;
	}

    /**
     * Sets work type.
     *
     * @param workType the work type
     */
    public void setWorkType(String workType) {
		this.workType = workType;
	}

}

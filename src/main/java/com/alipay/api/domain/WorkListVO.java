package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作业列表模型
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:18
 */
public class WorkListVO extends AlipayObject {

	private static final long serialVersionUID = 4343838673831715795L;

	/**
	 * 作业完成时间
	 */
	@ApiField("gmt_finished")
	private Date gmtFinished;

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
	 * 操作员id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 作业状态，INIT=待提交，SUCCEED=已完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	/**
	 * 作业id
	 */
	@ApiField("work_id")
	private String workId;

	/**
	 * 作业类型，INBOUND-入库，OUTBOUND-出库
	 */
	@ApiField("work_type")
	private String workType;

    /**
     * Gets gmt finished.
     *
     * @return the gmt finished
     */
    public Date getGmtFinished() {
		return this.gmtFinished;
	}

    /**
     * Sets gmt finished.
     *
     * @param gmtFinished the gmt finished
     */
    public void setGmtFinished(Date gmtFinished) {
		this.gmtFinished = gmtFinished;
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
     * Gets work id.
     *
     * @return the work id
     */
    public String getWorkId() {
		return this.workId;
	}

    /**
     * Sets work id.
     *
     * @param workId the work id
     */
    public void setWorkId(String workId) {
		this.workId = workId;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请单进度列表
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:49:09
 */
public class EcoApplySchedule extends AlipayObject {

	private static final long serialVersionUID = 6178459565942484111L;

	/**
	 * 批语
	 */
	@ApiField("audit_comment")
	private String auditComment;

	/**
	 * 审批时间(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("audit_time")
	private String auditTime;

	/**
	 * 编辑标识：0-不可编辑，1-可编辑，2-需重新提交。
	 */
	@ApiField("edit_flag")
	private Long editFlag;

	/**
	 * 申请单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 审批顺序
	 */
	@ApiField("order_num")
	private Long orderNum;

	/**
	 * 审批阶段状态编码如(1,2,3)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 审批阶段状态描述(审核中，通过，拒绝)
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 审批阶段编码
	 */
	@ApiField("step")
	private String step;

	/**
	 * 审批阶段描述如：初审，提交材料，市局审批，受理中心
	 */
	@ApiField("step_desc")
	private String stepDesc;

    /**
     * Gets audit comment.
     *
     * @return the audit comment
     */
    public String getAuditComment() {
		return this.auditComment;
	}

    /**
     * Sets audit comment.
     *
     * @param auditComment the audit comment
     */
    public void setAuditComment(String auditComment) {
		this.auditComment = auditComment;
	}

    /**
     * Gets audit time.
     *
     * @return the audit time
     */
    public String getAuditTime() {
		return this.auditTime;
	}

    /**
     * Sets audit time.
     *
     * @param auditTime the audit time
     */
    public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

    /**
     * Gets edit flag.
     *
     * @return the edit flag
     */
    public Long getEditFlag() {
		return this.editFlag;
	}

    /**
     * Sets edit flag.
     *
     * @param editFlag the edit flag
     */
    public void setEditFlag(Long editFlag) {
		this.editFlag = editFlag;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order num.
     *
     * @return the order num
     */
    public Long getOrderNum() {
		return this.orderNum;
	}

    /**
     * Sets order num.
     *
     * @param orderNum the order num
     */
    public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
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
     * Gets status desc.
     *
     * @return the status desc
     */
    public String getStatusDesc() {
		return this.statusDesc;
	}

    /**
     * Sets status desc.
     *
     * @param statusDesc the status desc
     */
    public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

    /**
     * Gets step.
     *
     * @return the step
     */
    public String getStep() {
		return this.step;
	}

    /**
     * Sets step.
     *
     * @param step the step
     */
    public void setStep(String step) {
		this.step = step;
	}

    /**
     * Gets step desc.
     *
     * @return the step desc
     */
    public String getStepDesc() {
		return this.stepDesc;
	}

    /**
     * Sets step desc.
     *
     * @param stepDesc the step desc
     */
    public void setStepDesc(String stepDesc) {
		this.stepDesc = stepDesc;
	}

}

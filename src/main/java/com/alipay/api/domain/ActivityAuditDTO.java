package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动审核模型
 *
 * @author auto create
 * @since 1.0, 2017-09-30 11:20:49
 */
public class ActivityAuditDTO extends AlipayObject {

	private static final long serialVersionUID = 7289914328912338657L;

	/**
	 * 审核id
	 */
	@ApiField("audit_id")
	private String auditId;

	/**
	 * INIT:初始化;AUDITING:审核中;REJECT:审核驳回;PASS:审核通过;CANCEL:审核撤销;FAIL:审核失败
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 操作人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * SALES:口碑内部小二;PROVIDER:外部服务商;PROVIDER_STAFF:外部服务商员工
	 */
	@ApiField("creator_type")
	private String creatorType;

	/**
	 * 操作时间
	 */
	@ApiField("operation_time")
	private Date operationTime;

	/**
	 * 审核通过或者审核驳回的原因
	 */
	@ApiField("reason")
	private String reason;

    /**
     * Gets audit id.
     *
     * @return the audit id
     */
    public String getAuditId() {
		return this.auditId;
	}

    /**
     * Sets audit id.
     *
     * @param auditId the audit id
     */
    public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

    /**
     * Gets audit status.
     *
     * @return the audit status
     */
    public String getAuditStatus() {
		return this.auditStatus;
	}

    /**
     * Sets audit status.
     *
     * @param auditStatus the audit status
     */
    public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

    /**
     * Gets creator id.
     *
     * @return the creator id
     */
    public String getCreatorId() {
		return this.creatorId;
	}

    /**
     * Sets creator id.
     *
     * @param creatorId the creator id
     */
    public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

    /**
     * Gets creator type.
     *
     * @return the creator type
     */
    public String getCreatorType() {
		return this.creatorType;
	}

    /**
     * Sets creator type.
     *
     * @param creatorType the creator type
     */
    public void setCreatorType(String creatorType) {
		this.creatorType = creatorType;
	}

    /**
     * Gets operation time.
     *
     * @return the operation time
     */
    public Date getOperationTime() {
		return this.operationTime;
	}

    /**
     * Sets operation time.
     *
     * @param operationTime the operation time
     */
    public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public String getReason() {
		return this.reason;
	}

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(String reason) {
		this.reason = reason;
	}

}

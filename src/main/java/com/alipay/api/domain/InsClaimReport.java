package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险报案信息实体
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:48:09
 */
public class InsClaimReport extends AlipayObject {

	private static final long serialVersionUID = 4396887544793166595L;

	/**
	 * 出险地点
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 出险事故描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 出险时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 案件附件列表
	 */
	@ApiListField("attachments")
	@ApiField("ins_claim_attachment")
	private List<InsClaimAttachment> attachments;

	/**
	 * 业务字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 赔案信息
	 */
	@ApiListField("claims")
	@ApiField("ins_claim")
	private List<InsClaim> claims;

	/**
	 * 案件进度列表
	 */
	@ApiListField("progress")
	@ApiField("ins_claim_report_progress")
	private List<InsClaimReportProgress> progress;

	/**
	 * 当status 值为不予受理:REJECTED时候返回
	 */
	@ApiField("report_reject_reason")
	private String reportRejectReason;

	/**
	 * 报案人
	 */
	@ApiField("reporter")
	private InsPerson reporter;

	/**
	 * 案件状态
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets accident address.
     *
     * @return the accident address
     */
    public String getAccidentAddress() {
		return this.accidentAddress;
	}

    /**
     * Sets accident address.
     *
     * @param accidentAddress the accident address
     */
    public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

    /**
     * Gets accident desc.
     *
     * @return the accident desc
     */
    public String getAccidentDesc() {
		return this.accidentDesc;
	}

    /**
     * Sets accident desc.
     *
     * @param accidentDesc the accident desc
     */
    public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

    /**
     * Gets accident time.
     *
     * @return the accident time
     */
    public Date getAccidentTime() {
		return this.accidentTime;
	}

    /**
     * Sets accident time.
     *
     * @param accidentTime the accident time
     */
    public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

    /**
     * Gets attachments.
     *
     * @return the attachments
     */
    public List<InsClaimAttachment> getAttachments() {
		return this.attachments;
	}

    /**
     * Sets attachments.
     *
     * @param attachments the attachments
     */
    public void setAttachments(List<InsClaimAttachment> attachments) {
		this.attachments = attachments;
	}

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets claim report no.
     *
     * @return the claim report no
     */
    public String getClaimReportNo() {
		return this.claimReportNo;
	}

    /**
     * Sets claim report no.
     *
     * @param claimReportNo the claim report no
     */
    public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

    /**
     * Gets claims.
     *
     * @return the claims
     */
    public List<InsClaim> getClaims() {
		return this.claims;
	}

    /**
     * Sets claims.
     *
     * @param claims the claims
     */
    public void setClaims(List<InsClaim> claims) {
		this.claims = claims;
	}

    /**
     * Gets progress.
     *
     * @return the progress
     */
    public List<InsClaimReportProgress> getProgress() {
		return this.progress;
	}

    /**
     * Sets progress.
     *
     * @param progress the progress
     */
    public void setProgress(List<InsClaimReportProgress> progress) {
		this.progress = progress;
	}

    /**
     * Gets report reject reason.
     *
     * @return the report reject reason
     */
    public String getReportRejectReason() {
		return this.reportRejectReason;
	}

    /**
     * Sets report reject reason.
     *
     * @param reportRejectReason the report reject reason
     */
    public void setReportRejectReason(String reportRejectReason) {
		this.reportRejectReason = reportRejectReason;
	}

    /**
     * Gets reporter.
     *
     * @return the reporter
     */
    public InsPerson getReporter() {
		return this.reporter;
	}

    /**
     * Sets reporter.
     *
     * @param reporter the reporter
     */
    public void setReporter(InsPerson reporter) {
		this.reporter = reporter;
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

}

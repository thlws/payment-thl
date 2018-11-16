package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 赔案
 *
 * @author auto create
 * @since 1.0, 2018-05-17 11:02:07
 */
public class InsClaim extends AlipayObject {

	private static final long serialVersionUID = 8857835216275497524L;

	/**
	 * 理赔因子;标准json 格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 实际赔付金额 ;单位分
	 */
	@ApiField("claim_fee")
	private Long claimFee;

	/**
	 * 赔案号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 赔付时间
	 */
	@ApiField("claim_pay_time")
	private Date claimPayTime;

	/**
	 * 赔案进度;根据更新时间倒序
	 */
	@ApiListField("claim_progress")
	@ApiField("claim_progress")
	private List<ClaimProgress> claimProgress;

	/**
	 * 赔案状态.ACCEPTED:已受理;REJECTED:已拒赔;PAID:已赔付
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 商户生成的外部理赔请求单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 当状态是拒赔时给出拒赔原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

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
     * Gets claim fee.
     *
     * @return the claim fee
     */
    public Long getClaimFee() {
		return this.claimFee;
	}

    /**
     * Sets claim fee.
     *
     * @param claimFee the claim fee
     */
    public void setClaimFee(Long claimFee) {
		this.claimFee = claimFee;
	}

    /**
     * Gets claim no.
     *
     * @return the claim no
     */
    public String getClaimNo() {
		return this.claimNo;
	}

    /**
     * Sets claim no.
     *
     * @param claimNo the claim no
     */
    public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

    /**
     * Gets claim pay time.
     *
     * @return the claim pay time
     */
    public Date getClaimPayTime() {
		return this.claimPayTime;
	}

    /**
     * Sets claim pay time.
     *
     * @param claimPayTime the claim pay time
     */
    public void setClaimPayTime(Date claimPayTime) {
		this.claimPayTime = claimPayTime;
	}

    /**
     * Gets claim progress.
     *
     * @return the claim progress
     */
    public List<ClaimProgress> getClaimProgress() {
		return this.claimProgress;
	}

    /**
     * Sets claim progress.
     *
     * @param claimProgress the claim progress
     */
    public void setClaimProgress(List<ClaimProgress> claimProgress) {
		this.claimProgress = claimProgress;
	}

    /**
     * Gets claim status.
     *
     * @return the claim status
     */
    public String getClaimStatus() {
		return this.claimStatus;
	}

    /**
     * Sets claim status.
     *
     * @param claimStatus the claim status
     */
    public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets reject reason.
     *
     * @return the reject reason
     */
    public String getRejectReason() {
		return this.rejectReason;
	}

    /**
     * Sets reject reason.
     *
     * @param rejectReason the reject reason
     */
    public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}

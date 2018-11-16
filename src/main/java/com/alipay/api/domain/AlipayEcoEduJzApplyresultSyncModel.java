package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兼职平台报名同步接口
 *
 * @author auto create
 * @since 1.0, 2016-09-08 16:00:33
 */
public class AlipayEcoEduJzApplyresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1315522192791724853L;

	/**
	 * 报名编号（通过调用报名信息同步接口返回）
	 */
	@ApiField("apply_third_id")
	private String applyThirdId;

	/**
	 * 备注
	 */
	@ApiField("audit_remark")
	private String auditRemark;

	/**
	 * 报名结果状态
	 */
	@ApiField("listing_status")
	private String listingStatus;

    /**
     * Gets apply third id.
     *
     * @return the apply third id
     */
    public String getApplyThirdId() {
		return this.applyThirdId;
	}

    /**
     * Sets apply third id.
     *
     * @param applyThirdId the apply third id
     */
    public void setApplyThirdId(String applyThirdId) {
		this.applyThirdId = applyThirdId;
	}

    /**
     * Gets audit remark.
     *
     * @return the audit remark
     */
    public String getAuditRemark() {
		return this.auditRemark;
	}

    /**
     * Sets audit remark.
     *
     * @param auditRemark the audit remark
     */
    public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}

    /**
     * Gets listing status.
     *
     * @return the listing status
     */
    public String getListingStatus() {
		return this.listingStatus;
	}

    /**
     * Sets listing status.
     *
     * @param listingStatus the listing status
     */
    public void setListingStatus(String listingStatus) {
		this.listingStatus = listingStatus;
	}

}

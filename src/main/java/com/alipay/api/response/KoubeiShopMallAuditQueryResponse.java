package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.audit.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:39
 */
public class KoubeiShopMallAuditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3388557321223395361L;

	/** 
	 * 审核备注
	 */
	@ApiField("audit_remark")
	private String auditRemark;

	/** 
	 * 工单审核状态：AUDITING 审核中，SUCCESS 通过，REJECTED 拒绝
	 */
	@ApiField("audit_status")
	private String auditStatus;

    /**
     * Sets audit remark.
     *
     * @param auditRemark the audit remark
     */
    public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}

    /**
     * Gets audit remark.
     *
     * @return the audit remark
     */
    public String getAuditRemark( ) {
		return this.auditRemark;
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
     * Gets audit status.
     *
     * @return the audit status
     */
    public String getAuditStatus( ) {
		return this.auditStatus;
	}

}

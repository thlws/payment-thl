package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.info.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-01-12 16:54:39
 */
public class AlipayOpenPublicInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2525598663537611478L;

	/** 
	 * 服务窗审核状态描述
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 服务窗审核状态，申请成功后返回AUDITING，等待风控审核
	 */
	@ApiField("audit_status")
	private String auditStatus;

    /**
     * Sets audit desc.
     *
     * @param auditDesc the audit desc
     */
    public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

    /**
     * Gets audit desc.
     *
     * @return the audit desc
     */
    public String getAuditDesc( ) {
		return this.auditDesc;
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

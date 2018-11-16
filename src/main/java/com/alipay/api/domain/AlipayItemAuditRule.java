package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审核规则
 *
 * @author auto create
 * @since 1.0, 2017-04-20 15:17:50
 */
public class AlipayItemAuditRule extends AlipayObject {

	private static final long serialVersionUID = 5719247815923439248L;

	/**
	 * 审核类型，商户授权模式此字段不需要填写。
	 */
	@ApiField("audit_type")
	private String auditType;

	/**
	 * true：需要审核、false：不需要审核，默认为不需要审核,商户授权模式此字段不需要填写。
	 */
	@ApiField("need_audit")
	private Boolean needAudit;

    /**
     * Gets audit type.
     *
     * @return the audit type
     */
    public String getAuditType() {
		return this.auditType;
	}

    /**
     * Sets audit type.
     *
     * @param auditType the audit type
     */
    public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

    /**
     * Gets need audit.
     *
     * @return the need audit
     */
    public Boolean getNeedAudit() {
		return this.needAudit;
	}

    /**
     * Sets need audit.
     *
     * @param needAudit the need audit
     */
    public void setNeedAudit(Boolean needAudit) {
		this.needAudit = needAudit;
	}

}

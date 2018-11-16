package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序审核结果
 *
 * @author auto create
 * @since 1.0, 2018-02-26 16:07:34
 */
public class AlipayOpenMiniInnerversionAuditstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2249461173813946254L;

	/**
	 * 小程序版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 审核结果描述
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/**
	 * 审核结果
	 */
	@ApiField("audit_result")
	private String auditResult;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

    /**
     * Gets app version.
     *
     * @return the app version
     */
    public String getAppVersion() {
		return this.appVersion;
	}

    /**
     * Sets app version.
     *
     * @param appVersion the app version
     */
    public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

    /**
     * Gets audit memo.
     *
     * @return the audit memo
     */
    public String getAuditMemo() {
		return this.auditMemo;
	}

    /**
     * Sets audit memo.
     *
     * @param auditMemo the audit memo
     */
    public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

    /**
     * Gets audit result.
     *
     * @return the audit result
     */
    public String getAuditResult() {
		return this.auditResult;
	}

    /**
     * Sets audit result.
     *
     * @param auditResult the audit result
     */
    public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

    /**
     * Gets mini app id.
     *
     * @return the mini app id
     */
    public String getMiniAppId() {
		return this.miniAppId;
	}

    /**
     * Sets mini app id.
     *
     * @param miniAppId the mini app id
     */
    public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}

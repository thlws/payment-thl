package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区服务列表
 *
 * @author auto create
 * @since 1.0, 2017-01-14 11:36:24
 */
public class CPCommServices extends AlipayObject {

	private static final long serialVersionUID = 2757183637279539829L;

	/**
	 * 对于涉及收费类型的服务，返回收款帐号，若开发者没有为当前服务传入过物业收款帐号，则默认为授权物业的签约账号。
	 */
	@ApiField("account")
	private String account;

	/**
	 * 若当前服务涉及收费，则返回收款帐号类型。
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 服务审核状态描述，如果审核驳回则有相关的驳回理由。
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/**
	 * 服务审核状态。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 服务对应的前台类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 该字段可选，若对于外部调用地址巡检失败，会返回失败状态。
	 */
	@ApiField("external_address_scan_result")
	private String externalAddressScanResult;

	/**
	 * 由开发者系统提供的，支付宝根据基础服务类型在特定业务环节调用的外部系统服务地址。
	 */
	@ApiField("external_invoke_address")
	private String externalInvokeAddress;

	/**
	 * 服务初始化时间
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/**
	 * 服务最近修改时间（包括状态变更）。
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 若从当前状态到下一状态需要完成下一步条件代码，则返回该字段，否则不返回。
	 */
	@ApiField("next_action")
	private String nextAction;

	/**
	 * 若qr_code_image二维码存在有效期，则返回。
	 */
	@ApiField("qr_code_expires")
	private Date qrCodeExpires;

	/**
	 * 为满足特定的服务类型在上线前后的不同阶段需要进行测试验证等目的，选择性返回能直达具体服务的二维码图片链接。用支付宝手机客户端扫一扫该链接，完成验证工作。
	 */
	@ApiField("qr_code_image")
	private String qrCodeImage;

	/**
	 * 若返回qr_code_image，则同时返回对应的类型，类型值为：
TEST - 用于上线前验证的临时二维码；
FORMAL - 上线后可用于推广的正式二维码（仅针对部分服务类型）；
	 */
	@ApiField("qr_code_type")
	private String qrCodeType;

	/**
	 * 本服务预计过期时间（如在物业服务合同中约定），按标准时间格式：yyyy-MM-dd HH:mm:ss返回。
	 */
	@ApiField("service_expires")
	private Date serviceExpires;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务当前状态
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
		return this.account;
	}

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
		this.account = account;
	}

    /**
     * Gets account type.
     *
     * @return the account type
     */
    public String getAccountType() {
		return this.accountType;
	}

    /**
     * Sets account type.
     *
     * @param accountType the account type
     */
    public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

    /**
     * Gets audit desc.
     *
     * @return the audit desc
     */
    public String getAuditDesc() {
		return this.auditDesc;
	}

    /**
     * Sets audit desc.
     *
     * @param auditDesc the audit desc
     */
    public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
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
     * Gets category name.
     *
     * @return the category name
     */
    public String getCategoryName() {
		return this.categoryName;
	}

    /**
     * Sets category name.
     *
     * @param categoryName the category name
     */
    public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

    /**
     * Gets external address scan result.
     *
     * @return the external address scan result
     */
    public String getExternalAddressScanResult() {
		return this.externalAddressScanResult;
	}

    /**
     * Sets external address scan result.
     *
     * @param externalAddressScanResult the external address scan result
     */
    public void setExternalAddressScanResult(String externalAddressScanResult) {
		this.externalAddressScanResult = externalAddressScanResult;
	}

    /**
     * Gets external invoke address.
     *
     * @return the external invoke address
     */
    public String getExternalInvokeAddress() {
		return this.externalInvokeAddress;
	}

    /**
     * Sets external invoke address.
     *
     * @param externalInvokeAddress the external invoke address
     */
    public void setExternalInvokeAddress(String externalInvokeAddress) {
		this.externalInvokeAddress = externalInvokeAddress;
	}

    /**
     * Gets gmt created.
     *
     * @return the gmt created
     */
    public Date getGmtCreated() {
		return this.gmtCreated;
	}

    /**
     * Sets gmt created.
     *
     * @param gmtCreated the gmt created
     */
    public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public Date getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets next action.
     *
     * @return the next action
     */
    public String getNextAction() {
		return this.nextAction;
	}

    /**
     * Sets next action.
     *
     * @param nextAction the next action
     */
    public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}

    /**
     * Gets qr code expires.
     *
     * @return the qr code expires
     */
    public Date getQrCodeExpires() {
		return this.qrCodeExpires;
	}

    /**
     * Sets qr code expires.
     *
     * @param qrCodeExpires the qr code expires
     */
    public void setQrCodeExpires(Date qrCodeExpires) {
		this.qrCodeExpires = qrCodeExpires;
	}

    /**
     * Gets qr code image.
     *
     * @return the qr code image
     */
    public String getQrCodeImage() {
		return this.qrCodeImage;
	}

    /**
     * Sets qr code image.
     *
     * @param qrCodeImage the qr code image
     */
    public void setQrCodeImage(String qrCodeImage) {
		this.qrCodeImage = qrCodeImage;
	}

    /**
     * Gets qr code type.
     *
     * @return the qr code type
     */
    public String getQrCodeType() {
		return this.qrCodeType;
	}

    /**
     * Sets qr code type.
     *
     * @param qrCodeType the qr code type
     */
    public void setQrCodeType(String qrCodeType) {
		this.qrCodeType = qrCodeType;
	}

    /**
     * Gets service expires.
     *
     * @return the service expires
     */
    public Date getServiceExpires() {
		return this.serviceExpires;
	}

    /**
     * Sets service expires.
     *
     * @param serviceExpires the service expires
     */
    public void setServiceExpires(Date serviceExpires) {
		this.serviceExpires = serviceExpires;
	}

    /**
     * Gets service type.
     *
     * @return the service type
     */
    public String getServiceType() {
		return this.serviceType;
	}

    /**
     * Sets service type.
     *
     * @param serviceType the service type
     */
    public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
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

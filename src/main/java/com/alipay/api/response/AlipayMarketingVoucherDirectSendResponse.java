package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.direct.send response.
 *
 * @author auto create
 * @since 1.0, 2018-09-18 11:04:42
 */
public class AlipayMarketingVoucherDirectSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2343828663482161378L;

	/** 
	 * 资产编码
	 */
	@ApiField("assets_code")
	private String assetsCode;

	/** 
	 * 可用金额（单位：分）。
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 总现金价值（单位：分）
	 */
	@ApiField("available_cash")
	private String availableCash;

	/** 
	 * 扩展信息，json格式。
1.activityUrl：活动链接地址
2.activityId：活动ID
3.extends：其它扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 模板扩展信息
	 */
	@ApiField("extend_template_info")
	private String extendTemplateInfo;

	/** 
	 * 券生效时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/** 
	 * 券创建时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 券失效时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/** 
	 * 展期，格式为yyyy-MM-dd HH:mm:ss。
如果退款时间超过失效时间，但是未到展期，将失效时间改成展期实际时间。
	 */
	@ApiField("gmt_extend")
	private String gmtExtend;

	/** 
	 * 券修改时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 券状态。
1.ENABLED：可用
2.DISABLED：不可用
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 总金额（面额）（单位：分）。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 总现金价值（单位：分）。
	 */
	@ApiField("total_cash")
	private String totalCash;

	/** 
	 * 用户的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 券描述信息，json格式。
description：券描述信息。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/** 
	 * 劵ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Sets assets code.
     *
     * @param assetsCode the assets code
     */
    public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}

    /**
     * Gets assets code.
     *
     * @return the assets code
     */
    public String getAssetsCode( ) {
		return this.assetsCode;
	}

    /**
     * Sets available amount.
     *
     * @param availableAmount the available amount
     */
    public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

    /**
     * Gets available amount.
     *
     * @return the available amount
     */
    public String getAvailableAmount( ) {
		return this.availableAmount;
	}

    /**
     * Sets available cash.
     *
     * @param availableCash the available cash
     */
    public void setAvailableCash(String availableCash) {
		this.availableCash = availableCash;
	}

    /**
     * Gets available cash.
     *
     * @return the available cash
     */
    public String getAvailableCash( ) {
		return this.availableCash;
	}

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo( ) {
		return this.extendInfo;
	}

    /**
     * Sets extend template info.
     *
     * @param extendTemplateInfo the extend template info
     */
    public void setExtendTemplateInfo(String extendTemplateInfo) {
		this.extendTemplateInfo = extendTemplateInfo;
	}

    /**
     * Gets extend template info.
     *
     * @return the extend template info
     */
    public String getExtendTemplateInfo( ) {
		return this.extendTemplateInfo;
	}

    /**
     * Sets gmt active.
     *
     * @param gmtActive the gmt active
     */
    public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}

    /**
     * Gets gmt active.
     *
     * @return the gmt active
     */
    public String getGmtActive( ) {
		return this.gmtActive;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate( ) {
		return this.gmtCreate;
	}

    /**
     * Sets gmt expired.
     *
     * @param gmtExpired the gmt expired
     */
    public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

    /**
     * Gets gmt expired.
     *
     * @return the gmt expired
     */
    public String getGmtExpired( ) {
		return this.gmtExpired;
	}

    /**
     * Sets gmt extend.
     *
     * @param gmtExtend the gmt extend
     */
    public void setGmtExtend(String gmtExtend) {
		this.gmtExtend = gmtExtend;
	}

    /**
     * Gets gmt extend.
     *
     * @return the gmt extend
     */
    public String getGmtExtend( ) {
		return this.gmtExtend;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public String getGmtModified( ) {
		return this.gmtModified;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode( ) {
		return this.productCode;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId( ) {
		return this.templateId;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount( ) {
		return this.totalAmount;
	}

    /**
     * Sets total cash.
     *
     * @param totalCash the total cash
     */
    public void setTotalCash(String totalCash) {
		this.totalCash = totalCash;
	}

    /**
     * Gets total cash.
     *
     * @return the total cash
     */
    public String getTotalCash( ) {
		return this.totalCash;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

    /**
     * Sets voucher description.
     *
     * @param voucherDescription the voucher description
     */
    public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

    /**
     * Gets voucher description.
     *
     * @return the voucher description
     */
    public String getVoucherDescription( ) {
		return this.voucherDescription;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId( ) {
		return this.voucherId;
	}

}

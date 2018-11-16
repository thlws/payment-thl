package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Offer导入的数据结构
 *
 * @author auto create
 * @since 1.0, 2018-05-17 21:31:50
 */
public class OfferObject extends AlipayObject {

	private static final long serialVersionUID = 2272672968146182538L;

	/**
	 * 服务编码
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 分类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 展台ID，这个是唯一主键，这个最重要，作为我方的source_offer_id存在表里，而且是唯一的
	 */
	@ApiField("displayapp_id")
	private String displayappId;

	/**
	 * 展台操作备注
	 */
	@ApiField("displayapp_memo")
	private String displayappMemo;

	/**
	 * 展台名称
	 */
	@ApiField("displayapp_name")
	private String displayappName;

	/**
	 * 状态
	 */
	@ApiField("displayapp_status")
	private String displayappStatus;

	/**
	 * URL
	 */
	@ApiField("displayapp_url")
	private String displayappUrl;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 图片地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 实际的URL
	 */
	@ApiField("service_url")
	private String serviceUrl;

    /**
     * Gets app code.
     *
     * @return the app code
     */
    public String getAppCode() {
		return this.appCode;
	}

    /**
     * Sets app code.
     *
     * @param appCode the app code
     */
    public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

    /**
     * Gets category code.
     *
     * @return the category code
     */
    public String getCategoryCode() {
		return this.categoryCode;
	}

    /**
     * Sets category code.
     *
     * @param categoryCode the category code
     */
    public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets displayapp id.
     *
     * @return the displayapp id
     */
    public String getDisplayappId() {
		return this.displayappId;
	}

    /**
     * Sets displayapp id.
     *
     * @param displayappId the displayapp id
     */
    public void setDisplayappId(String displayappId) {
		this.displayappId = displayappId;
	}

    /**
     * Gets displayapp memo.
     *
     * @return the displayapp memo
     */
    public String getDisplayappMemo() {
		return this.displayappMemo;
	}

    /**
     * Sets displayapp memo.
     *
     * @param displayappMemo the displayapp memo
     */
    public void setDisplayappMemo(String displayappMemo) {
		this.displayappMemo = displayappMemo;
	}

    /**
     * Gets displayapp name.
     *
     * @return the displayapp name
     */
    public String getDisplayappName() {
		return this.displayappName;
	}

    /**
     * Sets displayapp name.
     *
     * @param displayappName the displayapp name
     */
    public void setDisplayappName(String displayappName) {
		this.displayappName = displayappName;
	}

    /**
     * Gets displayapp status.
     *
     * @return the displayapp status
     */
    public String getDisplayappStatus() {
		return this.displayappStatus;
	}

    /**
     * Sets displayapp status.
     *
     * @param displayappStatus the displayapp status
     */
    public void setDisplayappStatus(String displayappStatus) {
		this.displayappStatus = displayappStatus;
	}

    /**
     * Gets displayapp url.
     *
     * @return the displayapp url
     */
    public String getDisplayappUrl() {
		return this.displayappUrl;
	}

    /**
     * Sets displayapp url.
     *
     * @param displayappUrl the displayapp url
     */
    public void setDisplayappUrl(String displayappUrl) {
		this.displayappUrl = displayappUrl;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate() {
		return this.gmtCreate;
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
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public String getGmtModified() {
		return this.gmtModified;
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
     * Gets logo url.
     *
     * @return the logo url
     */
    public String getLogoUrl() {
		return this.logoUrl;
	}

    /**
     * Sets logo url.
     *
     * @param logoUrl the logo url
     */
    public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

    /**
     * Gets service url.
     *
     * @return the service url
     */
    public String getServiceUrl() {
		return this.serviceUrl;
	}

    /**
     * Sets service url.
     *
     * @param serviceUrl the service url
     */
    public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}

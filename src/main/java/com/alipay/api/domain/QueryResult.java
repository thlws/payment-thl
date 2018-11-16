package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回列表为json格式的列表（query_type参数的值为brands时返回品牌信息列表；query_type参数的值为series时返回车系信息列表；query_type参数的值为company时返厂商信息列表；query_type参数的值为models时返回车型信息列表）
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:47:37
 */
public class QueryResult extends AlipayObject {

	private static final long serialVersionUID = 4441882581718814118L;

	/**
	 * 支付宝车型库品牌背景图片链接地址，
query_type参数的值为brands时此参数必填；query_type参数的值为series,models，company时不返回
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 支付宝车型库品牌编号query_type参数的值为brands，models时此参数必填；query_type参数的值为series，company时不返回，系统唯一
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 支付宝车型库品牌名称query_type参数的值为brands， models时此参数必填；query_type参数的值为series，company时不返回
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 支付宝车型库排量，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 支付宝车型库厂商编号，query_type参数的值为series， models，company时此参数必填；query_type参数的值为brands时不返回，系统唯一
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 支付宝车型库厂商名称，query_type参数的值为series， models，company时此参数必填，query_type参数的值为brands时此参数不返回
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 支付宝车型库发动机号，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 支付宝车型库品牌logo图片链接地址，
query_type参数的值为brands时此参数必填；query_type参数的值为series,models，company时不返回
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 支付宝车型库车型编号，query_type参数的值为models时此参数必填，query_type参数的值为series，company, brands时此参数不返回，系统唯一
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 支付宝车型库车型名称，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 支付宝车型库生产年限，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 支付宝车型库车系组别，query_type参数的值为series时此参数必填，query_type参数的值为brands， models时此参数不返回
	 */
	@ApiField("serie_group")
	private String serieGroup;

	/**
	 * 支付宝车型库车系编号query_type参数的值为series，models，company时此参数必填；query_type参数的值为brands时不返回，系统唯一
	 */
	@ApiField("serie_id")
	private String serieId;

	/**
	 * 支付宝车型库车系名称，query_type参数的值为series，models时此参数必填；query_type参数的值为brands时不返回
	 */
	@ApiField("serie_name")
	private String serieName;

	/**
	 * 支付宝车型库车系图片连接地址，
query_type参数的值为series时此参数必填；query_type参数的值为brands,models时不返回
	 */
	@ApiField("serie_photo")
	private String seriePhoto;

	/**
	 * 支付宝车型库年款，query_type参数的值为models时此参数必填, query_type参数的值为series，company, brands时此参数不返回
	 */
	@ApiField("style")
	private String style;

    /**
     * Gets background url.
     *
     * @return the background url
     */
    public String getBackgroundUrl() {
		return this.backgroundUrl;
	}

    /**
     * Sets background url.
     *
     * @param backgroundUrl the background url
     */
    public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

    /**
     * Gets brand id.
     *
     * @return the brand id
     */
    public String getBrandId() {
		return this.brandId;
	}

    /**
     * Sets brand id.
     *
     * @param brandId the brand id
     */
    public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets cc.
     *
     * @return the cc
     */
    public String getCc() {
		return this.cc;
	}

    /**
     * Sets cc.
     *
     * @param cc the cc
     */
    public void setCc(String cc) {
		this.cc = cc;
	}

    /**
     * Gets company id.
     *
     * @return the company id
     */
    public String getCompanyId() {
		return this.companyId;
	}

    /**
     * Sets company id.
     *
     * @param companyId the company id
     */
    public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

    /**
     * Gets company name.
     *
     * @return the company name
     */
    public String getCompanyName() {
		return this.companyName;
	}

    /**
     * Sets company name.
     *
     * @param companyName the company name
     */
    public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    /**
     * Gets engine.
     *
     * @return the engine
     */
    public String getEngine() {
		return this.engine;
	}

    /**
     * Sets engine.
     *
     * @param engine the engine
     */
    public void setEngine(String engine) {
		this.engine = engine;
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
     * Gets entity id.
     *
     * @return the entity id
     */
    public String getModelId() {
		return this.modelId;
	}

    /**
     * Sets entity id.
     *
     * @param modelId the entity id
     */
    public void setModelId(String modelId) {
		this.modelId = modelId;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getModelName() {
		return this.modelName;
	}

    /**
     * Sets entity name.
     *
     * @param modelName the entity name
     */
    public void setModelName(String modelName) {
		this.modelName = modelName;
	}

    /**
     * Gets prod year.
     *
     * @return the prod year
     */
    public String getProdYear() {
		return this.prodYear;
	}

    /**
     * Sets prod year.
     *
     * @param prodYear the prod year
     */
    public void setProdYear(String prodYear) {
		this.prodYear = prodYear;
	}

    /**
     * Gets serie group.
     *
     * @return the serie group
     */
    public String getSerieGroup() {
		return this.serieGroup;
	}

    /**
     * Sets serie group.
     *
     * @param serieGroup the serie group
     */
    public void setSerieGroup(String serieGroup) {
		this.serieGroup = serieGroup;
	}

    /**
     * Gets serie id.
     *
     * @return the serie id
     */
    public String getSerieId() {
		return this.serieId;
	}

    /**
     * Sets serie id.
     *
     * @param serieId the serie id
     */
    public void setSerieId(String serieId) {
		this.serieId = serieId;
	}

    /**
     * Gets serie name.
     *
     * @return the serie name
     */
    public String getSerieName() {
		return this.serieName;
	}

    /**
     * Sets serie name.
     *
     * @param serieName the serie name
     */
    public void setSerieName(String serieName) {
		this.serieName = serieName;
	}

    /**
     * Gets serie photo.
     *
     * @return the serie photo
     */
    public String getSeriePhoto() {
		return this.seriePhoto;
	}

    /**
     * Sets serie photo.
     *
     * @param seriePhoto the serie photo
     */
    public void setSeriePhoto(String seriePhoto) {
		this.seriePhoto = seriePhoto;
	}

    /**
     * Gets style.
     *
     * @return the style
     */
    public String getStyle() {
		return this.style;
	}

    /**
     * Sets style.
     *
     * @param style the style
     */
    public void setStyle(String style) {
		this.style = style;
	}

}

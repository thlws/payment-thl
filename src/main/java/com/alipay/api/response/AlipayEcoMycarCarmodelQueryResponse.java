package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.carmodel.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:12
 */
public class AlipayEcoMycarCarmodelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2713225996165342668L;

	/** 
	 * 支付宝车型库品牌背景图片链接地址
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/** 
	 * 支付宝车型库品牌编号（系统唯一）
	 */
	@ApiField("brand_id")
	private String brandId;

	/** 
	 * 支付宝车型库品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 支付宝车型库车型排量
	 */
	@ApiField("cc")
	private String cc;

	/** 
	 * 支付宝车型库厂商编号（系统唯一）
	 */
	@ApiField("company_id")
	private String companyId;

	/** 
	 * 支付宝车型库厂商名称
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * 支付宝车型库车型发动机号
	 */
	@ApiField("engine")
	private String engine;

	/** 
	 * 支付宝车型库品牌logo图片链接地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/** 
	 * 支付宝车型库车型编号（系统唯一）
	 */
	@ApiField("model_id")
	private String modelId;

	/** 
	 * 支付宝车型库车型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/** 
	 * 支付宝车型库车型生产年限
	 */
	@ApiField("prod_year")
	private String prodYear;

	/** 
	 * 支付宝车型库车系编号（系统唯一）
	 */
	@ApiField("serie_id")
	private String serieId;

	/** 
	 * 支付宝车型库车系名称
	 */
	@ApiField("serie_name")
	private String serieName;

	/** 
	 * 支付宝车型库车系图片连接地址
	 */
	@ApiField("serie_photo")
	private String seriePhoto;

	/** 
	 * 支付宝车型库车型年款
	 */
	@ApiField("style")
	private String style;

    /**
     * Sets background url.
     *
     * @param backgroundUrl the background url
     */
    public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

    /**
     * Gets background url.
     *
     * @return the background url
     */
    public String getBackgroundUrl( ) {
		return this.backgroundUrl;
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
     * Gets brand id.
     *
     * @return the brand id
     */
    public String getBrandId( ) {
		return this.brandId;
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
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName( ) {
		return this.brandName;
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
     * Gets cc.
     *
     * @return the cc
     */
    public String getCc( ) {
		return this.cc;
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
     * Gets company id.
     *
     * @return the company id
     */
    public String getCompanyId( ) {
		return this.companyId;
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
     * Gets company name.
     *
     * @return the company name
     */
    public String getCompanyName( ) {
		return this.companyName;
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
     * Gets engine.
     *
     * @return the engine
     */
    public String getEngine( ) {
		return this.engine;
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
     * Gets logo url.
     *
     * @return the logo url
     */
    public String getLogoUrl( ) {
		return this.logoUrl;
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
     * Gets entity id.
     *
     * @return the entity id
     */
    public String getModelId( ) {
		return this.modelId;
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
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getModelName( ) {
		return this.modelName;
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
     * Gets prod year.
     *
     * @return the prod year
     */
    public String getProdYear( ) {
		return this.prodYear;
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
     * Gets serie id.
     *
     * @return the serie id
     */
    public String getSerieId( ) {
		return this.serieId;
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
     * Gets serie name.
     *
     * @return the serie name
     */
    public String getSerieName( ) {
		return this.serieName;
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
     * Gets serie photo.
     *
     * @return the serie photo
     */
    public String getSeriePhoto( ) {
		return this.seriePhoto;
	}

    /**
     * Sets style.
     *
     * @param style the style
     */
    public void setStyle(String style) {
		this.style = style;
	}

    /**
     * Gets style.
     *
     * @return the style
     */
    public String getStyle( ) {
		return this.style;
	}

}

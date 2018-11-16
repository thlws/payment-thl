package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增车型信息接口
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:34
 */
public class AlipayEcoMycarCarmodelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1898555652487769323L;

	/**
	 * 新增车型数据类型，接口通过此参数判断本次请求是增加品牌信息还是车型信息等，brand（品牌），company（厂商），serie（车系），entity（车型）
	 */
	@ApiField("add_type")
	private String addType;

	/**
	 * 支付宝车型库品牌背景图片，尺寸750 x 448（add_type参数的值为brand时此参数必填）背景图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload 上传完成获取, 图片url需要进行URLencode进行转码
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * 支付宝车型库品牌编号，品牌编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（add_type参数的值为brand时此参数可为空）系统唯一
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 支付宝车型库品牌图片，尺寸220 x 147 （add_type参数的值为brand时此参数必填）品牌图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload 上传完成后获取, 图片url需要进行URLencode进行转码
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 支付宝车型库品牌名称（add_type参数的值为brand时此参数必填）开发者自行配置，保证系统唯一
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 支付宝车型库排量（add_type参数的值为model时此参数必填）
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 支付宝车型库厂商编号，厂商编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（add_type参数的值为company时此参数可为空）系统唯一
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 支付宝车型库厂商名称（add_type参数的值为company时此参数必填）
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 支付宝车型库发动机型号（add_type参数的值为model时此参数必填）
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 支付宝车型库车型名称（add_type参数的值为model时此参数必填）
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 支付宝车型库生产年份（add_type参数的值为model时此参数必填）
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 支付宝车型库车系组名称（add_type":"serie状态时必填）
	 */
	@ApiField("serie_group")
	private String serieGroup;

	/**
	 * 支付宝车型库车系编号，车系编号可以通过调用【批量查询车型信息接口】alipay.eco.mycar.carmodel.batchquery 获取。（add_type参数的值为serie时此参数可为空）系统唯一
	 */
	@ApiField("serie_id")
	private String serieId;

	/**
	 * 支付宝车型库车系名称（add_type参数的值为serie时此参数必填）
	 */
	@ApiField("serie_name")
	private String serieName;

	/**
	 * 支付宝车型库车系logo图片链接地址，尺寸220 x 147 （add_type参数的值为serie时此参数必填）
图片url可以通过【通用图片上传接口】alipay.eco.mycar.image.upload上传完成后获取, 图片url需要进行URLencode进行转码
	 */
	@ApiField("serie_photo")
	private String seriePhoto;

	/**
	 * 支付宝车型库年款（add_type参数的值为model时此参数必填）
	 */
	@ApiField("style")
	private String style;

    /**
     * Gets add type.
     *
     * @return the add type
     */
    public String getAddType() {
		return this.addType;
	}

    /**
     * Sets add type.
     *
     * @param addType the add type
     */
    public void setAddType(String addType) {
		this.addType = addType;
	}

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
     * Gets brand logo.
     *
     * @return the brand logo
     */
    public String getBrandLogo() {
		return this.brandLogo;
	}

    /**
     * Sets brand logo.
     *
     * @param brandLogo the brand logo
     */
    public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
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

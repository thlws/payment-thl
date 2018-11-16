package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步车型库
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:30:04
 */
public class AlipayEcoMycarCarlibInfoPushModel extends AlipayObject {

	private static final long serialVersionUID = 5753452696835696938L;

	/**
	 * 品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 排量
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 厂商
	 */
	@ApiField("company")
	private String company;

	/**
	 * 发动机型号
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 销售名字
	 */
	@ApiField("marker")
	private String marker;

	/**
	 * 生产年份
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 车系
	 */
	@ApiField("serie")
	private String serie;

	/**
	 * 车款
	 */
	@ApiField("style")
	private String style;

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
		return this.brand;
	}

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
		this.brand = brand;
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
     * Gets company.
     *
     * @return the company
     */
    public String getCompany() {
		return this.company;
	}

    /**
     * Sets company.
     *
     * @param company the company
     */
    public void setCompany(String company) {
		this.company = company;
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
     * Gets marker.
     *
     * @return the marker
     */
    public String getMarker() {
		return this.marker;
	}

    /**
     * Sets marker.
     *
     * @param marker the marker
     */
    public void setMarker(String marker) {
		this.marker = marker;
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
     * Gets serie.
     *
     * @return the serie
     */
    public String getSerie() {
		return this.serie;
	}

    /**
     * Sets serie.
     *
     * @param serie the serie
     */
    public void setSerie(String serie) {
		this.serie = serie;
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

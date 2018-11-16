package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dialogonline.vehicle.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:27:59
 */
public class AlipayEcoMycarDialogonlineVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8129579957842992524L;

	/** 
	 * 生产年份，格式：yyyy
	 */
	@ApiField("factory_date")
	private String factoryDate;

	/** 
	 * 车型库ID
	 */
	@ApiField("lib_id")
	private String libId;

	/** 
	 * 生产厂商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/** 
	 * 常驻城市的编码
	 */
	@ApiField("resident_city")
	private String residentCity;

	/** 
	 * 车辆品牌
	 */
	@ApiField("vi_brand")
	private String viBrand;

	/** 
	 * 发动机排量
	 */
	@ApiField("vi_cc")
	private String viCc;

	/** 
	 * 车辆ID
	 */
	@ApiField("vi_id")
	private String viId;

	/** 
	 * 行驶里程
	 */
	@ApiField("vi_mileage")
	private String viMileage;

	/** 
	 * 车型
	 */
	@ApiField("vi_model")
	private String viModel;

	/** 
	 * 车系
	 */
	@ApiField("vi_series")
	private String viSeries;

	/** 
	 * 上路时间，格式：yyyy-mm-dd
	 */
	@ApiField("vi_time")
	private String viTime;

    /**
     * Sets factory date.
     *
     * @param factoryDate the factory date
     */
    public void setFactoryDate(String factoryDate) {
		this.factoryDate = factoryDate;
	}

    /**
     * Gets factory date.
     *
     * @return the factory date
     */
    public String getFactoryDate( ) {
		return this.factoryDate;
	}

    /**
     * Sets lib id.
     *
     * @param libId the lib id
     */
    public void setLibId(String libId) {
		this.libId = libId;
	}

    /**
     * Gets lib id.
     *
     * @return the lib id
     */
    public String getLibId( ) {
		return this.libId;
	}

    /**
     * Sets manufacturer.
     *
     * @param manufacturer the manufacturer
     */
    public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

    /**
     * Gets manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer( ) {
		return this.manufacturer;
	}

    /**
     * Sets resident city.
     *
     * @param residentCity the resident city
     */
    public void setResidentCity(String residentCity) {
		this.residentCity = residentCity;
	}

    /**
     * Gets resident city.
     *
     * @return the resident city
     */
    public String getResidentCity( ) {
		return this.residentCity;
	}

    /**
     * Sets vi brand.
     *
     * @param viBrand the vi brand
     */
    public void setViBrand(String viBrand) {
		this.viBrand = viBrand;
	}

    /**
     * Gets vi brand.
     *
     * @return the vi brand
     */
    public String getViBrand( ) {
		return this.viBrand;
	}

    /**
     * Sets vi cc.
     *
     * @param viCc the vi cc
     */
    public void setViCc(String viCc) {
		this.viCc = viCc;
	}

    /**
     * Gets vi cc.
     *
     * @return the vi cc
     */
    public String getViCc( ) {
		return this.viCc;
	}

    /**
     * Sets vi id.
     *
     * @param viId the vi id
     */
    public void setViId(String viId) {
		this.viId = viId;
	}

    /**
     * Gets vi id.
     *
     * @return the vi id
     */
    public String getViId( ) {
		return this.viId;
	}

    /**
     * Sets vi mileage.
     *
     * @param viMileage the vi mileage
     */
    public void setViMileage(String viMileage) {
		this.viMileage = viMileage;
	}

    /**
     * Gets vi mileage.
     *
     * @return the vi mileage
     */
    public String getViMileage( ) {
		return this.viMileage;
	}

    /**
     * Sets vi entity.
     *
     * @param viModel the vi entity
     */
    public void setViModel(String viModel) {
		this.viModel = viModel;
	}

    /**
     * Gets vi entity.
     *
     * @return the vi entity
     */
    public String getViModel( ) {
		return this.viModel;
	}

    /**
     * Sets vi series.
     *
     * @param viSeries the vi series
     */
    public void setViSeries(String viSeries) {
		this.viSeries = viSeries;
	}

    /**
     * Gets vi series.
     *
     * @return the vi series
     */
    public String getViSeries( ) {
		return this.viSeries;
	}

    /**
     * Sets vi time.
     *
     * @param viTime the vi time
     */
    public void setViTime(String viTime) {
		this.viTime = viTime;
	}

    /**
     * Gets vi time.
     *
     * @return the vi time
     */
    public String getViTime( ) {
		return this.viTime;
	}

}

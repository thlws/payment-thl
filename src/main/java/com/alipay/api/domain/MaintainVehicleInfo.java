package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 爱车的数据信息
 *
 * @author auto create
 * @since 1.0, 2017-09-26 19:15:29
 */
public class MaintainVehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 8684471151698819883L;

	/**
	 * 背景图片
	 */
	@ApiField("bg_url")
	private String bgUrl;

	/**
	 * 发动机编号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 发动机类型
	 */
	@ApiField("engine_type")
	private String engineType;

	/**
	 * 生产厂商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 车主平台车型id
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 生产年份
	 */
	@ApiField("production_year")
	private String productionYear;

	/**
	 * 发动机排量
	 */
	@ApiListField("swept_volume")
	@ApiField("string")
	private List<String> sweptVolume;

	/**
	 * 品牌Logo
	 */
	@ApiField("vi_brand_logo")
	private String viBrandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("vi_brand_name")
	private String viBrandName;

	/**
	 * 车辆归属地id
	 */
	@ApiField("vi_city_id")
	private String viCityId;

	/**
	 * 城市名称
	 */
	@ApiField("vi_city_name")
	private String viCityName;

	/**
	 * 车辆图标URL
	 */
	@ApiField("vi_logo_url")
	private String viLogoUrl;

	/**
	 * 行驶里程
	 */
	@ApiField("vi_mileage")
	private String viMileage;

	/**
	 * 车型名称
	 */
	@ApiField("vi_model_name")
	private String viModelName;

	/**
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/**
	 * 车系名称
	 */
	@ApiField("vi_series_name")
	private String viSeriesName;

	/**
	 * 上路日期
	 */
	@ApiField("vi_start_time")
	private Date viStartTime;

	/**
	 * 年款
	 */
	@ApiField("vi_style_name")
	private String viStyleName;

	/**
	 * 车架号
	 */
	@ApiListField("vi_vin")
	@ApiField("string")
	private List<String> viVin;

	/**
	 * 行驶证注册时间
	 */
	@ApiField("vl_start_time")
	private Date vlStartTime;

    /**
     * Gets bg url.
     *
     * @return the bg url
     */
    public String getBgUrl() {
		return this.bgUrl;
	}

    /**
     * Sets bg url.
     *
     * @param bgUrl the bg url
     */
    public void setBgUrl(String bgUrl) {
		this.bgUrl = bgUrl;
	}

    /**
     * Gets engine no.
     *
     * @return the engine no
     */
    public String getEngineNo() {
		return this.engineNo;
	}

    /**
     * Sets engine no.
     *
     * @param engineNo the engine no
     */
    public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

    /**
     * Gets engine type.
     *
     * @return the engine type
     */
    public String getEngineType() {
		return this.engineType;
	}

    /**
     * Sets engine type.
     *
     * @param engineType the engine type
     */
    public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

    /**
     * Gets manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
		return this.manufacturer;
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
     * Gets production year.
     *
     * @return the production year
     */
    public String getProductionYear() {
		return this.productionYear;
	}

    /**
     * Sets production year.
     *
     * @param productionYear the production year
     */
    public void setProductionYear(String productionYear) {
		this.productionYear = productionYear;
	}

    /**
     * Gets swept volume.
     *
     * @return the swept volume
     */
    public List<String> getSweptVolume() {
		return this.sweptVolume;
	}

    /**
     * Sets swept volume.
     *
     * @param sweptVolume the swept volume
     */
    public void setSweptVolume(List<String> sweptVolume) {
		this.sweptVolume = sweptVolume;
	}

    /**
     * Gets vi brand logo.
     *
     * @return the vi brand logo
     */
    public String getViBrandLogo() {
		return this.viBrandLogo;
	}

    /**
     * Sets vi brand logo.
     *
     * @param viBrandLogo the vi brand logo
     */
    public void setViBrandLogo(String viBrandLogo) {
		this.viBrandLogo = viBrandLogo;
	}

    /**
     * Gets vi brand name.
     *
     * @return the vi brand name
     */
    public String getViBrandName() {
		return this.viBrandName;
	}

    /**
     * Sets vi brand name.
     *
     * @param viBrandName the vi brand name
     */
    public void setViBrandName(String viBrandName) {
		this.viBrandName = viBrandName;
	}

    /**
     * Gets vi city id.
     *
     * @return the vi city id
     */
    public String getViCityId() {
		return this.viCityId;
	}

    /**
     * Sets vi city id.
     *
     * @param viCityId the vi city id
     */
    public void setViCityId(String viCityId) {
		this.viCityId = viCityId;
	}

    /**
     * Gets vi city name.
     *
     * @return the vi city name
     */
    public String getViCityName() {
		return this.viCityName;
	}

    /**
     * Sets vi city name.
     *
     * @param viCityName the vi city name
     */
    public void setViCityName(String viCityName) {
		this.viCityName = viCityName;
	}

    /**
     * Gets vi logo url.
     *
     * @return the vi logo url
     */
    public String getViLogoUrl() {
		return this.viLogoUrl;
	}

    /**
     * Sets vi logo url.
     *
     * @param viLogoUrl the vi logo url
     */
    public void setViLogoUrl(String viLogoUrl) {
		this.viLogoUrl = viLogoUrl;
	}

    /**
     * Gets vi mileage.
     *
     * @return the vi mileage
     */
    public String getViMileage() {
		return this.viMileage;
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
     * Gets vi entity name.
     *
     * @return the vi entity name
     */
    public String getViModelName() {
		return this.viModelName;
	}

    /**
     * Sets vi entity name.
     *
     * @param viModelName the vi entity name
     */
    public void setViModelName(String viModelName) {
		this.viModelName = viModelName;
	}

    /**
     * Gets vi number.
     *
     * @return the vi number
     */
    public String getViNumber() {
		return this.viNumber;
	}

    /**
     * Sets vi number.
     *
     * @param viNumber the vi number
     */
    public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

    /**
     * Gets vi series name.
     *
     * @return the vi series name
     */
    public String getViSeriesName() {
		return this.viSeriesName;
	}

    /**
     * Sets vi series name.
     *
     * @param viSeriesName the vi series name
     */
    public void setViSeriesName(String viSeriesName) {
		this.viSeriesName = viSeriesName;
	}

    /**
     * Gets vi start time.
     *
     * @return the vi start time
     */
    public Date getViStartTime() {
		return this.viStartTime;
	}

    /**
     * Sets vi start time.
     *
     * @param viStartTime the vi start time
     */
    public void setViStartTime(Date viStartTime) {
		this.viStartTime = viStartTime;
	}

    /**
     * Gets vi style name.
     *
     * @return the vi style name
     */
    public String getViStyleName() {
		return this.viStyleName;
	}

    /**
     * Sets vi style name.
     *
     * @param viStyleName the vi style name
     */
    public void setViStyleName(String viStyleName) {
		this.viStyleName = viStyleName;
	}

    /**
     * Gets vi vin.
     *
     * @return the vi vin
     */
    public List<String> getViVin() {
		return this.viVin;
	}

    /**
     * Sets vi vin.
     *
     * @param viVin the vi vin
     */
    public void setViVin(List<String> viVin) {
		this.viVin = viVin;
	}

    /**
     * Gets vl start time.
     *
     * @return the vl start time
     */
    public Date getVlStartTime() {
		return this.vlStartTime;
	}

    /**
     * Sets vl start time.
     *
     * @param vlStartTime the vl start time
     */
    public void setVlStartTime(Date vlStartTime) {
		this.vlStartTime = vlStartTime;
	}

}

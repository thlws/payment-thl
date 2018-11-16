package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆的品牌型号
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:04:59
 */
public class CarModel extends AlipayObject {

	private static final long serialVersionUID = 8477251255741261927L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 配置类型
	 */
	@ApiField("config_name")
	private String configName;

	/**
	 * 排量
	 */
	@ApiField("engine_desc")
	private String engineDesc;

	/**
	 * 车系名称
	 */
	@ApiField("family_short_name")
	private String familyShortName;

	/**
	 * 车辆驾驶类型
	 */
	@ApiField("gear_box_type")
	private String gearBoxType;

	/**
	 * 新车购置价
	 */
	@ApiField("purchase_price")
	private String purchasePrice;

	/**
	 * 座位数
	 */
	@ApiField("seat")
	private String seat;

	/**
	 * 车辆类型编码
	 */
	@ApiField("vehicle_class_code")
	private String vehicleClassCode;

	/**
	 * 车型代码
	 */
	@ApiField("vehicle_code")
	private String vehicleCode;

	/**
	 * 车型名称
	 */
	@ApiField("vehicle_name")
	private String vehicleName;

	/**
	 * 年份
	 */
	@ApiField("year_pattern")
	private String yearPattern;

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
     * Gets config name.
     *
     * @return the config name
     */
    public String getConfigName() {
		return this.configName;
	}

    /**
     * Sets config name.
     *
     * @param configName the config name
     */
    public void setConfigName(String configName) {
		this.configName = configName;
	}

    /**
     * Gets engine desc.
     *
     * @return the engine desc
     */
    public String getEngineDesc() {
		return this.engineDesc;
	}

    /**
     * Sets engine desc.
     *
     * @param engineDesc the engine desc
     */
    public void setEngineDesc(String engineDesc) {
		this.engineDesc = engineDesc;
	}

    /**
     * Gets family short name.
     *
     * @return the family short name
     */
    public String getFamilyShortName() {
		return this.familyShortName;
	}

    /**
     * Sets family short name.
     *
     * @param familyShortName the family short name
     */
    public void setFamilyShortName(String familyShortName) {
		this.familyShortName = familyShortName;
	}

    /**
     * Gets gear box type.
     *
     * @return the gear box type
     */
    public String getGearBoxType() {
		return this.gearBoxType;
	}

    /**
     * Sets gear box type.
     *
     * @param gearBoxType the gear box type
     */
    public void setGearBoxType(String gearBoxType) {
		this.gearBoxType = gearBoxType;
	}

    /**
     * Gets purchase price.
     *
     * @return the purchase price
     */
    public String getPurchasePrice() {
		return this.purchasePrice;
	}

    /**
     * Sets purchase price.
     *
     * @param purchasePrice the purchase price
     */
    public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

    /**
     * Gets seat.
     *
     * @return the seat
     */
    public String getSeat() {
		return this.seat;
	}

    /**
     * Sets seat.
     *
     * @param seat the seat
     */
    public void setSeat(String seat) {
		this.seat = seat;
	}

    /**
     * Gets vehicle class code.
     *
     * @return the vehicle class code
     */
    public String getVehicleClassCode() {
		return this.vehicleClassCode;
	}

    /**
     * Sets vehicle class code.
     *
     * @param vehicleClassCode the vehicle class code
     */
    public void setVehicleClassCode(String vehicleClassCode) {
		this.vehicleClassCode = vehicleClassCode;
	}

    /**
     * Gets vehicle code.
     *
     * @return the vehicle code
     */
    public String getVehicleCode() {
		return this.vehicleCode;
	}

    /**
     * Sets vehicle code.
     *
     * @param vehicleCode the vehicle code
     */
    public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

    /**
     * Gets vehicle name.
     *
     * @return the vehicle name
     */
    public String getVehicleName() {
		return this.vehicleName;
	}

    /**
     * Sets vehicle name.
     *
     * @param vehicleName the vehicle name
     */
    public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

    /**
     * Gets year pattern.
     *
     * @return the year pattern
     */
    public String getYearPattern() {
		return this.yearPattern;
	}

    /**
     * Sets year pattern.
     *
     * @param yearPattern the year pattern
     */
    public void setYearPattern(String yearPattern) {
		this.yearPattern = yearPattern;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区域信息，包含省市区三级
 *
 * @author auto create
 * @since 1.0, 2018-01-18 17:18:08
 */
public class RegionInfo extends AlipayObject {

	private static final long serialVersionUID = 4324911454626766178L;

	/**
	 * 地址所属区代码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 地址所属区名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 地址所属市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 地址所属市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 地址所属省份代码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 地址所属省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

    /**
     * Gets area code.
     *
     * @return the area code
     */
    public String getAreaCode() {
		return this.areaCode;
	}

    /**
     * Sets area code.
     *
     * @param areaCode the area code
     */
    public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

    /**
     * Gets area name.
     *
     * @return the area name
     */
    public String getAreaName() {
		return this.areaName;
	}

    /**
     * Sets area name.
     *
     * @param areaName the area name
     */
    public void setAreaName(String areaName) {
		this.areaName = areaName;
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
     * Gets city name.
     *
     * @return the city name
     */
    public String getCityName() {
		return this.cityName;
	}

    /**
     * Sets city name.
     *
     * @param cityName the city name
     */
    public void setCityName(String cityName) {
		this.cityName = cityName;
	}

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
		return this.provinceCode;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

    /**
     * Gets province name.
     *
     * @return the province name
     */
    public String getProvinceName() {
		return this.provinceName;
	}

    /**
     * Sets province name.
     *
     * @param provinceName the province name
     */
    public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}

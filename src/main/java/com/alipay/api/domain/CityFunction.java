package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 城市信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class CityFunction extends AlipayObject {

	private static final long serialVersionUID = 1137954292347374582L;

	/**
	 * 城市标准编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 描述功能，支持开卡(issue)，圈存(load)，充值转账(recharge)
	 */
	@ApiListField("function_type")
	@ApiField("string")
	private List<String> functionType;

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
     * Gets function type.
     *
     * @return the function type
     */
    public List<String> getFunctionType() {
		return this.functionType;
	}

    /**
     * Sets function type.
     *
     * @param functionType the function type
     */
    public void setFunctionType(List<String> functionType) {
		this.functionType = functionType;
	}

}

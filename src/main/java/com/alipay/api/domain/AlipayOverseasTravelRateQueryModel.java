package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游汇率查询接口
 *
 * @author auto create
 * @since 1.0, 2018-06-02 16:26:31
 */
public class AlipayOverseasTravelRateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5322478629664117423L;

	/**
	 * 用户当前所在国家的国家码，ISO-3166标准三位数字国家码，currency、countryCode、longitude & latitude三者不能同时为空
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 货币代码，ISO标准alpha- 3币种代码，currency、countryCode、longitude & latitude三者不能同时为空
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 业务扩展参数,用于商户的特定业务信息的传递,json格式
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 用户当前定位纬度，currency、countryCode、longitude & latitude三者不能同时为空
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用户当前定位经度，currency、countryCode、longitude & latitude三者不能同时为空
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 蚂蚁统一会员ID，唯一，如有该字段，可以获取该币种对应会员等级的汇率
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets country code.
     *
     * @return the country code
     */
    public String getCountryCode() {
		return this.countryCode;
	}

    /**
     * Sets country code.
     *
     * @param countryCode the country code
     */
    public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets extend param.
     *
     * @return the extend param
     */
    public String getExtendParam() {
		return this.extendParam;
	}

    /**
     * Sets extend param.
     *
     * @param extendParam the extend param
     */
    public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
		return this.latitude;
	}

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
		return this.longitude;
	}

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}

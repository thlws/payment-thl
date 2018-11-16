package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机归属地对象
 *
 * @author auto create
 * @since 1.0, 2017-01-03 17:38:43
 */
public class SecuritydataMobileCity extends AlipayObject {

	private static final long serialVersionUID = 5329236452626388164L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 手机号前七位
	 */
	@ApiField("phone_first_7_digits")
	private String phoneFirst7Digits;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
		return this.city;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets phone first 7 digits.
     *
     * @return the phone first 7 digits
     */
    public String getPhoneFirst7Digits() {
		return this.phoneFirst7Digits;
	}

    /**
     * Sets phone first 7 digits.
     *
     * @param phoneFirst7Digits the phone first 7 digits
     */
    public void setPhoneFirst7Digits(String phoneFirst7Digits) {
		this.phoneFirst7Digits = phoneFirst7Digits;
	}

    /**
     * Gets province.
     *
     * @return the province
     */
    public String getProvince() {
		return this.province;
	}

    /**
     * Sets province.
     *
     * @param province the province
     */
    public void setProvince(String province) {
		this.province = province;
	}

}

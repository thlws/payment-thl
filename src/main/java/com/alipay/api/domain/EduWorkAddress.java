package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贴子发布接口中的工作地点
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:22:26
 */
public class EduWorkAddress extends AlipayObject {

	private static final long serialVersionUID = 1877768662274117785L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 北京市
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道
	 */
	@ApiField("street_name")
	private String streetName;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

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
     * Gets district name.
     *
     * @return the district name
     */
    public String getDistrictName() {
		return this.districtName;
	}

    /**
     * Sets district name.
     *
     * @param districtName the district name
     */
    public void setDistrictName(String districtName) {
		this.districtName = districtName;
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

    /**
     * Gets street name.
     *
     * @return the street name
     */
    public String getStreetName() {
		return this.streetName;
	}

    /**
     * Sets street name.
     *
     * @param streetName the street name
     */
    public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}

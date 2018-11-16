package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发件人信息
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:09
 */
public class SenderInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4347766767368923831L;

	/**
	 * 区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 城市编码
	 */
	@ApiField("city")
	private String city;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 发货人电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 发货人
	 */
	@ApiField("name")
	private String name;

	/**
	 * 省份编码
	 */
	@ApiField("province")
	private String province;

    /**
     * Gets area.
     *
     * @return the area
     */
    public String getArea() {
		return this.area;
	}

    /**
     * Sets area.
     *
     * @param area the area
     */
    public void setArea(String area) {
		this.area = area;
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
     * Gets detail address.
     *
     * @return the detail address
     */
    public String getDetailAddress() {
		return this.detailAddress;
	}

    /**
     * Sets detail address.
     *
     * @param detailAddress the detail address
     */
    public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
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

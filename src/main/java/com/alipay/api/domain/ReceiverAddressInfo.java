package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货人及地址信息
 *
 * @author auto create
 * @since 1.0, 2018-09-11 16:43:19
 */
public class ReceiverAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 3345688931432281111L;

	/**
	 * 收货地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 中国标准城市区域码
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 收货人手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 收货人的姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收货地址邮编
	 */
	@ApiField("zip")
	private String zip;

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
     * Gets division code.
     *
     * @return the division code
     */
    public String getDivisionCode() {
		return this.divisionCode;
	}

    /**
     * Sets division code.
     *
     * @param divisionCode the division code
     */
    public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
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
     * Gets zip.
     *
     * @return the zip
     */
    public String getZip() {
		return this.zip;
	}

    /**
     * Sets zip.
     *
     * @param zip the zip
     */
    public void setZip(String zip) {
		this.zip = zip;
	}

}

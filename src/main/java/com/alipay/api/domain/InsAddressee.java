package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单邮寄地址
 *
 * @author auto create
 * @since 1.0, 2018-06-28 20:24:40
 */
public class InsAddressee extends AlipayObject {

	private static final long serialVersionUID = 1861289957873852349L;

	/**
	 * 收件人详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("address_code")
	private String addressCode;

	/**
	 * 联系地址-城区
	 */
	@ApiField("area")
	private String area;

	/**
	 * 联系地址-城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 联系方式(mobile登录号)
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 收件人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系地址-电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 联系地址-省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 联系地址-邮编
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
     * Gets address code.
     *
     * @return the address code
     */
    public String getAddressCode() {
		return this.addressCode;
	}

    /**
     * Sets address code.
     *
     * @param addressCode the address code
     */
    public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

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
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
		return this.email;
	}

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
		this.email = email;
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
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
		return this.phone;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
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

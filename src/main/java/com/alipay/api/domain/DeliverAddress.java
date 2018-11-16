package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货人地址
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class DeliverAddress extends AlipayObject {

	private static final long serialVersionUID = 1529931887938944428L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("address_code")
	private String addressCode;

	/**
	 * 是否默认收货地址
	 */
	@ApiField("default_deliver_address")
	private String defaultDeliverAddress;

	/**
	 * 收货人所在区县
	 */
	@ApiField("deliver_area")
	private String deliverArea;

	/**
	 * 收货人所在城市
	 */
	@ApiField("deliver_city")
	private String deliverCity;

	/**
	 * 收货人全名
	 */
	@ApiField("deliver_fullname")
	private String deliverFullname;

	/**
	 * 收货地址的联系人移动电话
	 */
	@ApiField("deliver_mobile")
	private String deliverMobile;

	/**
	 * 收货地址的联系人固定电话
	 */
	@ApiField("deliver_phone")
	private String deliverPhone;

	/**
	 * 收货人所在省份
	 */
	@ApiField("deliver_province")
	private String deliverProvince;

	/**
	 * 邮政编码
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
     * Gets default deliver address.
     *
     * @return the default deliver address
     */
    public String getDefaultDeliverAddress() {
		return this.defaultDeliverAddress;
	}

    /**
     * Sets default deliver address.
     *
     * @param defaultDeliverAddress the default deliver address
     */
    public void setDefaultDeliverAddress(String defaultDeliverAddress) {
		this.defaultDeliverAddress = defaultDeliverAddress;
	}

    /**
     * Gets deliver area.
     *
     * @return the deliver area
     */
    public String getDeliverArea() {
		return this.deliverArea;
	}

    /**
     * Sets deliver area.
     *
     * @param deliverArea the deliver area
     */
    public void setDeliverArea(String deliverArea) {
		this.deliverArea = deliverArea;
	}

    /**
     * Gets deliver city.
     *
     * @return the deliver city
     */
    public String getDeliverCity() {
		return this.deliverCity;
	}

    /**
     * Sets deliver city.
     *
     * @param deliverCity the deliver city
     */
    public void setDeliverCity(String deliverCity) {
		this.deliverCity = deliverCity;
	}

    /**
     * Gets deliver fullname.
     *
     * @return the deliver fullname
     */
    public String getDeliverFullname() {
		return this.deliverFullname;
	}

    /**
     * Sets deliver fullname.
     *
     * @param deliverFullname the deliver fullname
     */
    public void setDeliverFullname(String deliverFullname) {
		this.deliverFullname = deliverFullname;
	}

    /**
     * Gets deliver mobile.
     *
     * @return the deliver mobile
     */
    public String getDeliverMobile() {
		return this.deliverMobile;
	}

    /**
     * Sets deliver mobile.
     *
     * @param deliverMobile the deliver mobile
     */
    public void setDeliverMobile(String deliverMobile) {
		this.deliverMobile = deliverMobile;
	}

    /**
     * Gets deliver phone.
     *
     * @return the deliver phone
     */
    public String getDeliverPhone() {
		return this.deliverPhone;
	}

    /**
     * Sets deliver phone.
     *
     * @param deliverPhone the deliver phone
     */
    public void setDeliverPhone(String deliverPhone) {
		this.deliverPhone = deliverPhone;
	}

    /**
     * Gets deliver province.
     *
     * @return the deliver province
     */
    public String getDeliverProvince() {
		return this.deliverProvince;
	}

    /**
     * Sets deliver province.
     *
     * @param deliverProvince the deliver province
     */
    public void setDeliverProvince(String deliverProvince) {
		this.deliverProvince = deliverProvince;
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

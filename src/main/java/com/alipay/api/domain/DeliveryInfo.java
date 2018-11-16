package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配送信息
 *
 * @author auto create
 * @since 1.0, 2018-08-23 19:58:00
 */
public class DeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 4529479689915593298L;

	/**
	 * 市区编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 收件人
	 */
	@ApiField("consignee")
	private String consignee;

	/**
	 * 收件人联系方式
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 详细地区
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 县区编码，国标码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 省份编码，国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 邮政编码
	 */
	@ApiField("zip_code")
	private String zipCode;

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
     * Gets consignee.
     *
     * @return the consignee
     */
    public String getConsignee() {
		return this.consignee;
	}

    /**
     * Sets consignee.
     *
     * @param consignee the consignee
     */
    public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

    /**
     * Gets contact phone.
     *
     * @return the contact phone
     */
    public String getContactPhone() {
		return this.contactPhone;
	}

    /**
     * Sets contact phone.
     *
     * @param contactPhone the contact phone
     */
    public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
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
     * Gets district code.
     *
     * @return the district code
     */
    public String getDistrictCode() {
		return this.districtCode;
	}

    /**
     * Sets district code.
     *
     * @param districtCode the district code
     */
    public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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
     * Gets zip code.
     *
     * @return the zip code
     */
    public String getZipCode() {
		return this.zipCode;
	}

    /**
     * Sets zip code.
     *
     * @param zipCode the zip code
     */
    public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配送地址
 *
 * @author auto create
 * @since 1.0, 2018-06-14 12:56:23
 */
public class AssetDeliveryAddress extends AlipayObject {

	private static final long serialVersionUID = 5315774861499615778L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 收件人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 区信息
	 */
	@ApiField("district")
	private String district;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 仓库id
	 */
	@ApiField("warehouse_id")
	private String warehouseId;

	/**
	 * 供应商的仓库名称
	 */
	@ApiField("warehouse_name")
	private String warehouseName;

	/**
	 * 邮编
	 */
	@ApiField("zip_code")
	private String zipCode;

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
     * Gets contact name.
     *
     * @return the contact name
     */
    public String getContactName() {
		return this.contactName;
	}

    /**
     * Sets contact name.
     *
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
		this.contactName = contactName;
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
     * Gets district.
     *
     * @return the district
     */
    public String getDistrict() {
		return this.district;
	}

    /**
     * Sets district.
     *
     * @param district the district
     */
    public void setDistrict(String district) {
		this.district = district;
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
     * Gets warehouse id.
     *
     * @return the warehouse id
     */
    public String getWarehouseId() {
		return this.warehouseId;
	}

    /**
     * Sets warehouse id.
     *
     * @param warehouseId the warehouse id
     */
    public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

    /**
     * Gets warehouse name.
     *
     * @return the warehouse name
     */
    public String getWarehouseName() {
		return this.warehouseName;
	}

    /**
     * Sets warehouse name.
     *
     * @param warehouseName the warehouse name
     */
    public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
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

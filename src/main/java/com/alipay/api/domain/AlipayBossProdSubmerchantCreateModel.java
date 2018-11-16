package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行二清商户入驻接口
 *
 * @author auto create
 * @since 1.0, 2017-09-23 20:46:27
 */
public class AlipayBossProdSubmerchantCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3449145993295726475L;

	/**
	 * 受理商户详细经营地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 受理商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 受理商户营业执照编号
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 受理商户经营类目，参考开放平台口碑开放行业入驻要求
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 受理商户所在城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 受理商户联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 受理商户联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 受理商户联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 受理商户联系人电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 受理商户所在区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 受理商户编号，由受理机构定义，需要保证在受理机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 受理商户身份证编号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 受理商户备注信息，可填写额外信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 受理商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 受理商户所在省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 受理商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 受理商户来源机构标识，填写受理机构在支付宝的pid
	 */
	@ApiField("source")
	private String source;

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
     * Gets alias name.
     *
     * @return the alias name
     */
    public String getAliasName() {
		return this.aliasName;
	}

    /**
     * Sets alias name.
     *
     * @param aliasName the alias name
     */
    public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

    /**
     * Gets business license.
     *
     * @return the business license
     */
    public String getBusinessLicense() {
		return this.businessLicense;
	}

    /**
     * Sets business license.
     *
     * @param businessLicense the business license
     */
    public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId() {
		return this.categoryId;
	}

    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

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
     * Gets contact email.
     *
     * @return the contact email
     */
    public String getContactEmail() {
		return this.contactEmail;
	}

    /**
     * Sets contact email.
     *
     * @param contactEmail the contact email
     */
    public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

    /**
     * Gets contact mobile.
     *
     * @return the contact mobile
     */
    public String getContactMobile() {
		return this.contactMobile;
	}

    /**
     * Sets contact mobile.
     *
     * @param contactMobile the contact mobile
     */
    public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
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
     * Gets external id.
     *
     * @return the external id
     */
    public String getExternalId() {
		return this.externalId;
	}

    /**
     * Sets external id.
     *
     * @param externalId the external id
     */
    public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

    /**
     * Gets id card.
     *
     * @return the id card
     */
    public String getIdCard() {
		return this.idCard;
	}

    /**
     * Sets id card.
     *
     * @param idCard the id card
     */
    public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
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
     * Gets service phone.
     *
     * @return the service phone
     */
    public String getServicePhone() {
		return this.servicePhone;
	}

    /**
     * Sets service phone.
     *
     * @param servicePhone the service phone
     */
    public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

}

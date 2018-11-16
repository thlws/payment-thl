package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁店铺创建
 *
 * @author auto create
 * @since 1.0, 2018-08-18 15:29:19
 */
public class AntMerchantExpandShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2191472498699654289L;

	/**
	 * 经营地址。地址对象中省、市、区、地址必填，其余选填
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 店铺经营时间。
	 */
	@ApiListField("business_time")
	@ApiField("shop_business_time")
	private List<ShopBusinessTime> businessTime;

	/**
	 * 营业执照图片url。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。当店铺类目为特殊行业时必填
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 营业执照名称，填写值为营业执照或统一社会信用代码证上的名称。当店铺类目是特殊类目是要求必填
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码。请填写店铺营业执照号。当店铺类目是特殊类目是要求必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，取值范围：201：营业执照；2011:多证合一(统一社会信用代码)。当店铺类目是特殊类目是要求必填
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 联系人信息。如果填写，其中xxxx必填
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfos;

	/**
	 * 店铺联系手机，与店铺联系固话二选一必填
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 店铺的联系固话，和店铺联系手机二选一必填
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 法人身份证号。当店铺类目是特殊类目是要求必填
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人名称。当店铺类目是特殊类目是要求必填
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 营业执照授权函。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。当店铺类目是特殊行业时必填
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。当店铺类目是特殊类目是要求必填
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * 行业特殊资质。当店铺类目是特殊类目是要求必填
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 结算支付宝账号的登录号
	 */
	@ApiField("settle_alipay_logon_id")
	private String settleAlipayLogonId;

	/**
	 * 店铺类目，取值参见文件https://mif-pub.alipayobjects.com/ShopCategory.xlsx 中的三级门店类目
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 店铺名称。直连开店要保证全局店铺名称+地址唯一，间连开店要保证服务商pid下店铺名称+地址唯一
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺经营类型，01表示直营，02表示加盟
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号
	 */
	@ApiField("store_id")
	private String storeId;

    /**
     * Gets business address.
     *
     * @return the business address
     */
    public AddressInfo getBusinessAddress() {
		return this.businessAddress;
	}

    /**
     * Sets business address.
     *
     * @param businessAddress the business address
     */
    public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

    /**
     * Gets business time.
     *
     * @return the business time
     */
    public List<ShopBusinessTime> getBusinessTime() {
		return this.businessTime;
	}

    /**
     * Sets business time.
     *
     * @param businessTime the business time
     */
    public void setBusinessTime(List<ShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

    /**
     * Gets cert image.
     *
     * @return the cert image
     */
    public String getCertImage() {
		return this.certImage;
	}

    /**
     * Sets cert image.
     *
     * @param certImage the cert image
     */
    public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

    /**
     * Gets cert name.
     *
     * @return the cert name
     */
    public String getCertName() {
		return this.certName;
	}

    /**
     * Sets cert name.
     *
     * @param certName the cert name
     */
    public void setCertName(String certName) {
		this.certName = certName;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType() {
		return this.certType;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets contact infos.
     *
     * @return the contact infos
     */
    public List<ContactInfo> getContactInfos() {
		return this.contactInfos;
	}

    /**
     * Sets contact infos.
     *
     * @param contactInfos the contact infos
     */
    public void setContactInfos(List<ContactInfo> contactInfos) {
		this.contactInfos = contactInfos;
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
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets legal cert no.
     *
     * @return the legal cert no
     */
    public String getLegalCertNo() {
		return this.legalCertNo;
	}

    /**
     * Sets legal cert no.
     *
     * @param legalCertNo the legal cert no
     */
    public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

    /**
     * Gets legal name.
     *
     * @return the legal name
     */
    public String getLegalName() {
		return this.legalName;
	}

    /**
     * Sets legal name.
     *
     * @param legalName the legal name
     */
    public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

    /**
     * Gets license auth letter image.
     *
     * @return the license auth letter image
     */
    public String getLicenseAuthLetterImage() {
		return this.licenseAuthLetterImage;
	}

    /**
     * Sets license auth letter image.
     *
     * @param licenseAuthLetterImage the license auth letter image
     */
    public void setLicenseAuthLetterImage(String licenseAuthLetterImage) {
		this.licenseAuthLetterImage = licenseAuthLetterImage;
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
     * Gets out door images.
     *
     * @return the out door images
     */
    public List<String> getOutDoorImages() {
		return this.outDoorImages;
	}

    /**
     * Sets out door images.
     *
     * @param outDoorImages the out door images
     */
    public void setOutDoorImages(List<String> outDoorImages) {
		this.outDoorImages = outDoorImages;
	}

    /**
     * Gets qualifications.
     *
     * @return the qualifications
     */
    public List<IndustryQualificationInfo> getQualifications() {
		return this.qualifications;
	}

    /**
     * Sets qualifications.
     *
     * @param qualifications the qualifications
     */
    public void setQualifications(List<IndustryQualificationInfo> qualifications) {
		this.qualifications = qualifications;
	}

    /**
     * Gets settle alipay logon id.
     *
     * @return the settle alipay logon id
     */
    public String getSettleAlipayLogonId() {
		return this.settleAlipayLogonId;
	}

    /**
     * Sets settle alipay logon id.
     *
     * @param settleAlipayLogonId the settle alipay logon id
     */
    public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}

    /**
     * Gets shop category.
     *
     * @return the shop category
     */
    public String getShopCategory() {
		return this.shopCategory;
	}

    /**
     * Sets shop category.
     *
     * @param shopCategory the shop category
     */
    public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName() {
		return this.shopName;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

    /**
     * Gets shop type.
     *
     * @return the shop type
     */
    public String getShopType() {
		return this.shopType;
	}

    /**
     * Sets shop type.
     *
     * @param shopType the shop type
     */
    public void setShopType(String shopType) {
		this.shopType = shopType;
	}

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
		return this.storeId;
	}

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}

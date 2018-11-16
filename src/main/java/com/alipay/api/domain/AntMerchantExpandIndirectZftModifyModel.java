package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直付通二级商户修改
 *
 * @author auto create
 * @since 1.0, 2018-09-07 20:01:54
 */
public class AntMerchantExpandIndirectZftModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3416458975721688882L;

	/**
	 * 商户别名
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 商户支付宝账号，用作结算账号。与银行卡对象字段二选一必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户。如果已确认过协议，修改时本信息项不允许变更，可以传空
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 商户结算卡信息。本业务当前只允许传入一张结算卡
	 */
	@ApiListField("biz_cards")
	@ApiField("settle_card_info")
	private List<SettleCardInfo> bizCards;

	/**
	 * 经营地址。地址对象中省、市、区、地址必填，其余选填
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 商户联系人信息。在本业务中，ContactInfo对象中名称，类型、手机号必填，其他选填
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfos;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一。与smid二选一必填
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 开票资料信息
	 */
	@ApiField("invoice_info")
	private MerchantInvoiceInfo invoiceInfo;

	/**
	 * 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
	 */
	@ApiField("legal_cert_back_image")
	private String legalCertBackImage;

	/**
	 * 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
	 */
	@ApiField("legal_cert_front_image")
	private String legalCertFrontImage;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人名称
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 营业执照授权函。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。当商户名与结算卡户名不一致时必填
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 商户类别码mcc，参见附件描述中的“类目code”  https://mif-pub.alipayobjects.com/AlipayMCC.xlsx
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商家类型：01：企业；02：事业单位
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 进件的二级商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * 商户行业资质，当商户是特殊行业时必填
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
	 */
	@ApiListField("service")
	@ApiField("string")
	private List<String> service;

	/**
	 * 客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 二级商户与服务商的签约时间
	 */
	@ApiField("sign_time_with_isv")
	private String signTimeWithIsv;

	/**
	 * 商户站点信息，包括网站、app、小程序。
商户使用服务包含电脑支付或wap支付时，必须填充一个类型为01(网站)的SiteInfo对象；
当包含app支付时，必须至少填充类型为02(APP)或06(支付宝小程序)中一种类型的SiteInfo对象
	 */
	@ApiListField("sites")
	@ApiField("site_info")
	private List<SiteInfo> sites;

	/**
	 * 二级商户id。与external_id二选一必填
	 */
	@ApiField("smid")
	private String smid;

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
     * Gets alipay logon id.
     *
     * @return the alipay logon id
     */
    public String getAlipayLogonId() {
		return this.alipayLogonId;
	}

    /**
     * Sets alipay logon id.
     *
     * @param alipayLogonId the alipay logon id
     */
    public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

    /**
     * Gets binding alipay logon id.
     *
     * @return the binding alipay logon id
     */
    public String getBindingAlipayLogonId() {
		return this.bindingAlipayLogonId;
	}

    /**
     * Sets binding alipay logon id.
     *
     * @param bindingAlipayLogonId the binding alipay logon id
     */
    public void setBindingAlipayLogonId(String bindingAlipayLogonId) {
		this.bindingAlipayLogonId = bindingAlipayLogonId;
	}

    /**
     * Gets biz cards.
     *
     * @return the biz cards
     */
    public List<SettleCardInfo> getBizCards() {
		return this.bizCards;
	}

    /**
     * Sets biz cards.
     *
     * @param bizCards the biz cards
     */
    public void setBizCards(List<SettleCardInfo> bizCards) {
		this.bizCards = bizCards;
	}

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
     * Gets invoice info.
     *
     * @return the invoice info
     */
    public MerchantInvoiceInfo getInvoiceInfo() {
		return this.invoiceInfo;
	}

    /**
     * Sets invoice info.
     *
     * @param invoiceInfo the invoice info
     */
    public void setInvoiceInfo(MerchantInvoiceInfo invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

    /**
     * Gets legal cert back image.
     *
     * @return the legal cert back image
     */
    public String getLegalCertBackImage() {
		return this.legalCertBackImage;
	}

    /**
     * Sets legal cert back image.
     *
     * @param legalCertBackImage the legal cert back image
     */
    public void setLegalCertBackImage(String legalCertBackImage) {
		this.legalCertBackImage = legalCertBackImage;
	}

    /**
     * Gets legal cert front image.
     *
     * @return the legal cert front image
     */
    public String getLegalCertFrontImage() {
		return this.legalCertFrontImage;
	}

    /**
     * Sets legal cert front image.
     *
     * @param legalCertFrontImage the legal cert front image
     */
    public void setLegalCertFrontImage(String legalCertFrontImage) {
		this.legalCertFrontImage = legalCertFrontImage;
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
     * Gets mcc.
     *
     * @return the mcc
     */
    public String getMcc() {
		return this.mcc;
	}

    /**
     * Sets mcc.
     *
     * @param mcc the mcc
     */
    public void setMcc(String mcc) {
		this.mcc = mcc;
	}

    /**
     * Gets merchant type.
     *
     * @return the merchant type
     */
    public String getMerchantType() {
		return this.merchantType;
	}

    /**
     * Sets merchant type.
     *
     * @param merchantType the merchant type
     */
    public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
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
     * Gets service.
     *
     * @return the service
     */
    public List<String> getService() {
		return this.service;
	}

    /**
     * Sets service.
     *
     * @param service the service
     */
    public void setService(List<String> service) {
		this.service = service;
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
     * Gets sign time with isv.
     *
     * @return the sign time with isv
     */
    public String getSignTimeWithIsv() {
		return this.signTimeWithIsv;
	}

    /**
     * Sets sign time with isv.
     *
     * @param signTimeWithIsv the sign time with isv
     */
    public void setSignTimeWithIsv(String signTimeWithIsv) {
		this.signTimeWithIsv = signTimeWithIsv;
	}

    /**
     * Gets sites.
     *
     * @return the sites
     */
    public List<SiteInfo> getSites() {
		return this.sites;
	}

    /**
     * Sets sites.
     *
     * @param sites the sites
     */
    public void setSites(List<SiteInfo> sites) {
		this.sites = sites;
	}

    /**
     * Gets smid.
     *
     * @return the smid
     */
    public String getSmid() {
		return this.smid;
	}

    /**
     * Sets smid.
     *
     * @param smid the smid
     */
    public void setSmid(String smid) {
		this.smid = smid;
	}

}

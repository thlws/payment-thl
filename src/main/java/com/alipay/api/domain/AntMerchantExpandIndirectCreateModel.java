package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 银行间连商户入驻
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:02:20
 */
public class AntMerchantExpandIndirectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7249166963213514536L;

	/**
	 * 商户地址信息
	 */
	@ApiListField("address_info")
	@ApiField("address_info")
	private List<AddressInfo> addressInfo;

	/**
	 * 商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 商户对应银行所开立的结算卡信息
	 */
	@ApiListField("bankcard_info")
	@ApiField("bank_card_info")
	private List<BankCardInfo> bankcardInfo;

	/**
	 * 商户证件编号（企业或者个体工商户提供营业执照，事业单位提供事证号）
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 商户证件类型，取值范围：NATIONAL_LEGAL：营业执照；NATIONAL_LEGAL_MERGE:营业执照(多证合一)；INST_RGST_CTF：事业单位法人证书
	 */
	@ApiField("business_license_type")
	private String businessLicenseType;

	/**
	 * 商户经营类目，参考文档：https://doc.open.alipay.com/doc2/detail?&docType=1&articleId=105444，非银联/网联进件时必传
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商户联系人信息
	 */
	@ApiListField("contact_info")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfo;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户的支付宝账号
	 */
	@ApiListField("logon_id")
	@ApiField("string")
	private List<String> logonId;

	/**
	 * 标准商户类别码，例如5976表示“专业销售-药品医疗-康复和身体辅助用品”，银联/网联进件时必传
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户备注，可填写额外信息。分支机构进件，需要按照要求填写“分支机构码”，方便进行入驻管控，分支机构码由支付宝指定编码值，具体编码值可联系对口BD获取。填写分支机构码的时候用“##”标识符括起来，放在整条备注信息的开头处。示例：若进件分支机构为吉林省，由于对应分支机构编码值为220000，那么进件的时候应填写备注信息为：##220000##其他备注信息。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收单机构(例如银行）的标识，填写该机构在支付宝的pid。银联/网联进件时必传。
	 */
	@ApiField("org_pid")
	private String orgPid;

	/**
	 * 商户的支付二维码中信息，用于营销活动
	 */
	@ApiListField("pay_code_info")
	@ApiField("string")
	private List<String> payCodeInfo;

	/**
	 * 商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 间连受理商户的推荐组织。如果是银行自有商户入驻，则推荐组织为银行，如果是ISV推广的商户，那么商户推荐组织为ISV，如果是第三方支付机构的自有商户，则推荐组织为第三方支付机构。
	 */
	@ApiField("source")
	private String source;

    /**
     * Gets address info.
     *
     * @return the address info
     */
    public List<AddressInfo> getAddressInfo() {
		return this.addressInfo;
	}

    /**
     * Sets address info.
     *
     * @param addressInfo the address info
     */
    public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
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
     * Gets bankcard info.
     *
     * @return the bankcard info
     */
    public List<BankCardInfo> getBankcardInfo() {
		return this.bankcardInfo;
	}

    /**
     * Sets bankcard info.
     *
     * @param bankcardInfo the bankcard info
     */
    public void setBankcardInfo(List<BankCardInfo> bankcardInfo) {
		this.bankcardInfo = bankcardInfo;
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
     * Gets business license type.
     *
     * @return the business license type
     */
    public String getBusinessLicenseType() {
		return this.businessLicenseType;
	}

    /**
     * Sets business license type.
     *
     * @param businessLicenseType the business license type
     */
    public void setBusinessLicenseType(String businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
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
     * Gets contact info.
     *
     * @return the contact info
     */
    public List<ContactInfo> getContactInfo() {
		return this.contactInfo;
	}

    /**
     * Sets contact info.
     *
     * @param contactInfo the contact info
     */
    public void setContactInfo(List<ContactInfo> contactInfo) {
		this.contactInfo = contactInfo;
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
     * Gets logon id.
     *
     * @return the logon id
     */
    public List<String> getLogonId() {
		return this.logonId;
	}

    /**
     * Sets logon id.
     *
     * @param logonId the logon id
     */
    public void setLogonId(List<String> logonId) {
		this.logonId = logonId;
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
     * Gets org pid.
     *
     * @return the org pid
     */
    public String getOrgPid() {
		return this.orgPid;
	}

    /**
     * Sets org pid.
     *
     * @param orgPid the org pid
     */
    public void setOrgPid(String orgPid) {
		this.orgPid = orgPid;
	}

    /**
     * Gets pay code info.
     *
     * @return the pay code info
     */
    public List<String> getPayCodeInfo() {
		return this.payCodeInfo;
	}

    /**
     * Sets pay code info.
     *
     * @param payCodeInfo the pay code info
     */
    public void setPayCodeInfo(List<String> payCodeInfo) {
		this.payCodeInfo = payCodeInfo;
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

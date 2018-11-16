package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线上间连商户修改
 *
 * @author auto create
 * @since 1.0, 2018-05-16 14:11:39
 */
public class AntMerchantExpandIndirectOnlineModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7478137454345722728L;

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
	 * 签约受理机构pid
	 */
	@ApiField("bank_pid")
	private String bankPid;

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
	 * 商户联系人信息
	 */
	@ApiListField("contact_info")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfo;

	/**
	 * 支付机构pid/source id；服务商PID；
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户的支付宝账号
	 */
	@ApiListField("logon_id")
	@ApiField("string")
	private List<String> logonId;

	/**
	 * mcc编码
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户特殊资质等
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

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
	 * 商户在银行端的签约时间
	 */
	@ApiField("sign_bank_time")
	private Date signBankTime;

	/**
	 * 站点信息
	 */
	@ApiListField("site_info")
	@ApiField("site_info")
	private List<SiteInfo> siteInfo;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 商户在受理机构的唯一代码，该代号在该机构下保持唯一；extenalID；
	 */
	@ApiField("unique_id_by_bank")
	private String uniqueIdByBank;

	/**
	 * 商户在支付机构的的唯一代码；服务商对该商户分配的ID；
	 */
	@ApiField("unique_id_by_isv")
	private String uniqueIdByIsv;

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
     * Gets bank pid.
     *
     * @return the bank pid
     */
    public String getBankPid() {
		return this.bankPid;
	}

    /**
     * Sets bank pid.
     *
     * @param bankPid the bank pid
     */
    public void setBankPid(String bankPid) {
		this.bankPid = bankPid;
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
     * Gets isv pid.
     *
     * @return the isv pid
     */
    public String getIsvPid() {
		return this.isvPid;
	}

    /**
     * Sets isv pid.
     *
     * @param isvPid the isv pid
     */
    public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
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
     * Gets sign bank time.
     *
     * @return the sign bank time
     */
    public Date getSignBankTime() {
		return this.signBankTime;
	}

    /**
     * Sets sign bank time.
     *
     * @param signBankTime the sign bank time
     */
    public void setSignBankTime(Date signBankTime) {
		this.signBankTime = signBankTime;
	}

    /**
     * Gets site info.
     *
     * @return the site info
     */
    public List<SiteInfo> getSiteInfo() {
		return this.siteInfo;
	}

    /**
     * Sets site info.
     *
     * @param siteInfo the site info
     */
    public void setSiteInfo(List<SiteInfo> siteInfo) {
		this.siteInfo = siteInfo;
	}

    /**
     * Gets sub merchant id.
     *
     * @return the sub merchant id
     */
    public String getSubMerchantId() {
		return this.subMerchantId;
	}

    /**
     * Sets sub merchant id.
     *
     * @param subMerchantId the sub merchant id
     */
    public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

    /**
     * Gets unique id by bank.
     *
     * @return the unique id by bank
     */
    public String getUniqueIdByBank() {
		return this.uniqueIdByBank;
	}

    /**
     * Sets unique id by bank.
     *
     * @param uniqueIdByBank the unique id by bank
     */
    public void setUniqueIdByBank(String uniqueIdByBank) {
		this.uniqueIdByBank = uniqueIdByBank;
	}

    /**
     * Gets unique id by isv.
     *
     * @return the unique id by isv
     */
    public String getUniqueIdByIsv() {
		return this.uniqueIdByIsv;
	}

    /**
     * Sets unique id by isv.
     *
     * @param uniqueIdByIsv the unique id by isv
     */
    public void setUniqueIdByIsv(String uniqueIdByIsv) {
		this.uniqueIdByIsv = uniqueIdByIsv;
	}

}

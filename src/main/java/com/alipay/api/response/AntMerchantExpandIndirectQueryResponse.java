package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AddressInfo;
import com.alipay.api.domain.BankCardInfo;
import com.alipay.api.domain.ContactInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:50:00
 */
public class AntMerchantExpandIndirectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7661848725238438388L;

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
	 * 商户经营类目，参考文档：https://doc.open.alipay.com/doc2/detail?&docType=1&articleId=105444。
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
	 * 间连商户等级。INDIRECT_LEVEL_M0:M0等级;INDIRECT_LEVEL_M1:M1等级;INDIRECT_LEVEL_M2:M2等级;INDIRECT_LEVEL_M3:M3等级
	 */
	@ApiField("indirect_level")
	private String indirectLevel;

	/** 
	 * 受理商户的支付宝账号（用于关联商户生活号、原服务窗，打通口碑营销活动）
	 */
	@ApiListField("logon_id")
	@ApiField("string")
	private List<String> logonId;

	/** 
	 * 标准商户类别码，例如5976表示“专业销售-药品医疗-康复和身体辅助用品”。银联、网联进件的商户有该值。
	 */
	@ApiField("mcc")
	private String mcc;

	/** 
	 * 商户备注信息，可填写额外信息
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 收单机构(例如银行）在支付宝的pid。银联、网联进件的商户有该值。
	 */
	@ApiField("org_pid")
	private String orgPid;

	/** 
	 * 受理商户的固定二维码链接地址（即一码多付页面地址，用于后续支付宝营销活动）
商户所属的银行或ISV 给商户的二维码url值
一码多付方案:https://doc.open.alipay.com/docs/doc.htm?&docType=1&articleId=105672
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
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

    /**
     * Sets address info.
     *
     * @param addressInfo the address info
     */
    public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}

    /**
     * Gets address info.
     *
     * @return the address info
     */
    public List<AddressInfo> getAddressInfo( ) {
		return this.addressInfo;
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
     * Gets alias name.
     *
     * @return the alias name
     */
    public String getAliasName( ) {
		return this.aliasName;
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
     * Gets bankcard info.
     *
     * @return the bankcard info
     */
    public List<BankCardInfo> getBankcardInfo( ) {
		return this.bankcardInfo;
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
     * Gets business license.
     *
     * @return the business license
     */
    public String getBusinessLicense( ) {
		return this.businessLicense;
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
     * Gets business license type.
     *
     * @return the business license type
     */
    public String getBusinessLicenseType( ) {
		return this.businessLicenseType;
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
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId( ) {
		return this.categoryId;
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
     * Gets contact info.
     *
     * @return the contact info
     */
    public List<ContactInfo> getContactInfo( ) {
		return this.contactInfo;
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
     * Gets external id.
     *
     * @return the external id
     */
    public String getExternalId( ) {
		return this.externalId;
	}

    /**
     * Sets indirect level.
     *
     * @param indirectLevel the indirect level
     */
    public void setIndirectLevel(String indirectLevel) {
		this.indirectLevel = indirectLevel;
	}

    /**
     * Gets indirect level.
     *
     * @return the indirect level
     */
    public String getIndirectLevel( ) {
		return this.indirectLevel;
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
     * Gets logon id.
     *
     * @return the logon id
     */
    public List<String> getLogonId( ) {
		return this.logonId;
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
     * Gets mcc.
     *
     * @return the mcc
     */
    public String getMcc( ) {
		return this.mcc;
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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo( ) {
		return this.memo;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
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
     * Gets org pid.
     *
     * @return the org pid
     */
    public String getOrgPid( ) {
		return this.orgPid;
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
     * Gets pay code info.
     *
     * @return the pay code info
     */
    public List<String> getPayCodeInfo( ) {
		return this.payCodeInfo;
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
     * Gets service phone.
     *
     * @return the service phone
     */
    public String getServicePhone( ) {
		return this.servicePhone;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource( ) {
		return this.source;
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
     * Gets sub merchant id.
     *
     * @return the sub merchant id
     */
    public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}

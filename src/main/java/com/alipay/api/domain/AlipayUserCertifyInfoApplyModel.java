package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝认证信息申请接口
 *
 * @author auto create
 * @since 1.0, 2017-09-22 10:47:12
 */
public class AlipayUserCertifyInfoApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4327482559978959244L;

	/**
	 * 委托书图片base64编码的字符串
	 */
	@ApiField("agent_auth_letter_picture")
	private String agentAuthLetterPicture;

	/**
	 * 代理人证件图片辅助页图片，对应二代身份证就是国徽页
	 */
	@ApiField("agent_cert_card_assist_picture")
	private String agentCertCardAssistPicture;

	/**
	 * 代理人证件信息页图片base64编码字符串，对应二代身份证为带人脸页图片
	 */
	@ApiField("agent_cert_card_info_picture")
	private String agentCertCardInfoPicture;

	/**
	 * 代理人证件图片有效期截止日期，"yyyy-MM-dd"格式，若为长期，则填“长期”
	 */
	@ApiField("agent_cert_expired_date")
	private String agentCertExpiredDate;

	/**
	 * 代理人证件号码，若认证申请人不是法人而是代理人，则需要填写代理人相关信息
	 */
	@ApiField("agent_cert_no")
	private String agentCertNo;

	/**
	 * 代理人证件类型，目前仅支持二代身份证：RESIDENT，不支持其他证件类型
	 */
	@ApiField("agent_cert_type")
	private String agentCertType;

	/**
	 * 代理人姓名，若申请认证者非法人而是由代理人，则将代理人姓名填到此字段
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 外部系统请求申请认证的业务来源，例如DingTalk，具体值请向认证开发同学确定
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 联系人手机号，用于认证过程中对用户进行短信通知的号码，11位数字
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 法人证件图片辅助页图片base64格式字符串,若为身份证，则为国徽页图片
	 */
	@ApiField("legal_cert_card_assist_picture")
	private String legalCertCardAssistPicture;

	/**
	 * 法定代表人的证件图片信息页的base64编码字符串，若为身份证，则为带人脸图片的那一页照片
	 */
	@ApiField("legal_cert_card_info_picture")
	private String legalCertCardInfoPicture;

	/**
	 * 法定代表人证件有效期截止日期 “yyyy-MM-dd” 格式，若为长期，则填“长期”
	 */
	@ApiField("legal_cert_expired_date")
	private String legalCertExpiredDate;

	/**
	 * 法定代表人证件号码
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法定代表人证件类型
二代身份证：RESIDENT
护照:PASSPORT
港澳来往内地通行证：HONGKONG_MACAO
台湾同胞往来大陆通行证：TAIWAN
	 */
	@ApiField("legal_cert_type")
	private String legalCertType;

	/**
	 * 法定代理人姓名，要按照营业执照上的姓名填写，必须一致，不能有错别字。
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 住所，填写营业执照号上的住所（经营地址）信息
	 */
	@ApiField("org_address")
	private String orgAddress;

	/**
	 * 填写营业执照上的经营范围
	 */
	@ApiField("org_business_scope")
	private String orgBusinessScope;

	/**
	 * 企业所在市，城市的中文完整描述
	 */
	@ApiField("org_city")
	private String orgCity;

	/**
	 * 企业所在国家，目前只支持 中国
	 */
	@ApiField("org_country")
	private String orgCountry;

	/**
	 * 营业执照上的经营期限截止日期，日期为10位格式"yyyy-MM-dd“  若为长期，则填“长期”
	 */
	@ApiField("org_main_cert_expired_date")
	private String orgMainCertExpiredDate;

	/**
	 * 填企业营业执照上的注册号（一般为15位数字）或社会信用代码（18位数字加字母格式大写），如果有信用代码则优先填写社会信用代码
	 */
	@ApiField("org_main_cert_no")
	private String orgMainCertNo;

	/**
	 * 营业执照图片的base64编码格式的string字符串
	 */
	@ApiField("org_main_cert_picture")
	private String orgMainCertPicture;

	/**
	 * 申请认证的公司的名字，要与营业执照上面一致，包括全半角字符
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 企业所在省份，填写省份中文完整信息
	 */
	@ApiField("org_province")
	private String orgProvince;

	/**
	 * 公司: ENTERPRISE，事业单位：PUBLIC_INST，社会团体：SOCIAL_ORG，民办非企业组织：PRIVATE_NON_ENTERPRISE，党政国家机关：PARTY_AND_STATE_ORGANS，个体工商户：INDIVIDUAL
	 */
	@ApiField("org_type")
	private String orgType;

	/**
	 * 注册资本
	 */
	@ApiField("register_capital")
	private String registerCapital;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets agent auth letter picture.
     *
     * @return the agent auth letter picture
     */
    public String getAgentAuthLetterPicture() {
		return this.agentAuthLetterPicture;
	}

    /**
     * Sets agent auth letter picture.
     *
     * @param agentAuthLetterPicture the agent auth letter picture
     */
    public void setAgentAuthLetterPicture(String agentAuthLetterPicture) {
		this.agentAuthLetterPicture = agentAuthLetterPicture;
	}

    /**
     * Gets agent cert card assist picture.
     *
     * @return the agent cert card assist picture
     */
    public String getAgentCertCardAssistPicture() {
		return this.agentCertCardAssistPicture;
	}

    /**
     * Sets agent cert card assist picture.
     *
     * @param agentCertCardAssistPicture the agent cert card assist picture
     */
    public void setAgentCertCardAssistPicture(String agentCertCardAssistPicture) {
		this.agentCertCardAssistPicture = agentCertCardAssistPicture;
	}

    /**
     * Gets agent cert card info picture.
     *
     * @return the agent cert card info picture
     */
    public String getAgentCertCardInfoPicture() {
		return this.agentCertCardInfoPicture;
	}

    /**
     * Sets agent cert card info picture.
     *
     * @param agentCertCardInfoPicture the agent cert card info picture
     */
    public void setAgentCertCardInfoPicture(String agentCertCardInfoPicture) {
		this.agentCertCardInfoPicture = agentCertCardInfoPicture;
	}

    /**
     * Gets agent cert expired date.
     *
     * @return the agent cert expired date
     */
    public String getAgentCertExpiredDate() {
		return this.agentCertExpiredDate;
	}

    /**
     * Sets agent cert expired date.
     *
     * @param agentCertExpiredDate the agent cert expired date
     */
    public void setAgentCertExpiredDate(String agentCertExpiredDate) {
		this.agentCertExpiredDate = agentCertExpiredDate;
	}

    /**
     * Gets agent cert no.
     *
     * @return the agent cert no
     */
    public String getAgentCertNo() {
		return this.agentCertNo;
	}

    /**
     * Sets agent cert no.
     *
     * @param agentCertNo the agent cert no
     */
    public void setAgentCertNo(String agentCertNo) {
		this.agentCertNo = agentCertNo;
	}

    /**
     * Gets agent cert type.
     *
     * @return the agent cert type
     */
    public String getAgentCertType() {
		return this.agentCertType;
	}

    /**
     * Sets agent cert type.
     *
     * @param agentCertType the agent cert type
     */
    public void setAgentCertType(String agentCertType) {
		this.agentCertType = agentCertType;
	}

    /**
     * Gets agent name.
     *
     * @return the agent name
     */
    public String getAgentName() {
		return this.agentName;
	}

    /**
     * Sets agent name.
     *
     * @param agentName the agent name
     */
    public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

    /**
     * Gets biz from.
     *
     * @return the biz from
     */
    public String getBizFrom() {
		return this.bizFrom;
	}

    /**
     * Sets biz from.
     *
     * @param bizFrom the biz from
     */
    public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
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
     * Gets legal cert card assist picture.
     *
     * @return the legal cert card assist picture
     */
    public String getLegalCertCardAssistPicture() {
		return this.legalCertCardAssistPicture;
	}

    /**
     * Sets legal cert card assist picture.
     *
     * @param legalCertCardAssistPicture the legal cert card assist picture
     */
    public void setLegalCertCardAssistPicture(String legalCertCardAssistPicture) {
		this.legalCertCardAssistPicture = legalCertCardAssistPicture;
	}

    /**
     * Gets legal cert card info picture.
     *
     * @return the legal cert card info picture
     */
    public String getLegalCertCardInfoPicture() {
		return this.legalCertCardInfoPicture;
	}

    /**
     * Sets legal cert card info picture.
     *
     * @param legalCertCardInfoPicture the legal cert card info picture
     */
    public void setLegalCertCardInfoPicture(String legalCertCardInfoPicture) {
		this.legalCertCardInfoPicture = legalCertCardInfoPicture;
	}

    /**
     * Gets legal cert expired date.
     *
     * @return the legal cert expired date
     */
    public String getLegalCertExpiredDate() {
		return this.legalCertExpiredDate;
	}

    /**
     * Sets legal cert expired date.
     *
     * @param legalCertExpiredDate the legal cert expired date
     */
    public void setLegalCertExpiredDate(String legalCertExpiredDate) {
		this.legalCertExpiredDate = legalCertExpiredDate;
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
     * Gets legal cert type.
     *
     * @return the legal cert type
     */
    public String getLegalCertType() {
		return this.legalCertType;
	}

    /**
     * Sets legal cert type.
     *
     * @param legalCertType the legal cert type
     */
    public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
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
     * Gets org address.
     *
     * @return the org address
     */
    public String getOrgAddress() {
		return this.orgAddress;
	}

    /**
     * Sets org address.
     *
     * @param orgAddress the org address
     */
    public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

    /**
     * Gets org business scope.
     *
     * @return the org business scope
     */
    public String getOrgBusinessScope() {
		return this.orgBusinessScope;
	}

    /**
     * Sets org business scope.
     *
     * @param orgBusinessScope the org business scope
     */
    public void setOrgBusinessScope(String orgBusinessScope) {
		this.orgBusinessScope = orgBusinessScope;
	}

    /**
     * Gets org city.
     *
     * @return the org city
     */
    public String getOrgCity() {
		return this.orgCity;
	}

    /**
     * Sets org city.
     *
     * @param orgCity the org city
     */
    public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

    /**
     * Gets org country.
     *
     * @return the org country
     */
    public String getOrgCountry() {
		return this.orgCountry;
	}

    /**
     * Sets org country.
     *
     * @param orgCountry the org country
     */
    public void setOrgCountry(String orgCountry) {
		this.orgCountry = orgCountry;
	}

    /**
     * Gets org main cert expired date.
     *
     * @return the org main cert expired date
     */
    public String getOrgMainCertExpiredDate() {
		return this.orgMainCertExpiredDate;
	}

    /**
     * Sets org main cert expired date.
     *
     * @param orgMainCertExpiredDate the org main cert expired date
     */
    public void setOrgMainCertExpiredDate(String orgMainCertExpiredDate) {
		this.orgMainCertExpiredDate = orgMainCertExpiredDate;
	}

    /**
     * Gets org main cert no.
     *
     * @return the org main cert no
     */
    public String getOrgMainCertNo() {
		return this.orgMainCertNo;
	}

    /**
     * Sets org main cert no.
     *
     * @param orgMainCertNo the org main cert no
     */
    public void setOrgMainCertNo(String orgMainCertNo) {
		this.orgMainCertNo = orgMainCertNo;
	}

    /**
     * Gets org main cert picture.
     *
     * @return the org main cert picture
     */
    public String getOrgMainCertPicture() {
		return this.orgMainCertPicture;
	}

    /**
     * Sets org main cert picture.
     *
     * @param orgMainCertPicture the org main cert picture
     */
    public void setOrgMainCertPicture(String orgMainCertPicture) {
		this.orgMainCertPicture = orgMainCertPicture;
	}

    /**
     * Gets org name.
     *
     * @return the org name
     */
    public String getOrgName() {
		return this.orgName;
	}

    /**
     * Sets org name.
     *
     * @param orgName the org name
     */
    public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

    /**
     * Gets org province.
     *
     * @return the org province
     */
    public String getOrgProvince() {
		return this.orgProvince;
	}

    /**
     * Sets org province.
     *
     * @param orgProvince the org province
     */
    public void setOrgProvince(String orgProvince) {
		this.orgProvince = orgProvince;
	}

    /**
     * Gets org type.
     *
     * @return the org type
     */
    public String getOrgType() {
		return this.orgType;
	}

    /**
     * Sets org type.
     *
     * @param orgType the org type
     */
    public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

    /**
     * Gets register capital.
     *
     * @return the register capital
     */
    public String getRegisterCapital() {
		return this.registerCapital;
	}

    /**
     * Sets register capital.
     *
     * @param registerCapital the register capital
     */
    public void setRegisterCapital(String registerCapital) {
		this.registerCapital = registerCapital;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}

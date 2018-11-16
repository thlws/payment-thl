package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业支付宝与企业信息匹配校验服务
 *
 * @author auto create
 * @since 1.0, 2018-09-06 14:19:07
 */
public class MybankCreditUserSitememberEnterpriseMatchModel extends AlipayObject {

	private static final long serialVersionUID = 8611182671694487525L;

	/**
	 * 工商注册号，与social_credit_code字段不能同时为空
	 */
	@ApiField("business_reg_no")
	private String businessRegNo;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 站点类型，如支付宝、淘宝等
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点登录号，比如企业支付宝的手机号或邮箱
	 */
	@ApiField("site_login_id")
	private String siteLoginId;

	/**
	 * 统一社会信用代码，与business_reg_no字段不能同时为空
	 */
	@ApiField("social_credit_code")
	private String socialCreditCode;

    /**
     * Gets business reg no.
     *
     * @return the business reg no
     */
    public String getBusinessRegNo() {
		return this.businessRegNo;
	}

    /**
     * Sets business reg no.
     *
     * @param businessRegNo the business reg no
     */
    public void setBusinessRegNo(String businessRegNo) {
		this.businessRegNo = businessRegNo;
	}

    /**
     * Gets company name.
     *
     * @return the company name
     */
    public String getCompanyName() {
		return this.companyName;
	}

    /**
     * Sets company name.
     *
     * @param companyName the company name
     */
    public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    /**
     * Gets site.
     *
     * @return the site
     */
    public String getSite() {
		return this.site;
	}

    /**
     * Sets site.
     *
     * @param site the site
     */
    public void setSite(String site) {
		this.site = site;
	}

    /**
     * Gets site login id.
     *
     * @return the site login id
     */
    public String getSiteLoginId() {
		return this.siteLoginId;
	}

    /**
     * Sets site login id.
     *
     * @param siteLoginId the site login id
     */
    public void setSiteLoginId(String siteLoginId) {
		this.siteLoginId = siteLoginId;
	}

    /**
     * Gets social credit code.
     *
     * @return the social credit code
     */
    public String getSocialCreditCode() {
		return this.socialCreditCode;
	}

    /**
     * Sets social credit code.
     *
     * @param socialCreditCode the social credit code
     */
    public void setSocialCreditCode(String socialCreditCode) {
		this.socialCreditCode = socialCreditCode;
	}

}

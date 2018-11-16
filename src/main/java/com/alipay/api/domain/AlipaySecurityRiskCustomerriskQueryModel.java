package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户风险服务输出
 *
 * @author auto create
 * @since 1.0, 2018-09-06 11:58:51
 */
public class AlipaySecurityRiskCustomerriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3423997642213514499L;

	/**
	 * 用于查询银行卡号是否有风险
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 用于查询营业执照是否来自风险商户
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 用于境外银行卡号的查询（预留）
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用于传递需查询风险的身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用于查询公司名称是否来自风险公司
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 间连交易场景下，银行类合作伙伴记录的风险商户ID
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 用于查询手机号是否来自风险用户
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 查询商户风险类型时：支持以下三种：riskinfo_cert_no（身份证风险查询）,riskinfo_bank_card_no（银行卡风险查询），riskinfo_business_license_no（营业执照风险查询）
查询ISV风险类型时：支持以下二种：riskinfo_cert_no_isv（服务商法人身份证风险查询），riskinfo_business_license_no_isv（营业执照风险查询）。
营销作弊风险场景：riskinfo_marketing
先享后付保障风险场景：riskinfo_nsf
使用服务时指定查询风险类型，且一次调用可以传递多个风险类型，用英文逗号隔开。
	 */
	@ApiField("risk_type")
	private String riskType;

    /**
     * Gets bank card no.
     *
     * @return the bank card no
     */
    public String getBankCardNo() {
		return this.bankCardNo;
	}

    /**
     * Sets bank card no.
     *
     * @param bankCardNo the bank card no
     */
    public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

    /**
     * Gets business license no.
     *
     * @return the business license no
     */
    public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}

    /**
     * Sets business license no.
     *
     * @param businessLicenseNo the business license no
     */
    public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
	}

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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
     * Gets mobile no.
     *
     * @return the mobile no
     */
    public String getMobileNo() {
		return this.mobileNo;
	}

    /**
     * Sets mobile no.
     *
     * @param mobileNo the mobile no
     */
    public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

    /**
     * Gets risk type.
     *
     * @return the risk type
     */
    public String getRiskType() {
		return this.riskType;
	}

    /**
     * Sets risk type.
     *
     * @param riskType the risk type
     */
    public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}

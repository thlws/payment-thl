package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台险赠险投保申请
 *
 * @author auto create
 * @since 1.0, 2017-02-23 21:17:48
 */
public class AlipayInsSceneCouponReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 2381197258334511345L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 保险发奖凭证
	 */
	@ApiField("certificate")
	private InsCertificate certificate;

	/**
	 * 被保险人
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 市场类型;TAOBAO:淘宝平台,ANT: 蚂蚁平台
	 */
	@ApiField("market_type")
	private String marketType;

	/**
	 * 商户生成的外部业务号,必须保证唯一，幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 产品编码;由蚂蚁保险平台分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本号
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 服务场景;
propertyPaySuccess:蚂蚁物业支付成功页面
	 */
	@ApiField("service_scenario")
	private String serviceScenario;

    /**
     * Gets applicant.
     *
     * @return the applicant
     */
    public InsPerson getApplicant() {
		return this.applicant;
	}

    /**
     * Sets applicant.
     *
     * @param applicant the applicant
     */
    public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

    /**
     * Gets certificate.
     *
     * @return the certificate
     */
    public InsCertificate getCertificate() {
		return this.certificate;
	}

    /**
     * Sets certificate.
     *
     * @param certificate the certificate
     */
    public void setCertificate(InsCertificate certificate) {
		this.certificate = certificate;
	}

    /**
     * Gets insured.
     *
     * @return the insured
     */
    public InsPerson getInsured() {
		return this.insured;
	}

    /**
     * Sets insured.
     *
     * @param insured the insured
     */
    public void setInsured(InsPerson insured) {
		this.insured = insured;
	}

    /**
     * Gets market type.
     *
     * @return the market type
     */
    public String getMarketType() {
		return this.marketType;
	}

    /**
     * Sets market type.
     *
     * @param marketType the market type
     */
    public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets prod version.
     *
     * @return the prod version
     */
    public String getProdVersion() {
		return this.prodVersion;
	}

    /**
     * Sets prod version.
     *
     * @param prodVersion the prod version
     */
    public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

    /**
     * Gets service scenario.
     *
     * @return the service scenario
     */
    public String getServiceScenario() {
		return this.serviceScenario;
	}

    /**
     * Sets service scenario.
     *
     * @param serviceScenario the service scenario
     */
    public void setServiceScenario(String serviceScenario) {
		this.serviceScenario = serviceScenario;
	}

}

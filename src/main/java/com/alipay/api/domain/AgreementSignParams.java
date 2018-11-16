package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约参数，支付后签约场景使用
 *
 * @author auto create
 * @since 1.0, 2017-07-18 14:28:45
 */
public class AgreementSignParams extends AlipayObject {

	private static final long serialVersionUID = 7144758367612481237L;

	/**
	 * 商户在芝麻端申请的appId
	 */
	@ApiField("buckle_app_id")
	private String buckleAppId;

	/**
	 * 商户在芝麻端申请的merchantId
	 */
	@ApiField("buckle_merchant_id")
	private String buckleMerchantId;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。
格式规则：支持大写小写字母和数字，最长32位。
商户系统按需传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 签约营销参数，此值为json格式；具体的key需与营销约定
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 协议签约场景，商户和支付宝签约时确定。
当传入商户签约号external_agreement_no时，场景不能为默认值DEFAULT|DEFAULT。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 当前用户签约请求的协议有效周期。
整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。
目前支持的时间单位：
1. d：天
2. m：月
如果未传入，默认为长期有效。
	 */
	@ApiField("sign_validity_period")
	private String signValidityPeriod;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
取值范围：
1. PARTNER（平台商户）;
2. MERCHANT（集团商户），集团下子商户可共享用户签约内容;
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

    /**
     * Gets buckle app id.
     *
     * @return the buckle app id
     */
    public String getBuckleAppId() {
		return this.buckleAppId;
	}

    /**
     * Sets buckle app id.
     *
     * @param buckleAppId the buckle app id
     */
    public void setBuckleAppId(String buckleAppId) {
		this.buckleAppId = buckleAppId;
	}

    /**
     * Gets buckle merchant id.
     *
     * @return the buckle merchant id
     */
    public String getBuckleMerchantId() {
		return this.buckleMerchantId;
	}

    /**
     * Sets buckle merchant id.
     *
     * @param buckleMerchantId the buckle merchant id
     */
    public void setBuckleMerchantId(String buckleMerchantId) {
		this.buckleMerchantId = buckleMerchantId;
	}

    /**
     * Gets external agreement no.
     *
     * @return the external agreement no
     */
    public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}

    /**
     * Sets external agreement no.
     *
     * @param externalAgreementNo the external agreement no
     */
    public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

    /**
     * Gets external logon id.
     *
     * @return the external logon id
     */
    public String getExternalLogonId() {
		return this.externalLogonId;
	}

    /**
     * Sets external logon id.
     *
     * @param externalLogonId the external logon id
     */
    public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

    /**
     * Gets personal product code.
     *
     * @return the personal product code
     */
    public String getPersonalProductCode() {
		return this.personalProductCode;
	}

    /**
     * Sets personal product code.
     *
     * @param personalProductCode the personal product code
     */
    public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

    /**
     * Gets promo params.
     *
     * @return the promo params
     */
    public String getPromoParams() {
		return this.promoParams;
	}

    /**
     * Sets promo params.
     *
     * @param promoParams the promo params
     */
    public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
	}

    /**
     * Gets sign scene.
     *
     * @return the sign scene
     */
    public String getSignScene() {
		return this.signScene;
	}

    /**
     * Sets sign scene.
     *
     * @param signScene the sign scene
     */
    public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

    /**
     * Gets sign validity period.
     *
     * @return the sign validity period
     */
    public String getSignValidityPeriod() {
		return this.signValidityPeriod;
	}

    /**
     * Sets sign validity period.
     *
     * @param signValidityPeriod the sign validity period
     */
    public void setSignValidityPeriod(String signValidityPeriod) {
		this.signValidityPeriod = signValidityPeriod;
	}

    /**
     * Gets third party type.
     *
     * @return the third party type
     */
    public String getThirdPartyType() {
		return this.thirdPartyType;
	}

    /**
     * Sets third party type.
     *
     * @param thirdPartyType the third party type
     */
    public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

}

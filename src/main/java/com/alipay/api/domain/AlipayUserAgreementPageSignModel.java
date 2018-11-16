package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议页面签约接口
 *
 * @author auto create
 * @since 1.0, 2018-07-01 21:53:36
 */
public class AlipayUserAgreementPageSignModel extends AlipayObject {

	private static final long serialVersionUID = 7356832856333987386L;

	/**
	 * 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。
扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接schema的请求地址
	 */
	@ApiField("access_params")
	private AccessParams accessParams;

	/**
	 * 协议生效类型, 用于指定协议是立即生效还是等待商户通知再生效. 可空, 不填默认为立即生效. 
DIRECT: 立即生效.
NOTICE: 商户通知生效, 需要再次调用alipay.user.agreement.sign.effect （支付宝个人协议签约生效接口）接口推进协议生效. 
默认为DIRECT
	 */
	@ApiField("agreement_effect_type")
	private String agreementEffectType;

	/**
	 * 设备信息参数，在使用设备维度签约代扣协议时，可以传这些信息
	 */
	@ApiField("device_params")
	private DeviceParams deviceParams;

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
	 * 用户实名信息参数，包含：姓名、身份证号、签约指定uid。商户传入用户实名信息参数，支付宝会对比用户在支付宝端的实名信息。
	 */
	@ApiField("identity_params")
	private IdentityParams identityParams;

	/**
	 * 参数名：跳转商户处理url
应用场景：商户需要在签约流程中跳转到商户自己的页面做处理的场景，如获得用户授权获取实名信息等
如何获取：商户自己提供的页面地址
特殊说明：商户如果传递此参数，则会在签约流程中跳转所传递的地址，不传则不会跳转
	 */
	@ApiField("merchant_process_url")
	private String merchantProcessUrl;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 签约产品属性，json格式
	 */
	@ApiField("prod_params")
	private ProdParams prodParams;

	/**
	 * 销售产品码，商户签约的支付宝合同所对应的产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 签约营销参数，此值为json格式；具体的key需与营销约定
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 协议签约场景，商户和支付宝签约时确定，商户可咨询技术支持。
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
	 * 此参数用于传递子商户信息，目前商户代扣、海外代扣、淘旅行信用住产品支持传入该参数(销售方案中是否允许自定义子商户信息选是)；
目前支持四个key值：
sub_merchant_id (子商户id)
sub_merchant_name (子商户名称)
sub_merchant_service_name (子商户服务名称)
sub_merchant_service_description (子商户服务描述)
	 */
	@ApiField("sub_merchant")
	private String subMerchant;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
取值范围：
1. PARTNER（平台商户）
2. MERCHANT（集团商户），集团下子商户可共享用户签约内容
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/**
	 * 芝麻授权信息，针对于信用代扣签约。json格式。
	 */
	@ApiField("zm_auth_params")
	private ZmAuthParams zmAuthParams;

    /**
     * Gets access params.
     *
     * @return the access params
     */
    public AccessParams getAccessParams() {
		return this.accessParams;
	}

    /**
     * Sets access params.
     *
     * @param accessParams the access params
     */
    public void setAccessParams(AccessParams accessParams) {
		this.accessParams = accessParams;
	}

    /**
     * Gets agreement effect type.
     *
     * @return the agreement effect type
     */
    public String getAgreementEffectType() {
		return this.agreementEffectType;
	}

    /**
     * Sets agreement effect type.
     *
     * @param agreementEffectType the agreement effect type
     */
    public void setAgreementEffectType(String agreementEffectType) {
		this.agreementEffectType = agreementEffectType;
	}

    /**
     * Gets device params.
     *
     * @return the device params
     */
    public DeviceParams getDeviceParams() {
		return this.deviceParams;
	}

    /**
     * Sets device params.
     *
     * @param deviceParams the device params
     */
    public void setDeviceParams(DeviceParams deviceParams) {
		this.deviceParams = deviceParams;
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
     * Gets identity params.
     *
     * @return the identity params
     */
    public IdentityParams getIdentityParams() {
		return this.identityParams;
	}

    /**
     * Sets identity params.
     *
     * @param identityParams the identity params
     */
    public void setIdentityParams(IdentityParams identityParams) {
		this.identityParams = identityParams;
	}

    /**
     * Gets merchant process url.
     *
     * @return the merchant process url
     */
    public String getMerchantProcessUrl() {
		return this.merchantProcessUrl;
	}

    /**
     * Sets merchant process url.
     *
     * @param merchantProcessUrl the merchant process url
     */
    public void setMerchantProcessUrl(String merchantProcessUrl) {
		this.merchantProcessUrl = merchantProcessUrl;
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
     * Gets prod params.
     *
     * @return the prod params
     */
    public ProdParams getProdParams() {
		return this.prodParams;
	}

    /**
     * Sets prod params.
     *
     * @param prodParams the prod params
     */
    public void setProdParams(ProdParams prodParams) {
		this.prodParams = prodParams;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
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
     * Gets sub merchant.
     *
     * @return the sub merchant
     */
    public String getSubMerchant() {
		return this.subMerchant;
	}

    /**
     * Sets sub merchant.
     *
     * @param subMerchant the sub merchant
     */
    public void setSubMerchant(String subMerchant) {
		this.subMerchant = subMerchant;
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

    /**
     * Gets zm auth params.
     *
     * @return the zm auth params
     */
    public ZmAuthParams getZmAuthParams() {
		return this.zmAuthParams;
	}

    /**
     * Sets zm auth params.
     *
     * @param zmAuthParams the zm auth params
     */
    public void setZmAuthParams(ZmAuthParams zmAuthParams) {
		this.zmAuthParams = zmAuthParams;
	}

}

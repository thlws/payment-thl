package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人代扣协议解约接口
 *
 * @author auto create
 * @since 1.0, 2018-07-16 15:00:20
 */
public class AlipayUserAgreementUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 8418478439875393127L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ），如果传了该参数，其他参数会被忽略
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 用户的支付宝登录账号，支持邮箱或手机号码格式。本参数与alipay_user_id 不可同时为空，若都填写，则以alipay_user_id 为准。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 用户的支付宝账号对应的支付宝唯一用户号，以2088 开头的 16 位纯数字 组成;
本参数与alipay_logon_id 不可同时为空，若都填写，则以本参数为准，优先级高于alipay_logon_id。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 操作类型:
confirm（解约确认），invalid（解约作废）
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 签约协议场景，商户和支付宝签约时确定。
当传入商户签约号 external_agreement_no时，场景不能为空或默认值 DEFAULT|DEFAULT。
该值需要与系统/页面签约接口调用时传入的值保持一 致。
	 */
	@ApiField("sign_scene")
	private String signScene;

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
     * Gets agreement no.
     *
     * @return the agreement no
     */
    public String getAgreementNo() {
		return this.agreementNo;
	}

    /**
     * Sets agreement no.
     *
     * @param agreementNo the agreement no
     */
    public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
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
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
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
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于传递用户和支付宝的协议相关信息，json格式
 *
 * @author auto create
 * @since 1.0, 2018-01-10 14:56:36
 */
public class AgreementParams extends AlipayObject {

	private static final long serialVersionUID = 7572675516828338367L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 鉴权申请token，其格式和内容，由支付宝定义。在需要做支付鉴权校验时，该参数不能为空。
	 */
	@ApiField("apply_token")
	private String applyToken;

	/**
	 * 鉴权确认码，在需要做支付鉴权校验时，该参数不能为空
	 */
	@ApiField("auth_confirm_no")
	private String authConfirmNo;

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
     * Gets apply token.
     *
     * @return the apply token
     */
    public String getApplyToken() {
		return this.applyToken;
	}

    /**
     * Sets apply token.
     *
     * @param applyToken the apply token
     */
    public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}

    /**
     * Gets auth confirm no.
     *
     * @return the auth confirm no
     */
    public String getAuthConfirmNo() {
		return this.authConfirmNo;
	}

    /**
     * Sets auth confirm no.
     *
     * @param authConfirmNo the auth confirm no
     */
    public void setAuthConfirmNo(String authConfirmNo) {
		this.authConfirmNo = authConfirmNo;
	}

}

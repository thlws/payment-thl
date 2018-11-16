package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议鉴权确认接口
 *
 * @author auto create
 * @since 1.0, 2017-12-07 13:53:09
 */
public class AlipayUserAgreementAuthConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1738754178686723537L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 鉴权申请token，其格式和内容，由支付宝定义。在该接口中，商户可根据申请操作成功时返回的申请token，进行鉴权确认操作。
	 */
	@ApiField("apply_token")
	private String applyToken;

	/**
	 * 鉴权确认码
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

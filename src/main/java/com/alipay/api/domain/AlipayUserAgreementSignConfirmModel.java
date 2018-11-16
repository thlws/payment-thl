package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人协议签约验证接口
 *
 * @author auto create
 * @since 1.0, 2018-01-08 15:35:38
 */
public class AlipayUserAgreementSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1462793188873624739L;

	/**
	 * 代扣签约申请时，支付宝返回的签约申请token，商户可利用该值完成签约的确认。
	 */
	@ApiField("apply_token")
	private String applyToken;

	/**
	 * 支付宝用户的身份证后4位。
签约确认接口目前只有国际极简会校验身份证后4位。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 能唯一确认用户身份的标识号，如：手机验证码等。
	 */
	@ApiField("confirm_no")
	private String confirmNo;

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
     * Gets confirm no.
     *
     * @return the confirm no
     */
    public String getConfirmNo() {
		return this.confirmNo;
	}

    /**
     * Sets confirm no.
     *
     * @param confirmNo the confirm no
     */
    public void setConfirmNo(String confirmNo) {
		this.confirmNo = confirmNo;
	}

}

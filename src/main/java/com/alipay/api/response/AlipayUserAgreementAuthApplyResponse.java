package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.auth.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-10-25 14:00:54
 */
public class AlipayUserAgreementAuthApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1141182416151124717L;

	/** 
	 * 鉴权申请token，其格式和内容，由支付宝定义。在鉴权确认的过程中，商户可根据申请操作成功时返回的申请token，进行后续的确认操作。
	 */
	@ApiField("apply_token")
	private String applyToken;

    /**
     * Sets apply token.
     *
     * @param applyToken the apply token
     */
    public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}

    /**
     * Gets apply token.
     *
     * @return the apply token
     */
    public String getApplyToken( ) {
		return this.applyToken;
	}

}

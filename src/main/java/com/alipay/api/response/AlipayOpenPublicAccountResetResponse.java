package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.account.reset response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicAccountResetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3518199639946244312L;

	/** 
	 * 重置后的协议号，商户会员在支付宝服务窗账号中的唯一标识
	 */
	@ApiField("agreement_id")
	private String agreementId;

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId( ) {
		return this.agreementId;
	}

}

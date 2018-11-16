package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.get response.
 *
 * @author auto create
 * @since 1.0, 2018-03-07 09:25:46
 */
public class AlipayUserAccountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6436929989793221464L;

	/** 
	 * 支付宝用户账户信息
	 */
	@ApiField("alipay_account")
	private AlipayAccount alipayAccount;

    /**
     * Sets alipay account.
     *
     * @param alipayAccount the alipay account
     */
    public void setAlipayAccount(AlipayAccount alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

    /**
     * Gets alipay account.
     *
     * @return the alipay account
     */
    public AlipayAccount getAlipayAccount( ) {
		return this.alipayAccount;
	}

}

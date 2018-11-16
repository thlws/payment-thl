package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicBindAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.account.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 20:28:20
 */
public class AlipayMobileStdPublicAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8153356213916517825L;

	/** 
	 * 绑定账户列表
	 */
	@ApiListField("public_bind_accounts")
	@ApiField("public_bind_account")
	private List<PublicBindAccount> publicBindAccounts;

    /**
     * Sets public bind accounts.
     *
     * @param publicBindAccounts the public bind accounts
     */
    public void setPublicBindAccounts(List<PublicBindAccount> publicBindAccounts) {
		this.publicBindAccounts = publicBindAccounts;
	}

    /**
     * Gets public bind accounts.
     *
     * @return the public bind accounts
     */
    public List<PublicBindAccount> getPublicBindAccounts( ) {
		return this.publicBindAccounts;
	}

}

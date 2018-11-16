package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发到账户收款方模型
 *
 * @author auto create
 * @since 1.0, 2018-05-02 15:06:09
 */
public class AccPayeeInfo extends AlipayObject {

	private static final long serialVersionUID = 3819219945165624276L;

	/**
	 * 收款方电子钱包账号。
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 收款方电子钱包持有者姓名。
	 */
	@ApiField("payee_name")
	private String payeeName;

    /**
     * Gets payee account.
     *
     * @return the payee account
     */
    public String getPayeeAccount() {
		return this.payeeAccount;
	}

    /**
     * Sets payee account.
     *
     * @param payeeAccount the payee account
     */
    public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

    /**
     * Gets payee name.
     *
     * @return the payee name
     */
    public String getPayeeName() {
		return this.payeeName;
	}

    /**
     * Sets payee name.
     *
     * @param payeeName the payee name
     */
    public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

}

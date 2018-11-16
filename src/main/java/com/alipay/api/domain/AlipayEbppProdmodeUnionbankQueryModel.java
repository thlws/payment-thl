package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联行信息查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:50
 */
public class AlipayEbppProdmodeUnionbankQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3281138813614982377L;

	/**
	 * 银联编号
	 */
	@ApiField("bank_code")
	private String bankCode;

    /**
     * Gets bank code.
     *
     * @return the bank code
     */
    public String getBankCode() {
		return this.bankCode;
	}

    /**
     * Sets bank code.
     *
     * @param bankCode the bank code
     */
    public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

}

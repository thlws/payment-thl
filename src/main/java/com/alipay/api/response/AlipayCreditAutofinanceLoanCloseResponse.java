package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.loan.close response.
 *
 * @author auto create
 * @since 1.0, 2017-05-10 09:44:23
 */
public class AlipayCreditAutofinanceLoanCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4651776676159489554L;

	/** 
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("outorderno")
	private String outorderno;

    /**
     * Sets outorderno.
     *
     * @param outorderno the outorderno
     */
    public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}

    /**
     * Gets outorderno.
     *
     * @return the outorderno
     */
    public String getOutorderno( ) {
		return this.outorderno;
	}

}

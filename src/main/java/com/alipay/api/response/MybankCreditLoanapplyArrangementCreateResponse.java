package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.arrangement.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-01 20:15:36
 */
public class MybankCreditLoanapplyArrangementCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8281945525672233257L;

	/** 
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

    /**
     * Sets ar no.
     *
     * @param arNo the ar no
     */
    public void setArNo(String arNo) {
		this.arNo = arNo;
	}

    /**
     * Gets ar no.
     *
     * @return the ar no
     */
    public String getArNo( ) {
		return this.arNo;
	}

}

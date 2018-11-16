package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanar.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:23:20
 */
public class MybankCreditLoantradeLoanarCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2726155138675518453L;

	/** 
	 * 事件流水号
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

	/** 
	 * 贷款合约号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

    /**
     * Sets ev seq no.
     *
     * @param evSeqNo the ev seq no
     */
    public void setEvSeqNo(String evSeqNo) {
		this.evSeqNo = evSeqNo;
	}

    /**
     * Gets ev seq no.
     *
     * @return the ev seq no
     */
    public String getEvSeqNo( ) {
		return this.evSeqNo;
	}

    /**
     * Sets loan ar no.
     *
     * @param loanArNo the loan ar no
     */
    public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

    /**
     * Gets loan ar no.
     *
     * @return the loan ar no
     */
    public String getLoanArNo( ) {
		return this.loanArNo;
	}

}

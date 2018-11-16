package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.refund.create response.
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:31:13
 */
public class AlipayPcreditLoanRefundCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3889332698645742423L;

	/** 
	 * 受理的还款申请单号
	 */
	@ApiField("loan_repay_no")
	private String loanRepayNo;

    /**
     * Sets loan repay no.
     *
     * @param loanRepayNo the loan repay no
     */
    public void setLoanRepayNo(String loanRepayNo) {
		this.loanRepayNo = loanRepayNo;
	}

    /**
     * Gets loan repay no.
     *
     * @return the loan repay no
     */
    public String getLoanRepayNo( ) {
		return this.loanRepayNo;
	}

}

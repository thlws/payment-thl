package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanrelation.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-11 17:51:30
 */
public class MybankCreditLoantradeLoanrelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3714753464217871193L;

	/** 
	 * 是否有融资关系的标志
	 */
	@ApiField("loan_relation_flag")
	private Boolean loanRelationFlag;

    /**
     * Sets loan relation flag.
     *
     * @param loanRelationFlag the loan relation flag
     */
    public void setLoanRelationFlag(Boolean loanRelationFlag) {
		this.loanRelationFlag = loanRelationFlag;
	}

    /**
     * Gets loan relation flag.
     *
     * @return the loan relation flag
     */
    public Boolean getLoanRelationFlag( ) {
		return this.loanRelationFlag;
	}

}

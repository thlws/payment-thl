package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.prepayment.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-07-28 01:15:00
 */
public class MybankCreditSupplychainPrepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6481976525875981354L;

	/** 
	 * 预付申请单编号。
	 */
	@ApiField("prepayment_apply_no")
	private String prepaymentApplyNo;

    /**
     * Sets prepayment apply no.
     *
     * @param prepaymentApplyNo the prepayment apply no
     */
    public void setPrepaymentApplyNo(String prepaymentApplyNo) {
		this.prepaymentApplyNo = prepaymentApplyNo;
	}

    /**
     * Gets prepayment apply no.
     *
     * @return the prepayment apply no
     */
    public String getPrepaymentApplyNo( ) {
		return this.prepaymentApplyNo;
	}

}

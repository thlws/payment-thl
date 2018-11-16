package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.partner.payment.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-08-25 10:18:52
 */
public class MybankCreditLoantradePartnerPaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6677524479249555383L;

	/** 
	 * 网商内部申请单编号，外部机构根据此编号查询申请状态。
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

    /**
     * Sets in apply no.
     *
     * @param inApplyNo the in apply no
     */
    public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}

    /**
     * Gets in apply no.
     *
     * @return the in apply no
     */
    public String getInApplyNo( ) {
		return this.inApplyNo;
	}

}

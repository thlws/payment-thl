package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.guarscheme.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-06 21:34:41
 */
public class MybankCreditCreditriskGuarschemeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7262697586633719781L;

	/** 
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 可用担保额度
	 */
	@ApiField("available_amt")
	private String availableAmt;

    /**
     * Sets admit.
     *
     * @param admit the admit
     */
    public void setAdmit(Boolean admit) {
		this.admit = admit;
	}

    /**
     * Gets admit.
     *
     * @return the admit
     */
    public Boolean getAdmit( ) {
		return this.admit;
	}

    /**
     * Sets available amt.
     *
     * @param availableAmt the available amt
     */
    public void setAvailableAmt(String availableAmt) {
		this.availableAmt = availableAmt;
	}

    /**
     * Gets available amt.
     *
     * @return the available amt
     */
    public String getAvailableAmt( ) {
		return this.availableAmt;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.prepayment.cancel response.
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:29:25
 */
public class MybankCreditSupplychainPrepaymentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6156914774798122434L;

	/** 
	 * 受理事件单编号
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

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

}

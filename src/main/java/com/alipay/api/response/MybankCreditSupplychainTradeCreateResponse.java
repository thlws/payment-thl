package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.create response.
 *
 * @author auto create
 * @since 1.0, 2018-06-06 13:51:27
 */
public class MybankCreditSupplychainTradeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8665454569451564771L;

	/** 
	 * 业务事件受理的流水号，建议调用方保持此流水号，以方便后续业务处理
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

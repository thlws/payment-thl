package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.user.trade.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:30:07
 */
public class AlipayEbppInvoiceUserTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8594995586435249486L;

	/** 
	 * 发票管家发票交易信息
	 */
	@ApiField("trade_info")
	private InvoiceTradeInfo tradeInfo;

    /**
     * Sets trade info.
     *
     * @param tradeInfo the trade info
     */
    public void setTradeInfo(InvoiceTradeInfo tradeInfo) {
		this.tradeInfo = tradeInfo;
	}

    /**
     * Gets trade info.
     *
     * @return the trade info
     */
    public InvoiceTradeInfo getTradeInfo( ) {
		return this.tradeInfo;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受理外汇交易请求
 *
 * @author auto create
 * @since 1.0, 2018-04-13 17:35:02
 */
public class AlipayAccountExrateTraderequestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7825317343124355777L;

	/**
	 * 交易请求对象内容
	 */
	@ApiField("trade_request")
	private TradeRequestVO tradeRequest;

    /**
     * Gets trade request.
     *
     * @return the trade request
     */
    public TradeRequestVO getTradeRequest() {
		return this.tradeRequest;
	}

    /**
     * Sets trade request.
     *
     * @param tradeRequest the trade request
     */
    public void setTradeRequest(TradeRequestVO tradeRequest) {
		this.tradeRequest = tradeRequest;
	}

}

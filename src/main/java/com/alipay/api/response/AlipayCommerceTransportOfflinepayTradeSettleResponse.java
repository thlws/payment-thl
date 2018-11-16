package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayOfflineTradeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.trade.settle response.
 *
 * @author auto create
 * @since 1.0, 2018-05-07 17:49:12
 */
public class AlipayCommerceTransportOfflinepayTradeSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 5198999674574665599L;

	/** 
	 * 支付宝脱机交易处理结果列表
	 */
	@ApiListField("result_list")
	@ApiField("alipay_offline_trade_result")
	private List<AlipayOfflineTradeResult> resultList;

    /**
     * Sets result list.
     *
     * @param resultList the result list
     */
    public void setResultList(List<AlipayOfflineTradeResult> resultList) {
		this.resultList = resultList;
	}

    /**
     * Gets result list.
     *
     * @return the result list
     */
    public List<AlipayOfflineTradeResult> getResultList( ) {
		return this.resultList;
	}

}

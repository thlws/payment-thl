package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.trade.subscribe response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:33:06
 */
public class KoubeiMarketingMallTradeSubscribeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6192197482758724574L;

	/** 
	 * 申请工单id（用以查询申请工单状态）
	 */
	@ApiField("order_flow_id")
	private String orderFlowId;

    /**
     * Sets order flow id.
     *
     * @param orderFlowId the order flow id
     */
    public void setOrderFlowId(String orderFlowId) {
		this.orderFlowId = orderFlowId;
	}

    /**
     * Gets order flow id.
     *
     * @return the order flow id
     */
    public String getOrderFlowId( ) {
		return this.orderFlowId;
	}

}

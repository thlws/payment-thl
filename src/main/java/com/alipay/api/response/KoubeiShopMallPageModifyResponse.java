package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.page.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:14
 */
public class KoubeiShopMallPageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6645856227856321647L;

	/** 
	 * 工单id（用以查询创建，修改操作的审核状态）
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

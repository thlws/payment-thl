package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈首页地址变更工单审核状态查询
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:39
 */
public class KoubeiShopMallAuditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2845852542255988925L;

	/**
	 * koubei.shop.mall.page.modify(商圈主页地址创建修改接口)中 返回的工单id
	 */
	@ApiField("order_flow_id")
	private String orderFlowId;

    /**
     * Gets order flow id.
     *
     * @return the order flow id
     */
    public String getOrderFlowId() {
		return this.orderFlowId;
	}

    /**
     * Sets order flow id.
     *
     * @param orderFlowId the order flow id
     */
    public void setOrderFlowId(String orderFlowId) {
		this.orderFlowId = orderFlowId;
	}

}

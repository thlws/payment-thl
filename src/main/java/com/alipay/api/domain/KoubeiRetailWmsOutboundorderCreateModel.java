package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建出库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:09
 */
public class KoubeiRetailWmsOutboundorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3828332875231177964L;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 出库通知单货品明细列表
	 */
	@ApiListField("order_lines")
	@ApiField("outbound_order_line")
	private List<OutboundOrderLine> orderLines;

	/**
	 * 出库通知单主体
	 */
	@ApiField("outbound_order")
	private OutboundOrder outboundOrder;

    /**
     * Gets operate context.
     *
     * @return the operate context
     */
    public OperateContext getOperateContext() {
		return this.operateContext;
	}

    /**
     * Sets operate context.
     *
     * @param operateContext the operate context
     */
    public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

    /**
     * Gets order lines.
     *
     * @return the order lines
     */
    public List<OutboundOrderLine> getOrderLines() {
		return this.orderLines;
	}

    /**
     * Sets order lines.
     *
     * @param orderLines the order lines
     */
    public void setOrderLines(List<OutboundOrderLine> orderLines) {
		this.orderLines = orderLines;
	}

    /**
     * Gets outbound order.
     *
     * @return the outbound order
     */
    public OutboundOrder getOutboundOrder() {
		return this.outboundOrder;
	}

    /**
     * Sets outbound order.
     *
     * @param outboundOrder the outbound order
     */
    public void setOutboundOrder(OutboundOrder outboundOrder) {
		this.outboundOrder = outboundOrder;
	}

}

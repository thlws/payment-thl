package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方的订单退款明细：包括服务号和单个服务的退款金额
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:30:03
 */
public class OrderRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 2252584648948921667L;

	/**
	 * 服务订单的退款金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 服务订单号，当商家退款时，可能包含多个服务订单
	 */
	@ApiField("service_order_no")
	private String serviceOrderNo;

    /**
     * Gets refund amount.
     *
     * @return the refund amount
     */
    public String getRefundAmount() {
		return this.refundAmount;
	}

    /**
     * Sets refund amount.
     *
     * @param refundAmount the refund amount
     */
    public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

    /**
     * Gets service order no.
     *
     * @return the service order no
     */
    public String getServiceOrderNo() {
		return this.serviceOrderNo;
	}

    /**
     * Sets service order no.
     *
     * @param serviceOrderNo the service order no
     */
    public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo;
	}

}

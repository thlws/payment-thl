package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.deposit.order.add response.
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:44
 */
public class AlipayEcardEduDepositOrderAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3718137495336711262L;

	/** 
	 * 支付申请流水号
	 */
	@ApiField("order_no")
	private String orderNo;

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

}

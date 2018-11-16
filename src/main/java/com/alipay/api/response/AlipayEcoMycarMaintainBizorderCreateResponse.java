package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.bizorder.create response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:27:37
 */
public class AlipayEcoMycarMaintainBizorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6568967383856754336L;

	/** 
	 * 业务订单编号，规则28位；
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

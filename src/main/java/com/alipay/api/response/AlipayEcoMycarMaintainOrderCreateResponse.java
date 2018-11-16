package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.order.create response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:50
 */
public class AlipayEcoMycarMaintainOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3412175692217591471L;

	/** 
	 * 业务订单编号，规则28位；yyMMddHHmmss&#160;+&#160;&#160;行业标识3位+模块标识2位&#160;+uid（后六位）&#160;+序列值（5位）
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.freedeposit.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-06-28 18:00:00
 */
public class ZhimaCreditEpFreedepositInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3232394798848948291L;

	/** 
	 * 免押额度业务流水号，每次业务唯一。
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

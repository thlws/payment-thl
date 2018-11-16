package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品交易查询接口
 *
 * @author auto create
 * @since 1.0, 2018-08-19 23:31:33
 */
public class KoubeiTradeItemorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8726274532569453637L;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}

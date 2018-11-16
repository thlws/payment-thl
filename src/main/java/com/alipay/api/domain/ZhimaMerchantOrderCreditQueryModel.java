package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用租订单信息查询
 *
 * @author auto create
 * @since 1.0, 2018-05-17 20:03:33
 */
public class ZhimaMerchantOrderCreditQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4845144393337944732L;

	/**
	 * 外部订单号,包含字母、数字、下划线，调用方需要保证订单号唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 芝麻订单号
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets zm order no.
     *
     * @return the zm order no
     */
    public String getZmOrderNo() {
		return this.zmOrderNo;
	}

    /**
     * Sets zm order no.
     *
     * @param zmOrderNo the zm order no
     */
    public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}

}

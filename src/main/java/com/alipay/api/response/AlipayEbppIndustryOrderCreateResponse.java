package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.order.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:37
 */
public class AlipayEbppIndustryOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4449429693514289776L;

	/** 
	 * 扩展属性，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 支付宝的业务订单号，具有唯一性。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 输出机构的业务流水号，需要保证唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField( ) {
		return this.extendField;
	}

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

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}

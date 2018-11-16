package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.refund response.
 *
 * @author auto create
 * @since 1.0, 2017-11-29 16:53:15
 */
public class AlipayEbppBillRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3881195658288179381L;

	/** 
	 * 回传支付宝流水号。
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/** 
	 * 扩展字段，一系列键值对，示例只是个形式，具体的Key-Value需要根据具体业务另行约定。
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 回传ISV流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * ACCEPTED：退款请求被接受
REJECTED：退款请求被驳回
本接口的业务逻辑具备幂等性，一旦拿到确定的结果ACCEPTED/REJECTED，再重试是没有意义的。
	 */
	@ApiField("result")
	private String result;

    /**
     * Sets alipay bill no.
     *
     * @param alipayBillNo the alipay bill no
     */
    public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}

    /**
     * Gets alipay bill no.
     *
     * @return the alipay bill no
     */
    public String getAlipayBillNo( ) {
		return this.alipayBillNo;
	}

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

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

}

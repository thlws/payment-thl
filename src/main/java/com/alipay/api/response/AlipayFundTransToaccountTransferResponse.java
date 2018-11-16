package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.toaccount.transfer response.
 *
 * @author auto create
 * @since 1.0, 2018-09-06 14:20:01
 */
public class AlipayFundTransToaccountTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4693511879296651773L;

	/** 
	 * 支付宝转账单据号，成功一定返回，失败可能不返回也可能返回。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户转账唯一订单号：发起转账来源方定义的转账单据号。请求时对应的参数，原样返回。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付时间：格式为yyyy-MM-dd HH:mm:ss，仅转账成功返回。
	 */
	@ApiField("pay_date")
	private String payDate;

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId( ) {
		return this.orderId;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
	}

    /**
     * Sets pay date.
     *
     * @param payDate the pay date
     */
    public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

    /**
     * Gets pay date.
     *
     * @return the pay date
     */
    public String getPayDate( ) {
		return this.payDate;
	}

}

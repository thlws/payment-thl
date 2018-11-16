package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.tobank.transfer response.
 *
 * @author auto create
 * @since 1.0, 2018-09-11 11:45:00
 */
public class AlipayFundTransTobankTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 1796161137285415745L;

	/** 
	 * 预计到账时间，格式为yyyy-MM-ddHH:mm:ss，转账受理失败不返回。
仅在进入提现流程时提供。
请求正在等待处理时将不返回此值。
此参数为预计时间，可能与实际到账时间有较大误差，不能作为实际到账时间使用，仅供参考用途。
	 */
	@ApiField("arrival_time_end")
	private String arrivalTimeEnd;

	/** 
	 * 支付宝转账单据号，成功一定返回，失败可能不返回也可能返回。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 发起转账来源方定义的转账单据号。
请求时对应的参数，原样返回。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Sets arrival time end.
     *
     * @param arrivalTimeEnd the arrival time end
     */
    public void setArrivalTimeEnd(String arrivalTimeEnd) {
		this.arrivalTimeEnd = arrivalTimeEnd;
	}

    /**
     * Gets arrival time end.
     *
     * @return the arrival time end
     */
    public String getArrivalTimeEnd( ) {
		return this.arrivalTimeEnd;
	}

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

}

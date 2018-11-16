package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时到账批量退款查询接口
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:39
 */
public class AlipayTradeBatchRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3378492769642196641L;

	/**
	 * 商户请求批量退款时传递的批次号。
trade_no和batch_no不能同时为空
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 退款明细的支付宝交易号。
trade_no和batch_no不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

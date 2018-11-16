package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.refund response.
 *
 * @author auto create
 * @since 1.0, 2018-08-08 12:05:00
 */
public class AlipayTradeBatchRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 2865687533624754779L;

	/** 
	 * 请求的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo( ) {
		return this.batchNo;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.batch.transfer response.
 *
 * @author auto create
 * @since 1.0, 2018-05-21 20:55:00
 */
public class AlipayFundBatchTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8449963678667734532L;

	/** 
	 * 商户请求的批次流水号，同请求中的"batch_no"。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 支付宝系统内部批次请求id。
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

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

    /**
     * Sets batch trans id.
     *
     * @param batchTransId the batch trans id
     */
    public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}

    /**
     * Gets batch trans id.
     *
     * @return the batch trans id
     */
    public String getBatchTransId( ) {
		return this.batchTransId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.batch.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-19 11:25:00
 */
public class AlipayFundTransAacollectBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2354972118629999548L;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 批次随机batchToken
	 */
	@ApiField("batch_token")
	private String batchToken;

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
     * Sets batch token.
     *
     * @param batchToken the batch token
     */
    public void setBatchToken(String batchToken) {
		this.batchToken = batchToken;
	}

    /**
     * Gets batch token.
     *
     * @return the batch token
     */
    public String getBatchToken( ) {
		return this.batchToken;
	}

}

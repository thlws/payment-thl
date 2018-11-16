package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aftscvpay.transaction.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 10:40:00
 */
public class AlipayMsaasMediarecogAftscvpayTransactionInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4165623499539324642L;

	/** 
	 * 处理结果
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 云平台请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("transaction_id")
	private String transactionId;

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

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId( ) {
		return this.transactionId;
	}

}

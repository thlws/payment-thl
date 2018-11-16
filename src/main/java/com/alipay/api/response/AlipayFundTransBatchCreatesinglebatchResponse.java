package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.batch.createsinglebatch response.
 *
 * @author auto create
 * @since 1.0, 2017-02-22 15:55:24
 */
public class AlipayFundTransBatchCreatesinglebatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4358327752471685654L;

	/** 
	 * 所创建成功后的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 调用方传入的ext_param，透传回去
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * token，每个批次对应一个token，每次调用方进行查询的时候都要使用批次号和token进行组合查询
	 */
	@ApiField("token")
	private String token;

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
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam( ) {
		return this.extParam;
	}

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken( ) {
		return this.token;
	}

}

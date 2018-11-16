package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdataservice.unidata.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-26 16:20:03
 */
public class AlipayZdataserviceUnidataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4176346484474555924L;

	/** 
	 * 查询结果集，统一用string方式返回
	 */
	@ApiField("query_result")
	private String queryResult;

	/** 
	 * 查询是否成功具体描述
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 查询是否成功
	 */
	@ApiField("success")
	private String success;

    /**
     * Sets query result.
     *
     * @param queryResult the query result
     */
    public void setQueryResult(String queryResult) {
		this.queryResult = queryResult;
	}

    /**
     * Gets query result.
     *
     * @return the query result
     */
    public String getQueryResult( ) {
		return this.queryResult;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(String success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public String getSuccess( ) {
		return this.success;
	}

}

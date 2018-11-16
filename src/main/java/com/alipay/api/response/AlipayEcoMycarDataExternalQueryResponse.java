package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.data.external.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-06 20:18:29
 */
public class AlipayEcoMycarDataExternalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5415198848562214997L;

	/** 
	 * 30
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/** 
	 * outter_response
	 */
	@ApiField("query_result")
	private String queryResult;

    /**
     * Sets external system name.
     *
     * @param externalSystemName the external system name
     */
    public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}

    /**
     * Gets external system name.
     *
     * @return the external system name
     */
    public String getExternalSystemName( ) {
		return this.externalSystemName;
	}

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

}

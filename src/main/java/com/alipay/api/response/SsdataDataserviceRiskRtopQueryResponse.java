package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.rtop.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-09 13:25:00
 */
public class SsdataDataserviceRiskRtopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7196433966635591194L;

	/** 
	 * 查询结果+蚁盾风控大脑，监管科技平台查询后端ssdataprod应用的返回数据
	 */
	@ApiField("query_result")
	private String queryResult;

	/** 
	 * 调用是否成功标识
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * unqiue_id+业务唯一识别码traceId
	 */
	@ApiField("unique_id")
	private String uniqueId;

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
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId( ) {
		return this.uniqueId;
	}

}

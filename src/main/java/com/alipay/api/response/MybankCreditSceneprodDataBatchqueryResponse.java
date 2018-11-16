package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneProdDataQueryResultDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.data.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:39:46
 */
public class MybankCreditSceneprodDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6735511855125941513L;

	/** 
	 * 订单数据查询的返回值。通过列表方式批量返回机构的订单查询数据。通过系统控制返回的数据中不包含客户的敏感信息。
	 */
	@ApiListField("result_data")
	@ApiField("scene_prod_data_query_result_detail")
	private List<SceneProdDataQueryResultDetail> resultData;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets result data.
     *
     * @param resultData the result data
     */
    public void setResultData(List<SceneProdDataQueryResultDetail> resultData) {
		this.resultData = resultData;
	}

    /**
     * Gets result data.
     *
     * @return the result data
     */
    public List<SceneProdDataQueryResultDetail> getResultData( ) {
		return this.resultData;
	}

    /**
     * Sets retry.
     *
     * @param retry the retry
     */
    public void setRetry(String retry) {
		this.retry = retry;
	}

    /**
     * Gets retry.
     *
     * @return the retry
     */
    public String getRetry( ) {
		return this.retry;
	}

    /**
     * Sets trace id.
     *
     * @param traceId the trace id
     */
    public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

    /**
     * Gets trace id.
     *
     * @return the trace id
     */
    public String getTraceId( ) {
		return this.traceId;
	}

}

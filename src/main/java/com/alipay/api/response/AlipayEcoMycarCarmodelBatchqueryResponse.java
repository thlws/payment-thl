package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.carmodel.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:52:28
 */
public class AlipayEcoMycarCarmodelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3813846859588782578L;

	/** 
	 * 以下是对查询结果query_result：查询品牌信息返回的json格式的品牌信息列表中字段属性的详细描述说明；查询车系信息返回的json格式的车系信息列表中字段属性的详细描述说明；查询车型信息返回的json格式的车型信息列表中字段属性的详细描述说明。
	 */
	@ApiField("query_result")
	private QueryResult queryResult;

	/** 
	 * 查询类型，接口通过此参数判断本次请求是查询品牌信息还是车型信息等，brands（查询品牌），series（查询车系），company(厂商)，models（查询车型）
	 */
	@ApiField("query_type")
	private String queryType;

    /**
     * Sets query result.
     *
     * @param queryResult the query result
     */
    public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

    /**
     * Gets query result.
     *
     * @return the query result
     */
    public QueryResult getQueryResult( ) {
		return this.queryResult;
	}

    /**
     * Sets query type.
     *
     * @param queryType the query type
     */
    public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

    /**
     * Gets query type.
     *
     * @return the query type
     */
    public String getQueryType( ) {
		return this.queryType;
	}

}

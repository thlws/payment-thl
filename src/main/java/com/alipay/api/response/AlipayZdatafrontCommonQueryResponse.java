package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.common.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-21 11:14:39
 */
public class AlipayZdatafrontCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1278174314934962189L;

	/** 
	 * 数据的时间戳：
如果fromCache=false,timestamp就是从外部返回的数据时间，如果外部返回的数据没有时间字段，就以系统取到的时间；
如果fromCache=true，timestamp就是从cache中获取的数据时间
	 */
	@ApiField("cache_timestamp")
	private Long cacheTimestamp;

	/** 
	 * 数据结果集，统一按照String类型返回
	 */
	@ApiField("values")
	private String values;

    /**
     * Sets cache timestamp.
     *
     * @param cacheTimestamp the cache timestamp
     */
    public void setCacheTimestamp(Long cacheTimestamp) {
		this.cacheTimestamp = cacheTimestamp;
	}

    /**
     * Gets cache timestamp.
     *
     * @return the cache timestamp
     */
    public Long getCacheTimestamp( ) {
		return this.cacheTimestamp;
	}

    /**
     * Sets values.
     *
     * @param values the values
     */
    public void setValues(String values) {
		this.values = values;
	}

    /**
     * Gets values.
     *
     * @return the values
     */
    public String getValues( ) {
		return this.values;
	}

}

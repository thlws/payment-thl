package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.crowd.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:55:14
 */
public class AlipayOpenPublicGroupCrowdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4614269519374824525L;

	/** 
	 * 分组圈出的人群数量
	 */
	@ApiField("count")
	private String count;

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(String count) {
		this.count = count;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public String getCount( ) {
		return this.count;
	}

}

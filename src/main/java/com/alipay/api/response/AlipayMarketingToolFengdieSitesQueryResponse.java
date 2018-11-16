package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSitesQueryRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:16:00
 */
public class AlipayMarketingToolFengdieSitesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2277221464614548327L;

	/** 
	 * 站点查询返回值
	 */
	@ApiField("data")
	private FengdieSitesQueryRespModel data;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FengdieSitesQueryRespModel data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public FengdieSitesQueryRespModel getData( ) {
		return this.data;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieActivityCreateModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:55
 */
public class AlipayMarketingToolFengdieSitesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6522992364444451374L;

	/** 
	 * 创建站点的返回值模型
	 */
	@ApiField("data")
	private FengdieActivityCreateModel data;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FengdieActivityCreateModel data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public FengdieActivityCreateModel getData( ) {
		return this.data;
	}

}

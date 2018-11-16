package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdiePreviewQueryRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.preview.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 10:14:55
 */
public class AlipayMarketingToolFengdiePreviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7372788814773885847L;

	/** 
	 * 站点页面预览数据返回值
	 */
	@ApiField("data")
	private FengdiePreviewQueryRespModel data;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FengdiePreviewQueryRespModel data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public FengdiePreviewQueryRespModel getData( ) {
		return this.data;
	}

}

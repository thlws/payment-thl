package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieTemplateListRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.template.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:06
 */
public class AlipayMarketingToolFengdieTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2614517757827385441L;

	/** 
	 * 模板详情列表
	 */
	@ApiField("data")
	private FengdieTemplateListRespModel data;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FengdieTemplateListRespModel data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public FengdieTemplateListRespModel getData( ) {
		return this.data;
	}

}

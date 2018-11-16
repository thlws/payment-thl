package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.create response.
 *
 * @author auto create
 * @since 1.0, 2018-09-07 15:35:00
 */
public class AlipayMarketingCardTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4357587396298987245L;

	/** 
	 * 支付宝卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId( ) {
		return this.templateId;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McardTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-16 15:34:04
 */
public class AlipayMarketingCardTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5282977953116572971L;

	/** 
	 * 会员卡模板基本信息
	 */
	@ApiListField("mcard_template")
	@ApiField("mcard_template")
	private List<McardTemplate> mcardTemplate;

	/** 
	 * 会员卡模板总数
	 */
	@ApiField("template_total")
	private Long templateTotal;

    /**
     * Sets mcard template.
     *
     * @param mcardTemplate the mcard template
     */
    public void setMcardTemplate(List<McardTemplate> mcardTemplate) {
		this.mcardTemplate = mcardTemplate;
	}

    /**
     * Gets mcard template.
     *
     * @return the mcard template
     */
    public List<McardTemplate> getMcardTemplate( ) {
		return this.mcardTemplate;
	}

    /**
     * Sets template total.
     *
     * @param templateTotal the template total
     */
    public void setTemplateTotal(Long templateTotal) {
		this.templateTotal = templateTotal;
	}

    /**
     * Gets template total.
     *
     * @return the template total
     */
    public Long getTemplateTotal( ) {
		return this.templateTotal;
	}

}

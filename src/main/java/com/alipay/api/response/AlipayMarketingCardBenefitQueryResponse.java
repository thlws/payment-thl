package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McardTemplateBenefitQuery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingCardBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2431147527337146199L;

	/** 
	 * 会员卡模板外部权益列表
	 */
	@ApiListField("mcard_template_benefit_query")
	@ApiField("mcard_template_benefit_query")
	private List<McardTemplateBenefitQuery> mcardTemplateBenefitQuery;

    /**
     * Sets mcard template benefit query.
     *
     * @param mcardTemplateBenefitQuery the mcard template benefit query
     */
    public void setMcardTemplateBenefitQuery(List<McardTemplateBenefitQuery> mcardTemplateBenefitQuery) {
		this.mcardTemplateBenefitQuery = mcardTemplateBenefitQuery;
	}

    /**
     * Gets mcard template benefit query.
     *
     * @return the mcard template benefit query
     */
    public List<McardTemplateBenefitQuery> getMcardTemplateBenefitQuery( ) {
		return this.mcardTemplateBenefitQuery;
	}

}

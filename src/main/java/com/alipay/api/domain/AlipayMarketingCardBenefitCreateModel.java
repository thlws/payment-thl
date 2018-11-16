package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益创建
 *
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:35
 */
public class AlipayMarketingCardBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5868256851131818264L;

	/**
	 * 会员卡模板外部权益
	 */
	@ApiField("mcard_template_benefit")
	private McardTemplateBenefit mcardTemplateBenefit;

    /**
     * Gets mcard template benefit.
     *
     * @return the mcard template benefit
     */
    public McardTemplateBenefit getMcardTemplateBenefit() {
		return this.mcardTemplateBenefit;
	}

    /**
     * Sets mcard template benefit.
     *
     * @param mcardTemplateBenefit the mcard template benefit
     */
    public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
		this.mcardTemplateBenefit = mcardTemplateBenefit;
	}

}

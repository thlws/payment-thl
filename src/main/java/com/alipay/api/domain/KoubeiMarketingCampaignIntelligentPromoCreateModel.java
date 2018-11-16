package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销方案创建
 *
 * @author auto create
 * @since 1.0, 2018-01-18 14:43:41
 */
public class KoubeiMarketingCampaignIntelligentPromoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7434349764812219474L;

	/**
	 * 创建营销方案的上下文信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 智能营销活动信息
	 */
	@ApiField("promo")
	private IntelligentPromo promo;

    /**
     * Gets operator context.
     *
     * @return the operator context
     */
    public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}

    /**
     * Sets operator context.
     *
     * @param operatorContext the operator context
     */
    public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets promo.
     *
     * @return the promo
     */
    public IntelligentPromo getPromo() {
		return this.promo;
	}

    /**
     * Sets promo.
     *
     * @param promo the promo
     */
    public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}

}

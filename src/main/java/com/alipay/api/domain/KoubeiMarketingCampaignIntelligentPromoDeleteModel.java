package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销活动下架
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:02:06
 */
public class KoubeiMarketingCampaignIntelligentPromoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7317324526682943148L;

	/**
	 * 操作下架的操作人信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 智能营销活动的id
	 */
	@ApiField("promo_id")
	private String promoId;

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
     * Gets promo id.
     *
     * @return the promo id
     */
    public String getPromoId() {
		return this.promoId;
	}

    /**
     * Sets promo id.
     *
     * @param promoId the promo id
     */
    public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

}

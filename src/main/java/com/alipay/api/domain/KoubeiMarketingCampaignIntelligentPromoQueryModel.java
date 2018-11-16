package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 只能营销方案详情查询
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:03:01
 */
public class KoubeiMarketingCampaignIntelligentPromoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3786493533114785742L;

	/**
	 * 操作人员上下文
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 外部业务id，请保持足够复杂。主要为了定位数据来源
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 智能营销活动id
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

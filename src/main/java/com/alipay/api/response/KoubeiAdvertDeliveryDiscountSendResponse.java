package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.send response.
 *
 * @author auto create
 * @since 1.0, 2018-07-31 20:48:04
 */
public class KoubeiAdvertDeliveryDiscountSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7875727253553437595L;

	/** 
	 * 权益详细信息：
partnerId：商户ID（用于打开手机钱包券详情）
	 */
	@ApiField("benefit_detail")
	private String benefitDetail;

	/** 
	 * 广告id对应的权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

    /**
     * Sets benefit detail.
     *
     * @param benefitDetail the benefit detail
     */
    public void setBenefitDetail(String benefitDetail) {
		this.benefitDetail = benefitDetail;
	}

    /**
     * Gets benefit detail.
     *
     * @return the benefit detail
     */
    public String getBenefitDetail( ) {
		return this.benefitDetail;
	}

    /**
     * Sets benefit id.
     *
     * @param benefitId the benefit id
     */
    public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

    /**
     * Gets benefit id.
     *
     * @return the benefit id
     */
    public String getBenefitId( ) {
		return this.benefitId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.coupon.template.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-05 10:10:00
 */
public class AlipayMarketingCouponTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2619479841235222333L;

	/** 
	 * 模板支付确认链接
	 */
	@ApiField("confirm_uri")
	private String confirmUri;

	/** 
	 * 资金订单号，模板支付时需要
	 */
	@ApiField("fund_order_no")
	private String fundOrderNo;

	/** 
	 * 红包模板ID
	 */
	@ApiField("template_id")
	private String templateId;

    /**
     * Sets confirm uri.
     *
     * @param confirmUri the confirm uri
     */
    public void setConfirmUri(String confirmUri) {
		this.confirmUri = confirmUri;
	}

    /**
     * Gets confirm uri.
     *
     * @return the confirm uri
     */
    public String getConfirmUri( ) {
		return this.confirmUri;
	}

    /**
     * Sets fund order no.
     *
     * @param fundOrderNo the fund order no
     */
    public void setFundOrderNo(String fundOrderNo) {
		this.fundOrderNo = fundOrderNo;
	}

    /**
     * Gets fund order no.
     *
     * @return the fund order no
     */
    public String getFundOrderNo( ) {
		return this.fundOrderNo;
	}

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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:27
 */
public class AlipayMarketingCampaignCashCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1866466972776677664L;

	/** 
	 * 生成的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/** 
	 * 原始活动号,商户排查问题时提供的活动依据
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	/** 
	 * 活动创建后的付款链接，返回的是urlencode编码后的字符串。需要先进行urldecode解码，然后在浏览器中进行访问，会先进行支付宝登录引导，然后商户进行付款。
	 */
	@ApiField("pay_url")
	private String payUrl;

    /**
     * Sets crowd no.
     *
     * @param crowdNo the crowd no
     */
    public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

    /**
     * Gets crowd no.
     *
     * @return the crowd no
     */
    public String getCrowdNo( ) {
		return this.crowdNo;
	}

    /**
     * Sets origin crowd no.
     *
     * @param originCrowdNo the origin crowd no
     */
    public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}

    /**
     * Gets origin crowd no.
     *
     * @return the origin crowd no
     */
    public String getOriginCrowdNo( ) {
		return this.originCrowdNo;
	}

    /**
     * Sets pay url.
     *
     * @param payUrl the pay url
     */
    public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

    /**
     * Gets pay url.
     *
     * @return the pay url
     */
    public String getPayUrl( ) {
		return this.payUrl;
	}

}

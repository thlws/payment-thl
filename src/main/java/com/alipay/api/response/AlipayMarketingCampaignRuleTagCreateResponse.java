package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.tag.create response.
 *
 * @author auto create
 * @since 1.0, 2017-02-22 20:02:42
 */
public class AlipayMarketingCampaignRuleTagCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2295999361526569591L;

	/** 
	 * 自定义标签id（创建自定义规则时提供）
	 */
	@ApiField("customertag")
	private String customertag;

    /**
     * Sets customertag.
     *
     * @param customertag the customertag
     */
    public void setCustomertag(String customertag) {
		this.customertag = customertag;
	}

    /**
     * Gets customertag.
     *
     * @return the customertag
     */
    public String getCustomertag( ) {
		return this.customertag;
	}

}

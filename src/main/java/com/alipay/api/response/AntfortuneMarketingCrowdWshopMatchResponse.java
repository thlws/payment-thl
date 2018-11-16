package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.crowd.wshop.match response.
 *
 * @author auto create
 * @since 1.0, 2017-08-11 17:34:49
 */
public class AntfortuneMarketingCrowdWshopMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1385766133153473136L;

	/** 
	 * 用户是否匹配人群，枚举值：true/false
	 */
	@ApiField("match_result")
	private Boolean matchResult;

    /**
     * Sets match result.
     *
     * @param matchResult the match result
     */
    public void setMatchResult(Boolean matchResult) {
		this.matchResult = matchResult;
	}

    /**
     * Gets match result.
     *
     * @return the match result
     */
    public Boolean getMatchResult( ) {
		return this.matchResult;
	}

}

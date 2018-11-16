package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoxCrowdMatchModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antlbs.crowd.match response.
 *
 * @author auto create
 * @since 1.0, 2018-07-16 17:30:00
 */
public class AlipayDataDataserviceAntlbsCrowdMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 8233855348924728518L;

	/** 
	 * 匹配结果，入参中每个客群码都会返回是否匹配，即使该客群不存在
	 */
	@ApiListField("match_result")
	@ApiField("promox_crowd_match_model")
	private List<PromoxCrowdMatchModel> matchResult;

    /**
     * Sets match result.
     *
     * @param matchResult the match result
     */
    public void setMatchResult(List<PromoxCrowdMatchModel> matchResult) {
		this.matchResult = matchResult;
	}

    /**
     * Gets match result.
     *
     * @return the match result
     */
    public List<PromoxCrowdMatchModel> getMatchResult( ) {
		return this.matchResult;
	}

}

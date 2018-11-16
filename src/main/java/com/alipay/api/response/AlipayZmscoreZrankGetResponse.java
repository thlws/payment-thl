package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayZmScoreZrankResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zmscore.zrank.get response.
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:27:38
 */
public class AlipayZmscoreZrankGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7641773426183153867L;

	/** 
	 * 芝麻分分段
	 */
	@ApiField("zm_score_zrank")
	private AlipayZmScoreZrankResult zmScoreZrank;

    /**
     * Sets zm score zrank.
     *
     * @param zmScoreZrank the zm score zrank
     */
    public void setZmScoreZrank(AlipayZmScoreZrankResult zmScoreZrank) {
		this.zmScoreZrank = zmScoreZrank;
	}

    /**
     * Gets zm score zrank.
     *
     * @return the zm score zrank
     */
    public AlipayZmScoreZrankResult getZmScoreZrank( ) {
		return this.zmScoreZrank;
	}

}

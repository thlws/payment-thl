package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliTrustScore;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.score.get response.
 *
 * @author auto create
 * @since 1.0, 2016-01-04 10:16:11
 */
public class AlipayTrustUserScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8425438129996721184L;

	/** 
	 * 芝麻信用通过模型计算出的该用户的芝麻信用评分
	 */
	@ApiField("ali_trust_score")
	private AliTrustScore aliTrustScore;

    /**
     * Sets ali trust score.
     *
     * @param aliTrustScore the ali trust score
     */
    public void setAliTrustScore(AliTrustScore aliTrustScore) {
		this.aliTrustScore = aliTrustScore;
	}

    /**
     * Gets ali trust score.
     *
     * @return the ali trust score
     */
    public AliTrustScore getAliTrustScore( ) {
		return this.aliTrustScore;
	}

}

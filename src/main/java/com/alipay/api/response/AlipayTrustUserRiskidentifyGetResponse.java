package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliTrustRiskIdentify;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.riskidentify.get response.
 *
 * @author auto create
 * @since 1.0, 2016-01-04 10:16:04
 */
public class AlipayTrustUserRiskidentifyGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1443851873297785213L;

	/** 
	 * 行业关注名单识别结果
	 */
	@ApiField("ali_trust_risk_identify")
	private AliTrustRiskIdentify aliTrustRiskIdentify;

    /**
     * Sets ali trust risk identify.
     *
     * @param aliTrustRiskIdentify the ali trust risk identify
     */
    public void setAliTrustRiskIdentify(AliTrustRiskIdentify aliTrustRiskIdentify) {
		this.aliTrustRiskIdentify = aliTrustRiskIdentify;
	}

    /**
     * Gets ali trust risk identify.
     *
     * @return the ali trust risk identify
     */
    public AliTrustRiskIdentify getAliTrustRiskIdentify( ) {
		return this.aliTrustRiskIdentify;
	}

}

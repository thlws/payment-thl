package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.policy.surrender.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-07-11 15:25:00
 */
public class AlipayInsScenePolicySurrenderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6181276473323796397L;

	/** 
	 * 蚂蚁保险平台生成的保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

    /**
     * Sets policy no.
     *
     * @param policyNo the policy no
     */
    public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

    /**
     * Gets policy no.
     *
     * @return the policy no
     */
    public String getPolicyNo( ) {
		return this.policyNo;
	}

}

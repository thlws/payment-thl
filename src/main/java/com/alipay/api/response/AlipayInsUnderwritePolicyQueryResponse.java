package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsPolicy;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.underwrite.policy.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-21 19:47:31
 */
public class AlipayInsUnderwritePolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6159243737675615851L;

	/** 
	 * 保单
	 */
	@ApiField("policy")
	private InsPolicy policy;

    /**
     * Sets policy.
     *
     * @param policy the policy
     */
    public void setPolicy(InsPolicy policy) {
		this.policy = policy;
	}

    /**
     * Gets policy.
     *
     * @return the policy
     */
    public InsPolicy getPolicy( ) {
		return this.policy;
	}

}

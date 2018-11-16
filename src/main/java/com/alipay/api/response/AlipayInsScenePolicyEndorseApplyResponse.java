package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.policy.endorse.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-07-12 13:05:00
 */
public class AlipayInsScenePolicyEndorseApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3751395285562337618L;

	/** 
	 * 批单号
	 */
	@ApiField("endorse_no")
	private String endorseNo;

	/** 
	 * 商户生成的批单请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

    /**
     * Sets endorse no.
     *
     * @param endorseNo the endorse no
     */
    public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

    /**
     * Gets endorse no.
     *
     * @return the endorse no
     */
    public String getEndorseNo( ) {
		return this.endorseNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}

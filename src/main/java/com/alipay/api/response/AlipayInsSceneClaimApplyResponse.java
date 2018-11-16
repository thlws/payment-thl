package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-11-02 12:01:15
 */
public class AlipayInsSceneClaimApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8673619496614394176L;

	/** 
	 * 报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/** 
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 商户生成的理赔请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

    /**
     * Sets claim report no.
     *
     * @param claimReportNo the claim report no
     */
    public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

    /**
     * Gets claim report no.
     *
     * @return the claim report no
     */
    public String getClaimReportNo( ) {
		return this.claimReportNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
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

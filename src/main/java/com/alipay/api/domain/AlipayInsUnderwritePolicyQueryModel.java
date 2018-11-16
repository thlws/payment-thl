package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-21 19:47:31
 */
public class AlipayInsUnderwritePolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6387768251665841388L;

	/**
	 * 商户生成的外部投保业务号;当保单凭证号不传时则必传.
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保单凭证号;商户生成的外部投保业务号不传时则必传.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品编码;当保单凭证号不传时则必传.
	 */
	@ApiField("prod_code")
	private String prodCode;

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
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
     * Gets policy no.
     *
     * @return the policy no
     */
    public String getPolicyNo() {
		return this.policyNo;
	}

    /**
     * Sets policy no.
     *
     * @param policyNo the policy no
     */
    public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}

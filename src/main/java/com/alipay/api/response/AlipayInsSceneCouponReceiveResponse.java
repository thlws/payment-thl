package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.coupon.receive response.
 *
 * @author auto create
 * @since 1.0, 2017-02-23 21:17:48
 */
public class AlipayInsSceneCouponReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1833499412499396775L;

	/** 
	 * 保单凭证号;商户生成的外部投保业务号不传时则必传
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 保险产品
	 */
	@ApiField("product")
	private InsProduct product;

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

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(InsProduct product) {
		this.product = product;
	}

    /**
     * Gets product.
     *
     * @return the product
     */
    public InsProduct getProduct( ) {
		return this.product;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.inquiry.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-01-11 15:55:21
 */
public class AlipayInsSceneProductInquiryApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1515631716282684472L;

	/** 
	 * 保险产品保费值，金额类型(单位为分)
	 */
	@ApiField("premium")
	private Long premium;

    /**
     * Sets premium.
     *
     * @param premium the premium
     */
    public void setPremium(Long premium) {
		this.premium = premium;
	}

    /**
     * Gets premium.
     *
     * @return the premium
     */
    public Long getPremium( ) {
		return this.premium;
	}

}

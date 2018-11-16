package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.product.query response.
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:33
 */
public class AlipayInsCooperationProductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4288168725142286226L;

	/** 
	 * 保险产品
	 */
	@ApiField("product")
	private InsProduct product;

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

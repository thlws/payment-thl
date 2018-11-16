package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.serviceproduct.update response.
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:49:05
 */
public class AlipayEcoMycarMaintainServiceproductUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7647216144938769384L;

	/** 
	 * 车主平台生成的产品编号
新增：必填
	 */
	@ApiField("product_id")
	private Long productId;

    /**
     * Sets product id.
     *
     * @param productId the product id
     */
    public void setProductId(Long productId) {
		this.productId = productId;
	}

    /**
     * Gets product id.
     *
     * @return the product id
     */
    public Long getProductId( ) {
		return this.productId;
	}

}

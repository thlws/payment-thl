package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.order.pay response.
 *
 * @author auto create
 * @since 1.0, 2018-09-06 11:10:00
 */
public class AlipayOverseasTaxOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3652176569613248479L;

	/** 
	 * 支付宝的退税流水号
	 */
	@ApiField("tax_no")
	private String taxNo;

    /**
     * Sets tax no.
     *
     * @param taxNo the tax no
     */
    public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

    /**
     * Gets tax no.
     *
     * @return the tax no
     */
    public String getTaxNo( ) {
		return this.taxNo;
	}

}

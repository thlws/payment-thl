package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.creditrisk.data.put response.
 *
 * @author auto create
 * @since 1.0, 2017-08-15 09:11:01
 */
public class AlipayCreditCreditriskDataPutResponse extends AlipayResponse {

	private static final long serialVersionUID = 3793737719197214463L;

	/** 
	 * 返回该条数据在网商的唯一ID
	 */
	@ApiField("dataid")
	private String dataid;

    /**
     * Sets dataid.
     *
     * @param dataid the dataid
     */
    public void setDataid(String dataid) {
		this.dataid = dataid;
	}

    /**
     * Gets dataid.
     *
     * @return the dataid
     */
    public String getDataid( ) {
		return this.dataid;
	}

}

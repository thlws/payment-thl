package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:29:40
 */
public class AlipayEbppInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6852636593126232685L;

	/** 
	 * 支付宝返回的发票申请id,该id具有唯一性
	 */
	@ApiField("apply_id")
	private String applyId;

    /**
     * Sets apply id.
     *
     * @param applyId the apply id
     */
    public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

    /**
     * Gets apply id.
     *
     * @return the apply id
     */
    public String getApplyId( ) {
		return this.applyId;
	}

}

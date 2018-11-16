package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.dynamic.get response.
 *
 * @author auto create
 * @since 1.0, 2018-08-24 14:40:00
 */
public class AlipayEbppInvoiceTitleDynamicGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1147169494684318374L;

	/** 
	 * 发票抬头
	 */
	@ApiField("title")
	private InvoiceTitleModel title;

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(InvoiceTitleModel title) {
		this.title = title;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public InvoiceTitleModel getTitle( ) {
		return this.title;
	}

}

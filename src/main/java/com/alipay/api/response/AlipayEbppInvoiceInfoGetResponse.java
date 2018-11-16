package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceModelContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.info.get response.
 *
 * @author auto create
 * @since 1.0, 2018-04-23 13:17:08
 */
public class AlipayEbppInvoiceInfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4647876678524512781L;

	/** 
	 * 电子发票详情模型
	 */
	@ApiField("invoice_model")
	private InvoiceModelContent invoiceModel;

    /**
     * Sets invoice entity.
     *
     * @param invoiceModel the invoice entity
     */
    public void setInvoiceModel(InvoiceModelContent invoiceModel) {
		this.invoiceModel = invoiceModel;
	}

    /**
     * Gets invoice entity.
     *
     * @return the invoice entity
     */
    public InvoiceModelContent getInvoiceModel( ) {
		return this.invoiceModel;
	}

}

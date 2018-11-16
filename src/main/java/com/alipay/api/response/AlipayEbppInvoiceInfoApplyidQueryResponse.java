package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceQueryOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.info.applyid.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-13 10:35:00
 */
public class AlipayEbppInvoiceInfoApplyidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8479841532921661899L;

	/** 
	 * 发票信息
	 */
	@ApiListField("invoice_info")
	@ApiField("invoice_query_open_model")
	private List<InvoiceQueryOpenModel> invoiceInfo;

    /**
     * Sets invoice info.
     *
     * @param invoiceInfo the invoice info
     */
    public void setInvoiceInfo(List<InvoiceQueryOpenModel> invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

    /**
     * Gets invoice info.
     *
     * @return the invoice info
     */
    public List<InvoiceQueryOpenModel> getInvoiceInfo( ) {
		return this.invoiceInfo;
	}

}

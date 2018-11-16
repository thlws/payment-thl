package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceElementModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.taxno.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-08-24 14:37:09
 */
public class AlipayEbppInvoiceTaxnoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8544355435342929378L;

	/** 
	 * 发票要素列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_model")
	private List<InvoiceElementModel> invoiceElementList;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets invoice element list.
     *
     * @param invoiceElementList the invoice element list
     */
    public void setInvoiceElementList(List<InvoiceElementModel> invoiceElementList) {
		this.invoiceElementList = invoiceElementList;
	}

    /**
     * Gets invoice element list.
     *
     * @return the invoice element list
     */
    public List<InvoiceElementModel> getInvoiceElementList( ) {
		return this.invoiceElementList;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}

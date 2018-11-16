package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceElementModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-09-06 11:18:09
 */
public class AlipayEbppInvoiceTitleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4389151421174318376L;

	/** 
	 * 发票要素列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_model")
	private List<InvoiceElementModel> invoiceElementList;

	/** 
	 * 依据条件查询到的发票总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

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
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
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

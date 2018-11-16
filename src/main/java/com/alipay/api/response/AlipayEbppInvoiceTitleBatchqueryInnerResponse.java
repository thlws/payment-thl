package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.batchquery.inner response.
 *
 * @author auto create
 * @since 1.0, 2018-04-23 13:17:34
 */
public class AlipayEbppInvoiceTitleBatchqueryInnerResponse extends AlipayResponse {

	private static final long serialVersionUID = 6755138459311675538L;

	/** 
	 * 用户抬头列表（包括个人、单位抬头）
	 */
	@ApiListField("title_list")
	@ApiField("invoice_title_model")
	private List<InvoiceTitleModel> titleList;

    /**
     * Sets title list.
     *
     * @param titleList the title list
     */
    public void setTitleList(List<InvoiceTitleModel> titleList) {
		this.titleList = titleList;
	}

    /**
     * Gets title list.
     *
     * @return the title list
     */
    public List<InvoiceTitleModel> getTitleList( ) {
		return this.titleList;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.file.query response.
 *
 * @author auto create
 * @since 1.0, 2017-05-09 14:11:28
 */
public class AlipayEbppInvoiceFileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7458696274922935926L;

	/** 
	 * 发票文件内容,需要先base64解码，获取原始byte[]类型文件流
	 */
	@ApiField("invoice_file_content")
	private String invoiceFileContent;

    /**
     * Sets invoice file content.
     *
     * @param invoiceFileContent the invoice file content
     */
    public void setInvoiceFileContent(String invoiceFileContent) {
		this.invoiceFileContent = invoiceFileContent;
	}

    /**
     * Gets invoice file content.
     *
     * @return the invoice file content
     */
    public String getInvoiceFileContent( ) {
		return this.invoiceFileContent;
	}

}

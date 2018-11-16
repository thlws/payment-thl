package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 依据发票id查询发票文件信息
 *
 * @author auto create
 * @since 1.0, 2017-05-09 14:11:28
 */
public class AlipayEbppInvoiceFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5351895789672595315L;

	/**
	 * 支付宝端生成的发票id，该字段可从发票详情查询接口获得
	 */
	@ApiField("invoice_id")
	private String invoiceId;

    /**
     * Gets invoice id.
     *
     * @return the invoice id
     */
    public String getInvoiceId() {
		return this.invoiceId;
	}

    /**
     * Sets invoice id.
     *
     * @param invoiceId the invoice id
     */
    public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

}

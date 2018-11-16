package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票信息
 *
 * @author auto create
 * @since 1.0, 2017-06-06 18:11:55
 */
public class InvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 1376879153752683653L;

	/**
	 * 开票内容
注：json数组格式
	 */
	@ApiField("details")
	private String details;

	/**
	 * 开票关键信息
	 */
	@ApiField("key_info")
	private InvoiceKeyInfo keyInfo;

    /**
     * Gets details.
     *
     * @return the details
     */
    public String getDetails() {
		return this.details;
	}

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(String details) {
		this.details = details;
	}

    /**
     * Gets key info.
     *
     * @return the key info
     */
    public InvoiceKeyInfo getKeyInfo() {
		return this.keyInfo;
	}

    /**
     * Sets key info.
     *
     * @param keyInfo the key info
     */
    public void setKeyInfo(InvoiceKeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.bill.downloadurl.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-08 15:18:41
 */
public class AlipayDataDataserviceBillDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1468217355284945823L;

	/** 
	 * 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

    /**
     * Sets bill download url.
     *
     * @param billDownloadUrl the bill download url
     */
    public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}

    /**
     * Gets bill download url.
     *
     * @return the bill download url
     */
    public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}

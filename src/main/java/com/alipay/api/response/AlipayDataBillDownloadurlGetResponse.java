package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.downloadurl.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 11:43:02
 */
public class AlipayDataBillDownloadurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7282272676572325369L;

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

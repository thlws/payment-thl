package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.activity.bill.download response.
 *
 * @author auto create
 * @since 1.0, 2018-03-28 21:22:31
 */
public class KoubeiMarketingDataActivityBillDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3686925678346864579L;

	/** 
	 * 账单下载地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl( ) {
		return this.url;
	}

}

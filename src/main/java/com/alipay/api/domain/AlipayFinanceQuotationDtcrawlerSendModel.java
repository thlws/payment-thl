package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金爬虫数据推送接口
 *
 * @author auto create
 * @since 1.0, 2017-08-07 17:54:21
 */
public class AlipayFinanceQuotationDtcrawlerSendModel extends AlipayObject {

	private static final long serialVersionUID = 2264729336663171776L;

	/**
	 * 爬虫平台推送数据，为json字符串，bizNo 为推送流水号，taskName为任务名，业务数据包含在bizData中
	 */
	@ApiField("content")
	private String content;

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.encode.shortlink.create response.
 *
 * @author auto create
 * @since 1.0, 2017-10-13 10:38:17
 */
public class AlipayMarketingEncodeShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7126663943349267796L;

	/** 
	 * 将长连接改写成短连接，改写成功后的短连接地址
	 */
	@ApiField("content")
	private String content;

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent( ) {
		return this.content;
	}

}

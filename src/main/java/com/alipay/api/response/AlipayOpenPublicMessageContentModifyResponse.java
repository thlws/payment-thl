package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.content.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-02-09 16:28:22
 */
public class AlipayOpenPublicMessageContentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5873129935961425445L;

	/** 
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 内容详情内链url
	 */
	@ApiField("content_url")
	private String contentUrl;

    /**
     * Sets content id.
     *
     * @param contentId the content id
     */
    public void setContentId(String contentId) {
		this.contentId = contentId;
	}

    /**
     * Gets content id.
     *
     * @return the content id
     */
    public String getContentId( ) {
		return this.contentId;
	}

    /**
     * Sets content url.
     *
     * @param contentUrl the content url
     */
    public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

    /**
     * Gets content url.
     *
     * @return the content url
     */
    public String getContentUrl( ) {
		return this.contentUrl;
	}

}

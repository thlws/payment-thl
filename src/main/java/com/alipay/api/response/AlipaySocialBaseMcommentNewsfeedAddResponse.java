package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.newsfeed.add response.
 *
 * @author auto create
 * @since 1.0, 2016-08-12 11:11:25
 */
public class AlipaySocialBaseMcommentNewsfeedAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8237143327937281364L;

	/** 
	 * 新评论id
	 */
	@ApiField("newsfeed_id")
	private String newsfeedId;

    /**
     * Sets newsfeed id.
     *
     * @param newsfeedId the newsfeed id
     */
    public void setNewsfeedId(String newsfeedId) {
		this.newsfeedId = newsfeedId;
	}

    /**
     * Gets newsfeed id.
     *
     * @return the newsfeed id
     */
    public String getNewsfeedId( ) {
		return this.newsfeedId;
	}

}

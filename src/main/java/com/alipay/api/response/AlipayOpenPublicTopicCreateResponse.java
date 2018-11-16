package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.topic.create response.
 *
 * @author auto create
 * @since 1.0, 2018-01-05 17:38:29
 */
public class AlipayOpenPublicTopicCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4619739797169226957L;

	/** 
	 * 营销位id
	 */
	@ApiField("topic_id")
	private String topicId;

    /**
     * Sets topic id.
     *
     * @param topicId the topic id
     */
    public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

    /**
     * Gets topic id.
     *
     * @return the topic id
     */
    public String getTopicId( ) {
		return this.topicId;
	}

}

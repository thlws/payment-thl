package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Topic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.topic.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-01-05 15:06:33
 */
public class AlipayOpenPublicTopicBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1527668681412435393L;

	/** 
	 * 营销位列表
	 */
	@ApiListField("topic_list")
	@ApiField("topic")
	private List<Topic> topicList;

    /**
     * Sets topic list.
     *
     * @param topicList the topic list
     */
    public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}

    /**
     * Gets topic list.
     *
     * @return the topic list
     */
    public List<Topic> getTopicList( ) {
		return this.topicList;
	}

}

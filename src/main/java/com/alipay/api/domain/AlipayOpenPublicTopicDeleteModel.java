package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销位删除接口
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:22:56
 */
public class AlipayOpenPublicTopicDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8187264937352398267L;

	/**
	 * 营销位id
	 */
	@ApiField("topic_id")
	private String topicId;

    /**
     * Gets topic id.
     *
     * @return the topic id
     */
    public String getTopicId() {
		return this.topicId;
	}

    /**
     * Sets topic id.
     *
     * @param topicId the topic id
     */
    public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

}

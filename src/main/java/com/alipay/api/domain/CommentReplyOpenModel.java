package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评价回复模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:31
 */
public class CommentReplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 1347352458139129929L;

	/**
	 * 回复内容，最多500字，不区分中英文
	 */
	@ApiField("content")
	private String content;

	/**
	 * 发表回复的操作员id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 回复发表时间
	 */
	@ApiField("reply_publish_time")
	private Date replyPublishTime;

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

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets reply publish time.
     *
     * @return the reply publish time
     */
    public Date getReplyPublishTime() {
		return this.replyPublishTime;
	}

    /**
     * Sets reply publish time.
     *
     * @param replyPublishTime the reply publish time
     */
    public void setReplyPublishTime(Date replyPublishTime) {
		this.replyPublishTime = replyPublishTime;
	}

}

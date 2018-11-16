package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单发模板消息
 *
 * @author auto create
 * @since 1.0, 2018-04-19 11:28:05
 */
public class AlipayOpenPublicMessageSingleSendModel extends AlipayObject {

	private static final long serialVersionUID = 2699325756159715933L;

	/**
	 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
	 */
	@ApiField("template")
	private Template template;

	/**
	 * 消息接收用户的userid
	 */
	@ApiField("to_user_id")
	private String toUserId;

    /**
     * Gets template.
     *
     * @return the template
     */
    public Template getTemplate() {
		return this.template;
	}

    /**
     * Sets template.
     *
     * @param template the template
     */
    public void setTemplate(Template template) {
		this.template = template;
	}

    /**
     * Gets to user id.
     *
     * @return the to user id
     */
    public String getToUserId() {
		return this.toUserId;
	}

    /**
     * Sets to user id.
     *
     * @param toUserId the to user id
     */
    public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}

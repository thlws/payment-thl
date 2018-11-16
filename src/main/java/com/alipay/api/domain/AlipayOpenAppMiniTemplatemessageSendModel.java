package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序发送模板消息
 *
 * @author auto create
 * @since 1.0, 2018-09-18 17:30:38
 */
public class AlipayOpenAppMiniTemplatemessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 2116289433897257786L;

	/**
	 * 开发者需要发送模板消息中的自定义部分来替换模板的占位符
	 */
	@ApiField("data")
	private String data;

	/**
	 * 用户发生的交易行为的交易号，或者用户在小程序产生表单提交的表单号，用于信息发送的校验
	 */
	@ApiField("form_id")
	private String formId;

	/**
	 * 小程序的跳转页面，用于消息中心用户点击之后详细跳转的小程序页面
	 */
	@ApiField("page")
	private String page;

	/**
	 * 发送消息的支付宝账号
	 */
	@ApiField("to_user_id")
	private String toUserId;

	/**
	 * 用户申请的模板id号，固定的模板id会发送固定的消息
	 */
	@ApiField("user_template_id")
	private String userTemplateId;

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
		return this.data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

    /**
     * Gets form id.
     *
     * @return the form id
     */
    public String getFormId() {
		return this.formId;
	}

    /**
     * Sets form id.
     *
     * @param formId the form id
     */
    public void setFormId(String formId) {
		this.formId = formId;
	}

    /**
     * Gets page.
     *
     * @return the page
     */
    public String getPage() {
		return this.page;
	}

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(String page) {
		this.page = page;
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

    /**
     * Gets user template id.
     *
     * @return the user template id
     */
    public String getUserTemplateId() {
		return this.userTemplateId;
	}

    /**
     * Sets user template id.
     *
     * @param userTemplateId the user template id
     */
    public void setUserTemplateId(String userTemplateId) {
		this.userTemplateId = userTemplateId;
	}

}

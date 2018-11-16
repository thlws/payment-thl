package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.template.message.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicTemplateMessageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8271149761635881589L;

	/** 
	 * 消息模板id--商户领取母版后生成的唯一模板id
	 */
	@ApiField("msg_template_id")
	private String msgTemplateId;

	/** 
	 * 模板内容
	 */
	@ApiField("template")
	private String template;

    /**
     * Sets msg template id.
     *
     * @param msgTemplateId the msg template id
     */
    public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}

    /**
     * Gets msg template id.
     *
     * @return the msg template id
     */
    public String getMsgTemplateId( ) {
		return this.msgTemplateId;
	}

    /**
     * Sets template.
     *
     * @param template the template
     */
    public void setTemplate(String template) {
		this.template = template;
	}

    /**
     * Gets template.
     *
     * @return the template
     */
    public String getTemplate( ) {
		return this.template;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板消息领取接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:18:43
 */
public class AlipayOpenPublicTemplateMessageGetModel extends AlipayObject {

	private static final long serialVersionUID = 2159187953778847412L;

	/**
	 * 消息母板id，登陆生活号后台(fuwu.alipay.com)，点击菜单“模板消息”，点击“模板库”，即可看到相应模板的消息母板id
	 */
	@ApiField("template_id")
	private String templateId;

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}

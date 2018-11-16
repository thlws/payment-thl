package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询模板详情
 *
 * @author auto create
 * @since 1.0, 2018-06-20 18:10:39
 */
public class AlipayMarketingVoucherTemplatedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5149222758446441223L;

	/**
	 * 券模板ID
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

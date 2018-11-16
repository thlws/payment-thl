package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除资金券模板
 *
 * @author auto create
 * @since 1.0, 2018-01-30 22:43:25
 */
public class AlipayMarketingVoucherTemplateDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2365313287779287799L;

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益删除
 *
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:27
 */
public class AlipayMarketingCardBenefitDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1641415558464413257L;

	/**
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 会员卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

    /**
     * Gets benefit id.
     *
     * @return the benefit id
     */
    public String getBenefitId() {
		return this.benefitId;
	}

    /**
     * Sets benefit id.
     *
     * @param benefitId the benefit id
     */
    public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建凤蝶H5应用
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:15:30
 */
public class AlipayMarketingToolFengdieActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4658581368793552435L;

	/**
	 * H5应用初始化数据
	 */
	@ApiField("activity")
	private FengdieActivityCreateData activity;

	/**
	 * 凤蝶模板包唯一id，从alipay.marketing.tool.fengdie.template.query接口中获取
	 */
	@ApiField("template_id")
	private Long templateId;

    /**
     * Gets activity.
     *
     * @return the activity
     */
    public FengdieActivityCreateData getActivity() {
		return this.activity;
	}

    /**
     * Sets activity.
     *
     * @param activity the activity
     */
    public void setActivity(FengdieActivityCreateData activity) {
		this.activity = activity;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public Long getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}

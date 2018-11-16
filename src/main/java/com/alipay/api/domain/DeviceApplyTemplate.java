package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具设备模板
 *
 * @author auto create
 * @since 1.0, 2018-08-23 19:58:00
 */
public class DeviceApplyTemplate extends AlipayObject {

	private static final long serialVersionUID = 1812235837421264861L;

	/**
	 * 实际申请数量，取值1到500之间，最多不能超过500。补充说明：一次能申请的机具模板种类最多为10，也就是device_list大小为10
	 */
	@ApiField("apply_amount")
	private Long applyAmount;

	/**
	 * 机具模板id
	 */
	@ApiField("template_id")
	private String templateId;

    /**
     * Gets apply amount.
     *
     * @return the apply amount
     */
    public Long getApplyAmount() {
		return this.applyAmount;
	}

    /**
     * Sets apply amount.
     *
     * @param applyAmount the apply amount
     */
    public void setApplyAmount(Long applyAmount) {
		this.applyAmount = applyAmount;
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

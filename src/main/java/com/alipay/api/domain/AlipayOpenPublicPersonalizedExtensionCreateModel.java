package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 个性化扩展区创建接口
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:51:40
 */
public class AlipayOpenPublicPersonalizedExtensionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1469465532676164739L;

	/**
	 * 扩展区列表，最大条数为3
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	/**
	 * 标签规则，目前限定只能传入1条，在扩展区上线后，满足该标签规则的用户进入生活号首页，将看到该套扩展区。
	 */
	@ApiListField("label_rule")
	@ApiField("label_rule")
	private List<LabelRule> labelRule;

    /**
     * Gets areas.
     *
     * @return the areas
     */
    public List<ExtensionArea> getAreas() {
		return this.areas;
	}

    /**
     * Sets areas.
     *
     * @param areas the areas
     */
    public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

    /**
     * Gets label rule.
     *
     * @return the label rule
     */
    public List<LabelRule> getLabelRule() {
		return this.labelRule;
	}

    /**
     * Sets label rule.
     *
     * @param labelRule the label rule
     */
    public void setLabelRule(List<LabelRule> labelRule) {
		this.labelRule = labelRule;
	}

}

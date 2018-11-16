package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群数量查询
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:55:14
 */
public class AlipayOpenPublicGroupCrowdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2181416869327532473L;

	/**
	 * 用户分组的规则项列表，规则项之间元素是与的逻辑，每个规则项内部用多个值表示或的逻辑
	 */
	@ApiListField("label_rule")
	@ApiField("complex_label_rule")
	private List<ComplexLabelRule> labelRule;

    /**
     * Gets label rule.
     *
     * @return the label rule
     */
    public List<ComplexLabelRule> getLabelRule() {
		return this.labelRule;
	}

    /**
     * Sets label rule.
     *
     * @param labelRule the label rule
     */
    public void setLabelRule(List<ComplexLabelRule> labelRule) {
		this.labelRule = labelRule;
	}

}

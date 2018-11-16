package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户分组修改接口
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:55:20
 */
public class AlipayOpenPublicGroupModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6682936576354824646L;

	/**
	 * 分组ID，整型值
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 标签规则，满足该规则的粉丝将被圈定，标签id不能重复
	 */
	@ApiListField("label_rule")
	@ApiField("complex_label_rule")
	private List<ComplexLabelRule> labelRule;

	/**
	 * 分组名称，仅支持中文、字母、数字、下划线的组合。
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

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

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

}

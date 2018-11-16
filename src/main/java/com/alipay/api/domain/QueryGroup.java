package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分组查询模型
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:01:42
 */
public class QueryGroup extends AlipayObject {

	private static final long serialVersionUID = 8651536997925292745L;

	/**
	 * 分组id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 分组中的圈人规则
	 */
	@ApiListField("label_rule")
	@ApiField("query_complex_label_rule")
	private List<QueryComplexLabelRule> labelRule;

	/**
	 * 用户分组名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets label rule.
     *
     * @return the label rule
     */
    public List<QueryComplexLabelRule> getLabelRule() {
		return this.labelRule;
	}

    /**
     * Sets label rule.
     *
     * @param labelRule the label rule
     */
    public void setLabelRule(List<QueryComplexLabelRule> labelRule) {
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

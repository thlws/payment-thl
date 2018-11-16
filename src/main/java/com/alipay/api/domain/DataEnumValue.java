package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义标签的枚举值信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class DataEnumValue extends AlipayObject {

	private static final long serialVersionUID = 8293764671994165843L;

	/**
	 * 过滤条件
	 */
	@ApiListField("filter_tags")
	@ApiField("filter_tag")
	private List<FilterTag> filterTags;

	/**
	 * 枚举的展示文本
	 */
	@ApiField("label")
	private String label;

	/**
	 * 自定义标签的枚举值
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets filter tags.
     *
     * @return the filter tags
     */
    public List<FilterTag> getFilterTags() {
		return this.filterTags;
	}

    /**
     * Sets filter tags.
     *
     * @param filterTags the filter tags
     */
    public void setFilterTags(List<FilterTag> filterTags) {
		this.filterTags = filterTags;
	}

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
		return this.label;
	}

    /**
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(String label) {
		this.label = label;
	}

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
		this.value = value;
	}

}

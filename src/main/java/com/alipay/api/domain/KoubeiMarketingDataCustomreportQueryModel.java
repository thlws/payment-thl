package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义数据报表数据查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:03:45
 */
public class KoubeiMarketingDataCustomreportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2154989786333284322L;

	/**
	 * 规则KEY
	 */
	@ApiField("condition_key")
	private String conditionKey;

	/**
	 * 额外增加的查询过滤条件
	 */
	@ApiListField("filter_tags")
	@ApiField("filter_tag")
	private List<FilterTag> filterTags;

	/**
	 * 一次拉多少条
	 */
	@ApiField("max_count")
	private String maxCount;

    /**
     * Gets condition key.
     *
     * @return the condition key
     */
    public String getConditionKey() {
		return this.conditionKey;
	}

    /**
     * Sets condition key.
     *
     * @param conditionKey the condition key
     */
    public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

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
     * Gets max count.
     *
     * @return the max count
     */
    public String getMaxCount() {
		return this.maxCount;
	}

    /**
     * Sets max count.
     *
     * @param maxCount the max count
     */
    public void setMaxCount(String maxCount) {
		this.maxCount = maxCount;
	}

}

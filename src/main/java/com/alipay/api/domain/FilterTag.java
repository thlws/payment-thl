package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义报表过滤标签
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:03:45
 */
public class FilterTag extends AlipayObject {

	private static final long serialVersionUID = 3658959988485888823L;

	/**
	 * 过滤条件的标签code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 分组过滤条件
注意：这个是JSON数组，必须以[开头，以]结尾，[]外层不能加双引号"",正确案例[{"operate": "EQ","value": "1" }]，错误案例："[{"operate": "EQ","value": "1" }]"
	 */
	@ApiField("filter_items")
	private String filterItems;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets filter items.
     *
     * @return the filter items
     */
    public String getFilterItems() {
		return this.filterItems;
	}

    /**
     * Sets filter items.
     *
     * @param filterItems the filter items
     */
    public void setFilterItems(String filterItems) {
		this.filterItems = filterItems;
	}

}

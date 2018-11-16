package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品销售属性属性值模型
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:26:52
 */
public class KbdishPropertyValueInfo extends AlipayObject {

	private static final long serialVersionUID = 7549926677938431321L;

	/**
	 * 属性值排序字段，从1一直递增到5
	 */
	@ApiField("sort")
	private String sort;

	/**
	 * 销售属性值
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public String getSort() {
		return this.sort;
	}

    /**
     * Sets sort.
     *
     * @param sort the sort
     */
    public void setSort(String sort) {
		this.sort = sort;
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

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品销售属性模型
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:26:52
 */
public class KbdishPropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 8724967469863847256L;

	/**
	 * 菜品属性名称
	 */
	@ApiField("property_name")
	private String propertyName;

	/**
	 * 菜品销售属性属性值模型
	 */
	@ApiListField("property_value_info_list")
	@ApiField("kbdish_property_value_info")
	private List<KbdishPropertyValueInfo> propertyValueInfoList;

	/**
	 * 菜品属性排序字段，从1一直递增到4
	 */
	@ApiField("sort")
	private String sort;

    /**
     * Gets property name.
     *
     * @return the property name
     */
    public String getPropertyName() {
		return this.propertyName;
	}

    /**
     * Sets property name.
     *
     * @param propertyName the property name
     */
    public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

    /**
     * Gets property value info list.
     *
     * @return the property value info list
     */
    public List<KbdishPropertyValueInfo> getPropertyValueInfoList() {
		return this.propertyValueInfoList;
	}

    /**
     * Sets property value info list.
     *
     * @param propertyValueInfoList the property value info list
     */
    public void setPropertyValueInfoList(List<KbdishPropertyValueInfo> propertyValueInfoList) {
		this.propertyValueInfoList = propertyValueInfoList;
	}

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

}

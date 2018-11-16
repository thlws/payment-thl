package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口参数扩展字段，用于传递不同平台上特性化的参数。
 *
 * @author auto create
 * @since 1.0, 2018-03-30 19:52:12
 */
public class ExtendFieldInfo extends AlipayObject {

	private static final long serialVersionUID = 3732537523614746193L;

	/**
	 * 字段名
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 字段值
	 */
	@ApiField("field_value")
	private String fieldValue;

    /**
     * Gets field name.
     *
     * @return the field name
     */
    public String getFieldName() {
		return this.fieldName;
	}

    /**
     * Sets field name.
     *
     * @param fieldName the field name
     */
    public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

    /**
     * Gets field value.
     *
     * @return the field value
     */
    public String getFieldValue() {
		return this.fieldValue;
	}

    /**
     * Sets field value.
     *
     * @param fieldValue the field value
     */
    public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

}

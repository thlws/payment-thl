package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 条件模型
 *
 * @author auto create
 * @since 1.0, 2017-09-29 18:12:38
 */
public class Condition extends AlipayObject {

	private static final long serialVersionUID = 4158226725191393998L;

	/**
	 * 字段名称，目前支持以下字段：
name: 活动名称 
startTime: 开始时间
endTime: 结束时间
status：活动状态
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 对应于field_name的字段值，当field_name为status时，field_value支持STARTED、STARTING、MODIFYING、CLOSED、CLOSING、DISABLED几种值，用|分隔，代表查询这些状态中的活动，此时operator只能为IN,field_name为name时候value表示要查询的活动名，field_name为时间时,field_value为开始或结束时间，格式如2016-10-01 00:00:00
	 */
	@ApiField("field_value")
	private String fieldValue;

	/**
	 * 操作符,EQUAL:等于,IN:范围。目前支持field_name=status且operator=IN,多个状态以"|"分隔
	 */
	@ApiField("operator")
	private String operator;

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

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

}

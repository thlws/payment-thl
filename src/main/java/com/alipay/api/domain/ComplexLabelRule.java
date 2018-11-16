package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签规则项的模型，支持多种操作符
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:01:18
 */
public class ComplexLabelRule extends AlipayObject {

	private static final long serialVersionUID = 8341665291921646839L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签取值，当有多个取值时用英文","分隔（比如使用in操作符时）；不允许传入下划线"_"、竖线"|"或者空格" "
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 目前支持EQ（等于）、NEQ（不等于）、LT（小于），GT（大于）、LTEQ（小于等于）、GTEQ（大于等于）、LIKE（匹配）、BETWEEN（范围）、IN（包含）、NOTIN（不包含）操作
	 */
	@ApiField("operator")
	private String operator;

    /**
     * Gets label id.
     *
     * @return the label id
     */
    public String getLabelId() {
		return this.labelId;
	}

    /**
     * Sets label id.
     *
     * @param labelId the label id
     */
    public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

    /**
     * Gets label value.
     *
     * @return the label value
     */
    public String getLabelValue() {
		return this.labelValue;
	}

    /**
     * Sets label value.
     *
     * @param labelValue the label value
     */
    public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化标签规则
 *
 * @author auto create
 * @since 1.0, 2017-09-13 17:51:30
 */
public class LabelRule extends AlipayObject {

	private static final long serialVersionUID = 4731169635466657559L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签值，当有多个取值时用英文","分隔，不允许传入下划线"_"、竖线"|"或者空格" "和方括号"["、"]"
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 目前支持EQ（等于）、BETWEEN（范围）、IN（包含）三种操作符；每个标签支持的运算符可以通过<a href="https://docs.open.alipay.com/api_6/alipay.open.public.life.label.batchquery#sintq">标签列表查询接口</a>获得。该字段允许为空，默认运算符为IN
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

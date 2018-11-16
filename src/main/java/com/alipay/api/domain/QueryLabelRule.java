package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化标签规则返回模型
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:47:28
 */
public class QueryLabelRule extends AlipayObject {

	private static final long serialVersionUID = 8222532973687447231L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 标签值，多值会用英文逗号分隔
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 运算符
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
     * Gets label name.
     *
     * @return the label name
     */
    public String getLabelName() {
		return this.labelName;
	}

    /**
     * Sets label name.
     *
     * @param labelName the label name
     */
    public void setLabelName(String labelName) {
		this.labelName = labelName;
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

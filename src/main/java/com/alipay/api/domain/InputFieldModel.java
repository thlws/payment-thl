package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 输入域模型集合对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class InputFieldModel extends AlipayObject {

	private static final long serialVersionUID = 4181915854462715859L;

	/**
	 * 默认提示值，例如歌华宽带的金额为100的倍数
	 */
	@ApiField("default_value")
	private String defaultValue;

	/**
	 * 域英文名称 例如：billkey
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 输入框下方文字提示，例如： 户号为10位数字
	 */
	@ApiField("field_tips")
	private String fieldTips;

	/**
	 * 页面显示提示 例如：手机号码
	 */
	@ApiField("field_title")
	private String fieldTitle;

	/**
	 * 控件类型 输入框类型 例如：inputText (文本输入框)
	 */
	@ApiField("field_type")
	private String fieldType;

	/**
	 * 控件展示顺序 例如：优选级 1
	 */
	@ApiField("priority")
	private String priority;

	/**
	 * 输入域的校验规则模型
	 */
	@ApiListField("regexp_rule_list")
	@ApiField("validation_rule")
	private List<ValidationRule> regexpRuleList;

    /**
     * Gets default value.
     *
     * @return the default value
     */
    public String getDefaultValue() {
		return this.defaultValue;
	}

    /**
     * Sets default value.
     *
     * @param defaultValue the default value
     */
    public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

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
     * Gets field tips.
     *
     * @return the field tips
     */
    public String getFieldTips() {
		return this.fieldTips;
	}

    /**
     * Sets field tips.
     *
     * @param fieldTips the field tips
     */
    public void setFieldTips(String fieldTips) {
		this.fieldTips = fieldTips;
	}

    /**
     * Gets field title.
     *
     * @return the field title
     */
    public String getFieldTitle() {
		return this.fieldTitle;
	}

    /**
     * Sets field title.
     *
     * @param fieldTitle the field title
     */
    public void setFieldTitle(String fieldTitle) {
		this.fieldTitle = fieldTitle;
	}

    /**
     * Gets field type.
     *
     * @return the field type
     */
    public String getFieldType() {
		return this.fieldType;
	}

    /**
     * Sets field type.
     *
     * @param fieldType the field type
     */
    public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

    /**
     * Gets priority.
     *
     * @return the priority
     */
    public String getPriority() {
		return this.priority;
	}

    /**
     * Sets priority.
     *
     * @param priority the priority
     */
    public void setPriority(String priority) {
		this.priority = priority;
	}

    /**
     * Gets regexp rule list.
     *
     * @return the regexp rule list
     */
    public List<ValidationRule> getRegexpRuleList() {
		return this.regexpRuleList;
	}

    /**
     * Sets regexp rule list.
     *
     * @param regexpRuleList the regexp rule list
     */
    public void setRegexpRuleList(List<ValidationRule> regexpRuleList) {
		this.regexpRuleList = regexpRuleList;
	}

}

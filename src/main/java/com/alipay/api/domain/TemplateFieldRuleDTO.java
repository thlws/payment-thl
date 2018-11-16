package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板字段规则
 *
 * @author auto create
 * @since 1.0, 2017-08-21 19:54:34
 */
public class TemplateFieldRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 3535682623574982447L;

	/**
	 * 字段名称，现在支持如下几个Key（暂不支持自定义）
Balance：金额
Point：整数
Level：任意字符串
OpenDate：开卡日期
ValidDate：过期日期
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 规则名
1、ASSIGN_FROM_REQUEST:  以rule_value为key值，表示该栏位的值从会员卡开卡接口中获取，会员卡开卡接口的card_info中获取对应参数值
2、DATE_IN_FUTURE: 生成一个未来的日期（格式YYYY-MM-DD)，当选择DATE_IN_FUTURE的时候，field_name 必须是OpenDate或ValidDate， 值为(10m或10d 分别表示10个月或10天)
3、CONST: 常量，会员卡开卡接口进行开卡的时候使用模板创建时候设置的值，即取rule_value的值
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 根据rule_name，采取相应取值策略
CONST：直接取rule_value作为卡属性值
DATE_IN_FUTURE：10m或10d 分别表示10个月或10天
ASSIGN_FROM_REQUEST：在开卡Reuqest请求中按rule_value取值，现在和field_name对应的为（OpenDate、ValidDate、Level、Point、Balance）
	 */
	@ApiField("rule_value")
	private String ruleValue;

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
     * Gets rule name.
     *
     * @return the rule name
     */
    public String getRuleName() {
		return this.ruleName;
	}

    /**
     * Sets rule name.
     *
     * @param ruleName the rule name
     */
    public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

    /**
     * Gets rule value.
     *
     * @return the rule value
     */
    public String getRuleValue() {
		return this.ruleValue;
	}

    /**
     * Sets rule value.
     *
     * @param ruleValue the rule value
     */
    public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 个性化菜单创建
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:54:12
 */
public class AlipayOpenPublicPersonalizedMenuCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7724153692519954988L;

	/**
	 * 一级菜单列表。如果是文本菜单，最多有4个一级菜单，若开发者在后台打开了"咨询反馈"的开关，则只能有3个一级菜单；如果是 ICON 菜单信息，最多有80个一级菜单(忽略二级菜单)
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 标签规则，目前限定只能传入1条，在个性化菜单创建成功后，满足该标签规则的用户进入生活号首页，将看到该套菜单。
	 */
	@ApiListField("label_rule")
	@ApiField("label_rule")
	private List<LabelRule> labelRule;

	/**
	 * 菜单类型，支持值为icon：icon型菜单，text：文本型菜单，不传时默认为"text"，当传值为"icon"时，菜单节点的icon字段必传。
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets button.
     *
     * @return the button
     */
    public List<ButtonObject> getButton() {
		return this.button;
	}

    /**
     * Sets button.
     *
     * @param button the button
     */
    public void setButton(List<ButtonObject> button) {
		this.button = button;
	}

    /**
     * Gets label rule.
     *
     * @return the label rule
     */
    public List<LabelRule> getLabelRule() {
		return this.labelRule;
	}

    /**
     * Sets label rule.
     *
     * @param labelRule the label rule
     */
    public void setLabelRule(List<LabelRule> labelRule) {
		this.labelRule = labelRule;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询个性化菜单返回对象
 *
 * @author auto create
 * @since 1.0, 2017-05-25 11:39:51
 */
public class QueryMenu extends AlipayObject {

	private static final long serialVersionUID = 1322643932385237357L;

	/**
	 * 一级菜单列表
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 标签规则项列表
	 */
	@ApiListField("label_rule")
	@ApiField("query_label_rule")
	private List<QueryLabelRule> labelRule;

	/**
	 * 菜单唯一id
	 */
	@ApiField("menu_key")
	private String menuKey;

	/**
	 * 菜单类型，icon：icon型菜单，text：文本型菜单
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
    public List<QueryLabelRule> getLabelRule() {
		return this.labelRule;
	}

    /**
     * Sets label rule.
     *
     * @param labelRule the label rule
     */
    public void setLabelRule(List<QueryLabelRule> labelRule) {
		this.labelRule = labelRule;
	}

    /**
     * Gets menu key.
     *
     * @return the menu key
     */
    public String getMenuKey() {
		return this.menuKey;
	}

    /**
     * Sets menu key.
     *
     * @param menuKey the menu key
     */
    public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
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

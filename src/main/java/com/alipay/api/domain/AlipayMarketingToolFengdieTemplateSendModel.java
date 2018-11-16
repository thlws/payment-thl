package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分配云凤蝶站点模板
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:49
 */
public class AlipayMarketingToolFengdieTemplateSendModel extends AlipayObject {

	private static final long serialVersionUID = 5537515649722664734L;

	/**
	 * 企业 VIP 用户的ID（以 2088 开头的ID）
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲分配站点模板的空间业务 ID 列表
	 */
	@ApiListField("space_ids")
	@ApiField("string")
	private List<String> spaceIds;

	/**
	 * 欲分配的站点模板的名称，可以在模板包的 package.json 文件中找到 name 字段
	 */
	@ApiField("template_name")
	private String templateName;

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

    /**
     * Gets space ids.
     *
     * @return the space ids
     */
    public List<String> getSpaceIds() {
		return this.spaceIds;
	}

    /**
     * Sets space ids.
     *
     * @param spaceIds the space ids
     */
    public void setSpaceIds(List<String> spaceIds) {
		this.spaceIds = spaceIds;
	}

    /**
     * Gets template name.
     *
     * @return the template name
     */
    public String getTemplateName() {
		return this.templateName;
	}

    /**
     * Sets template name.
     *
     * @param templateName the template name
     */
    public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询个性化扩展区返回对象
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:26:41
 */
public class QueryExtension extends AlipayObject {

	private static final long serialVersionUID = 7392639877169435584L;

	/**
	 * 扩展区列表
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	/**
	 * 扩展区套id
	 */
	@ApiField("extension_key")
	private String extensionKey;

	/**
	 * 标签规则列表
	 */
	@ApiListField("label_rules")
	@ApiField("query_label_rule")
	private List<QueryLabelRule> labelRules;

	/**
	 * 扩展区状态，"ON"代表上线，"OFF"代表下线，只有上线的扩展区才能被用户看到
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets areas.
     *
     * @return the areas
     */
    public List<ExtensionArea> getAreas() {
		return this.areas;
	}

    /**
     * Sets areas.
     *
     * @param areas the areas
     */
    public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

    /**
     * Gets extension key.
     *
     * @return the extension key
     */
    public String getExtensionKey() {
		return this.extensionKey;
	}

    /**
     * Sets extension key.
     *
     * @param extensionKey the extension key
     */
    public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}

    /**
     * Gets label rules.
     *
     * @return the label rules
     */
    public List<QueryLabelRule> getLabelRules() {
		return this.labelRules;
	}

    /**
     * Sets label rules.
     *
     * @param labelRules the label rules
     */
    public void setLabelRules(List<QueryLabelRule> labelRules) {
		this.labelRules = labelRules;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}

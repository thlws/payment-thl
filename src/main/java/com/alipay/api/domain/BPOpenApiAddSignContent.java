package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 加签内容
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:33
 */
public class BPOpenApiAddSignContent extends AlipayObject {

	private static final long serialVersionUID = 5879434562489555766L;

	/**
	 * 自定义的条件跳转。JSON格式
	 */
	@ApiListField("additional_lines")
	@ApiField("string")
	private List<String> additionalLines;

	/**
	 * 任务处理人的域账号列表
	 */
	@ApiField("assignee")
	private String assignee;

	/**
	 * 自定义操作
	 */
	@ApiField("deal_actions")
	private String dealActions;

	/**
	 * 任务处理链接。如果不填，则使用流程平台默认地址
	 */
	@ApiField("deal_url")
	private String dealUrl;

	/**
	 * 详情查看地址。如果不填写，则使用流程平台默认详情地址
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 处理节点展示名称
	 */
	@ApiField("display_name")
	private String displayName;

    /**
     * Gets additional lines.
     *
     * @return the additional lines
     */
    public List<String> getAdditionalLines() {
		return this.additionalLines;
	}

    /**
     * Sets additional lines.
     *
     * @param additionalLines the additional lines
     */
    public void setAdditionalLines(List<String> additionalLines) {
		this.additionalLines = additionalLines;
	}

    /**
     * Gets assignee.
     *
     * @return the assignee
     */
    public String getAssignee() {
		return this.assignee;
	}

    /**
     * Sets assignee.
     *
     * @param assignee the assignee
     */
    public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

    /**
     * Gets deal actions.
     *
     * @return the deal actions
     */
    public String getDealActions() {
		return this.dealActions;
	}

    /**
     * Sets deal actions.
     *
     * @param dealActions the deal actions
     */
    public void setDealActions(String dealActions) {
		this.dealActions = dealActions;
	}

    /**
     * Gets deal url.
     *
     * @return the deal url
     */
    public String getDealUrl() {
		return this.dealUrl;
	}

    /**
     * Sets deal url.
     *
     * @param dealUrl the deal url
     */
    public void setDealUrl(String dealUrl) {
		this.dealUrl = dealUrl;
	}

    /**
     * Gets detail url.
     *
     * @return the detail url
     */
    public String getDetailUrl() {
		return this.detailUrl;
	}

    /**
     * Sets detail url.
     *
     * @param detailUrl the detail url
     */
    public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
		return this.displayName;
	}

    /**
     * Sets display name.
     *
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}

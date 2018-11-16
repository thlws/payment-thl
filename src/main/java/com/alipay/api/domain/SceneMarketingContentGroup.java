package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景营销内容分组
 *
 * @author auto create
 * @since 1.0, 2018-06-05 11:05:01
 */
public class SceneMarketingContentGroup extends AlipayObject {

	private static final long serialVersionUID = 1758267361467374232L;

	/**
	 * 营销内容列表
	 */
	@ApiListField("data_list")
	@ApiField("scene_marketing_content")
	private List<SceneMarketingContent> dataList;

	/**
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 简要描述
	 */
	@ApiField("summary")
	private String summary;

    /**
     * Gets data list.
     *
     * @return the data list
     */
    public List<SceneMarketingContent> getDataList() {
		return this.dataList;
	}

    /**
     * Sets data list.
     *
     * @param dataList the data list
     */
    public void setDataList(List<SceneMarketingContent> dataList) {
		this.dataList = dataList;
	}

    /**
     * Gets group name.
     *
     * @return the group name
     */
    public String getGroupName() {
		return this.groupName;
	}

    /**
     * Sets group name.
     *
     * @param groupName the group name
     */
    public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

    /**
     * Gets summary.
     *
     * @return the summary
     */
    public String getSummary() {
		return this.summary;
	}

    /**
     * Sets summary.
     *
     * @param summary the summary
     */
    public void setSummary(String summary) {
		this.summary = summary;
	}

}

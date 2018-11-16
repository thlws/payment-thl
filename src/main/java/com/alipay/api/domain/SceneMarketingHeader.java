package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景营销头部信息
 *
 * @author auto create
 * @since 1.0, 2018-06-05 11:04:43
 */
public class SceneMarketingHeader extends AlipayObject {

	private static final long serialVersionUID = 6341776216638377351L;

	/**
	 * 图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 子标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 简要描述
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 标签
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 跳转地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon() {
		return this.icon;
	}

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
		this.icon = icon;
	}

    /**
     * Gets sub title.
     *
     * @return the sub title
     */
    public String getSubTitle() {
		return this.subTitle;
	}

    /**
     * Sets sub title.
     *
     * @param subTitle the sub title
     */
    public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
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

    /**
     * Gets tags.
     *
     * @return the tags
     */
    public List<String> getTags() {
		return this.tags;
	}

    /**
     * Sets tags.
     *
     * @param tags the tags
     */
    public void setTags(List<String> tags) {
		this.tags = tags;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
		return this.url;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

}

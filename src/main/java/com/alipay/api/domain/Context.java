package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板上下文，即模板中定义的参数及参数值
 *
 * @author auto create
 * @since 1.0, 2018-03-07 10:30:34
 */
public class Context extends AlipayObject {

	private static final long serialVersionUID = 6699788371166249418L;

	/**
	 * 底部链接描述文字，如“查看详情”
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("first")
	private Keyword first;

	/**
	 * 顶部色条的色值
	 */
	@ApiField("head_color")
	private String headColor;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("keyword1")
	private Keyword keyword1;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("keyword2")
	private Keyword keyword2;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("remark")
	private Keyword remark;

	/**
	 * 点击消息后承接页的地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets action name.
     *
     * @return the action name
     */
    public String getActionName() {
		return this.actionName;
	}

    /**
     * Sets action name.
     *
     * @param actionName the action name
     */
    public void setActionName(String actionName) {
		this.actionName = actionName;
	}

    /**
     * Gets first.
     *
     * @return the first
     */
    public Keyword getFirst() {
		return this.first;
	}

    /**
     * Sets first.
     *
     * @param first the first
     */
    public void setFirst(Keyword first) {
		this.first = first;
	}

    /**
     * Gets head color.
     *
     * @return the head color
     */
    public String getHeadColor() {
		return this.headColor;
	}

    /**
     * Sets head color.
     *
     * @param headColor the head color
     */
    public void setHeadColor(String headColor) {
		this.headColor = headColor;
	}

    /**
     * Gets keyword 1.
     *
     * @return the keyword 1
     */
    public Keyword getKeyword1() {
		return this.keyword1;
	}

    /**
     * Sets keyword 1.
     *
     * @param keyword1 the keyword 1
     */
    public void setKeyword1(Keyword keyword1) {
		this.keyword1 = keyword1;
	}

    /**
     * Gets keyword 2.
     *
     * @return the keyword 2
     */
    public Keyword getKeyword2() {
		return this.keyword2;
	}

    /**
     * Sets keyword 2.
     *
     * @param keyword2 the keyword 2
     */
    public void setKeyword2(Keyword keyword2) {
		this.keyword2 = keyword2;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public Keyword getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(Keyword remark) {
		this.remark = remark;
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

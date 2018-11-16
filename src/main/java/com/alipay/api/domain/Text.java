package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本消息内容
 *
 * @author auto create
 * @since 1.0, 2017-06-29 17:24:44
 */
public class Text extends AlipayObject {

	private static final long serialVersionUID = 2597677163739435699L;

	/**
	 * 文本消息的内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 文本消息的标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
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

}

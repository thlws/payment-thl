package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板权益内容
 *
 * @author auto create
 * @since 1.0, 2018-04-16 19:42:00
 */
public class TemplateRightsContentDTO extends AlipayObject {

	private static final long serialVersionUID = 1719898995664176298L;

	/**
	 * 权益内容详情
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 权益内容标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets detail.
     *
     * @return the detail
     */
    public String getDetail() {
		return this.detail;
	}

    /**
     * Sets detail.
     *
     * @param detail the detail
     */
    public void setDetail(String detail) {
		this.detail = detail;
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

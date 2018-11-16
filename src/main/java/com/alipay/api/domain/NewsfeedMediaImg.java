package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发布动态的图片类型数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class NewsfeedMediaImg extends AlipayObject {

	private static final long serialVersionUID = 7464339617858235848L;

	/**
	 * 图片高度
	 */
	@ApiField("height")
	private String height;

	/**
	 * 图片地址
	 */
	@ApiField("src")
	private String src;

	/**
	 * 图片宽度
	 */
	@ApiField("width")
	private String width;

    /**
     * Gets height.
     *
     * @return the height
     */
    public String getHeight() {
		return this.height;
	}

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(String height) {
		this.height = height;
	}

    /**
     * Gets src.
     *
     * @return the src
     */
    public String getSrc() {
		return this.src;
	}

    /**
     * Sets src.
     *
     * @param src the src
     */
    public void setSrc(String src) {
		this.src = src;
	}

    /**
     * Gets width.
     *
     * @return the width
     */
    public String getWidth() {
		return this.width;
	}

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(String width) {
		this.width = width;
	}

}

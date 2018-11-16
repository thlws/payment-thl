package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销券的使用说明描述
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:28:44
 */
public class InteligentVoucherDescDetail extends AlipayObject {

	private static final long serialVersionUID = 3233682941113474419L;

	/**
	 * 具体描述信息列表
	 */
	@ApiField("details")
	private String details;

	/**
	 * 图片描述信息
	 */
	@ApiField("images")
	private String images;

	/**
	 * 券说明的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 券外部详情描述
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets details.
     *
     * @return the details
     */
    public String getDetails() {
		return this.details;
	}

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(String details) {
		this.details = details;
	}

    /**
     * Gets images.
     *
     * @return the images
     */
    public String getImages() {
		return this.images;
	}

    /**
     * Sets images.
     *
     * @param images the images
     */
    public void setImages(String images) {
		this.images = images;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 链接信息数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class NewsfeedMediaLinkInfo extends AlipayObject {

	private static final long serialVersionUID = 5231258353159377249L;

	/**
	 * 资源ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 资源的来源
	 */
	@ApiField("content_source")
	private String contentSource;

	/**
	 * 资源类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 链接的缩略图
	 */
	@ApiField("thumb")
	private String thumb;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * linkurl
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets content id.
     *
     * @return the content id
     */
    public String getContentId() {
		return this.contentId;
	}

    /**
     * Sets content id.
     *
     * @param contentId the content id
     */
    public void setContentId(String contentId) {
		this.contentId = contentId;
	}

    /**
     * Gets content source.
     *
     * @return the content source
     */
    public String getContentSource() {
		return this.contentSource;
	}

    /**
     * Sets content source.
     *
     * @param contentSource the content source
     */
    public void setContentSource(String contentSource) {
		this.contentSource = contentSource;
	}

    /**
     * Gets content type.
     *
     * @return the content type
     */
    public String getContentType() {
		return this.contentType;
	}

    /**
     * Sets content type.
     *
     * @param contentType the content type
     */
    public void setContentType(String contentType) {
		this.contentType = contentType;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets thumb.
     *
     * @return the thumb
     */
    public String getThumb() {
		return this.thumb;
	}

    /**
     * Sets thumb.
     *
     * @param thumb the thumb
     */
    public void setThumb(String thumb) {
		this.thumb = thumb;
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

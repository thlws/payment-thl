package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图文消息子消息
 *
 * @author auto create
 * @since 1.0, 2017-07-04 11:09:05
 */
public class Article extends AlipayObject {

	private static final long serialVersionUID = 1271516222619232929L;

	/**
	 * 链接文字
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 图文消息内容
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图片链接，对于多条图文消息的第一条消息，该字段不能为空; 请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 图文消息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 点击图文消息跳转的链接
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
     * Gets image url.
     *
     * @return the image url
     */
    public String getImageUrl() {
		return this.imageUrl;
	}

    /**
     * Sets image url.
     *
     * @param imageUrl the image url
     */
    public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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

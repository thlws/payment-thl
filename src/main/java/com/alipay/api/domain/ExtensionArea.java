package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展区
 *
 * @author auto create
 * @since 1.0, 2017-07-04 11:08:57
 */
public class ExtensionArea extends AlipayObject {

	private static final long serialVersionUID = 1655246395638695618L;

	/**
	 * 跳转链接，当content_type为"image"时必传，必须是https或alipays开头的url链接
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 扩展区高度，当content_type值为"h5"时必填，取值范围为200-500的整数
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 扩展区名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 扩展区类型，支持两个值，h5：h5类型，image：图片类型。
	 */
	@ApiField("type")
	private String type;

	/**
	 * 扩展区url，传入图片url或者h5页面url，必须是https开头的链接，如果要传入图片链接，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets goto url.
     *
     * @return the goto url
     */
    public String getGotoUrl() {
		return this.gotoUrl;
	}

    /**
     * Sets goto url.
     *
     * @param gotoUrl the goto url
     */
    public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

    /**
     * Gets height.
     *
     * @return the height
     */
    public Long getHeight() {
		return this.height;
	}

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(Long height) {
		this.height = height;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡行动点配置
 *
 * @author auto create
 * @since 1.0, 2018-08-09 16:22:44
 */
public class TemplateActionInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4388393725155974559L;

	/**
	 * 行动点业务CODE，商户自定义
	 */
	@ApiField("code")
	private String code;

	/**
	 * 小程序页面跳转链接，当url_type取"miniAppUrl"时必填
	 */
	@ApiField("mini_app_url")
	private TemplateActionMiniAppUrlDTO miniAppUrl;

	/**
	 * 行动点展示文案
	 */
	@ApiField("text")
	private String text;

	/**
	 * 行动点跳转链接，当url_type取"url"或不填时必填
	 */
	@ApiField("url")
	private String url;

	/**
	 * 跳转链接类型，当前支持url和miniAppUrl，不填则默认为url类型：
url：对应填写url参数，支持http(s)和支付宝schema地址等；
miniAppUrl: 对应填写mini_app_url参数，跳转至指定的支付宝小程序页面
	 */
	@ApiField("url_type")
	private String urlType;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets mini app url.
     *
     * @return the mini app url
     */
    public TemplateActionMiniAppUrlDTO getMiniAppUrl() {
		return this.miniAppUrl;
	}

    /**
     * Sets mini app url.
     *
     * @param miniAppUrl the mini app url
     */
    public void setMiniAppUrl(TemplateActionMiniAppUrlDTO miniAppUrl) {
		this.miniAppUrl = miniAppUrl;
	}

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
		return this.text;
	}

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
		this.text = text;
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

    /**
     * Gets url type.
     *
     * @return the url type
     */
    public String getUrlType() {
		return this.urlType;
	}

    /**
     * Sets url type.
     *
     * @param urlType the url type
     */
    public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

}

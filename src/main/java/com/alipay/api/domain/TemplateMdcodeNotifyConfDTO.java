package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户动态码通知配置
 *
 * @author auto create
 * @since 1.0, 2017-06-15 01:40:05
 */
public class TemplateMdcodeNotifyConfDTO extends AlipayObject {

	private static final long serialVersionUID = 3287888523418378995L;

	/**
	 * 扩展参数信息；
格式为key-value键值对；
支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数。
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 商户接收发码通知的地址链接；
只支持https地址；
用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets ext params.
     *
     * @return the ext params
     */
    public String getExtParams() {
		return this.extParams;
	}

    /**
     * Sets ext params.
     *
     * @param extParams the ext params
     */
    public void setExtParams(String extParams) {
		this.extParams = extParams;
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

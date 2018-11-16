package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统推广内容
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertAdvContent extends AlipayObject {

	private static final long serialVersionUID = 1834288479521938374L;

	/**
	 * 二维码
	 */
	@ApiField("codec")
	private String codec;

	/**
	 * 访问地址
	 */
	@ApiField("link_url")
	private String linkUrl;

    /**
     * Gets codec.
     *
     * @return the codec
     */
    public String getCodec() {
		return this.codec;
	}

    /**
     * Sets codec.
     *
     * @param codec the codec
     */
    public void setCodec(String codec) {
		this.codec = codec;
	}

    /**
     * Gets link url.
     *
     * @return the link url
     */
    public String getLinkUrl() {
		return this.linkUrl;
	}

    /**
     * Sets link url.
     *
     * @param linkUrl the link url
     */
    public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

}

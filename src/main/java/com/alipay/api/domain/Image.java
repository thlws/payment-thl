package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片信息
 *
 * @author auto create
 * @since 1.0, 2017-06-27 18:37:04
 */
public class Image extends AlipayObject {

	private static final long serialVersionUID = 6691243838159754158L;

	/**
	 * 图片url，请先调用alipay.offline.material.image.upload 图片上传接口获得图片url
	 */
	@ApiField("url")
	private String url;

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

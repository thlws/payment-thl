package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统二维码内容详情
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertContentCodec extends AlipayObject {

	private static final long serialVersionUID = 5674347448461834787L;

	/**
	 * 二维码广告内容
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

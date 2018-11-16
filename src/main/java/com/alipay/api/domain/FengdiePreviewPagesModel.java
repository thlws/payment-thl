package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云凤蝶站点页面预览数据模型
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:00:41
 */
public class FengdiePreviewPagesModel extends AlipayObject {

	private static final long serialVersionUID = 1383775654286595883L;

	/**
	 * 站点页面别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 页面预览地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets alias.
     *
     * @return the alias
     */
    public String getAlias() {
		return this.alias;
	}

    /**
     * Sets alias.
     *
     * @param alias the alias
     */
    public void setAlias(String alias) {
		this.alias = alias;
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

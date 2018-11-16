package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫一扫查询桌码信息
 *
 * @author auto create
 * @since 1.0, 2017-06-15 23:44:52
 */
public class KoubeiCateringTablecodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5256837353443761957L;

	/**
	 * 用户在isv界面通过扫一扫传入的url文本
	 */
	@ApiField("url_context")
	private String urlContext;

    /**
     * Gets url context.
     *
     * @return the url context
     */
    public String getUrlContext() {
		return this.urlContext;
	}

    /**
     * Sets url context.
     *
     * @param urlContext the url context
     */
    public void setUrlContext(String urlContext) {
		this.urlContext = urlContext;
	}

}

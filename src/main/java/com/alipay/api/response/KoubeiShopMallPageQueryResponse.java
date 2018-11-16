package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.page.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:33
 */
public class KoubeiShopMallPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8441388374784726235L;

	/** 
	 * 商圈首页url地址
	 */
	@ApiField("mall_url")
	private String mallUrl;

    /**
     * Sets mall url.
     *
     * @param mallUrl the mall url
     */
    public void setMallUrl(String mallUrl) {
		this.mallUrl = mallUrl;
	}

    /**
     * Gets mall url.
     *
     * @return the mall url
     */
    public String getMallUrl( ) {
		return this.mallUrl;
	}

}

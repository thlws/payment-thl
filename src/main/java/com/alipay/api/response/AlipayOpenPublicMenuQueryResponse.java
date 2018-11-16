package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.query response.
 *
 * @author auto create
 * @since 1.0, 2017-06-07 19:49:27
 */
public class AlipayOpenPublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7149974663851652837L;

	/** 
	 * 一级菜单数组，个数应为1~4个
	 */
	@ApiField("menu_content")
	private String menuContent;

    /**
     * Sets menu content.
     *
     * @param menuContent the menu content
     */
    public void setMenuContent(String menuContent) {
		this.menuContent = menuContent;
	}

    /**
     * Gets menu content.
     *
     * @return the menu content
     */
    public String getMenuContent( ) {
		return this.menuContent;
	}

}

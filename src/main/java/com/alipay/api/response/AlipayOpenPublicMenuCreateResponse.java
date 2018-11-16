package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:53:59
 */
public class AlipayOpenPublicMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8597636814146284989L;

	/** 
	 * 默认菜单菜单key，文本菜单为“default”，icon菜单为“iconDefault”
	 */
	@ApiField("menu_key")
	private String menuKey;

    /**
     * Sets menu key.
     *
     * @param menuKey the menu key
     */
    public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

    /**
     * Gets menu key.
     *
     * @return the menu key
     */
    public String getMenuKey( ) {
		return this.menuKey;
	}

}

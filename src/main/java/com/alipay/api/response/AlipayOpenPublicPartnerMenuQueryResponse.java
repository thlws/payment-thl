package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.partner.menu.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 20:23:59
 */
public class AlipayOpenPublicPartnerMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8222242644783273675L;

	/** 
	 * 服务窗菜单
	 */
	@ApiField("public_menu")
	private String publicMenu;

    /**
     * Sets public menu.
     *
     * @param publicMenu the public menu
     */
    public void setPublicMenu(String publicMenu) {
		this.publicMenu = publicMenu;
	}

    /**
     * Gets public menu.
     *
     * @return the public menu
     */
    public String getPublicMenu( ) {
		return this.publicMenu;
	}

}

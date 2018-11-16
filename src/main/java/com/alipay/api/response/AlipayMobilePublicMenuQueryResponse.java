package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.menu.query response.
 *
 * @author auto create
 * @since 1.0, 2015-11-27 11:29:48
 */
public class AlipayMobilePublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4512468639421671277L;

	/** 
	 * 所有菜单列表json串
	 */
	@ApiField("all_menu_list")
	private String allMenuList;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

    /**
     * Sets all menu list.
     *
     * @param allMenuList the all menu list
     */
    public void setAllMenuList(String allMenuList) {
		this.allMenuList = allMenuList;
	}

    /**
     * Gets all menu list.
     *
     * @return the all menu list
     */
    public String getAllMenuList( ) {
		return this.allMenuList;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}

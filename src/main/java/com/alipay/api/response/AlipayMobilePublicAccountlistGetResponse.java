package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.accountlist.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 20:39:58
 */
public class AlipayMobilePublicAccountlistGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1378796551645789161L;

	/** 
	 * 服务窗列表
	 */
	@ApiField("account_list")
	private String accountList;

	/** 
	 * 响应码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 服务窗列表总数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

    /**
     * Sets account list.
     *
     * @param accountList the account list
     */
    public void setAccountList(String accountList) {
		this.accountList = accountList;
	}

    /**
     * Gets account list.
     *
     * @return the account list
     */
    public String getAccountList( ) {
		return this.accountList;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
		this.count = count;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount( ) {
		return this.count;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}

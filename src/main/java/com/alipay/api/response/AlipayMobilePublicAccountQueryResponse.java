package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicBindAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.account.query response.
 *
 * @author auto create
 * @since 1.0, 2016-03-31 21:02:46
 */
public class AlipayMobilePublicAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5393865339239338115L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 菜单唯一标识
	 */
	@ApiField("menu_key")
	private String menuKey;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 绑定账户列表
	 */
	@ApiListField("public_bind_accounts")
	@ApiField("public_bind_account")
	private List<PublicBindAccount> publicBindAccounts;

	/** 
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

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

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

    /**
     * Sets public bind accounts.
     *
     * @param publicBindAccounts the public bind accounts
     */
    public void setPublicBindAccounts(List<PublicBindAccount> publicBindAccounts) {
		this.publicBindAccounts = publicBindAccounts;
	}

    /**
     * Gets public bind accounts.
     *
     * @return the public bind accounts
     */
    public List<PublicBindAccount> getPublicBindAccounts( ) {
		return this.publicBindAccounts;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark( ) {
		return this.remark;
	}

}

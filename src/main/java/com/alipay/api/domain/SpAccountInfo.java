package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构专户信息模型
 *
 * @author auto create
 * @since 1.0, 2018-01-17 17:16:36
 */
public class SpAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 7894925648383549238L;

	/**
	 * 机构专户开户银行名称
	 */
	@ApiField("account_inst_name")
	private String accountInstName;

	/**
	 * 账户名称（个人对应真实姓名，企业用户对应是企业注册名）
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 机构专户账号
	 */
	@ApiField("sp_account_no")
	private String spAccountNo;

    /**
     * Gets account inst name.
     *
     * @return the account inst name
     */
    public String getAccountInstName() {
		return this.accountInstName;
	}

    /**
     * Sets account inst name.
     *
     * @param accountInstName the account inst name
     */
    public void setAccountInstName(String accountInstName) {
		this.accountInstName = accountInstName;
	}

    /**
     * Gets account name.
     *
     * @return the account name
     */
    public String getAccountName() {
		return this.accountName;
	}

    /**
     * Sets account name.
     *
     * @param accountName the account name
     */
    public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

    /**
     * Gets sp account no.
     *
     * @return the sp account no
     */
    public String getSpAccountNo() {
		return this.spAccountNo;
	}

    /**
     * Sets sp account no.
     *
     * @param spAccountNo the sp account no
     */
    public void setSpAccountNo(String spAccountNo) {
		this.spAccountNo = spAccountNo;
	}

}

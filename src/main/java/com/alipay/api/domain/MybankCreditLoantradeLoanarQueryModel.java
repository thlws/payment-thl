package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询贷款合约
 *
 * @author auto create
 * @since 1.0, 2018-05-11 17:51:09
 */
public class MybankCreditLoantradeLoanarQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5442214139649524378L;

	/**
	 * 客户的角色编号
	 */
	@ApiField("iproleid")
	private String iproleid;

	/**
	 * 合约编号
	 */
	@ApiField("loanarno")
	private String loanarno;

    /**
     * Gets iproleid.
     *
     * @return the iproleid
     */
    public String getIproleid() {
		return this.iproleid;
	}

    /**
     * Sets iproleid.
     *
     * @param iproleid the iproleid
     */
    public void setIproleid(String iproleid) {
		this.iproleid = iproleid;
	}

    /**
     * Gets loanarno.
     *
     * @return the loanarno
     */
    public String getLoanarno() {
		return this.loanarno;
	}

    /**
     * Sets loanarno.
     *
     * @param loanarno the loanarno
     */
    public void setLoanarno(String loanarno) {
		this.loanarno = loanarno;
	}

}

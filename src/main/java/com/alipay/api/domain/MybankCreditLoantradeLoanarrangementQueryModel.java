package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询贷款合约
 *
 * @author auto create
 * @since 1.0, 2017-09-19 14:04:16
 */
public class MybankCreditLoantradeLoanarrangementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4212426192398655494L;

	/**
	 * 网商银行参与者会员角色ID。客户在网商融资平台页面发起贷款申请或者机构调用代客户申贷接口mybank.credit.loanapply.apply.create后，网商会把申请结果以消息的方式通知机构，该字段包含在返回的消息体中。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 合约编号，客户签署合约时获取。
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets loan ar no.
     *
     * @return the loan ar no
     */
    public String getLoanArNo() {
		return this.loanArNo;
	}

    /**
     * Sets loan ar no.
     *
     * @param loanArNo the loan ar no
     */
    public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

}

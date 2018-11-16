package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户还款计划查询
 *
 * @author auto create
 * @since 1.0, 2018-07-18 10:46:20
 */
public class AlipayPcreditLoanRepayplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1265481876636888299L;

	/**
	 * 贷款申请单号，借呗客户申请贷款时系统生成的全局唯一业务流水号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

    /**
     * Gets loan apply no.
     *
     * @return the loan apply no
     */
    public String getLoanApplyNo() {
		return this.loanApplyNo;
	}

    /**
     * Sets loan apply no.
     *
     * @param loanApplyNo the loan apply no
     */
    public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

}

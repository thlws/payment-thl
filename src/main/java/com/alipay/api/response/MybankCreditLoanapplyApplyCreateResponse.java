package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.apply.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-01 20:15:55
 */
public class MybankCreditLoanapplyApplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1747386535889188831L;

	/** 
	 * 申请单编号，展示给客户，无业务意义
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 客户在网商银行的角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 子申请单号，唯一标识一笔申请，业务使用
	 */
	@ApiField("sub_apply_no")
	private String subApplyNo;

    /**
     * Sets apply no.
     *
     * @param applyNo the apply no
     */
    public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

    /**
     * Gets apply no.
     *
     * @return the apply no
     */
    public String getApplyNo( ) {
		return this.applyNo;
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
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId( ) {
		return this.ipRoleId;
	}

    /**
     * Sets sub apply no.
     *
     * @param subApplyNo the sub apply no
     */
    public void setSubApplyNo(String subApplyNo) {
		this.subApplyNo = subApplyNo;
	}

    /**
     * Gets sub apply no.
     *
     * @return the sub apply no
     */
    public String getSubApplyNo( ) {
		return this.subApplyNo;
	}

}

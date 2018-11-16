package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CompanyRole;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.role.get response.
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:33:23
 */
public class ZhimaCreditEpRoleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5264376269247945925L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 自然人担任 法人/股东/主要管理人员 的企业信息
	 */
	@ApiField("company_role")
	private CompanyRole companyRole;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets company role.
     *
     * @param companyRole the company role
     */
    public void setCompanyRole(CompanyRole companyRole) {
		this.companyRole = companyRole;
	}

    /**
     * Gets company role.
     *
     * @return the company role
     */
    public CompanyRole getCompanyRole( ) {
		return this.companyRole;
	}

}

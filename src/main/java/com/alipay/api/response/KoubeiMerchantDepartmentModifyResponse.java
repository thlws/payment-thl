package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:35:00
 */
public class KoubeiMerchantDepartmentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7287682842522336881L;

	/** 
	 * 修改商户部门成功时返回的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

    /**
     * Sets dept id.
     *
     * @param deptId the dept id
     */
    public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

    /**
     * Gets dept id.
     *
     * @return the dept id
     */
    public String getDeptId( ) {
		return this.deptId;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 部门信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-16 19:00:55
 */
public class KoubeiMerchantDepartmentDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8894873241438924263L;

	/**
	 * 人员管理场景的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

    /**
     * Gets dept id.
     *
     * @return the dept id
     */
    public String getDeptId() {
		return this.deptId;
	}

    /**
     * Sets dept id.
     *
     * @param deptId the dept id
     */
    public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

}

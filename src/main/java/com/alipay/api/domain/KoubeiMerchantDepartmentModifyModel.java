package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户部门信息修改
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:27:02
 */
public class KoubeiMerchantDepartmentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3858857327448592449L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 商户部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 商户创建的部门名称，可以修改
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 人员组织场景，组织部门属性标签，现在支持PROCESSING_ROOM, DELIVER_CENTRE, CENTRAL_KITCHEN三种
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 当前部门对应的上级部门id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

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

    /**
     * Gets dept name.
     *
     * @return the dept name
     */
    public String getDeptName() {
		return this.deptName;
	}

    /**
     * Sets dept name.
     *
     * @param deptName the dept name
     */
    public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

    /**
     * Gets label code.
     *
     * @return the label code
     */
    public String getLabelCode() {
		return this.labelCode;
	}

    /**
     * Sets label code.
     *
     * @param labelCode the label code
     */
    public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

    /**
     * Gets parent dept id.
     *
     * @return the parent dept id
     */
    public String getParentDeptId() {
		return this.parentDeptId;
	}

    /**
     * Sets parent dept id.
     *
     * @param parentDeptId the parent dept id
     */
    public void setParentDeptId(String parentDeptId) {
		this.parentDeptId = parentDeptId;
	}

}

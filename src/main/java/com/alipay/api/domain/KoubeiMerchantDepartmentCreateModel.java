package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建商户部门信息
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:26:04
 */
public class KoubeiMerchantDepartmentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6377411578141284978L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 员工管理场景下的商户部门名称，根目录为商户名称，下属部门由商户自己创建，例如可以创建下属部门为“华东大区”
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 组织部门标签，现在有PROCESSING_ROOM, DELIVER_CENTRE, CENTRAL_KITCHEN三种
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 当前需要创建部门的上级部门id
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

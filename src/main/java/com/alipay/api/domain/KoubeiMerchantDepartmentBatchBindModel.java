package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量绑定部门员工关系
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:30:05
 */
public class KoubeiMerchantDepartmentBatchBindModel extends AlipayObject {

	private static final long serialVersionUID = 4745482646369957725L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 部门类型，5为非叶子节点部门即商户创建的部门；6为叶子节点部门即门店，门店在业务上被当成是类型为6的部门
	 */
	@ApiField("dept_type")
	private String deptType;

	/**
	 * 操作员基本信息列表
	 */
	@ApiListField("operator_list")
	@ApiField("simple_operator_model")
	private List<SimpleOperatorModel> operatorList;

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
     * Gets dept type.
     *
     * @return the dept type
     */
    public String getDeptType() {
		return this.deptType;
	}

    /**
     * Sets dept type.
     *
     * @param deptType the dept type
     */
    public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

    /**
     * Gets operator list.
     *
     * @return the operator list
     */
    public List<SimpleOperatorModel> getOperatorList() {
		return this.operatorList;
	}

    /**
     * Sets operator list.
     *
     * @param operatorList the operator list
     */
    public void setOperatorList(List<SimpleOperatorModel> operatorList) {
		this.operatorList = operatorList;
	}

}

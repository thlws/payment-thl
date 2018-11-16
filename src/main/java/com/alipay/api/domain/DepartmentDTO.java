package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商家中心员工管理的部门组织对象
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:28:57
 */
public class DepartmentDTO extends AlipayObject {

	private static final long serialVersionUID = 4589425967285322686L;

	/**
	 * 业务类型KOUBEI_OPERATOR
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 部门组织id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 组织树部门名称
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 组织部门树
	 */
	@ApiField("dept_path")
	private String deptPath;

	/**
	 * 人员组织场景的部门标签码
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 人员组织场景的部门标签名称
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 上级组织部门id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

	/**
	 * 门店id，只有叶子节点部门才有shop_id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 组织部门类型(5为非叶子部门，6为叶子部门)
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
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
     * Gets dept path.
     *
     * @return the dept path
     */
    public String getDeptPath() {
		return this.deptPath;
	}

    /**
     * Sets dept path.
     *
     * @param deptPath the dept path
     */
    public void setDeptPath(String deptPath) {
		this.deptPath = deptPath;
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
     * Gets label name.
     *
     * @return the label name
     */
    public String getLabelName() {
		return this.labelName;
	}

    /**
     * Sets label name.
     *
     * @param labelName the label name
     */
    public void setLabelName(String labelName) {
		this.labelName = labelName;
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

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}

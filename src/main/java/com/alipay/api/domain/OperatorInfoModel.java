package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 包含操作员基本信息、部门、门店信息
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:53:42
 */
public class OperatorInfoModel extends AlipayObject {

	private static final long serialVersionUID = 5177464929833232523L;

	/**
	 * customerId
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 邮件
	 */
	@ApiField("email")
	private String email;

	/**
	 * 部门ID
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 部门树
	 */
	@ApiField("job_tree")
	private String jobTree;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作员姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作员别名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员类型
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 角色名字
	 */
	@ApiField("role_name")
	private String roleName;

	/**
	 * 门店列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * T
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets cid.
     *
     * @return the cid
     */
    public String getCid() {
		return this.cid;
	}

    /**
     * Sets cid.
     *
     * @param cid the cid
     */
    public void setCid(String cid) {
		this.cid = cid;
	}

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
		return this.email;
	}

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
		this.email = email;
	}

    /**
     * Gets job id.
     *
     * @return the job id
     */
    public String getJobId() {
		return this.jobId;
	}

    /**
     * Sets job id.
     *
     * @param jobId the job id
     */
    public void setJobId(String jobId) {
		this.jobId = jobId;
	}

    /**
     * Gets job tree.
     *
     * @return the job tree
     */
    public String getJobTree() {
		return this.jobTree;
	}

    /**
     * Sets job tree.
     *
     * @param jobTree the job tree
     */
    public void setJobTree(String jobTree) {
		this.jobTree = jobTree;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets nick name.
     *
     * @return the nick name
     */
    public String getNickName() {
		return this.nickName;
	}

    /**
     * Sets nick name.
     *
     * @param nickName the nick name
     */
    public void setNickName(String nickName) {
		this.nickName = nickName;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public String getRoleId() {
		return this.roleId;
	}

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
		return this.roleName;
	}

    /**
     * Sets role name.
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds() {
		return this.shopIds;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}

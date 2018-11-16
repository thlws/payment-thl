package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品项目组
 *
 * @author auto create
 * @since 1.0, 2018-09-14 15:09:11
 */
public class KbdishGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 1199896121728449368L;

	/**
	 * 操作员
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 套餐组明细
	 */
	@ApiListField("detail_list")
	@ApiField("kbdish_group_detail_info")
	private List<KbdishGroupDetailInfo> detailList;

	/**
	 * 组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 预留字段
	 */
	@ApiField("group_rule")
	private String groupRule;

	/**
	 * 版本号 就是一个数据操作的时间戳
	 */
	@ApiField("group_version")
	private String groupVersion;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 份数限制
	 */
	@ApiField("unit_count_limit")
	private String unitCountLimit;

	/**
	 * 修改操作小二
	 */
	@ApiField("update_user")
	private String updateUser;

    /**
     * Gets create user.
     *
     * @return the create user
     */
    public String getCreateUser() {
		return this.createUser;
	}

    /**
     * Sets create user.
     *
     * @param createUser the create user
     */
    public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

    /**
     * Gets detail list.
     *
     * @return the detail list
     */
    public List<KbdishGroupDetailInfo> getDetailList() {
		return this.detailList;
	}

    /**
     * Sets detail list.
     *
     * @param detailList the detail list
     */
    public void setDetailList(List<KbdishGroupDetailInfo> detailList) {
		this.detailList = detailList;
	}

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

    /**
     * Gets group name.
     *
     * @return the group name
     */
    public String getGroupName() {
		return this.groupName;
	}

    /**
     * Sets group name.
     *
     * @param groupName the group name
     */
    public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

    /**
     * Gets group rule.
     *
     * @return the group rule
     */
    public String getGroupRule() {
		return this.groupRule;
	}

    /**
     * Sets group rule.
     *
     * @param groupRule the group rule
     */
    public void setGroupRule(String groupRule) {
		this.groupRule = groupRule;
	}

    /**
     * Gets group version.
     *
     * @return the group version
     */
    public String getGroupVersion() {
		return this.groupVersion;
	}

    /**
     * Sets group version.
     *
     * @param groupVersion the group version
     */
    public void setGroupVersion(String groupVersion) {
		this.groupVersion = groupVersion;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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

    /**
     * Gets unit count limit.
     *
     * @return the unit count limit
     */
    public String getUnitCountLimit() {
		return this.unitCountLimit;
	}

    /**
     * Sets unit count limit.
     *
     * @param unitCountLimit the unit count limit
     */
    public void setUnitCountLimit(String unitCountLimit) {
		this.unitCountLimit = unitCountLimit;
	}

    /**
     * Gets update user.
     *
     * @return the update user
     */
    public String getUpdateUser() {
		return this.updateUser;
	}

    /**
     * Sets update user.
     *
     * @param updateUser the update user
     */
    public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}

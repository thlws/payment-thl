package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交修改群名称
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:16:05
 */
public class AlipaySocialBaseChatGnameModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5537485744526124991L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 群名称
	 */
	@ApiField("group_name")
	private String groupName;

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

}

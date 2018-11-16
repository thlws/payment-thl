package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户分组删除接口
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:55:29
 */
public class AlipayOpenPublicGroupDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4532548184152545976L;

	/**
	 * 需要删除的用户分组的id
	 */
	@ApiField("group_id")
	private String groupId;

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

}

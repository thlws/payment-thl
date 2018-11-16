package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交查询群信息
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:47
 */
public class AlipaySocialBaseChatGinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3786574425621942518L;

	/**
	 * 群id
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

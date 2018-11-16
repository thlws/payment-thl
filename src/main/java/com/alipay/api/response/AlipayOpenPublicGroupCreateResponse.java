package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:55:36
 */
public class AlipayOpenPublicGroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6246182536888489145L;

	/** 
	 * 分组id
	 */
	@ApiField("group_id")
	private String groupId;

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId( ) {
		return this.groupId;
	}

}

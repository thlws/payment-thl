package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝社交修改群公告
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:55
 */
public class AlipaySocialBaseChatGnoticeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4399734471969767354L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 群公告
	 */
	@ApiField("group_notice")
	private String groupNotice;

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
     * Gets group notice.
     *
     * @return the group notice
     */
    public String getGroupNotice() {
		return this.groupNotice;
	}

    /**
     * Sets group notice.
     *
     * @param groupNotice the group notice
     */
    public void setGroupNotice(String groupNotice) {
		this.groupNotice = groupNotice;
	}

}

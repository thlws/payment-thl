package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 建群时的群设置
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class GroupSetting extends AlipayObject {

	private static final long serialVersionUID = 6647493579959952849L;

	/**
	 * 群名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 是否开放群成员邀请
	 */
	@ApiField("is_openinv")
	private Boolean isOpeninv;

	/**
	 * 群公告
	 */
	@ApiField("public_notice")
	private String publicNotice;

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
     * Gets is openinv.
     *
     * @return the is openinv
     */
    public Boolean getIsOpeninv() {
		return this.isOpeninv;
	}

    /**
     * Sets is openinv.
     *
     * @param isOpeninv the is openinv
     */
    public void setIsOpeninv(Boolean isOpeninv) {
		this.isOpeninv = isOpeninv;
	}

    /**
     * Gets public notice.
     *
     * @return the public notice
     */
    public String getPublicNotice() {
		return this.publicNotice;
	}

    /**
     * Sets public notice.
     *
     * @param publicNotice the public notice
     */
    public void setPublicNotice(String publicNotice) {
		this.publicNotice = publicNotice;
	}

}

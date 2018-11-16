package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝增加群成员
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:46:44
 */
public class AlipaySocialBaseGroupmemberAddModel extends AlipayObject {

	private static final long serialVersionUID = 8333646679497967583L;

	/**
	 * 加人的时候，是否需要校验加人者和被加的人的好友关系
	 */
	@ApiField("friend_validate")
	private Boolean friendValidate;

	/**
	 * 群的id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 增加群成员的时候，选择的用户userid,每次不能超过50个，每个群人数上限500人，user_ids的值为错误的uid时，多个uid的情况下会添加成功正确的uid，如果所有添加的uid全部错误，则会报错
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

    /**
     * Gets friend validate.
     *
     * @return the friend validate
     */
    public Boolean getFriendValidate() {
		return this.friendValidate;
	}

    /**
     * Sets friend validate.
     *
     * @param friendValidate the friend validate
     */
    public void setFriendValidate(Boolean friendValidate) {
		this.friendValidate = friendValidate;
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
     * Gets user ids.
     *
     * @return the user ids
     */
    public List<String> getUserIds() {
		return this.userIds;
	}

    /**
     * Sets user ids.
     *
     * @param userIds the user ids
     */
    public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

}

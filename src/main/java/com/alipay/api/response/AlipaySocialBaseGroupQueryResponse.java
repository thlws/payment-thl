package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupMemberInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.group.query response.
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:46:49
 */
public class AlipaySocialBaseGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8586345135472281295L;

	/** 
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/** 
	 * 群的群成员总数
	 */
	@ApiField("group_member_count")
	private Long groupMemberCount;

	/** 
	 * 群成员列表
	 */
	@ApiListField("group_members")
	@ApiField("group_member_info")
	private List<GroupMemberInfo> groupMembers;

	/** 
	 * 群的名称
	 */
	@ApiField("group_name")
	private String groupName;

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

    /**
     * Sets group member count.
     *
     * @param groupMemberCount the group member count
     */
    public void setGroupMemberCount(Long groupMemberCount) {
		this.groupMemberCount = groupMemberCount;
	}

    /**
     * Gets group member count.
     *
     * @return the group member count
     */
    public Long getGroupMemberCount( ) {
		return this.groupMemberCount;
	}

    /**
     * Sets group members.
     *
     * @param groupMembers the group members
     */
    public void setGroupMembers(List<GroupMemberInfo> groupMembers) {
		this.groupMembers = groupMembers;
	}

    /**
     * Gets group members.
     *
     * @return the group members
     */
    public List<GroupMemberInfo> getGroupMembers( ) {
		return this.groupMembers;
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
     * Gets group name.
     *
     * @return the group name
     */
    public String getGroupName( ) {
		return this.groupName;
	}

}

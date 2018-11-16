package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupInfo;
import com.alipay.api.domain.MemberInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.ginfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:47
 */
public class AlipaySocialBaseChatGinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8565515946289457237L;

	/** 
	 * 群信息
	 */
	@ApiField("group_info")
	private GroupInfo groupInfo;

	/** 
	 * 群成员信息列表
	 */
	@ApiListField("member_infos")
	@ApiField("member_info")
	private List<MemberInfo> memberInfos;

    /**
     * Sets group info.
     *
     * @param groupInfo the group info
     */
    public void setGroupInfo(GroupInfo groupInfo) {
		this.groupInfo = groupInfo;
	}

    /**
     * Gets group info.
     *
     * @return the group info
     */
    public GroupInfo getGroupInfo( ) {
		return this.groupInfo;
	}

    /**
     * Sets member infos.
     *
     * @param memberInfos the member infos
     */
    public void setMemberInfos(List<MemberInfo> memberInfos) {
		this.memberInfos = memberInfos;
	}

    /**
     * Gets member infos.
     *
     * @return the member infos
     */
    public List<MemberInfo> getMemberInfos( ) {
		return this.memberInfos;
	}

}

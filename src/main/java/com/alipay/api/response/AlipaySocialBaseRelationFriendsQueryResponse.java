package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FriendListVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.relation.friends.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-06 10:50:00
 */
public class AlipaySocialBaseRelationFriendsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7476734636561986116L;

	/** 
	 * 好友列表数据
	 */
	@ApiListField("friend_list")
	@ApiField("friend_list_v_o")
	private List<FriendListVO> friendList;

    /**
     * Sets friend list.
     *
     * @param friendList the friend list
     */
    public void setFriendList(List<FriendListVO> friendList) {
		this.friendList = friendList;
	}

    /**
     * Gets friend list.
     *
     * @return the friend list
     */
    public List<FriendListVO> getFriendList( ) {
		return this.friendList;
	}

}

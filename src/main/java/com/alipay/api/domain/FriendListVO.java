package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好友列表的模型对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class FriendListVO extends AlipayObject {

	private static final long serialVersionUID = 5394637435746852388L;

	/**
	 * 头像的服务地址
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 是否双向好友
	 */
	@ApiField("real_friend")
	private Boolean realFriend;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 有可能包含emoji表情，业务方要注意编码
	 */
	@ApiField("view_name")
	private String viewName;

    /**
     * Gets head img.
     *
     * @return the head img
     */
    public String getHeadImg() {
		return this.headImg;
	}

    /**
     * Sets head img.
     *
     * @param headImg the head img
     */
    public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

    /**
     * Gets real friend.
     *
     * @return the real friend
     */
    public Boolean getRealFriend() {
		return this.realFriend;
	}

    /**
     * Sets real friend.
     *
     * @param realFriend the real friend
     */
    public void setRealFriend(Boolean realFriend) {
		this.realFriend = realFriend;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets view name.
     *
     * @return the view name
     */
    public String getViewName() {
		return this.viewName;
	}

    /**
     * Sets view name.
     *
     * @param viewName the view name
     */
    public void setViewName(String viewName) {
		this.viewName = viewName;
	}

}

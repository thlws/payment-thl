package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组合关系模型对象
 *
 * @author auto create
 * @since 1.0, 2017-08-18 16:52:40
 */
public class RelationCombinedVO extends AlipayObject {

	private static final long serialVersionUID = 6813549847142229138L;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private ExtraInfoVO extInfo;

	/**
	 * 支付宝头像
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 是否支付宝双向好友
	 */
	@ApiField("real_friend")
	private Boolean realFriend;

	/**
	 * 支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 有可能包含emoji表情，业务方要注意编码
	 */
	@ApiField("view_name")
	private String viewName;

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public ExtraInfoVO getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(ExtraInfoVO extInfo) {
		this.extInfo = extInfo;
	}

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

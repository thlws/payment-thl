package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于为服务窗合作伙伴（如YunOS），提供订阅关系（关注与取消关注）同步功能
 *
 * @author auto create
 * @since 1.0, 2016-03-31 21:05:13
 */
public class AlipayOpenPublicPartnerSubscribeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8566461212773588452L;

	/**
	 * 是否接受服务窗消息
	 */
	@ApiField("accept_msg")
	private String acceptMsg;

	/**
	 * 关注的服务窗id
	 */
	@ApiField("follow_object_id")
	private String followObjectId;

	/**
	 * 操作类型，添加关注或取消关注
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 是否打开接收公众号PUSH提醒开关 ON:打开 OFF:关闭
	 */
	@ApiField("push_switch")
	private String pushSwitch;

	/**
	 * 关注来源
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 关注服务窗的用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets accept msg.
     *
     * @return the accept msg
     */
    public String getAcceptMsg() {
		return this.acceptMsg;
	}

    /**
     * Sets accept msg.
     *
     * @param acceptMsg the accept msg
     */
    public void setAcceptMsg(String acceptMsg) {
		this.acceptMsg = acceptMsg;
	}

    /**
     * Gets follow object id.
     *
     * @return the follow object id
     */
    public String getFollowObjectId() {
		return this.followObjectId;
	}

    /**
     * Sets follow object id.
     *
     * @param followObjectId the follow object id
     */
    public void setFollowObjectId(String followObjectId) {
		this.followObjectId = followObjectId;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

    /**
     * Gets push switch.
     *
     * @return the push switch
     */
    public String getPushSwitch() {
		return this.pushSwitch;
	}

    /**
     * Sets push switch.
     *
     * @param pushSwitch the push switch
     */
    public void setPushSwitch(String pushSwitch) {
		this.pushSwitch = pushSwitch;
	}

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
		return this.sourceId;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
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

}

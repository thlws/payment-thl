package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动触发
 *
 * @author auto create
 * @since 1.0, 2017-12-04 10:02:45
 */
public class AlipayMarketingCampaignDrawcampTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 5555178668368159121L;

	/**
	 * 用户参与活动的手机号（如果是用户直接输入手机号的活动形式，该项必填，作为识别用户的依据）
	 */
	@ApiField("bind_mobile")
	private String bindMobile;

	/**
	 * 活动id，获取方式：调用方通过活动创建接口alipay.marketing.campaign.drawcamp.create 生成；联系支付宝运营同学获取（适用于支付宝平台活动，由合作伙伴调用触发）
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 请求来源，目前支持：1微信 2 微博 3虾米 4淘宝  5天猫
	 */
	@ApiField("camp_source")
	private Long campSource;

	/**
	 * 渠道来源参数，记录调用方level 1~n级渠道来源信息，用于业务数据统计和分析
	 */
	@ApiField("channel_info")
	private String channelInfo;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * rds嵌入页面的js收集的用户行为数据
	 */
	@ApiField("json_ua")
	private String jsonUa;

	/**
	 * 用户登录账号名：邮箱或手机号。已知支付宝账号的活动触发调用中，user_id与login_id至少有一个非空，都非空时，以user_id为准。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 支付宝用户uid：支付宝用户唯一标识。该参数用于已知支付宝账号的活动触发。user_id、login_id、bind_mobile三个参数至少有一个非空。
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets bind mobile.
     *
     * @return the bind mobile
     */
    public String getBindMobile() {
		return this.bindMobile;
	}

    /**
     * Sets bind mobile.
     *
     * @param bindMobile the bind mobile
     */
    public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId() {
		return this.campId;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

    /**
     * Gets camp source.
     *
     * @return the camp source
     */
    public Long getCampSource() {
		return this.campSource;
	}

    /**
     * Sets camp source.
     *
     * @param campSource the camp source
     */
    public void setCampSource(Long campSource) {
		this.campSource = campSource;
	}

    /**
     * Gets channel info.
     *
     * @return the channel info
     */
    public String getChannelInfo() {
		return this.channelInfo;
	}

    /**
     * Sets channel info.
     *
     * @param channelInfo the channel info
     */
    public void setChannelInfo(String channelInfo) {
		this.channelInfo = channelInfo;
	}

    /**
     * Gets client ip.
     *
     * @return the client ip
     */
    public String getClientIp() {
		return this.clientIp;
	}

    /**
     * Sets client ip.
     *
     * @param clientIp the client ip
     */
    public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

    /**
     * Gets json ua.
     *
     * @return the json ua
     */
    public String getJsonUa() {
		return this.jsonUa;
	}

    /**
     * Sets json ua.
     *
     * @param jsonUa the json ua
     */
    public void setJsonUa(String jsonUa) {
		this.jsonUa = jsonUa;
	}

    /**
     * Gets login id.
     *
     * @return the login id
     */
    public String getLoginId() {
		return this.loginId;
	}

    /**
     * Sets login id.
     *
     * @param loginId the login id
     */
    public void setLoginId(String loginId) {
		this.loginId = loginId;
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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户攒油请求
 *
 * @author auto create
 * @since 1.0, 2017-09-28 11:02:58
 */
public class AlipayInsAutoUserPointReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1359435317747588455L;

	/**
	 * 车险活动类型编码。
攒油：SAVE_OIL
	 */
	@ApiField("auto_campaign_type")
	private String autoCampaignType;

	/**
	 * 扩展参数。
BIZ_END_TIME:业务结束时间，值为时间戳
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 车险活动的接入场景。
例如，车险攒油活动的接入场景码。
高德导航：gaode_use
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets auto campaign type.
     *
     * @return the auto campaign type
     */
    public String getAutoCampaignType() {
		return this.autoCampaignType;
	}

    /**
     * Sets auto campaign type.
     *
     * @param autoCampaignType the auto campaign type
     */
    public void setAutoCampaignType(String autoCampaignType) {
		this.autoCampaignType = autoCampaignType;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo() {
		return this.extendInfo;
	}

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets scene type.
     *
     * @return the scene type
     */
    public String getSceneType() {
		return this.sceneType;
	}

    /**
     * Sets scene type.
     *
     * @param sceneType the scene type
     */
    public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
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

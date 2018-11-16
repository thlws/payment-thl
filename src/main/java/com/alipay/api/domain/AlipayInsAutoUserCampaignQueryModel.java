package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户参与活动状态
 *
 * @author auto create
 * @since 1.0, 2017-09-28 11:02:50
 */
public class AlipayInsAutoUserCampaignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2688398547518682743L;

	/**
	 * 车险活动类型编码。
攒油活动：SAVE_OIL
	 */
	@ApiField("auto_campaign_type")
	private String autoCampaignType;

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

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询有效子凭证详细信息
 *
 * @author auto create
 * @since 1.0, 2018-07-25 15:27:12
 */
public class AlipayMarketingCampaignSubcertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3349612845328453551L;

	/**
	 * 用户登录账号名：邮箱或手机号。已知支付宝账号的活动触发调用中，user_id与login_id至少有一个非空，都非空时，以user_id为准。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 营销平台凭证批次号
	 */
	@ApiField("lot_num")
	private String lotNum;

	/**
	 * 支付宝用户uid：支付宝用户唯一标识。该参数用于已知支付宝账号的活动触发。user_id、login_id两个参数至少有一个非空。
	 */
	@ApiField("user_id")
	private String userId;

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
     * Gets lot num.
     *
     * @return the lot num
     */
    public String getLotNum() {
		return this.lotNum;
	}

    /**
     * Sets lot num.
     *
     * @param lotNum the lot num
     */
    public void setLotNum(String lotNum) {
		this.lotNum = lotNum;
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

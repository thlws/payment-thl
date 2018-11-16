package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触发现金红包活动
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:18
 */
public class AlipayMarketingCampaignCashTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 3466716452787952836L;

	/**
	 * 现金活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/**
	 * 用户登录账号名：邮箱或手机号。user_id与login_id至少有一个非空，都非空时，以user_id为准。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 此字段如果传入金额，就忽略prize_type算法，按照传入的金额发奖。如果不传或者小于等于0，则按照活动创建时指定的prize_type为fixed或者random算法发奖
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * 领取红包的外部业务号，只由可由字母、数字、下划线组成。同一个活动中不可重复，相同的外部业务号会被幂等并返回之前的结果。不填时，系统会生成一个默认固定的外部业务号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户唯一标识userId。user_id与login_id至少有一个非空；都非空时，以user_id为准。
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets crowd no.
     *
     * @return the crowd no
     */
    public String getCrowdNo() {
		return this.crowdNo;
	}

    /**
     * Sets crowd no.
     *
     * @param crowdNo the crowd no
     */
    public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
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
     * Gets order price.
     *
     * @return the order price
     */
    public String getOrderPrice() {
		return this.orderPrice;
	}

    /**
     * Sets order price.
     *
     * @param orderPrice the order price
     */
    public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
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

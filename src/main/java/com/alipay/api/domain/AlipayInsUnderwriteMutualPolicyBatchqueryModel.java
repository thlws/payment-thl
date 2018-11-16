package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据用户ID与互助计划ID查询保单号列表
 *
 * @author auto create
 * @since 1.0, 2018-05-30 11:18:48
 */
public class AlipayInsUnderwriteMutualPolicyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6257822463521941822L;

	/**
	 * 渠道来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 计划ID，宝贝计划(BAOBEI_PLAN)
	 */
	@ApiField("plan_no")
	private String planNo;

	/**
	 * 来源，如支付宝客户端(MOBILE_APP)
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets plan no.
     *
     * @return the plan no
     */
    public String getPlanNo() {
		return this.planNo;
	}

    /**
     * Sets plan no.
     *
     * @param planNo the plan no
     */
    public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
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

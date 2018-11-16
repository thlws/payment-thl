package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销立减活动预算创建
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:19:16
 */
public class AlipayMarketingCampaignDiscountBudgetCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6577453453599572814L;

	/**
	 * 业务名称，和out_biz_no一起进行幂等控制
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 预算库使用结束时间，格式：yyyy-MM-dd mm:hh:ss
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 预算名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 预算创建业务号，和biz_from一起进行幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 积分预算库ID
	 */
	@ApiField("out_budget_no")
	private String outBudgetNo;

	/**
	 * 发行人支付宝登录账号
	 */
	@ApiField("publisher_logon_id")
	private String publisherLogonId;

	/**
	 * 预算金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

    /**
     * Gets biz from.
     *
     * @return the biz from
     */
    public String getBizFrom() {
		return this.bizFrom;
	}

    /**
     * Sets biz from.
     *
     * @param bizFrom the biz from
     */
    public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
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
     * Gets out budget no.
     *
     * @return the out budget no
     */
    public String getOutBudgetNo() {
		return this.outBudgetNo;
	}

    /**
     * Sets out budget no.
     *
     * @param outBudgetNo the out budget no
     */
    public void setOutBudgetNo(String outBudgetNo) {
		this.outBudgetNo = outBudgetNo;
	}

    /**
     * Gets publisher logon id.
     *
     * @return the publisher logon id
     */
    public String getPublisherLogonId() {
		return this.publisherLogonId;
	}

    /**
     * Sets publisher logon id.
     *
     * @param publisherLogonId the publisher logon id
     */
    public void setPublisherLogonId(String publisherLogonId) {
		this.publisherLogonId = publisherLogonId;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}

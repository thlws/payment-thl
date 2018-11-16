package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 能够创商户建领券活动,后续支持
 *
 * @author auto create
 * @since 1.0, 2016-05-09 17:09:27
 */
public class AlipayMarketingCampaignActivityOfflineCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8794938896622434484L;

	/**
	 * 预算信息
	 */
	@ApiField("budget")
	private OpenPromoBudget budget;

	/**
	 * 活动信息
	 */
	@ApiField("camp")
	private OpenPromoCamp camp;

	/**
	 * 活动创建单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 奖品信息
	 */
	@ApiField("prize")
	private OpenPromoPrize prize;

    /**
     * Gets budget.
     *
     * @return the budget
     */
    public OpenPromoBudget getBudget() {
		return this.budget;
	}

    /**
     * Sets budget.
     *
     * @param budget the budget
     */
    public void setBudget(OpenPromoBudget budget) {
		this.budget = budget;
	}

    /**
     * Gets camp.
     *
     * @return the camp
     */
    public OpenPromoCamp getCamp() {
		return this.camp;
	}

    /**
     * Sets camp.
     *
     * @param camp the camp
     */
    public void setCamp(OpenPromoCamp camp) {
		this.camp = camp;
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
     * Gets prize.
     *
     * @return the prize
     */
    public OpenPromoPrize getPrize() {
		return this.prize;
	}

    /**
     * Sets prize.
     *
     * @param prize the prize
     */
    public void setPrize(OpenPromoPrize prize) {
		this.prize = prize;
	}

}

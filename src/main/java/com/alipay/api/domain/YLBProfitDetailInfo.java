package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝收益详情数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class YLBProfitDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3753823338143666722L;

	/**
	 * 近1日收益，单位为元
	 */
	@ApiField("day_profit")
	private String dayProfit;

	/**
	 * 近1月收益，单位为元
	 */
	@ApiField("month_profit")
	private String monthProfit;

	/**
	 * 历史累计收益，单位为元
	 */
	@ApiField("total_profit")
	private String totalProfit;

	/**
	 * 近1周收益，单位为元
	 */
	@ApiField("week_profit")
	private String weekProfit;

    /**
     * Gets day profit.
     *
     * @return the day profit
     */
    public String getDayProfit() {
		return this.dayProfit;
	}

    /**
     * Sets day profit.
     *
     * @param dayProfit the day profit
     */
    public void setDayProfit(String dayProfit) {
		this.dayProfit = dayProfit;
	}

    /**
     * Gets month profit.
     *
     * @return the month profit
     */
    public String getMonthProfit() {
		return this.monthProfit;
	}

    /**
     * Sets month profit.
     *
     * @param monthProfit the month profit
     */
    public void setMonthProfit(String monthProfit) {
		this.monthProfit = monthProfit;
	}

    /**
     * Gets total profit.
     *
     * @return the total profit
     */
    public String getTotalProfit() {
		return this.totalProfit;
	}

    /**
     * Sets total profit.
     *
     * @param totalProfit the total profit
     */
    public void setTotalProfit(String totalProfit) {
		this.totalProfit = totalProfit;
	}

    /**
     * Gets week profit.
     *
     * @return the week profit
     */
    public String getWeekProfit() {
		return this.weekProfit;
	}

    /**
     * Sets week profit.
     *
     * @param weekProfit the week profit
     */
    public void setWeekProfit(String weekProfit) {
		this.weekProfit = weekProfit;
	}

}

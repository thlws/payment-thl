package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.smartactivity.forecast response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:02:52
 */
public class KoubeiMarketingDataSmartactivityForecastResponse extends AlipayResponse {

	private static final long serialVersionUID = 1855196147984184991L;

	/** 
	 * 领取数量 上限值
	 */
	@ApiField("apply_cnt_max")
	private String applyCntMax;

	/** 
	 * 领取数量 下限值
	 */
	@ApiField("apply_cnt_min")
	private String applyCntMin;

	/** 
	 * 新增曝光数量 上限值
	 */
	@ApiField("increased_exposure_max")
	private String increasedExposureMax;

	/** 
	 * 新增曝光数量 下限值
	 */
	@ApiField("increased_exposure_min")
	private String increasedExposureMin;

	/** 
	 * 提升复购率区间上限
	 */
	@ApiField("repay_rate_range_max")
	private String repayRateRangeMax;

	/** 
	 * 提升复购率区间下限
	 */
	@ApiField("repay_rate_range_min")
	private String repayRateRangeMin;

	/** 
	 * 活动收益金额(分)区间上限值
	 */
	@ApiField("trade_amt_range_max")
	private String tradeAmtRangeMax;

	/** 
	 * 活动收益金额(分)区间下限值
	 */
	@ApiField("trade_amt_range_min")
	private String tradeAmtRangeMin;

	/** 
	 * 核销数量区间上限
	 */
	@ApiField("verify_count_range_max")
	private String verifyCountRangeMax;

	/** 
	 * 核销数量区间下限
	 */
	@ApiField("verify_count_range_min")
	private String verifyCountRangeMin;

    /**
     * Sets apply cnt max.
     *
     * @param applyCntMax the apply cnt max
     */
    public void setApplyCntMax(String applyCntMax) {
		this.applyCntMax = applyCntMax;
	}

    /**
     * Gets apply cnt max.
     *
     * @return the apply cnt max
     */
    public String getApplyCntMax( ) {
		return this.applyCntMax;
	}

    /**
     * Sets apply cnt min.
     *
     * @param applyCntMin the apply cnt min
     */
    public void setApplyCntMin(String applyCntMin) {
		this.applyCntMin = applyCntMin;
	}

    /**
     * Gets apply cnt min.
     *
     * @return the apply cnt min
     */
    public String getApplyCntMin( ) {
		return this.applyCntMin;
	}

    /**
     * Sets increased exposure max.
     *
     * @param increasedExposureMax the increased exposure max
     */
    public void setIncreasedExposureMax(String increasedExposureMax) {
		this.increasedExposureMax = increasedExposureMax;
	}

    /**
     * Gets increased exposure max.
     *
     * @return the increased exposure max
     */
    public String getIncreasedExposureMax( ) {
		return this.increasedExposureMax;
	}

    /**
     * Sets increased exposure min.
     *
     * @param increasedExposureMin the increased exposure min
     */
    public void setIncreasedExposureMin(String increasedExposureMin) {
		this.increasedExposureMin = increasedExposureMin;
	}

    /**
     * Gets increased exposure min.
     *
     * @return the increased exposure min
     */
    public String getIncreasedExposureMin( ) {
		return this.increasedExposureMin;
	}

    /**
     * Sets repay rate range max.
     *
     * @param repayRateRangeMax the repay rate range max
     */
    public void setRepayRateRangeMax(String repayRateRangeMax) {
		this.repayRateRangeMax = repayRateRangeMax;
	}

    /**
     * Gets repay rate range max.
     *
     * @return the repay rate range max
     */
    public String getRepayRateRangeMax( ) {
		return this.repayRateRangeMax;
	}

    /**
     * Sets repay rate range min.
     *
     * @param repayRateRangeMin the repay rate range min
     */
    public void setRepayRateRangeMin(String repayRateRangeMin) {
		this.repayRateRangeMin = repayRateRangeMin;
	}

    /**
     * Gets repay rate range min.
     *
     * @return the repay rate range min
     */
    public String getRepayRateRangeMin( ) {
		return this.repayRateRangeMin;
	}

    /**
     * Sets trade amt range max.
     *
     * @param tradeAmtRangeMax the trade amt range max
     */
    public void setTradeAmtRangeMax(String tradeAmtRangeMax) {
		this.tradeAmtRangeMax = tradeAmtRangeMax;
	}

    /**
     * Gets trade amt range max.
     *
     * @return the trade amt range max
     */
    public String getTradeAmtRangeMax( ) {
		return this.tradeAmtRangeMax;
	}

    /**
     * Sets trade amt range min.
     *
     * @param tradeAmtRangeMin the trade amt range min
     */
    public void setTradeAmtRangeMin(String tradeAmtRangeMin) {
		this.tradeAmtRangeMin = tradeAmtRangeMin;
	}

    /**
     * Gets trade amt range min.
     *
     * @return the trade amt range min
     */
    public String getTradeAmtRangeMin( ) {
		return this.tradeAmtRangeMin;
	}

    /**
     * Sets verify count range max.
     *
     * @param verifyCountRangeMax the verify count range max
     */
    public void setVerifyCountRangeMax(String verifyCountRangeMax) {
		this.verifyCountRangeMax = verifyCountRangeMax;
	}

    /**
     * Gets verify count range max.
     *
     * @return the verify count range max
     */
    public String getVerifyCountRangeMax( ) {
		return this.verifyCountRangeMax;
	}

    /**
     * Sets verify count range min.
     *
     * @param verifyCountRangeMin the verify count range min
     */
    public void setVerifyCountRangeMin(String verifyCountRangeMin) {
		this.verifyCountRangeMin = verifyCountRangeMin;
	}

    /**
     * Gets verify count range min.
     *
     * @return the verify count range min
     */
    public String getVerifyCountRangeMin( ) {
		return this.verifyCountRangeMin;
	}

}

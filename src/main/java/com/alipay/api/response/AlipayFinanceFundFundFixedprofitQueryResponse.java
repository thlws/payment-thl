package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.fund.fixedprofit.query response.
 *
 * @author auto create
 * @since 1.0, 2017-10-30 14:15:24
 */
public class AlipayFinanceFundFundFixedprofitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8777767154313142261L;

	/** 
	 * 过去5年定投收益率
	 */
	@ApiField("last_five_year")
	private String lastFiveYear;

	/** 
	 * 近一年定投收益率
	 */
	@ApiField("last_one_year")
	private String lastOneYear;

	/** 
	 * 最近三年定投收益率
	 */
	@ApiField("last_three_year")
	private String lastThreeYear;

	/** 
	 * 过去2年定投收益率
	 */
	@ApiField("last_two_year")
	private String lastTwoYear;

	/** 
	 * 自从成立以来
	 */
	@ApiField("since_establish")
	private String sinceEstablish;

    /**
     * Sets last five year.
     *
     * @param lastFiveYear the last five year
     */
    public void setLastFiveYear(String lastFiveYear) {
		this.lastFiveYear = lastFiveYear;
	}

    /**
     * Gets last five year.
     *
     * @return the last five year
     */
    public String getLastFiveYear( ) {
		return this.lastFiveYear;
	}

    /**
     * Sets last one year.
     *
     * @param lastOneYear the last one year
     */
    public void setLastOneYear(String lastOneYear) {
		this.lastOneYear = lastOneYear;
	}

    /**
     * Gets last one year.
     *
     * @return the last one year
     */
    public String getLastOneYear( ) {
		return this.lastOneYear;
	}

    /**
     * Sets last three year.
     *
     * @param lastThreeYear the last three year
     */
    public void setLastThreeYear(String lastThreeYear) {
		this.lastThreeYear = lastThreeYear;
	}

    /**
     * Gets last three year.
     *
     * @return the last three year
     */
    public String getLastThreeYear( ) {
		return this.lastThreeYear;
	}

    /**
     * Sets last two year.
     *
     * @param lastTwoYear the last two year
     */
    public void setLastTwoYear(String lastTwoYear) {
		this.lastTwoYear = lastTwoYear;
	}

    /**
     * Gets last two year.
     *
     * @return the last two year
     */
    public String getLastTwoYear( ) {
		return this.lastTwoYear;
	}

    /**
     * Sets since establish.
     *
     * @param sinceEstablish the since establish
     */
    public void setSinceEstablish(String sinceEstablish) {
		this.sinceEstablish = sinceEstablish;
	}

    /**
     * Gets since establish.
     *
     * @return the since establish
     */
    public String getSinceEstablish( ) {
		return this.sinceEstablish;
	}

}

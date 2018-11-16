package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.fundquotation.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:44
 */
public class AlipayFinanceFundFundquotationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5213462693967221437L;

	/** 
	 * 近半年收益：基金产品近半年内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_half_year")
	private String lastHalfYear;

	/** 
	 * 近一月收益率：基金产品近一月内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_month")
	private String lastMonth;

	/** 
	 * 近三月收益：基金产品近三月内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_quarter")
	private String lastQuarter;

	/** 
	 * 近一周收益率：基金产品近一周内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_week")
	private String lastWeek;

	/** 
	 * 近一年收益率：基金产品近一年内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("last_year")
	private String lastYear;

	/** 
	 * 发布日期：产品收益率发布的时间
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 成立以来收益率：基金产品成立以来收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("since_establishment")
	private String sinceEstablishment;

	/** 
	 * 今年以来收益率：基金产品今年以来收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("this_year")
	private String thisYear;

	/** 
	 * 三年内收益率：基金产品三年内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("yield_3_year")
	private String yield3Year;

	/** 
	 * 近五年收益率：基金产品近五年内收益率
四舍五入后保留小数点后4位
	 */
	@ApiField("yield_5_year")
	private String yield5Year;

    /**
     * Sets last half year.
     *
     * @param lastHalfYear the last half year
     */
    public void setLastHalfYear(String lastHalfYear) {
		this.lastHalfYear = lastHalfYear;
	}

    /**
     * Gets last half year.
     *
     * @return the last half year
     */
    public String getLastHalfYear( ) {
		return this.lastHalfYear;
	}

    /**
     * Sets last month.
     *
     * @param lastMonth the last month
     */
    public void setLastMonth(String lastMonth) {
		this.lastMonth = lastMonth;
	}

    /**
     * Gets last month.
     *
     * @return the last month
     */
    public String getLastMonth( ) {
		return this.lastMonth;
	}

    /**
     * Sets last quarter.
     *
     * @param lastQuarter the last quarter
     */
    public void setLastQuarter(String lastQuarter) {
		this.lastQuarter = lastQuarter;
	}

    /**
     * Gets last quarter.
     *
     * @return the last quarter
     */
    public String getLastQuarter( ) {
		return this.lastQuarter;
	}

    /**
     * Sets last week.
     *
     * @param lastWeek the last week
     */
    public void setLastWeek(String lastWeek) {
		this.lastWeek = lastWeek;
	}

    /**
     * Gets last week.
     *
     * @return the last week
     */
    public String getLastWeek( ) {
		return this.lastWeek;
	}

    /**
     * Sets last year.
     *
     * @param lastYear the last year
     */
    public void setLastYear(String lastYear) {
		this.lastYear = lastYear;
	}

    /**
     * Gets last year.
     *
     * @return the last year
     */
    public String getLastYear( ) {
		return this.lastYear;
	}

    /**
     * Sets report date.
     *
     * @param reportDate the report date
     */
    public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

    /**
     * Gets report date.
     *
     * @return the report date
     */
    public String getReportDate( ) {
		return this.reportDate;
	}

    /**
     * Sets since establishment.
     *
     * @param sinceEstablishment the since establishment
     */
    public void setSinceEstablishment(String sinceEstablishment) {
		this.sinceEstablishment = sinceEstablishment;
	}

    /**
     * Gets since establishment.
     *
     * @return the since establishment
     */
    public String getSinceEstablishment( ) {
		return this.sinceEstablishment;
	}

    /**
     * Sets this year.
     *
     * @param thisYear the this year
     */
    public void setThisYear(String thisYear) {
		this.thisYear = thisYear;
	}

    /**
     * Gets this year.
     *
     * @return the this year
     */
    public String getThisYear( ) {
		return this.thisYear;
	}

    /**
     * Sets yield 3 year.
     *
     * @param yield3Year the yield 3 year
     */
    public void setYield3Year(String yield3Year) {
		this.yield3Year = yield3Year;
	}

    /**
     * Gets yield 3 year.
     *
     * @return the yield 3 year
     */
    public String getYield3Year( ) {
		return this.yield3Year;
	}

    /**
     * Sets yield 5 year.
     *
     * @param yield5Year the yield 5 year
     */
    public void setYield5Year(String yield5Year) {
		this.yield5Year = yield5Year;
	}

    /**
     * Gets yield 5 year.
     *
     * @return the yield 5 year
     */
    public String getYield5Year( ) {
		return this.yield5Year;
	}

}

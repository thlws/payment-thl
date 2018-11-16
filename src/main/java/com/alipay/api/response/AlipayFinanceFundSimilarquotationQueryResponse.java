package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.similarquotation.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:34
 */
public class AlipayFinanceFundSimilarquotationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6394159224237617155L;

	/** 
	 * 近半年的参与同类收益率排名的基金数量
	 */
	@ApiField("last_half_year_count")
	private String lastHalfYearCount;

	/** 
	 * 近半年的同类收益率的排名
	 */
	@ApiField("last_half_year_order")
	private String lastHalfYearOrder;

	/** 
	 * 近半年的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("last_half_year_similar")
	private String lastHalfYearSimilar;

	/** 
	 * 近一月的参与同类收益率排名的基金数量
	 */
	@ApiField("last_month_count")
	private String lastMonthCount;

	/** 
	 * 近一月的同类收益率的排名
	 */
	@ApiField("last_month_order")
	private String lastMonthOrder;

	/** 
	 * 近一月的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("last_month_similar")
	private String lastMonthSimilar;

	/** 
	 * 近一季度的参与同类收益率排名的基金数量
	 */
	@ApiField("last_quarter_count")
	private String lastQuarterCount;

	/** 
	 * 近一季度的同类收益率的排名
	 */
	@ApiField("last_quarter_order")
	private String lastQuarterOrder;

	/** 
	 * 近一季度的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("last_quarter_similar")
	private String lastQuarterSimilar;

	/** 
	 * 近一年的参与同类收益率排名的基金数量
	 */
	@ApiField("last_year_count")
	private String lastYearCount;

	/** 
	 * 近一年的同类收益率排名
	 */
	@ApiField("last_year_order")
	private String lastYearOrder;

	/** 
	 * 近一年的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("last_year_similar")
	private String lastYearSimilar;

	/** 
	 * 发布日期；同类收益率发布的时间
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 近三年的参与同类收益率排名的基金数量
	 */
	@ApiField("yield_three_year_count")
	private String yieldThreeYearCount;

	/** 
	 * 近三年的同类收益率的排名
	 */
	@ApiField("yield_three_year_order")
	private String yieldThreeYearOrder;

	/** 
	 * 近三年的同类收益率；四舍五入后保留小数点后4位
	 */
	@ApiField("yield_three_year_similar")
	private String yieldThreeYearSimilar;

    /**
     * Sets last half year count.
     *
     * @param lastHalfYearCount the last half year count
     */
    public void setLastHalfYearCount(String lastHalfYearCount) {
		this.lastHalfYearCount = lastHalfYearCount;
	}

    /**
     * Gets last half year count.
     *
     * @return the last half year count
     */
    public String getLastHalfYearCount( ) {
		return this.lastHalfYearCount;
	}

    /**
     * Sets last half year order.
     *
     * @param lastHalfYearOrder the last half year order
     */
    public void setLastHalfYearOrder(String lastHalfYearOrder) {
		this.lastHalfYearOrder = lastHalfYearOrder;
	}

    /**
     * Gets last half year order.
     *
     * @return the last half year order
     */
    public String getLastHalfYearOrder( ) {
		return this.lastHalfYearOrder;
	}

    /**
     * Sets last half year similar.
     *
     * @param lastHalfYearSimilar the last half year similar
     */
    public void setLastHalfYearSimilar(String lastHalfYearSimilar) {
		this.lastHalfYearSimilar = lastHalfYearSimilar;
	}

    /**
     * Gets last half year similar.
     *
     * @return the last half year similar
     */
    public String getLastHalfYearSimilar( ) {
		return this.lastHalfYearSimilar;
	}

    /**
     * Sets last month count.
     *
     * @param lastMonthCount the last month count
     */
    public void setLastMonthCount(String lastMonthCount) {
		this.lastMonthCount = lastMonthCount;
	}

    /**
     * Gets last month count.
     *
     * @return the last month count
     */
    public String getLastMonthCount( ) {
		return this.lastMonthCount;
	}

    /**
     * Sets last month order.
     *
     * @param lastMonthOrder the last month order
     */
    public void setLastMonthOrder(String lastMonthOrder) {
		this.lastMonthOrder = lastMonthOrder;
	}

    /**
     * Gets last month order.
     *
     * @return the last month order
     */
    public String getLastMonthOrder( ) {
		return this.lastMonthOrder;
	}

    /**
     * Sets last month similar.
     *
     * @param lastMonthSimilar the last month similar
     */
    public void setLastMonthSimilar(String lastMonthSimilar) {
		this.lastMonthSimilar = lastMonthSimilar;
	}

    /**
     * Gets last month similar.
     *
     * @return the last month similar
     */
    public String getLastMonthSimilar( ) {
		return this.lastMonthSimilar;
	}

    /**
     * Sets last quarter count.
     *
     * @param lastQuarterCount the last quarter count
     */
    public void setLastQuarterCount(String lastQuarterCount) {
		this.lastQuarterCount = lastQuarterCount;
	}

    /**
     * Gets last quarter count.
     *
     * @return the last quarter count
     */
    public String getLastQuarterCount( ) {
		return this.lastQuarterCount;
	}

    /**
     * Sets last quarter order.
     *
     * @param lastQuarterOrder the last quarter order
     */
    public void setLastQuarterOrder(String lastQuarterOrder) {
		this.lastQuarterOrder = lastQuarterOrder;
	}

    /**
     * Gets last quarter order.
     *
     * @return the last quarter order
     */
    public String getLastQuarterOrder( ) {
		return this.lastQuarterOrder;
	}

    /**
     * Sets last quarter similar.
     *
     * @param lastQuarterSimilar the last quarter similar
     */
    public void setLastQuarterSimilar(String lastQuarterSimilar) {
		this.lastQuarterSimilar = lastQuarterSimilar;
	}

    /**
     * Gets last quarter similar.
     *
     * @return the last quarter similar
     */
    public String getLastQuarterSimilar( ) {
		return this.lastQuarterSimilar;
	}

    /**
     * Sets last year count.
     *
     * @param lastYearCount the last year count
     */
    public void setLastYearCount(String lastYearCount) {
		this.lastYearCount = lastYearCount;
	}

    /**
     * Gets last year count.
     *
     * @return the last year count
     */
    public String getLastYearCount( ) {
		return this.lastYearCount;
	}

    /**
     * Sets last year order.
     *
     * @param lastYearOrder the last year order
     */
    public void setLastYearOrder(String lastYearOrder) {
		this.lastYearOrder = lastYearOrder;
	}

    /**
     * Gets last year order.
     *
     * @return the last year order
     */
    public String getLastYearOrder( ) {
		return this.lastYearOrder;
	}

    /**
     * Sets last year similar.
     *
     * @param lastYearSimilar the last year similar
     */
    public void setLastYearSimilar(String lastYearSimilar) {
		this.lastYearSimilar = lastYearSimilar;
	}

    /**
     * Gets last year similar.
     *
     * @return the last year similar
     */
    public String getLastYearSimilar( ) {
		return this.lastYearSimilar;
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
     * Sets yield three year count.
     *
     * @param yieldThreeYearCount the yield three year count
     */
    public void setYieldThreeYearCount(String yieldThreeYearCount) {
		this.yieldThreeYearCount = yieldThreeYearCount;
	}

    /**
     * Gets yield three year count.
     *
     * @return the yield three year count
     */
    public String getYieldThreeYearCount( ) {
		return this.yieldThreeYearCount;
	}

    /**
     * Sets yield three year order.
     *
     * @param yieldThreeYearOrder the yield three year order
     */
    public void setYieldThreeYearOrder(String yieldThreeYearOrder) {
		this.yieldThreeYearOrder = yieldThreeYearOrder;
	}

    /**
     * Gets yield three year order.
     *
     * @return the yield three year order
     */
    public String getYieldThreeYearOrder( ) {
		return this.yieldThreeYearOrder;
	}

    /**
     * Sets yield three year similar.
     *
     * @param yieldThreeYearSimilar the yield three year similar
     */
    public void setYieldThreeYearSimilar(String yieldThreeYearSimilar) {
		this.yieldThreeYearSimilar = yieldThreeYearSimilar;
	}

    /**
     * Gets yield three year similar.
     *
     * @return the yield three year similar
     */
    public String getYieldThreeYearSimilar( ) {
		return this.yieldThreeYearSimilar;
	}

}

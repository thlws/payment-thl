package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.advertise.report.query response.
 *
 * @author auto create
 * @since 1.0, 2017-08-18 15:36:32
 */
public class AlipayMarketingCdpAdvertiseReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2642922132628874561L;

	/** 
	 * 日点击量
	 */
	@ApiField("click_pv_dd")
	private String clickPvDd;

	/** 
	 * 历史累积点击量
	 */
	@ApiField("click_pv_history")
	private String clickPvHistory;

	/** 
	 * 日点击用户数
	 */
	@ApiField("click_uv_dd")
	private String clickUvDd;

	/** 
	 * 历史累积点击用户数
	 */
	@ApiField("click_uv_history")
	private String clickUvHistory;

	/** 
	 * 效果分析日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/** 
	 * 日曝光量
	 */
	@ApiField("show_pv_dd")
	private String showPvDd;

	/** 
	 * 历史累积曝光量
	 */
	@ApiField("show_pv_history")
	private String showPvHistory;

	/** 
	 * 日曝光用户数
	 */
	@ApiField("show_uv_dd")
	private String showUvDd;

	/** 
	 * 历史累积曝光用户数
	 */
	@ApiField("show_uv_history")
	private String showUvHistory;

    /**
     * Sets click pv dd.
     *
     * @param clickPvDd the click pv dd
     */
    public void setClickPvDd(String clickPvDd) {
		this.clickPvDd = clickPvDd;
	}

    /**
     * Gets click pv dd.
     *
     * @return the click pv dd
     */
    public String getClickPvDd( ) {
		return this.clickPvDd;
	}

    /**
     * Sets click pv history.
     *
     * @param clickPvHistory the click pv history
     */
    public void setClickPvHistory(String clickPvHistory) {
		this.clickPvHistory = clickPvHistory;
	}

    /**
     * Gets click pv history.
     *
     * @return the click pv history
     */
    public String getClickPvHistory( ) {
		return this.clickPvHistory;
	}

    /**
     * Sets click uv dd.
     *
     * @param clickUvDd the click uv dd
     */
    public void setClickUvDd(String clickUvDd) {
		this.clickUvDd = clickUvDd;
	}

    /**
     * Gets click uv dd.
     *
     * @return the click uv dd
     */
    public String getClickUvDd( ) {
		return this.clickUvDd;
	}

    /**
     * Sets click uv history.
     *
     * @param clickUvHistory the click uv history
     */
    public void setClickUvHistory(String clickUvHistory) {
		this.clickUvHistory = clickUvHistory;
	}

    /**
     * Gets click uv history.
     *
     * @return the click uv history
     */
    public String getClickUvHistory( ) {
		return this.clickUvHistory;
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
     * Sets show pv dd.
     *
     * @param showPvDd the show pv dd
     */
    public void setShowPvDd(String showPvDd) {
		this.showPvDd = showPvDd;
	}

    /**
     * Gets show pv dd.
     *
     * @return the show pv dd
     */
    public String getShowPvDd( ) {
		return this.showPvDd;
	}

    /**
     * Sets show pv history.
     *
     * @param showPvHistory the show pv history
     */
    public void setShowPvHistory(String showPvHistory) {
		this.showPvHistory = showPvHistory;
	}

    /**
     * Gets show pv history.
     *
     * @return the show pv history
     */
    public String getShowPvHistory( ) {
		return this.showPvHistory;
	}

    /**
     * Sets show uv dd.
     *
     * @param showUvDd the show uv dd
     */
    public void setShowUvDd(String showUvDd) {
		this.showUvDd = showUvDd;
	}

    /**
     * Gets show uv dd.
     *
     * @return the show uv dd
     */
    public String getShowUvDd( ) {
		return this.showUvDd;
	}

    /**
     * Sets show uv history.
     *
     * @param showUvHistory the show uv history
     */
    public void setShowUvHistory(String showUvHistory) {
		this.showUvHistory = showUvHistory;
	}

    /**
     * Gets show uv history.
     *
     * @return the show uv history
     */
    public String getShowUvHistory( ) {
		return this.showUvHistory;
	}

}

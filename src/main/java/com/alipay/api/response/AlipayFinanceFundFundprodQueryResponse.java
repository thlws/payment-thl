package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.fundprod.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:25
 */
public class AlipayFinanceFundFundprodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4585221795369839717L;

	/** 
	 * 成立日期，格式为YYYYMMDD
	 */
	@ApiField("establishment_date")
	private String establishmentDate;

	/** 
	 * 基金代码
	 */
	@ApiField("fund_code")
	private String fundCode;

	/** 
	 * 基金全称
	 */
	@ApiField("fund_name")
	private String fundName;

	/** 
	 * 基金简称
	 */
	@ApiField("fund_name_abbr")
	private String fundNameAbbr;

	/** 
	 * 基金单位净值，含4位小数
	 */
	@ApiField("net_value")
	private String netValue;

	/** 
	 * 净值日期
	 */
	@ApiField("net_value_date")
	private String netValueDate;

	/** 
	 * 七日年化收益率，含5位小数，可以为负
	 */
	@ApiField("profit_seven_days")
	private String profitSevenDays;

	/** 
	 * 万份收益，含5位小数，可以为负
	 */
	@ApiField("profit_ten_thousand")
	private String profitTenThousand;

	/** 
	 * 风险等级，分五级：L-低风险; ML-中低风险; M-中风险; MH-中高风险; H-高风险
	 */
	@ApiField("risk_evaluation")
	private String riskEvaluation;

    /**
     * Sets establishment date.
     *
     * @param establishmentDate the establishment date
     */
    public void setEstablishmentDate(String establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

    /**
     * Gets establishment date.
     *
     * @return the establishment date
     */
    public String getEstablishmentDate( ) {
		return this.establishmentDate;
	}

    /**
     * Sets fund code.
     *
     * @param fundCode the fund code
     */
    public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

    /**
     * Gets fund code.
     *
     * @return the fund code
     */
    public String getFundCode( ) {
		return this.fundCode;
	}

    /**
     * Sets fund name.
     *
     * @param fundName the fund name
     */
    public void setFundName(String fundName) {
		this.fundName = fundName;
	}

    /**
     * Gets fund name.
     *
     * @return the fund name
     */
    public String getFundName( ) {
		return this.fundName;
	}

    /**
     * Sets fund name abbr.
     *
     * @param fundNameAbbr the fund name abbr
     */
    public void setFundNameAbbr(String fundNameAbbr) {
		this.fundNameAbbr = fundNameAbbr;
	}

    /**
     * Gets fund name abbr.
     *
     * @return the fund name abbr
     */
    public String getFundNameAbbr( ) {
		return this.fundNameAbbr;
	}

    /**
     * Sets net value.
     *
     * @param netValue the net value
     */
    public void setNetValue(String netValue) {
		this.netValue = netValue;
	}

    /**
     * Gets net value.
     *
     * @return the net value
     */
    public String getNetValue( ) {
		return this.netValue;
	}

    /**
     * Sets net value date.
     *
     * @param netValueDate the net value date
     */
    public void setNetValueDate(String netValueDate) {
		this.netValueDate = netValueDate;
	}

    /**
     * Gets net value date.
     *
     * @return the net value date
     */
    public String getNetValueDate( ) {
		return this.netValueDate;
	}

    /**
     * Sets profit seven days.
     *
     * @param profitSevenDays the profit seven days
     */
    public void setProfitSevenDays(String profitSevenDays) {
		this.profitSevenDays = profitSevenDays;
	}

    /**
     * Gets profit seven days.
     *
     * @return the profit seven days
     */
    public String getProfitSevenDays( ) {
		return this.profitSevenDays;
	}

    /**
     * Sets profit ten thousand.
     *
     * @param profitTenThousand the profit ten thousand
     */
    public void setProfitTenThousand(String profitTenThousand) {
		this.profitTenThousand = profitTenThousand;
	}

    /**
     * Gets profit ten thousand.
     *
     * @return the profit ten thousand
     */
    public String getProfitTenThousand( ) {
		return this.profitTenThousand;
	}

    /**
     * Sets risk evaluation.
     *
     * @param riskEvaluation the risk evaluation
     */
    public void setRiskEvaluation(String riskEvaluation) {
		this.riskEvaluation = riskEvaluation;
	}

    /**
     * Gets risk evaluation.
     *
     * @return the risk evaluation
     */
    public String getRiskEvaluation( ) {
		return this.riskEvaluation;
	}

}

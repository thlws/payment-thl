package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.creditrisk.dashboard.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-18 16:45:50
 */
public class AlipayCreditCreditriskDashboardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8648973213124213814L;

	/** 
	 * 信用贷款额度
	 */
	@ApiField("credit_loan")
	private String creditLoan;

	/** 
	 * 售后退款金额
	 */
	@ApiField("sale_refund")
	private String saleRefund;

	/** 
	 * 交易服务费
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/** 
	 * 收入总计
	 */
	@ApiField("total_income")
	private String totalIncome;

	/** 
	 * 支出总计
	 */
	@ApiField("total_payout")
	private String totalPayout;

	/** 
	 * 提前收款额度
	 */
	@ApiField("tqsk_loan")
	private String tqskLoan;

	/** 
	 * 余利宝收益
	 */
	@ApiField("ylb_profit")
	private String ylbProfit;

    /**
     * Sets credit loan.
     *
     * @param creditLoan the credit loan
     */
    public void setCreditLoan(String creditLoan) {
		this.creditLoan = creditLoan;
	}

    /**
     * Gets credit loan.
     *
     * @return the credit loan
     */
    public String getCreditLoan( ) {
		return this.creditLoan;
	}

    /**
     * Sets sale refund.
     *
     * @param saleRefund the sale refund
     */
    public void setSaleRefund(String saleRefund) {
		this.saleRefund = saleRefund;
	}

    /**
     * Gets sale refund.
     *
     * @return the sale refund
     */
    public String getSaleRefund( ) {
		return this.saleRefund;
	}

    /**
     * Sets service charge.
     *
     * @param serviceCharge the service charge
     */
    public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

    /**
     * Gets service charge.
     *
     * @return the service charge
     */
    public String getServiceCharge( ) {
		return this.serviceCharge;
	}

    /**
     * Sets total income.
     *
     * @param totalIncome the total income
     */
    public void setTotalIncome(String totalIncome) {
		this.totalIncome = totalIncome;
	}

    /**
     * Gets total income.
     *
     * @return the total income
     */
    public String getTotalIncome( ) {
		return this.totalIncome;
	}

    /**
     * Sets total payout.
     *
     * @param totalPayout the total payout
     */
    public void setTotalPayout(String totalPayout) {
		this.totalPayout = totalPayout;
	}

    /**
     * Gets total payout.
     *
     * @return the total payout
     */
    public String getTotalPayout( ) {
		return this.totalPayout;
	}

    /**
     * Sets tqsk loan.
     *
     * @param tqskLoan the tqsk loan
     */
    public void setTqskLoan(String tqskLoan) {
		this.tqskLoan = tqskLoan;
	}

    /**
     * Gets tqsk loan.
     *
     * @return the tqsk loan
     */
    public String getTqskLoan( ) {
		return this.tqskLoan;
	}

    /**
     * Sets ylb profit.
     *
     * @param ylbProfit the ylb profit
     */
    public void setYlbProfit(String ylbProfit) {
		this.ylbProfit = ylbProfit;
	}

    /**
     * Gets ylb profit.
     *
     * @return the ylb profit
     */
    public String getYlbProfit( ) {
		return this.ylbProfit;
	}

}

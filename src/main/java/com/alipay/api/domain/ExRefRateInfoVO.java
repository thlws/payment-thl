package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ExRefRateInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2199233691371518499L;

	/**
	 * 货币对
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	/**
	 * 基础币种
	 */
	@ApiField("datum_currency")
	private String datumCurrency;

	/**
	 * 牌价类型，表示站在用户角度，对目标币种的交易方向，01表示买入，02表示卖出
	 */
	@ApiField("price_type")
	private String priceType;

	/**
	 * 报价日期，格式为YYYYMMDD
	 */
	@ApiField("pub_date")
	private String pubDate;

	/**
	 * 报价时间
	 */
	@ApiField("pub_time")
	private Date pubTime;

	/**
	 * 汇率，表示一单位基准币种等于多少目标币种，小数点后最多精确到8位
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 目标币种
	 */
	@ApiField("target_currency")
	private String targetCurrency;

    /**
     * Gets currency pair.
     *
     * @return the currency pair
     */
    public String getCurrencyPair() {
		return this.currencyPair;
	}

    /**
     * Sets currency pair.
     *
     * @param currencyPair the currency pair
     */
    public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

    /**
     * Gets datum currency.
     *
     * @return the datum currency
     */
    public String getDatumCurrency() {
		return this.datumCurrency;
	}

    /**
     * Sets datum currency.
     *
     * @param datumCurrency the datum currency
     */
    public void setDatumCurrency(String datumCurrency) {
		this.datumCurrency = datumCurrency;
	}

    /**
     * Gets price type.
     *
     * @return the price type
     */
    public String getPriceType() {
		return this.priceType;
	}

    /**
     * Sets price type.
     *
     * @param priceType the price type
     */
    public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

    /**
     * Gets pub date.
     *
     * @return the pub date
     */
    public String getPubDate() {
		return this.pubDate;
	}

    /**
     * Sets pub date.
     *
     * @param pubDate the pub date
     */
    public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

    /**
     * Gets pub time.
     *
     * @return the pub time
     */
    public Date getPubTime() {
		return this.pubTime;
	}

    /**
     * Sets pub time.
     *
     * @param pubTime the pub time
     */
    public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

    /**
     * Gets rate.
     *
     * @return the rate
     */
    public String getRate() {
		return this.rate;
	}

    /**
     * Sets rate.
     *
     * @param rate the rate
     */
    public void setRate(String rate) {
		this.rate = rate;
	}

    /**
     * Gets target currency.
     *
     * @return the target currency
     */
    public String getTargetCurrency() {
		return this.targetCurrency;
	}

    /**
     * Sets target currency.
     *
     * @param targetCurrency the target currency
     */
    public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

}

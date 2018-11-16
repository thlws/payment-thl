package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.exchangerate.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:25:00
 */
public class AlipayOverseasTravelExchangerateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4212733594527447693L;

	/** 
	 * 货币代码，ISO标准alpha- 3币种代码，为当前查询的币种、或者根据国家码、经纬度定位所在国家对应的币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 货币icon的url地址
	 */
	@ApiField("currency_icon")
	private String currencyIcon;

	/** 
	 * 支付宝会员等级，只有在入参user_id存在的情况下才返回
	 */
	@ApiField("customer_level")
	private String customerLevel;

	/** 
	 * 汇率，double类型，为支付宝当面付的当前币种/CNY的汇率值，如1美元=6.2345人民币元，即汇率为6.2345
	 */
	@ApiField("rate")
	private String rate;

	/** 
	 * 汇率描述
	 */
	@ApiField("rate_desc")
	private String rateDesc;

	/** 
	 * 汇率来源说明
	 */
	@ApiField("rate_source")
	private String rateSource;

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency( ) {
		return this.currency;
	}

    /**
     * Sets currency icon.
     *
     * @param currencyIcon the currency icon
     */
    public void setCurrencyIcon(String currencyIcon) {
		this.currencyIcon = currencyIcon;
	}

    /**
     * Gets currency icon.
     *
     * @return the currency icon
     */
    public String getCurrencyIcon( ) {
		return this.currencyIcon;
	}

    /**
     * Sets customer level.
     *
     * @param customerLevel the customer level
     */
    public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

    /**
     * Gets customer level.
     *
     * @return the customer level
     */
    public String getCustomerLevel( ) {
		return this.customerLevel;
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
     * Gets rate.
     *
     * @return the rate
     */
    public String getRate( ) {
		return this.rate;
	}

    /**
     * Sets rate desc.
     *
     * @param rateDesc the rate desc
     */
    public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}

    /**
     * Gets rate desc.
     *
     * @return the rate desc
     */
    public String getRateDesc( ) {
		return this.rateDesc;
	}

    /**
     * Sets rate source.
     *
     * @param rateSource the rate source
     */
    public void setRateSource(String rateSource) {
		this.rateSource = rateSource;
	}

    /**
     * Gets rate source.
     *
     * @return the rate source
     */
    public String getRateSource( ) {
		return this.rateSource;
	}

}

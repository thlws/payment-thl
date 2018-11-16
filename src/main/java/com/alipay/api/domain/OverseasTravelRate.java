package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 该结构为json格式，示例： "rates":[{"currency": "USD", "rate": 6.2345,"currencyIcon":"https://alipayobjects.com/xxxx" }]
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:21:50
 */
public class OverseasTravelRate extends AlipayObject {

	private static final long serialVersionUID = 6259959447923115181L;

	/**
	 * 货币代码，ISO标准alpha- 3币种代码
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 货币icon的url地址
	 */
	@ApiField("currency_icon")
	private String currencyIcon;

	/**
	 * 汇率，double类型，为支付宝当面付的当前币种/CNY的汇率值，如1美元=6.2345人民币元，即汇率为6.2345
	 */
	@ApiField("rate")
	private String rate;

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets currency icon.
     *
     * @return the currency icon
     */
    public String getCurrencyIcon() {
		return this.currencyIcon;
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

}

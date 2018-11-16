package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账兑换汇率的基本信息
 *
 * @author auto create
 * @since 1.0, 2018-05-18 14:42:42
 */
public class ExchangeRate extends AlipayObject {

	private static final long serialVersionUID = 1549699217232828437L;

	/**
	 * 兑换汇率的基本币种。biz_scene是LOCAL场景下，该参数返回为空。
	 */
	@ApiField("base_currency")
	private String baseCurrency;

	/**
	 * 兑换汇率对应的兑换目标币种. LOCAL场景下为空
	 */
	@ApiField("exchange_currency")
	private String exchangeCurrency;

	/**
	 * 转账币种兑换结算币种的汇率。biz_scene是LOCAL场景下，该参数返回空。
	 */
	@ApiField("rate")
	private Long rate;

    /**
     * Gets base currency.
     *
     * @return the base currency
     */
    public String getBaseCurrency() {
		return this.baseCurrency;
	}

    /**
     * Sets base currency.
     *
     * @param baseCurrency the base currency
     */
    public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

    /**
     * Gets exchange currency.
     *
     * @return the exchange currency
     */
    public String getExchangeCurrency() {
		return this.exchangeCurrency;
	}

    /**
     * Sets exchange currency.
     *
     * @param exchangeCurrency the exchange currency
     */
    public void setExchangeCurrency(String exchangeCurrency) {
		this.exchangeCurrency = exchangeCurrency;
	}

    /**
     * Gets rate.
     *
     * @return the rate
     */
    public Long getRate() {
		return this.rate;
	}

    /**
     * Sets rate.
     *
     * @param rate the rate
     */
    public void setRate(Long rate) {
		this.rate = rate;
	}

}

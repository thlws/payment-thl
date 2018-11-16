package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.rate.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-06-02 16:35:00
 */
public class AlipayOverseasTravelRateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5779148931753643964L;

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
	 * 多个币种汇率结果，currency:货币代码，ISO标准alpha- 3币种代码;
rate:当前币种/CNY的汇率,Number(15,8)
currency_icon:货币图片的url地址
	 */
	@ApiField("rates")
	private String rates;

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

    /**
     * Sets rates.
     *
     * @param rates the rates
     */
    public void setRates(String rates) {
		this.rates = rates;
	}

    /**
     * Gets rates.
     *
     * @return the rates
     */
    public String getRates( ) {
		return this.rates;
	}

}

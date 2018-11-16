package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝账户和收益查询
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:07:46
 */
public class MybankFinanceYulibaoAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2719135235125689111L;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝
	 */
	@ApiField("fund_code")
	private String fundCode;

    /**
     * Gets fund code.
     *
     * @return the fund code
     */
    public String getFundCode() {
		return this.fundCode;
	}

    /**
     * Sets fund code.
     *
     * @param fundCode the fund code
     */
    public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

}

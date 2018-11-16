package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报价信息
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:04:26
 */
public class QuoteInfo extends AlipayObject {

	private static final long serialVersionUID = 6652999279376861356L;

	/**
	 * 238810000000049704774
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

    /**
     * Gets company id.
     *
     * @return the company id
     */
    public String getCompanyId() {
		return this.companyId;
	}

    /**
     * Sets company id.
     *
     * @param companyId the company id
     */
    public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

    /**
     * Gets quote biz id.
     *
     * @return the quote biz id
     */
    public String getQuoteBizId() {
		return this.quoteBizId;
	}

    /**
     * Sets quote biz id.
     *
     * @param quoteBizId the quote biz id
     */
    public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

}

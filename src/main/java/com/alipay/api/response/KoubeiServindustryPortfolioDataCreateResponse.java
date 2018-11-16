package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.data.create response.
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:04:51
 */
public class KoubeiServindustryPortfolioDataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7648346488464112421L;

	/** 
	 * 作品集ID
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

    /**
     * Sets portfolio id.
     *
     * @param portfolioId the portfolio id
     */
    public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

    /**
     * Gets portfolio id.
     *
     * @return the portfolio id
     */
    public String getPortfolioId( ) {
		return this.portfolioId;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpusCreateResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.opus.create response.
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:05:02
 */
public class KoubeiServindustryPortfolioOpusCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3251215954195698817L;

	/** 
	 * 作品列表
	 */
	@ApiField("opuses")
	private OpusCreateResponse opuses;

    /**
     * Sets opuses.
     *
     * @param opuses the opuses
     */
    public void setOpuses(OpusCreateResponse opuses) {
		this.opuses = opuses;
	}

    /**
     * Gets opuses.
     *
     * @return the opuses
     */
    public OpusCreateResponse getOpuses( ) {
		return this.opuses;
	}

}

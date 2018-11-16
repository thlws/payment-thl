package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.userule.pid.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingUserulePidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6669145345413126843L;

	/** 
	 * 满足条件的所有pid，多个pid使用英文逗号隔开
	 */
	@ApiField("pids")
	private String pids;

    /**
     * Sets pids.
     *
     * @param pids the pids
     */
    public void setPids(String pids) {
		this.pids = pids;
	}

    /**
     * Gets pids.
     *
     * @return the pids
     */
    public String getPids( ) {
		return this.pids;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.weibo.ebpp.recharge response.
 *
 * @author auto create
 * @since 1.0, 2018-01-02 11:20:40
 */
public class AlipayWeiboEbppRechargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3654684564483451933L;

	/** 
	 * 返回缴费页面
	 */
	@ApiField("partnerpuccharge")
	private String partnerpuccharge;

    /**
     * Sets partnerpuccharge.
     *
     * @param partnerpuccharge the partnerpuccharge
     */
    public void setPartnerpuccharge(String partnerpuccharge) {
		this.partnerpuccharge = partnerpuccharge;
	}

    /**
     * Gets partnerpuccharge.
     *
     * @return the partnerpuccharge
     */
    public String getPartnerpuccharge( ) {
		return this.partnerpuccharge;
	}

}

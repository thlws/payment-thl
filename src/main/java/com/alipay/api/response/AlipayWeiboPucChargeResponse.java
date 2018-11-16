package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.weibo.puc.charge response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:54:38
 */
public class AlipayWeiboPucChargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4828229917817843196L;

	/** 
	 * 返回页面内容
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.freezepayurl.get response.
 *
 * @author auto create
 * @since 1.0, 2016-06-06 17:52:18
 */
public class AlipayMicropayOrderFreezepayurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5615972171716823691L;

	/** 
	 * 支付冻结金的地址
	 */
	@ApiField("pay_freeze_url")
	private String payFreezeUrl;

    /**
     * Sets pay freeze url.
     *
     * @param payFreezeUrl the pay freeze url
     */
    public void setPayFreezeUrl(String payFreezeUrl) {
		this.payFreezeUrl = payFreezeUrl;
	}

    /**
     * Gets pay freeze url.
     *
     * @return the pay freeze url
     */
    public String getPayFreezeUrl( ) {
		return this.payFreezeUrl;
	}

}

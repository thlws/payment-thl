package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayUserDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-24 16:35:00
 */
public class AlipayUserGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6499842215762795477L;

	/** 
	 * 支付宝用户信息
	 */
	@ApiField("alipay_user_detail")
	private AlipayUserDetail alipayUserDetail;

    /**
     * Sets alipay user detail.
     *
     * @param alipayUserDetail the alipay user detail
     */
    public void setAlipayUserDetail(AlipayUserDetail alipayUserDetail) {
		this.alipayUserDetail = alipayUserDetail;
	}

    /**
     * Gets alipay user detail.
     *
     * @return the alipay user detail
     */
    public AlipayUserDetail getAlipayUserDetail( ) {
		return this.alipayUserDetail;
	}

}

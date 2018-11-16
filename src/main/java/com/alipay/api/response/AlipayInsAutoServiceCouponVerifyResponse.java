package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.service.coupon.verify response.
 *
 * @author auto create
 * @since 1.0, 2018-06-20 20:32:32
 */
public class AlipayInsAutoServiceCouponVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2829776561969414311L;

	/** 
	 * 核销同步结果，返回成功或失败。
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

    /**
     * Sets biz success.
     *
     * @param bizSuccess the biz success
     */
    public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}

    /**
     * Gets biz success.
     *
     * @return the biz success
     */
    public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}

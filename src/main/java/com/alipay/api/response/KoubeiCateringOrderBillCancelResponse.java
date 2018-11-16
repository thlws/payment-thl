package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.bill.cancel response.
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:20
 */
public class KoubeiCateringOrderBillCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7636894165273296165L;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

    /**
     * Sets retry.
     *
     * @param retry the retry
     */
    public void setRetry(Boolean retry) {
		this.retry = retry;
	}

    /**
     * Gets retry.
     *
     * @return the retry
     */
    public Boolean getRetry( ) {
		return this.retry;
	}

}

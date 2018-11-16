package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SinglePayDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.direct.pay response.
 *
 * @author auto create
 * @since 1.0, 2018-02-06 10:34:09
 */
public class AlipayMicropayOrderDirectPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8473164699533317984L;

	/** 
	 * 单笔直接支付返回结果
	 */
	@ApiField("single_pay_detail")
	private SinglePayDetail singlePayDetail;

    /**
     * Sets single pay detail.
     *
     * @param singlePayDetail the single pay detail
     */
    public void setSinglePayDetail(SinglePayDetail singlePayDetail) {
		this.singlePayDetail = singlePayDetail;
	}

    /**
     * Gets single pay detail.
     *
     * @return the single pay detail
     */
    public SinglePayDetail getSinglePayDetail( ) {
		return this.singlePayDetail;
	}

}

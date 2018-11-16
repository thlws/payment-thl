package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SinglePayDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.confirmpayurl.get response.
 *
 * @author auto create
 * @since 1.0, 2016-06-06 17:53:18
 */
public class AlipayMicropayOrderConfirmpayurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6255412257364346315L;

	/** 
	 * SinglePayDetail信息
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaymentAbilityQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.databiz.core.payment.ability.get response.
 *
 * @author auto create
 * @since 1.0, 2017-03-27 18:01:50
 */
public class AlipayDatabizCorePaymentAbilityGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1236282559521548276L;

	/** 
	 * 支付能力返回结果信息
	 */
	@ApiField("payment_ability_query_response")
	private PaymentAbilityQueryResponse paymentAbilityQueryResponse;

    /**
     * Sets payment ability query response.
     *
     * @param paymentAbilityQueryResponse the payment ability query response
     */
    public void setPaymentAbilityQueryResponse(PaymentAbilityQueryResponse paymentAbilityQueryResponse) {
		this.paymentAbilityQueryResponse = paymentAbilityQueryResponse;
	}

    /**
     * Gets payment ability query response.
     *
     * @return the payment ability query response
     */
    public PaymentAbilityQueryResponse getPaymentAbilityQueryResponse( ) {
		return this.paymentAbilityQueryResponse;
	}

}

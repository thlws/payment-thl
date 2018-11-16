package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaymentAbilityPostbackResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.databiz.core.payment.ability.update response.
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:50:36
 */
public class AlipayDatabizCorePaymentAbilityUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8317837234798972473L;

	/** 
	 * 支付能力回传信息结果信息
	 */
	@ApiField("payment_ability_postback_response")
	private PaymentAbilityPostbackResponse paymentAbilityPostbackResponse;

    /**
     * Sets payment ability postback response.
     *
     * @param paymentAbilityPostbackResponse the payment ability postback response
     */
    public void setPaymentAbilityPostbackResponse(PaymentAbilityPostbackResponse paymentAbilityPostbackResponse) {
		this.paymentAbilityPostbackResponse = paymentAbilityPostbackResponse;
	}

    /**
     * Gets payment ability postback response.
     *
     * @return the payment ability postback response
     */
    public PaymentAbilityPostbackResponse getPaymentAbilityPostbackResponse( ) {
		return this.paymentAbilityPostbackResponse;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PaymentSchedule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.paymentschedule.get response.
 *
 * @author auto create
 * @since 1.0, 2016-03-29 11:34:20
 */
public class AlipayEcapiprodDrawndnPaymentscheduleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2134538697754447745L;

	/** 
	 * 返回的支用还款计划集合
	 */
	@ApiListField("payment_schedules")
	@ApiField("payment_schedule")
	private List<PaymentSchedule> paymentSchedules;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Sets payment schedules.
     *
     * @param paymentSchedules the payment schedules
     */
    public void setPaymentSchedules(List<PaymentSchedule> paymentSchedules) {
		this.paymentSchedules = paymentSchedules;
	}

    /**
     * Gets payment schedules.
     *
     * @return the payment schedules
     */
    public List<PaymentSchedule> getPaymentSchedules( ) {
		return this.paymentSchedules;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId( ) {
		return this.requestId;
	}

}

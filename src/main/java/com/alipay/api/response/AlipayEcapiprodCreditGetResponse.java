package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.credit.get response.
 *
 * @author auto create
 * @since 1.0, 2015-04-02 16:44:25
 */
public class AlipayEcapiprodCreditGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5246972735792198183L;

	/** 
	 * 授信结果
	 */
	@ApiField("credit_result")
	private CreditResult creditResult;

	/** 
	 * 为了保持幂等性，返回唯一请求号
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Sets credit result.
     *
     * @param creditResult the credit result
     */
    public void setCreditResult(CreditResult creditResult) {
		this.creditResult = creditResult;
	}

    /**
     * Gets credit result.
     *
     * @return the credit result
     */
    public CreditResult getCreditResult( ) {
		return this.creditResult;
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

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.ticketcode.delay response.
 *
 * @author auto create
 * @since 1.0, 2018-05-21 11:33:24
 */
public class KoubeiTradeTicketTicketcodeDelayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2278831536855798149L;

	/** 
	 * 该字段用于描述本次返回中的业务属性，现有：BIZ_ALREADY_SUCCESS（幂等业务码）。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 请求id，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Sets biz code.
     *
     * @param bizCode the biz code
     */
    public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

    /**
     * Gets biz code.
     *
     * @return the biz code
     */
    public String getBizCode( ) {
		return this.bizCode;
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

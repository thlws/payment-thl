package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.present.send response.
 *
 * @author auto create
 * @since 1.0, 2018-03-30 14:30:00
 */
public class AlipayCommerceLotteryPresentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7352242522559767218L;

	/** 
	 * 是否赠送成功
	 */
	@ApiField("send_result")
	private Boolean sendResult;

    /**
     * Sets send result.
     *
     * @param sendResult the send result
     */
    public void setSendResult(Boolean sendResult) {
		this.sendResult = sendResult;
	}

    /**
     * Gets send result.
     *
     * @return the send result
     */
    public Boolean getSendResult( ) {
		return this.sendResult;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.message.courier.send response.
 *
 * @author auto create
 * @since 1.0, 2017-08-03 15:58:32
 */
public class AlipayGotoneMessageCourierSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2849436885114132772L;

	/** 
	 * 结果码。SUCCESS：发送成功。
	 */
	@ApiField("result_code")
	private String resultCode;

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
	}

}

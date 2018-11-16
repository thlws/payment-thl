package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.order.refund response.
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:48:57
 */
public class AlipayEcoMycarOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3553276819679842559L;

	/** 
	 * 失败原因
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 是否成功(T: 成功，F:失败)
	 */
	@ApiField("success")
	private String success;

    /**
     * Sets err msg.
     *
     * @param errMsg the err msg
     */
    public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

    /**
     * Gets err msg.
     *
     * @return the err msg
     */
    public String getErrMsg( ) {
		return this.errMsg;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(String success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public String getSuccess( ) {
		return this.success;
	}

}

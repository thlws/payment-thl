package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单预创建结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class PreOrderResult extends AlipayObject {

	private static final long serialVersionUID = 5895588651123572695L;

	/**
	 * 应用唯一标识
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 错误描述
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 校验是否成功
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
		return this.appId;
	}

    /**
     * Sets app id.
     *
     * @param appId the app id
     */
    public void setAppId(String appId) {
		this.appId = appId;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode() {
		return this.resultCode;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess() {
		return this.success;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

}

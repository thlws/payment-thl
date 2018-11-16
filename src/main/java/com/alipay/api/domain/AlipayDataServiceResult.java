package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据决策分析结果
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:52:52
 */
public class AlipayDataServiceResult extends AlipayObject {

	private static final long serialVersionUID = 5722624539585739931L;

	/**
	 * 错误码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 错误信息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 调用结果，json格式
	 */
	@ApiField("result")
	private String result;

	/**
	 * 调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
		return this.message;
	}

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
		this.message = message;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult() {
		return this.result;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
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

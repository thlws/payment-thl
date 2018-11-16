package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 脱机交易执行结果
 *
 * @author auto create
 * @since 1.0, 2017-09-20 18:08:12
 */
public class AlipayOfflineTradeResult extends AlipayObject {

	private static final long serialVersionUID = 5519734281947279766L;

	/**
	 * 系统异常
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 脱机交易处理结果描述
	 */
	@ApiField("message")
	private String message;

	/**
	 * 表示是否需要重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	/**
	 * 交易需要重试时下一次重试时间
	 */
	@ApiField("next_try_time")
	private String nextTryTime;

	/**
	 * 支付宝外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 业务处理结果,SUCCESS：处理成功，FAIL：处理失败， UNKNOWN:结果未知。当结果非SUCCESS时，检查need_retry判断是否需要重试。
	 */
	@ApiField("result")
	private String result;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
		return this.errorCode;
	}

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

    /**
     * Gets error message.
     *
     * @return the error message
     */
    public String getErrorMessage() {
		return this.errorMessage;
	}

    /**
     * Sets error message.
     *
     * @param errorMessage the error message
     */
    public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
     * Gets need retry.
     *
     * @return the need retry
     */
    public Boolean getNeedRetry() {
		return this.needRetry;
	}

    /**
     * Sets need retry.
     *
     * @param needRetry the need retry
     */
    public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}

    /**
     * Gets next try time.
     *
     * @return the next try time
     */
    public String getNextTryTime() {
		return this.nextTryTime;
	}

    /**
     * Sets next try time.
     *
     * @param nextTryTime the next try time
     */
    public void setNextTryTime(String nextTryTime) {
		this.nextTryTime = nextTryTime;
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
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

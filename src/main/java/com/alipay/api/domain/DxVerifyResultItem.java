package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * decisionx的验证结果项
 *
 * @author auto create
 * @since 1.0, 2018-01-29 16:40:24
 */
public class DxVerifyResultItem extends AlipayObject {

	private static final long serialVersionUID = 4896847184652148993L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 验证的输入参数，map的json格式序列化传递
	 */
	@ApiField("input")
	private String input;

	/**
	 * 行号
	 */
	@ApiField("line")
	private Long line;

	/**
	 * 输出值，map的json格式序列化传递
	 */
	@ApiField("output")
	private String output;

	/**
	 * 预测的结果值，map的json 格式序列化传递
	 */
	@ApiField("predict")
	private String predict;

	/**
	 * 验证是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 验证路径
	 */
	@ApiField("trace")
	private String trace;

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
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg() {
		return this.errorMsg;
	}

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    /**
     * Gets input.
     *
     * @return the input
     */
    public String getInput() {
		return this.input;
	}

    /**
     * Sets input.
     *
     * @param input the input
     */
    public void setInput(String input) {
		this.input = input;
	}

    /**
     * Gets line.
     *
     * @return the line
     */
    public Long getLine() {
		return this.line;
	}

    /**
     * Sets line.
     *
     * @param line the line
     */
    public void setLine(Long line) {
		this.line = line;
	}

    /**
     * Gets output.
     *
     * @return the output
     */
    public String getOutput() {
		return this.output;
	}

    /**
     * Sets output.
     *
     * @param output the output
     */
    public void setOutput(String output) {
		this.output = output;
	}

    /**
     * Gets predict.
     *
     * @return the predict
     */
    public String getPredict() {
		return this.predict;
	}

    /**
     * Sets predict.
     *
     * @param predict the predict
     */
    public void setPredict(String predict) {
		this.predict = predict;
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

    /**
     * Gets trace.
     *
     * @return the trace
     */
    public String getTrace() {
		return this.trace;
	}

    /**
     * Sets trace.
     *
     * @param trace the trace
     */
    public void setTrace(String trace) {
		this.trace = trace;
	}

}

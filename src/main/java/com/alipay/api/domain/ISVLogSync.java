package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv服务端日志同步格式
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ISVLogSync extends AlipayObject {

	private static final long serialVersionUID = 6536257269656364816L;

	/**
	 * 应用名
	 */
	@ApiField("application")
	private String application;

	/**
	 * isv自定义错误码， 该值传了表示接口调用业务失败或发生异常
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 异常堆栈
	 */
	@ApiField("exception_stack_trace")
	private String exceptionStackTrace;

	/**
	 * 执行时长，毫秒数。如果能取到尽量传入，涉及到接口耗时的监控
	 */
	@ApiField("execution_millis")
	private String executionMillis;

	/**
	 * 接口全限定名 包含远程rpc和内部调用
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * T 成功
F 失败
	 */
	@ApiField("success")
	private String success;

	/**
	 * 回流数据类型
	 */
	@ApiField("sync_type")
	private String syncType;

	/**
	 * 时间戳
	 */
	@ApiField("timestamp")
	private String timestamp;

    /**
     * Gets application.
     *
     * @return the application
     */
    public String getApplication() {
		return this.application;
	}

    /**
     * Sets application.
     *
     * @param application the application
     */
    public void setApplication(String application) {
		this.application = application;
	}

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
     * Gets exception stack trace.
     *
     * @return the exception stack trace
     */
    public String getExceptionStackTrace() {
		return this.exceptionStackTrace;
	}

    /**
     * Sets exception stack trace.
     *
     * @param exceptionStackTrace the exception stack trace
     */
    public void setExceptionStackTrace(String exceptionStackTrace) {
		this.exceptionStackTrace = exceptionStackTrace;
	}

    /**
     * Gets execution millis.
     *
     * @return the execution millis
     */
    public String getExecutionMillis() {
		return this.executionMillis;
	}

    /**
     * Sets execution millis.
     *
     * @param executionMillis the execution millis
     */
    public void setExecutionMillis(String executionMillis) {
		this.executionMillis = executionMillis;
	}

    /**
     * Gets interface name.
     *
     * @return the interface name
     */
    public String getInterfaceName() {
		return this.interfaceName;
	}

    /**
     * Sets interface name.
     *
     * @param interfaceName the interface name
     */
    public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public String getSuccess() {
		return this.success;
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
     * Gets sync type.
     *
     * @return the sync type
     */
    public String getSyncType() {
		return this.syncType;
	}

    /**
     * Sets sync type.
     *
     * @param syncType the sync type
     */
    public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public String getTimestamp() {
		return this.timestamp;
	}

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}

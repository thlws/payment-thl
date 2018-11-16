package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.promorulecenter.rule.analyze response.
 *
 * @author auto create
 * @since 1.0, 2017-10-09 17:38:20
 */
public class AlipayPromorulecenterRuleAnalyzeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4335833682225667497L;

	/** 
	 * 未通过条件描述信息
	 */
	@ApiField("fail_condition_msg")
	private String failConditionMsg;

	/** 
	 * 未通过的条件
	 */
	@ApiField("fail_condition_name")
	private String failConditionName;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 服务调用是否成功
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 规则是否通过
	 */
	@ApiField("triggered")
	private String triggered;

    /**
     * Sets fail condition msg.
     *
     * @param failConditionMsg the fail condition msg
     */
    public void setFailConditionMsg(String failConditionMsg) {
		this.failConditionMsg = failConditionMsg;
	}

    /**
     * Gets fail condition msg.
     *
     * @return the fail condition msg
     */
    public String getFailConditionMsg( ) {
		return this.failConditionMsg;
	}

    /**
     * Sets fail condition name.
     *
     * @param failConditionName the fail condition name
     */
    public void setFailConditionName(String failConditionName) {
		this.failConditionName = failConditionName;
	}

    /**
     * Gets fail condition name.
     *
     * @return the fail condition name
     */
    public String getFailConditionName( ) {
		return this.failConditionName;
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
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
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

    /**
     * Sets triggered.
     *
     * @param triggered the triggered
     */
    public void setTriggered(String triggered) {
		this.triggered = triggered;
	}

    /**
     * Gets triggered.
     *
     * @return the triggered
     */
    public String getTriggered( ) {
		return this.triggered;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.se.applet.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-29 10:02:30
 */
public class AlipaySecurityProdSeAppletQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3665648675431235749L;

	/** 
	 * apdu_commands:apdu指令列表，逗号分隔，根据该值确定硬件端对applet的具体操作
	 */
	@ApiField("apdu_commands")
	private String apduCommands;

	/** 
	 * 操作类型，唯一，传递tsm的具体操作，厂测程序提供
	 */
	@ApiField("opt_type")
	private Long optType;

	/** 
	 * result_code:调用tsm返回的结果码，根据该字段可以知道本次调用的状态
	 */
	@ApiField("result_code")
	private Long resultCode;

	/** 
	 * step:表示调用tsm过程中的步骤数
	 */
	@ApiField("step")
	private Long step;

	/** 
	 * step_code:tsm返回的步骤编码，供多语使用
	 */
	@ApiField("step_code")
	private Long stepCode;

	/** 
	 * sub_opt_type:子操作类型，tsm返回给厂测程序
	 */
	@ApiField("sub_opt_type")
	private Long subOptType;

	/** 
	 * total_step:表示调用tsm的总步骤数
	 */
	@ApiField("total_step")
	private Long totalStep;

    /**
     * Sets apdu commands.
     *
     * @param apduCommands the apdu commands
     */
    public void setApduCommands(String apduCommands) {
		this.apduCommands = apduCommands;
	}

    /**
     * Gets apdu commands.
     *
     * @return the apdu commands
     */
    public String getApduCommands( ) {
		return this.apduCommands;
	}

    /**
     * Sets opt type.
     *
     * @param optType the opt type
     */
    public void setOptType(Long optType) {
		this.optType = optType;
	}

    /**
     * Gets opt type.
     *
     * @return the opt type
     */
    public Long getOptType( ) {
		return this.optType;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(Long resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public Long getResultCode( ) {
		return this.resultCode;
	}

    /**
     * Sets step.
     *
     * @param step the step
     */
    public void setStep(Long step) {
		this.step = step;
	}

    /**
     * Gets step.
     *
     * @return the step
     */
    public Long getStep( ) {
		return this.step;
	}

    /**
     * Sets step code.
     *
     * @param stepCode the step code
     */
    public void setStepCode(Long stepCode) {
		this.stepCode = stepCode;
	}

    /**
     * Gets step code.
     *
     * @return the step code
     */
    public Long getStepCode( ) {
		return this.stepCode;
	}

    /**
     * Sets sub opt type.
     *
     * @param subOptType the sub opt type
     */
    public void setSubOptType(Long subOptType) {
		this.subOptType = subOptType;
	}

    /**
     * Gets sub opt type.
     *
     * @return the sub opt type
     */
    public Long getSubOptType( ) {
		return this.subOptType;
	}

    /**
     * Sets total step.
     *
     * @param totalStep the total step
     */
    public void setTotalStep(Long totalStep) {
		this.totalStep = totalStep;
	}

    /**
     * Gets total step.
     *
     * @return the total step
     */
    public Long getTotalStep( ) {
		return this.totalStep;
	}

}

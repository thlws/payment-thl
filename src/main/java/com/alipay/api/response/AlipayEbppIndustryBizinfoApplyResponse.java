package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bizinfo.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:15:05
 */
public class AlipayEbppIndustryBizinfoApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4134476186829259435L;

	/** 
	 * 业务能力码，标识业务场景
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/** 
	 * 支付宝办理流水号，支持幂等
	 */
	@ApiField("apply_flow_no")
	private String applyFlowNo;

	/** 
	 * 业务账户号，例如水费单号，电费号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 业务机构简称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 机构结果码
	 */
	@ApiField("org_result_code")
	private String orgResultCode;

	/** 
	 * 外部申请流水号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果上下文，json格式
	 */
	@ApiField("result_context")
	private String resultContext;

	/** 
	 * 结果码描述文案
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 办理状态，SUCCESS：成功；FAILURE：失败；PROCESS：处理中
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets ability code.
     *
     * @param abilityCode the ability code
     */
    public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

    /**
     * Gets ability code.
     *
     * @return the ability code
     */
    public String getAbilityCode( ) {
		return this.abilityCode;
	}

    /**
     * Sets apply flow no.
     *
     * @param applyFlowNo the apply flow no
     */
    public void setApplyFlowNo(String applyFlowNo) {
		this.applyFlowNo = applyFlowNo;
	}

    /**
     * Gets apply flow no.
     *
     * @return the apply flow no
     */
    public String getApplyFlowNo( ) {
		return this.applyFlowNo;
	}

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey( ) {
		return this.billKey;
	}

    /**
     * Sets biz inst.
     *
     * @param bizInst the biz inst
     */
    public void setBizInst(String bizInst) {
		this.bizInst = bizInst;
	}

    /**
     * Gets biz inst.
     *
     * @return the biz inst
     */
    public String getBizInst( ) {
		return this.bizInst;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets org result code.
     *
     * @param orgResultCode the org result code
     */
    public void setOrgResultCode(String orgResultCode) {
		this.orgResultCode = orgResultCode;
	}

    /**
     * Gets org result code.
     *
     * @return the org result code
     */
    public String getOrgResultCode( ) {
		return this.orgResultCode;
	}

    /**
     * Sets out apply no.
     *
     * @param outApplyNo the out apply no
     */
    public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

    /**
     * Gets out apply no.
     *
     * @return the out apply no
     */
    public String getOutApplyNo( ) {
		return this.outApplyNo;
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
     * Sets result context.
     *
     * @param resultContext the result context
     */
    public void setResultContext(String resultContext) {
		this.resultContext = resultContext;
	}

    /**
     * Gets result context.
     *
     * @return the result context
     */
    public String getResultContext( ) {
		return this.resultContext;
	}

    /**
     * Sets result msg.
     *
     * @param resultMsg the result msg
     */
    public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

    /**
     * Gets result msg.
     *
     * @return the result msg
     */
    public String getResultMsg( ) {
		return this.resultMsg;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bizinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:08
 */
public class AlipayEbppIndustryBizinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7456438741893834985L;

	/** 
	 * 业务机构简称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/** 
	 * 业务类型，公服业务：IND
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 业务数据码，标识业务场景
	 */
	@ApiField("data_code")
	private String dataCode;

	/** 
	 * 机构结果码
	 */
	@ApiField("org_result_code")
	private String orgResultCode;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回结果上下文，json格式
	 */
	@ApiField("result_context")
	private String resultContext;

	/** 
	 * 结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

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
     * Sets data code.
     *
     * @param dataCode the data code
     */
    public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

    /**
     * Gets data code.
     *
     * @return the data code
     */
    public String getDataCode( ) {
		return this.dataCode;
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

}

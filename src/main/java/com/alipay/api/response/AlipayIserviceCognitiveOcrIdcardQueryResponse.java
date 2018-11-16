package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.idcard.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-09 14:55:00
 */
public class AlipayIserviceCognitiveOcrIdcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7898347957885968772L;

	/** 
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 出生年月日
	 */
	@ApiField("birth")
	private String birth;

	/** 
	 * 信息抽取失败后详细错误原因
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 民族
	 */
	@ApiField("nationality")
	private String nationality;

	/** 
	 * 号码
	 */
	@ApiField("num")
	private String num;

	/** 
	 * 服务器内部id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 性别：男/女
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * true: 解析成功
false: 解析失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress( ) {
		return this.address;
	}

    /**
     * Sets birth.
     *
     * @param birth the birth
     */
    public void setBirth(String birth) {
		this.birth = birth;
	}

    /**
     * Gets birth.
     *
     * @return the birth
     */
    public String getBirth( ) {
		return this.birth;
	}

    /**
     * Sets error content.
     *
     * @param errorContent the error content
     */
    public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}

    /**
     * Gets error content.
     *
     * @return the error content
     */
    public String getErrorContent( ) {
		return this.errorContent;
	}

    /**
     * Sets nationality.
     *
     * @param nationality the nationality
     */
    public void setNationality(String nationality) {
		this.nationality = nationality;
	}

    /**
     * Gets nationality.
     *
     * @return the nationality
     */
    public String getNationality( ) {
		return this.nationality;
	}

    /**
     * Sets num.
     *
     * @param num the num
     */
    public void setNum(String num) {
		this.num = num;
	}

    /**
     * Gets num.
     *
     * @return the num
     */
    public String getNum( ) {
		return this.num;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId( ) {
		return this.requestId;
	}

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
		this.sex = sex;
	}

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex( ) {
		return this.sex;
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
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

    /**
     * Sets trace id.
     *
     * @param traceId the trace id
     */
    public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

    /**
     * Gets trace id.
     *
     * @return the trace id
     */
    public String getTraceId( ) {
		return this.traceId;
	}

}

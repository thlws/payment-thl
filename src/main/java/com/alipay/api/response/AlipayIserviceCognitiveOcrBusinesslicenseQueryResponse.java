package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.businesslicense.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-14 23:20:00
 */
public class AlipayIserviceCognitiveOcrBusinesslicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5734432428361894857L;

	/** 
	 * 住所
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 经营范围
	 */
	@ApiField("business")
	private String business;

	/** 
	 * 注册资本
	 */
	@ApiField("captial")
	private String captial;

	/** 
	 * 识别错误情况下的，详细错误原因
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 成立日期
	 */
	@ApiField("establish_date")
	private String establishDate;

	/** 
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 法定代表人
	 */
	@ApiField("person")
	private String person;

	/** 
	 * 注册号
	 */
	@ApiField("reg_num")
	private String regNum;

	/** 
	 * 服务器id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * true: 识别成功
false：识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 营业期限
	 */
	@ApiField("valid_period")
	private String validPeriod;

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
     * Sets business.
     *
     * @param business the business
     */
    public void setBusiness(String business) {
		this.business = business;
	}

    /**
     * Gets business.
     *
     * @return the business
     */
    public String getBusiness( ) {
		return this.business;
	}

    /**
     * Sets captial.
     *
     * @param captial the captial
     */
    public void setCaptial(String captial) {
		this.captial = captial;
	}

    /**
     * Gets captial.
     *
     * @return the captial
     */
    public String getCaptial( ) {
		return this.captial;
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
     * Sets establish date.
     *
     * @param establishDate the establish date
     */
    public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

    /**
     * Gets establish date.
     *
     * @return the establish date
     */
    public String getEstablishDate( ) {
		return this.establishDate;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

    /**
     * Sets person.
     *
     * @param person the person
     */
    public void setPerson(String person) {
		this.person = person;
	}

    /**
     * Gets person.
     *
     * @return the person
     */
    public String getPerson( ) {
		return this.person;
	}

    /**
     * Sets reg num.
     *
     * @param regNum the reg num
     */
    public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

    /**
     * Gets reg num.
     *
     * @return the reg num
     */
    public String getRegNum( ) {
		return this.regNum;
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

    /**
     * Sets valid period.
     *
     * @param validPeriod the valid period
     */
    public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}

    /**
     * Gets valid period.
     *
     * @return the valid period
     */
    public String getValidPeriod( ) {
		return this.validPeriod;
	}

}

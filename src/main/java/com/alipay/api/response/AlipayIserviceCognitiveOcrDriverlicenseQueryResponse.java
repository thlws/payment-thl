package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.driverlicense.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-09 12:25:00
 */
public class AlipayIserviceCognitiveOcrDriverlicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7278188549875642632L;

	/** 
	 * 地址
	 */
	@ApiField("addr")
	private String addr;

	/** 
	 * 有效期限
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 识别错误的详细原因描述
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 驾驶证号码
	 */
	@ApiField("num")
	private String num;

	/** 
	 * 服务器id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 性别
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * 有效期起始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/** 
	 * true:识别成功
false:识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 准驾车型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

    /**
     * Sets addr.
     *
     * @param addr the addr
     */
    public void setAddr(String addr) {
		this.addr = addr;
	}

    /**
     * Gets addr.
     *
     * @return the addr
     */
    public String getAddr( ) {
		return this.addr;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public String getEndDate( ) {
		return this.endDate;
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
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public String getStartDate( ) {
		return this.startDate;
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
     * Sets vehicle type.
     *
     * @param vehicleType the vehicle type
     */
    public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

    /**
     * Gets vehicle type.
     *
     * @return the vehicle type
     */
    public String getVehicleType( ) {
		return this.vehicleType;
	}

}

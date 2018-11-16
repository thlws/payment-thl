package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.vehiclelicense.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-21 18:10:00
 */
public class AlipayIserviceCognitiveOcrVehiclelicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7556698831829798154L;

	/** 
	 * 发动机号码
	 */
	@ApiField("engine_num")
	private String engineNum;

	/** 
	 * 识别错误的详细原因描述
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 发证时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/** 
	 * 品牌型号
	 */
	@ApiField("entity")
	private String model;

	/** 
	 * 所有人
	 */
	@ApiField("owner")
	private String owner;

	/** 
	 * 号牌号码
	 */
	@ApiField("plate_num")
	private String plateNum;

	/** 
	 * 注册时间
	 */
	@ApiField("register_date")
	private String registerDate;

	/** 
	 * 服务器内部请求id
	 */
	@ApiField("request_id")
	private String requestId;

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
	 * 使用性质
	 */
	@ApiField("use_character")
	private String useCharacter;

	/** 
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/** 
	 * 车辆识别代号
	 */
	@ApiField("vin")
	private String vin;

    /**
     * Sets engine num.
     *
     * @param engineNum the engine num
     */
    public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}

    /**
     * Gets engine num.
     *
     * @return the engine num
     */
    public String getEngineNum( ) {
		return this.engineNum;
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
     * Sets issue date.
     *
     * @param issueDate the issue date
     */
    public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

    /**
     * Gets issue date.
     *
     * @return the issue date
     */
    public String getIssueDate( ) {
		return this.issueDate;
	}

    /**
     * Sets entity.
     *
     * @param model the entity
     */
    public void setModel(String model) {
		this.model = model;
	}

    /**
     * Gets entity.
     *
     * @return the entity
     */
    public String getModel( ) {
		return this.model;
	}

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(String owner) {
		this.owner = owner;
	}

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public String getOwner( ) {
		return this.owner;
	}

    /**
     * Sets plate num.
     *
     * @param plateNum the plate num
     */
    public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}

    /**
     * Gets plate num.
     *
     * @return the plate num
     */
    public String getPlateNum( ) {
		return this.plateNum;
	}

    /**
     * Sets register date.
     *
     * @param registerDate the register date
     */
    public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

    /**
     * Gets register date.
     *
     * @return the register date
     */
    public String getRegisterDate( ) {
		return this.registerDate;
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
     * Sets use character.
     *
     * @param useCharacter the use character
     */
    public void setUseCharacter(String useCharacter) {
		this.useCharacter = useCharacter;
	}

    /**
     * Gets use character.
     *
     * @return the use character
     */
    public String getUseCharacter( ) {
		return this.useCharacter;
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

    /**
     * Sets vin.
     *
     * @param vin the vin
     */
    public void setVin(String vin) {
		this.vin = vin;
	}

    /**
     * Gets vin.
     *
     * @return the vin
     */
    public String getVin( ) {
		return this.vin;
	}

}

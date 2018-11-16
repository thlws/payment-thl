package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.afts.cert.identify response.
 *
 * @author auto create
 * @since 1.0, 2017-12-13 10:48:22
 */
public class AlipayMsaasMediarecogAftsCertIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2846863314755321235L;

	/** 
	 * 浮点数，属于该证件类型的概率
	 */
	@ApiField("cert_probability")
	private Long certProbability;

	/** 
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 发动机号
	 */
	@ApiField("ocr_engine_number")
	private String ocrEngineNumber;

	/** 
	 * 姓名
	 */
	@ApiField("ocr_name")
	private String ocrName;

	/** 
	 * 车牌
	 */
	@ApiField("ocr_plate_number")
	private String ocrPlateNumber;

	/** 
	 * 车架号
	 */
	@ApiField("ocr_vehicle_id")
	private String ocrVehicleId;

    /**
     * Sets cert probability.
     *
     * @param certProbability the cert probability
     */
    public void setCertProbability(Long certProbability) {
		this.certProbability = certProbability;
	}

    /**
     * Gets cert probability.
     *
     * @return the cert probability
     */
    public Long getCertProbability( ) {
		return this.certProbability;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType( ) {
		return this.certType;
	}

    /**
     * Sets ocr engine number.
     *
     * @param ocrEngineNumber the ocr engine number
     */
    public void setOcrEngineNumber(String ocrEngineNumber) {
		this.ocrEngineNumber = ocrEngineNumber;
	}

    /**
     * Gets ocr engine number.
     *
     * @return the ocr engine number
     */
    public String getOcrEngineNumber( ) {
		return this.ocrEngineNumber;
	}

    /**
     * Sets ocr name.
     *
     * @param ocrName the ocr name
     */
    public void setOcrName(String ocrName) {
		this.ocrName = ocrName;
	}

    /**
     * Gets ocr name.
     *
     * @return the ocr name
     */
    public String getOcrName( ) {
		return this.ocrName;
	}

    /**
     * Sets ocr plate number.
     *
     * @param ocrPlateNumber the ocr plate number
     */
    public void setOcrPlateNumber(String ocrPlateNumber) {
		this.ocrPlateNumber = ocrPlateNumber;
	}

    /**
     * Gets ocr plate number.
     *
     * @return the ocr plate number
     */
    public String getOcrPlateNumber( ) {
		return this.ocrPlateNumber;
	}

    /**
     * Sets ocr vehicle id.
     *
     * @param ocrVehicleId the ocr vehicle id
     */
    public void setOcrVehicleId(String ocrVehicleId) {
		this.ocrVehicleId = ocrVehicleId;
	}

    /**
     * Gets ocr vehicle id.
     *
     * @return the ocr vehicle id
     */
    public String getOcrVehicleId( ) {
		return this.ocrVehicleId;
	}

}

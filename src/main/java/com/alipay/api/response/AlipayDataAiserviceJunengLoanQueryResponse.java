package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.juneng.loan.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:57:56
 */
public class AlipayDataAiserviceJunengLoanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4751621469376436881L;

	/** 
	 * 二级错误码，帮助诊断错误
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/** 
	 * 用户身份证的md5加密值
	 */
	@ApiField("hashed_cert_no")
	private String hashedCertNo;

	/** 
	 * 本次请求的uuid
	 */
	@ApiField("request_uuid")
	private String requestUuid;

	/** 
	 * 接口的返回结果
	 */
	@ApiField("result")
	private String result;

    /**
     * Sets biz error code.
     *
     * @param bizErrorCode the biz error code
     */
    public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}

    /**
     * Gets biz error code.
     *
     * @return the biz error code
     */
    public String getBizErrorCode( ) {
		return this.bizErrorCode;
	}

    /**
     * Sets hashed cert no.
     *
     * @param hashedCertNo the hashed cert no
     */
    public void setHashedCertNo(String hashedCertNo) {
		this.hashedCertNo = hashedCertNo;
	}

    /**
     * Gets hashed cert no.
     *
     * @return the hashed cert no
     */
    public String getHashedCertNo( ) {
		return this.hashedCertNo;
	}

    /**
     * Sets request uuid.
     *
     * @param requestUuid the request uuid
     */
    public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}

    /**
     * Gets request uuid.
     *
     * @return the request uuid
     */
    public String getRequestUuid( ) {
		return this.requestUuid;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

}

package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.information.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-09-12 17:00:00
 */
public class AlipayCommerceMedicalInformationUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8227875247112742373L;

	/** 
	 * 报备成功时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 根据各地人社局返回为准，与入参数request_content对应的业务响应数据。
	 */
	@ApiField("response_content")
	private String responseContent;

    /**
     * Sets gmt payment.
     *
     * @param gmtPayment the gmt payment
     */
    public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

    /**
     * Gets gmt payment.
     *
     * @return the gmt payment
     */
    public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

    /**
     * Sets response content.
     *
     * @param responseContent the response content
     */
    public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}

    /**
     * Gets response content.
     *
     * @return the response content
     */
    public String getResponseContent( ) {
		return this.responseContent;
	}

}

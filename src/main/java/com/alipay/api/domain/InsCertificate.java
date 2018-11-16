package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险发奖凭证
 *
 * @author auto create
 * @since 1.0, 2017-02-23 21:17:32
 */
public class InsCertificate extends AlipayObject {

	private static final long serialVersionUID = 5687727176726234222L;

	/**
	 * 发奖凭证ID
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 发奖凭证类型;GIFT_INSURANCE:赠险
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 发奖凭证值
	 */
	@ApiField("certificate_value")
	private String certificateValue;

    /**
     * Gets certificate id.
     *
     * @return the certificate id
     */
    public String getCertificateId() {
		return this.certificateId;
	}

    /**
     * Sets certificate id.
     *
     * @param certificateId the certificate id
     */
    public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

    /**
     * Gets certificate type.
     *
     * @return the certificate type
     */
    public String getCertificateType() {
		return this.certificateType;
	}

    /**
     * Sets certificate type.
     *
     * @param certificateType the certificate type
     */
    public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

    /**
     * Gets certificate value.
     *
     * @return the certificate value
     */
    public String getCertificateValue() {
		return this.certificateValue;
	}

    /**
     * Sets certificate value.
     *
     * @param certificateValue the certificate value
     */
    public void setCertificateValue(String certificateValue) {
		this.certificateValue = certificateValue;
	}

}

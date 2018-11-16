package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertAuditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.idcard.certify response.
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:35:00
 */
public class ZolozIdentificationCustomerIdcardCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6274613349947883996L;

	/** 
	 * 证件宝审核结果
	 */
	@ApiListField("cert_audit_result")
	@ApiField("cert_audit_result")
	private List<CertAuditResult> certAuditResult;

	/** 
	 * 业务校验是否通过
	 */
	@ApiField("passed")
	private Boolean passed;

	/** 
	 * 全流程上下文唯一id
	 */
	@ApiField("token")
	private String token;

    /**
     * Sets cert audit result.
     *
     * @param certAuditResult the cert audit result
     */
    public void setCertAuditResult(List<CertAuditResult> certAuditResult) {
		this.certAuditResult = certAuditResult;
	}

    /**
     * Gets cert audit result.
     *
     * @return the cert audit result
     */
    public List<CertAuditResult> getCertAuditResult( ) {
		return this.certAuditResult;
	}

    /**
     * Sets passed.
     *
     * @param passed the passed
     */
    public void setPassed(Boolean passed) {
		this.passed = passed;
	}

    /**
     * Gets passed.
     *
     * @return the passed
     */
    public Boolean getPassed( ) {
		return this.passed;
	}

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken( ) {
		return this.token;
	}

}

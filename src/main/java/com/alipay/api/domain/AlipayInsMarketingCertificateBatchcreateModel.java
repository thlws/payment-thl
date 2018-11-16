package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险凭证批量创建
 *
 * @author auto create
 * @since 1.0, 2016-10-13 19:50:45
 */
public class AlipayInsMarketingCertificateBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 2673469479522148726L;

	/**
	 * 批量创建凭证请求
	 */
	@ApiListField("ins_create_certificate_requests")
	@ApiField("ins_create_certificate_request")
	private List<InsCreateCertificateRequest> insCreateCertificateRequests;

    /**
     * Gets ins create certificate requests.
     *
     * @return the ins create certificate requests
     */
    public List<InsCreateCertificateRequest> getInsCreateCertificateRequests() {
		return this.insCreateCertificateRequests;
	}

    /**
     * Sets ins create certificate requests.
     *
     * @param insCreateCertificateRequests the ins create certificate requests
     */
    public void setInsCreateCertificateRequests(List<InsCreateCertificateRequest> insCreateCertificateRequests) {
		this.insCreateCertificateRequests = insCreateCertificateRequests;
	}

}

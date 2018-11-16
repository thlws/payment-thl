package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsCertificatePaginationList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.certificate.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2016-10-13 19:51:03
 */
public class AlipayInsMarketingCertificateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1395576789528261613L;

	/** 
	 * 分页查询结果
	 */
	@ApiField("ins_certificate_pagination_list")
	private InsCertificatePaginationList insCertificatePaginationList;

    /**
     * Sets ins certificate pagination list.
     *
     * @param insCertificatePaginationList the ins certificate pagination list
     */
    public void setInsCertificatePaginationList(InsCertificatePaginationList insCertificatePaginationList) {
		this.insCertificatePaginationList = insCertificatePaginationList;
	}

    /**
     * Gets ins certificate pagination list.
     *
     * @return the ins certificate pagination list
     */
    public InsCertificatePaginationList getInsCertificatePaginationList( ) {
		return this.insCertificatePaginationList;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certify.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-06-11 19:32:40
 */
public class ZolozIdentificationCustomerCertifyInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3576495189264694111L;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 实人认证id
	 */
	@ApiField("zim_id")
	private String zimId;

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId( ) {
		return this.bizId;
	}

    /**
     * Sets zim id.
     *
     * @param zimId the zim id
     */
    public void setZimId(String zimId) {
		this.zimId = zimId;
	}

    /**
     * Gets zim id.
     *
     * @return the zim id
     */
    public String getZimId( ) {
		return this.zimId;
	}

}

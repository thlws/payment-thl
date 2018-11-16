package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.promo.query response.
 *
 * @author auto create
 * @since 1.0, 2016-03-03 17:48:05
 */
public class AlipayPcreditHuabeiPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8218639319818434447L;

	/** 
	 * 花呗颜值分
	 */
	@ApiField("facescore")
	private String facescore;

    /**
     * Sets facescore.
     *
     * @param facescore the facescore
     */
    public void setFacescore(String facescore) {
		this.facescore = facescore;
	}

    /**
     * Gets facescore.
     *
     * @return the facescore
     */
    public String getFacescore( ) {
		return this.facescore;
	}

}

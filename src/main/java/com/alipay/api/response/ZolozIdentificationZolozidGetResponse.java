package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.zolozid.get response.
 *
 * @author auto create
 * @since 1.0, 2018-03-14 16:45:14
 */
public class ZolozIdentificationZolozidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7224495741349711728L;

	/** 
	 * zcif结果
	 */
	@ApiField("result_info")
	private String resultInfo;

    /**
     * Sets result info.
     *
     * @param resultInfo the result info
     */
    public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}

    /**
     * Gets result info.
     *
     * @return the result info
     */
    public String getResultInfo( ) {
		return this.resultInfo;
	}

}

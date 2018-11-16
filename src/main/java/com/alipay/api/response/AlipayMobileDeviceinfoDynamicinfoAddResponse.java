package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.deviceinfo.dynamicinfo.add response.
 *
 * @author auto create
 * @since 1.0, 2017-03-27 19:38:25
 */
public class AlipayMobileDeviceinfoDynamicinfoAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2291257523312492786L;

	/** 
	 * 同步处理结果
	 */
	@ApiField("operateresult")
	private Boolean operateresult;

    /**
     * Sets operateresult.
     *
     * @param operateresult the operateresult
     */
    public void setOperateresult(Boolean operateresult) {
		this.operateresult = operateresult;
	}

    /**
     * Gets operateresult.
     *
     * @return the operateresult
     */
    public Boolean getOperateresult( ) {
		return this.operateresult;
	}

}

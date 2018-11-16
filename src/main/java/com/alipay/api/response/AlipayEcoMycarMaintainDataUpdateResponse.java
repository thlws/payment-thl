package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.data.update response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:17
 */
public class AlipayEcoMycarMaintainDataUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1214951989367553336L;

	/** 
	 * 具体返回的处理结果
	 */
	@ApiField("info")
	private String info;

    /**
     * Sets info.
     *
     * @param info the info
     */
    public void setInfo(String info) {
		this.info = info;
	}

    /**
     * Gets info.
     *
     * @return the info
     */
    public String getInfo( ) {
		return this.info;
	}

}

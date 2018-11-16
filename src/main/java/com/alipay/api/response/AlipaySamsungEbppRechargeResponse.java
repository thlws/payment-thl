package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.samsung.ebpp.recharge response.
 *
 * @author auto create
 * @since 1.0, 2018-01-02 11:20:54
 */
public class AlipaySamsungEbppRechargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1156724558182861926L;

	/** 
	 * 直接返回页面
	 */
	@ApiField("page_retrun")
	private String pageRetrun;

    /**
     * Sets page retrun.
     *
     * @param pageRetrun the page retrun
     */
    public void setPageRetrun(String pageRetrun) {
		this.pageRetrun = pageRetrun;
	}

    /**
     * Gets page retrun.
     *
     * @return the page retrun
     */
    public String getPageRetrun( ) {
		return this.pageRetrun;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.device.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-23 19:58:04
 */
public class AntMerchantExpandIsvDeviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1249497632466158613L;

	/** 
	 * 机具申请物料订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
	}

}

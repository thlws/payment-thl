package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.automat.apply.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-09-10 14:30:00
 */
public class AntMerchantExpandAutomatApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2266762812657366521L;

	/** 
	 * 支付宝设备ID
	 */
	@ApiField("alipay_terminal_id")
	private String alipayTerminalId;

    /**
     * Sets alipay terminal id.
     *
     * @param alipayTerminalId the alipay terminal id
     */
    public void setAlipayTerminalId(String alipayTerminalId) {
		this.alipayTerminalId = alipayTerminalId;
	}

    /**
     * Gets alipay terminal id.
     *
     * @return the alipay terminal id
     */
    public String getAlipayTerminalId( ) {
		return this.alipayTerminalId;
	}

}

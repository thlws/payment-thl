package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.delete response.
 *
 * @author auto create
 * @since 1.0, 2018-01-16 19:51:58
 */
public class AlipayMarketingCardDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6651198823772987254L;

	/** 
	 * 支付宝端删卡业务流水号
	 */
	@ApiField("biz_serial_no")
	private String bizSerialNo;

    /**
     * Sets biz serial no.
     *
     * @param bizSerialNo the biz serial no
     */
    public void setBizSerialNo(String bizSerialNo) {
		this.bizSerialNo = bizSerialNo;
	}

    /**
     * Gets biz serial no.
     *
     * @return the biz serial no
     */
    public String getBizSerialNo( ) {
		return this.bizSerialNo;
	}

}

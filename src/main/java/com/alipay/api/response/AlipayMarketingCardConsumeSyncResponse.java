package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.consume.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-06-23 14:51:37
 */
public class AlipayMarketingCardConsumeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4229242954492281965L;

	/** 
	 * 外部卡号
	 */
	@ApiField("external_card_no")
	private String externalCardNo;

    /**
     * Sets external card no.
     *
     * @param externalCardNo the external card no
     */
    public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}

    /**
     * Gets external card no.
     *
     * @return the external card no
     */
    public String getExternalCardNo( ) {
		return this.externalCardNo;
	}

}
